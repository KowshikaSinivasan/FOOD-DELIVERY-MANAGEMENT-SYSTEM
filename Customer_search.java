import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Customer_search extends javax.swing.JFrame {

    Connection con=MyConnection.getConnection();
    public static String rid;
    public static String oid=IdGenerator.generateOrderId();
    String cid=LoginPage.cid;
    
	//System.out.println(oid);
	
    public Customer_search() {
    	
        initComponents();
        location.setEditable(false);
        item.setEditable(false);
        
    }
    
    
    public void orders_entry()
    {
    	if (rid!=null)
    	{
    		String sql = "INSERT INTO ORDERS (Oid, Cid, Rid, Did, status, order_date_time, del_date_time, Orating, price) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        	try
        	{
        		 PreparedStatement statement = con.prepareStatement(sql);
                 
                 // Set the values
                 statement.setString(1, oid); // Oid
                 statement.setString(2, cid);  // Cid
                 statement.setString(3, rid);   // Rid
                 statement.setNull(4, Types.VARCHAR); // Did
                 statement.setString(5, "1");           // status
                 statement.setNull(6, Types.DATE); // order_date_time
                 statement.setNull(7, Types.DATE); // del_date_time
                 statement.setInt(8, 0);           // Orating
                 statement.setDouble(9, 0);      // price
                 int r = statement.executeUpdate();
        	}
        	catch(Exception e)
        	{
        		//System.out.println("ORDERS"+ e);
        	}
    	}
    	
    }
    
    private void initComponents() {


    	jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        search_rest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        location = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        search_item = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        item = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        item_enter = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        view = new javax.swing.JButton();
        qty = new javax.swing.JComboBox<>();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DineDash Discover");

        search.setText("Discover Your Favorite Eatery");

        search_rest.setBackground(new java.awt.Color(255, 0, 0));
        search_rest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        search_rest.setText("search");
        search_rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_restActionPerformed(evt);
            }
        });

        location.setBackground(new java.awt.Color(0, 204, 204));
        location.setColumns(20);
        location.setRows(5);
        jScrollPane1.setViewportView(location);

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "price", "category", "rating"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOCATION ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MENU");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Explore More About an Item");

        jTextField1.setText("name");

        search_item.setBackground(new java.awt.Color(255, 255, 0));
        search_item.setText("Search");
        search_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_itemActionPerformed(evt);
            }
        });

        item.setBackground(new java.awt.Color(204, 204, 204));
        item.setColumns(20);
        item.setRows(5);
        jScrollPane3.setViewportView(item);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Place Order");

        item_enter.setBackground(new java.awt.Color(0, 204, 255));
        item_enter.setText("Enter item name");

        add.setBackground(new java.awt.Color(255, 51, 0));
        add.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add to cart");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        view.setBackground(new java.awt.Color(0, 204, 0));
        view.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setText("View Cart");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        qty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(item_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add)
                        .addGap(18, 18, 18)
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(search_item)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(search_rest))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_rest))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_item))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item_enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add)
                    .addComponent(view)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>  
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
    	Customer1 l = new Customer1();
     	//this.dispose();
     	l.setVisible(true);
    }

    private void search_restActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String rest=search.getText();
        
        try
    	{
        	
        	location.setText("");
        	jTable1.setModel(new DefaultTableModel(null, new String[] {"Name", "price", "category", "rating"}));
        	CallableStatement cs = con.prepareCall("{CALL get_restaurant_id(?,?)}");
            cs.setString(1, rest);
            cs.registerOutParameter(2, java.sql.Types.VARCHAR);
            cs.execute();

            rid = cs.getString(2);
            //using procedure
            CallableStatement cs1 = con.prepareCall("{CALL get_restaurant_address(?, ?, ?, ?, ?)}");
            cs1.setString(1, rid);
            cs1.registerOutParameter(2, java.sql.Types.VARCHAR);
            cs1.registerOutParameter(3, java.sql.Types.VARCHAR);
            cs1.registerOutParameter(4, java.sql.Types.VARCHAR);
            cs1.registerOutParameter(5, java.sql.Types.VARCHAR);

            cs1.execute();
            String block = cs1.getString(2);
            String street = cs1.getString(3);
             String area = cs1.getString(4);
             String pincode = cs1.getString(5);

             String loc = block + " " + street + " " + area + " " + pincode;
            location.append(loc+"\n");
            
           System.out.println(rid);
            String q="select Iid from menu where Rid='"+rid+"'";
    		Statement st1=con.createStatement();
			ResultSet rs1=st1.executeQuery(q);
			while(rs1.next())
			{
				//System.out.println(rs1.getString("Iid"));
				String iid=rs1.getString("Iid");
				System.out.println(iid);
				String q1="select * from item where Iid = '"+iid+"'";
				Statement st2=con.createStatement();
				ResultSet rs2=st2.executeQuery(q1);
				rs2.next();
				String name=rs2.getString("iname");
				String cat=rs2.getString("category");
				int price=rs2.getInt("price");
				int ra=rs2.getInt("iratings");
				//boolean select = false;
				System.out.println(name+cat+price+ra);
				Object tbdata[]= {name,price,cat,ra,};
	    		DefaultTableModel tblModel=(DefaultTableModel) jTable1.getModel();
	    		tblModel.addRow(tbdata);
				
			}
			
			
    	}
        catch(Exception e)
        {
        	
        }       
        
    }      
    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }  
    
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) { 
    	//item_enter.setText("");
        String item=item_enter.getText();
        //System.out.println(item);
        CallableStatement cstmt = null;

        try {
            String sql = "{CALL get_item_id(?, ?)}";
            cstmt = con.prepareCall(sql);
            cstmt.setString(1, item);
            cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);

            cstmt.execute();

            String iid = cstmt.getString(2);
            System.out.println(iid);
            System.out.println(rid);
           String q="select * from menu where iid='"+iid+"' and rid ='"+rid+"'";
    		Statement st1=con.createStatement();
			ResultSet rs1=st1.executeQuery(q);
			if (rs1.next())
			{
				String quantity = (String) qty.getSelectedItem();
				orders_entry();
				//System.out.println(quantity);
				String query = "INSERT INTO ORDER_DETAILS (Oid, Iid, price, Qty) VALUES (?, ?, ?, ?)";
				PreparedStatement statement = con.prepareStatement(query);
				CallableStatement callableStatement = null;
				 callableStatement = con.prepareCall("{call GetItemPrice(?, ?)}");
		          callableStatement.setString(1, iid);
		         callableStatement.registerOutParameter(2, java.sql.Types.NUMERIC);
		         callableStatement.execute();

		            // Get the output parameter value
		         double price = callableStatement.getDouble(2);
		         //int quant = Integer.parseInt(quantity);
		         //System.out.println(price);
		         //price=quant*price;
		         //System.out.println(price);
		         
				statement.setString(1, oid); // Oid
				statement.setString(2, iid); // Iid
				statement.setDouble(3,price );      // price
				statement.setString(4, quantity);           // Qty
				int r = statement.executeUpdate();
				JOptionPane.showMessageDialog(null,"Item added to cart!");
			}
				
			else
				JOptionPane.showMessageDialog(null,"No matching items found!");
            
            
            
            
        } catch (SQLException e) {
            //e.printStackTrace();
        	JOptionPane.showMessageDialog(null,"No matching items found!");
        }    
        		
    }                                   

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {                                     
    	Customer_order l = new Customer_order();
     	this.dispose();
     	l.setVisible(true);
    }     

    private void search_itemActionPerformed(java.awt.event.ActionEvent evt) {   
    	item.setText("");
       String iname=jTextField1.getText();
       System.out.println(iname);
       String q="select * from item where iname='"+iname+"'";
       try
       {
    	   	Statement st1=con.createStatement();
   			ResultSet rs1=st1.executeQuery(q);
   			if (rs1.next())
   			{
   	   			item.append(rs1.getString("idesc")+"\n");
   	   			item.append("Guiltfree : "+ rs1.getString("guiltfree")+"\n");
   	   			item.append("Jain : "+ rs1.getString("jain")+"\n");
   			}
   				
   			else
   				item.append("Oops no item found :<");

       }
       catch(Exception e)
       {
    	   
       }
       
		
       
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton add;
    private javax.swing.JTextArea item;
    private javax.swing.JTextField item_enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea location;
    private javax.swing.JComboBox<String> qty;
    private javax.swing.JTextField search;
    private javax.swing.JButton search_item;
    private javax.swing.JButton search_rest;
    private javax.swing.JButton view;
    // End of variables declaration                   
}
