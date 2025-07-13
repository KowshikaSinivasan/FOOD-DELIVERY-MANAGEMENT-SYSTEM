REM : To find restaurant address ( Customer 1)

CREATE OR REPLACE PROCEDURE get_restaurant_address(
    p_rid IN VARCHAR2,
    p_block OUT VARCHAR2,
    p_street OUT VARCHAR2,
    p_area OUT VARCHAR2,
    p_pincode OUT VARCHAR2
) AS
BEGIN
    SELECT block, street, area, pincode
    INTO p_block, p_street, p_area, p_pincode
    FROM restaurant_address
    WHERE rid = p_rid;
END;
/

rem: Finding Rid from rname
CREATE OR REPLACE PROCEDURE get_restaurant_id(
    p_name IN VARCHAR2,
    p_rid OUT VARCHAR2
) AS
BEGIN
    SELECT Rid INTO p_rid
    FROM restaurant_info
    WHERE Rname = p_name;
END;
/


rem: To find Iid given item name (Customer_search)
CREATE OR REPLACE PROCEDURE get_item_id(
    p_iname IN VARCHAR2,
    p_iid OUT VARCHAR2
) AS
BEGIN
    SELECT Iid INTO p_iid
    FROM ITEM
    WHERE Iname = p_iname;

END;
/

rem: Finding price of an item given its item Idesc
CREATE OR REPLACE PROCEDURE GetItemPrice(
    p_Iid IN VARCHAR2,
    p_price OUT NUMBER
)
AS
BEGIN
    SELECT price INTO p_price
    FROM ITEM
    WHERE Iid = p_Iid;

END;
/

rem: calculating total cost of an order
CREATE OR REPLACE PROCEDURE calculate_total_price(
    p_oid IN VARCHAR2,
    p_total_price OUT NUMBER
) AS
BEGIN
    SELECT SUM(price * Qty) INTO p_total_price
    FROM ORDER_DETAILS
    WHERE Oid = p_oid;
    
    IF p_total_price IS NULL THEN
        p_total_price := 0;
    END IF;
END;
/

rem: Get restaurant name given rest Id
CREATE OR REPLACE PROCEDURE get_restaurant_name(
    p_rid IN VARCHAR2,
    p_name OUT VARCHAR2
) AS
BEGIN
    SELECT Rname INTO p_name
    FROM restaurant_info
    WHERE Rid = p_rid;
END;
/


rem : INSERTION TRIGGERS
CREATE OR REPLACE TRIGGER calculate_order_total_trigger
AFTER INSERT ON ORDER_DETAILS
FOR EACH ROW
DECLARE
    total_price NUMBER;
BEGIN
    SELECT SUM(price * Qty) INTO total_price
    FROM ORDER_DETAILS
    WHERE Oid = :NEW.Oid;
    
    UPDATE ORDERS
    SET price = total_price
    WHERE Oid = :NEW.Oid;
END;
/

CREATE OR REPLACE TRIGGER update_restaurant_ratings_trigger
AFTER INSERT ON ORDERS
FOR EACH ROW
DECLARE
    avg_rating NUMBER;
    total_ratings NUMBER;
BEGIN
    SELECT COUNT(*), AVG(Orating)
    INTO total_ratings, avg_rating
    FROM ORDERS
    WHERE Rid = :NEW.Rid;
    
    UPDATE RESTAURANT_INFO
    SET Ratings = ROUND(avg_rating)
    WHERE Rid = :NEW.Rid;
END;
/

CREATE OR REPLACE TRIGGER update_customer_points_trigger
AFTER INSERT ON ORDERS
FOR EACH ROW
BEGIN
    UPDATE CUSTOMER_info
    SET CPOINTS = CPOINTS + 10
    WHERE Cid = :NEW.Cid;
END;
/

rem : delete TRIGGERS
CREATE OR REPLACE TRIGGER delete_order_trigger
BEFORE DELETE ON ORDERS
FOR EACH ROW
BEGIN
    -- Delete corresponding records from ORDER_DETAILS
    DELETE FROM ORDER_DETAILS
    WHERE Oid = :OLD.Oid;
    
    -- Optional: Additional actions can be added here, such as logging or notifications.
END;
/
