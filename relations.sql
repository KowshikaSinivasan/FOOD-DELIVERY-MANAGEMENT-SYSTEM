drop table customer_info;
drop table RESTAURANT_CRED;
drop table RESTAURANT_INFO;
drop table customer_addresss;
drop table DRIVER_ADD_MAP;
drop table driver_info;
drop table DRIVER_ADDRESS;
drop table menu;
drop table  ORDERS;
drop table ORDER_DETAILS;
drop table item;
drop table menu;
 drop table payment;
 drop table membership;
 drop table Restaurant_Acct;
drop table CUST_ADD_MAP;
drop table  RESTAURANT_ADDRESS;


CREATE TABLE CUSTOMER_INFO (
    Name VARCHAR(255) NOT NULL,
    Cid VARCHAR(255) CONSTRAINT Cid_check CHECK(Cid LIKE 'C%'),
    password VARCHAR(255) CONSTRAINT password_check CHECK(length(password)>8),
    phone NUMBER(10) UNIQUE,
    email VARCHAR(255),
    Cpoints NUMBER,
    Mid VARCHAR(255) CONSTRAINT Mid_check CHECK(Mid LIKE 'M%'),
    PRIMARY KEY (Cid)
);



CREATE TABLE CUSTOMER_ADDRESS (
    Aid VARCHAR(255) CHECK (Aid LIKE 'CA%') PRIMARY KEY,
    block VARCHAR(255),
    street VARCHAR(255),
    area VARCHAR(255),
    pincode NUMBER(6)
);


CREATE TABLE CUST_ADD_MAP (
     Aid VARCHAR(255) CHECK (Aid LIKE 'A%'),
     Cid VARCHAR(255) CHECK (Cid LIKE 'C%'),
     PRIMARY KEY (Aid, Cid)
);

CREATE TABLE RESTAURANT_INFO (
    Rid VARCHAR(255) CHECK (Rid LIKE 'R%') PRIMARY KEY,
    Rname VARCHAR(255) NOT NULL,
    Rphone NUMBER(10) UNIQUE,
    Ratings NUMBER(1) CHECK (Ratings BETWEEN 1 AND 5),
    Cuisine VARCHAR(255),
    Rdesc VARCHAR(255),
    password VARCHAR(255) CHECK (LENGTH(password) > 8),
    Category VARCHAR(255) CHECK (Category IN ('Veg', 'Non Veg'))
);


CREATE TABLE RESTAURANT_CRED (
    Rid VARCHAR(255) PRIMARY KEY,
    Raccount NUMBER(11) UNIQUE,
    CHECK (Rid LIKE 'R%'),
    FOREIGN KEY (Rid) References Restaurant_INFO(Rid)
);

CREATE TABLE Restaurant_Acct (
    Raccount NUMBER(11) UNIQUE,
    accountname VARCHAR(255),
    FOREIGN KEY (Raccount) REFERENCES Restaurant_cred(Raccount)
);

CREATE TABLE RESTAURANT_ADDRESS (
  Rid VARCHAR(255) CHECK(Rid LIKE 'R%'),
  block VARCHAR(255),
  street VARCHAR(255),
  area VARCHAR(255),
  pincode VARCHAR(255),
  PRIMARY KEY (Rid),
  FOREIGN KEY (Rid) REFERENCES RESTAURANT_INFO(Rid)
);

CREATE TABLE DRIVER_INFO (
  Did VARCHAR(6) CHECK(Did LIKE 'D%') PRIMARY KEY,
  Daadhar NUMBER(12) UNIQUE NOT NULL,
  password VARCHAR(20) CHECK(length(password)>8),
  Dname VARCHAR(50) NOT NULL,
  Dphone NUMBER(10) UNIQUE,
  Dstatus CHAR(1) CHECK(Dstatus IN ('y','n')),
  Dpin NUMBER(6) NOT NULL,
  Demail VARCHAR(50),
  dob DATE,
  Dratings NUMBER CHECK(Dratings BETWEEN 1 AND 5)
);

CREATE TABLE DRIVER_ADD_MAP (
  Aid VARCHAR(255) CHECK(Aid LIKE 'AD%'),
  Did VARCHAR(255) CHECK(Did LIKE 'D%'),
  PRIMARY KEY (Aid, Did),
  FOREIGN KEY (Did) REFERENCES DRIVER_INFO(Did)
);

CREATE TABLE DRIVER_ADDRESS (
  Aid VARCHAR(3) CHECK (Aid LIKE 'AD%') PRIMARY KEY,
  block VARCHAR(50),
  street VARCHAR(50),
  area VARCHAR(50)
);


CREATE TABLE ORDERS (
  Oid VARCHAR2(20) CONSTRAINT Oid_PK PRIMARY KEY,
  Cid VARCHAR2(20) CONSTRAINT Cid_FK REFERENCES CUSTOMER_info(Cid),
  Rid VARCHAR2(20) CONSTRAINT Rid_FK REFERENCES RESTAURANT_INFO(Rid),
  Did VARCHAR2(20) CONSTRAINT Did_FK REFERENCES DRIVER_INFO(Did),
  status CHAR(1) CONSTRAINT status_CHK CHECK(status IN ('0', '1', '2')),
  order_date_time VARCHAR(50),
  del_date_time VARCHAR(50),
  Orating NUMBER(1) CONSTRAINT Orating_CHK CHECK(Orating BETWEEN 0 AND 5),
  price NUMBER(10, 2) CONSTRAINT price_CHK CHECK(price >= 0),
  CONSTRAINT Oid_CHK CHECK(Oid LIKE 'O%'),
  CONSTRAINT del_date_time_CHK CHECK(del_date_time > order_date_time)
);

CREATE TABLE ITEM (
  Iid VARCHAR2(20) CONSTRAINT Iid_PK PRIMARY KEY,
  Iname VARCHAR2(50) NOT NULL,
  Idesc VARCHAR2(200),
  price NUMBER(10, 2) CONSTRAINT price_CHEK CHECK(price > 0),
  Category VARCHAR2(10) CONSTRAINT Category_CHK CHECK(Category IN ('Veg', 'Non Veg')),
  Type VARCHAR2(20),
  Cuisine VARCHAR2(20),
  Iratings NUMBER(1) CONSTRAINT Iratings_CHK CHECK(Iratings BETWEEN 1 AND 5),
  Guiltfree VARCHAR2(1) CONSTRAINT Guiltfree_CHK CHECK(Guiltfree IN ('Y', 'N')),
  Jain VARCHAR2(1) CONSTRAINT Jain_CHK CHECK(Jain IN ('Y', 'N')),
  CONSTRAINT Iid_CHK CHECK(Iid LIKE 'I%')
);

CREATE TABLE ORDER_DETAILS (
  Oid VARCHAR2(20) CONSTRAINT Oid_FK REFERENCES ORDERS(Oid),
  Iid VARCHAR2(20) CONSTRAINT Iid_FK REFERENCES ITEM(Iid),
  price NUMBER(10, 2) CONSTRAINT price_CHECK CHECK(price > 0),
  Qty NUMBER(10) CONSTRAINT Qty_CHEK CHECK(Qty > 0),
  CONSTRAINT Oid_Iid_PK PRIMARY KEY (Oid, Iid),
  CONSTRAINT Oid_CHEK CHECK(Oid LIKE 'O%')
);

CREATE TABLE MENU (
  Rid VARCHAR2(11),
  Iid VARCHAR2(20),
  Timings VARCHAR2(50),
  CONSTRAINT Menu_PK PRIMARY KEY (Rid, Iid),
  CONSTRAINT Rid_FKey FOREIGN KEY (Rid) REFERENCES RESTAURANT_INFO(Rid),
  CONSTRAINT Iid_FKey FOREIGN KEY (Iid) REFERENCES ITEM(Iid)
);


CREATE TABLE PAYMENT (
  Pid VARCHAR(10) PRIMARY KEY,
  Oid VARCHAR(10) REFERENCES ORDERS(Oid),
  status NUMBER(1) CHECK (status IN (0, 1)),
  Type VARCHAR(10) CHECK (Type IN ('cash', 'online', 'card'))
);

CREATE TABLE MEMBERSHIP (
  Mid VARCHAR(10) CHECK (Mid LIKE 'M%' AND LENGTH(Mid) = 5),
  Cid VARCHAR(10) REFERENCES CUSTOMER_info(Cid),
  Type VARCHAR(10) CHECK (Type IN ('Gold', 'Silver', 'Platinum')),
  start_date DATE,
  end_date DATE,
  active NUMBER(1) CHECK (active IN (0, 1)),
  PRIMARY KEY (Mid),
  CONSTRAINT end_date_check CHECK (end_date > start_date)
);