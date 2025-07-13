import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Register_driver extends javax.swing.JFrame {

    Connection con=MyConnection.getConnection();
    public Register_driver() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        aadhar = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        block = new javax.swing.JTextField();
        street = new javax.swing.JTextField();
        area = new javax.swing.JTextField();
        pincode = new javax.swing.JTextField();
        login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Drive Your Success: Join Our Delivery Partner Team Today!");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Your Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Aadhar Number:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email : ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DOB :");

        name.setBackground(new java.awt.Color(255, 102, 0));

        phone.setBackground(new java.awt.Color(255, 102, 0));

        aadhar.setBackground(new java.awt.Color(255, 102, 0));

        email.setBackground(new java.awt.Color(255, 102, 0));

        dob.setBackground(new java.awt.Color(255, 102, 0));
        dob.setText("yyyy-mm-dd");

        password.setBackground(new java.awt.Color(255, 102, 0));
        password.setText("jPasswordField1");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Address :");

        block.setBackground(new java.awt.Color(255, 102, 0));
        block.setText("block");

        street.setBackground(new java.awt.Color(255, 102, 0));
        street.setText("street");

        area.setBackground(new java.awt.Color(255, 102, 0));
        area.setText("area");

        pincode.setBackground(new java.awt.Color(255, 102, 0));
        pincode.setText("pincode");

        login.setBackground(new java.awt.Color(255, 255, 0));
        login.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(487, 487, 487)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pincode, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(429, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(aadhar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(block, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(login)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	try
		{
			Statement st = con.createStatement();
			String query="CREATE TABLE DRIVER_INFO (\r\n"
					+ "  Did VARCHAR(15) CHECK(Did LIKE 'D%') PRIMARY KEY,\r\n"
					+ "  Daadhar NUMBER(12) UNIQUE NOT NULL,\r\n"
					+ "  password VARCHAR(20) CHECK(length(password)>8),\r\n"
					+ "  Dname VARCHAR(40) NOT NULL,\r\n"
					+ "  Dphone NUMBER(10) UNIQUE,\r\n"
					+ "  Dstatus CHAR(1) CHECK(Dstatus IN ('y','n')),\r\n"
					+ "  Dpin NUMBER(6) NOT NULL,\r\n"
					+ "  Demail VARCHAR(40),\r\n"
					+ "  dob VARCHAR(20),\r\n"
					+ "  Dratings NUMBER CHECK(Dratings BETWEEN 0 AND 5)\r\n"
					+ ")";

			st.executeUpdate(query);
			
			Statement st1 = con.createStatement();
			String query1="CREATE TABLE DRIVER_ADDRESS (\r\n"
					+ "  Aid VARCHAR(20) CHECK (Aid LIKE 'DA%') PRIMARY KEY,\r\n"
					+ "  block VARCHAR(50),\r\n"
					+ "  street VARCHAR(50),\r\n"
					+ "  area VARCHAR(50)\r\n"
					+ ")";

			st1.executeUpdate(query1);
			
			Statement st2 = con.createStatement();
			String query2="CREATE TABLE DRIVER_ADD_MAP (\r\n"
					+ "  Aid VARCHAR(20) CHECK(Aid LIKE 'DA%'),\r\n"
					+ "  Did VARCHAR(15) CHECK(Did LIKE 'D%'),\r\n"
					+ "  PRIMARY KEY (Aid, Did),\r\n"
					+ "  FOREIGN KEY (Did) REFERENCES DRIVER_INFO(Did),\r\n"
					+ "  FOREIGN KEY (Aid) REFERENCES DRIVER_ADDRESS(Aid)\r\n"
					+ ")";

			st2.executeUpdate(query2);
			
			
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
    	
    	String query="INSERT INTO DRIVER_INFO (Did, Daadhar, password, Dname, Dphone, Dstatus, Dpin, Demail, dob, Dratings)\r\n"
    			+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
   	 	String name_driver= name.getText();
        String email_driver= email.getText();
    	 String pass=String.valueOf(password.getPassword());
    	 String phone_driver= phone.getText();
    	String block_driver= block.getText();
    	String street_driver= street.getText();
    	String area_driver= area.getText();
    	String pincode_driver= pincode.getText();
    	String aadhar_driver= aadhar.getText();
    	String dob_driver= dob.getText();
    	if ( name_driver.length()==0 || email_driver.length()==0 || aadhar_driver.length()==0 || phone_driver.length()==0 
     			||block_driver.length()==0||street_driver.length()==0||area_driver.length()==0
     			||pincode_driver.length()==0)
     	{
     		JOptionPane.showMessageDialog(null,"Please fill out all fields.");
     	}
     	else if (pass.length()<8)
     		JOptionPane.showMessageDialog(null,"Password must be atleast 8 characters long");
     	else if (phone_driver.length()!=10)
     		JOptionPane.showMessageDialog(null,"Invalid Phone number");
     	else if (pincode_driver.length()!=6 )
     		JOptionPane.showMessageDialog(null,"Invalid Pincode");
     	else if (aadhar_driver.length()!=12)
     		JOptionPane.showMessageDialog(null,"Invalid Aadhar Number");
     	else
     	{
     		int flag=0;
     		//CUSTOMER_INFO
     		PreparedStatement ps;
    		String did_trial=IdGenerator.generateDriverId();
    		String aid_trial=IdGenerator.generateDriverAddressId();
    		System.out.println(did_trial);
    		System.out.println(aid_trial);
    		try
            {
                ps=MyConnection.getConnection().prepareStatement(query);
                
                ps.setString(1,did_trial);
                ps.setString(2,aadhar_driver);
                ps.setString(3,pass);
                ps.setString(4,name_driver);
                ps.setString(5,phone_driver);
                ps.setString(6, "y");
                ps.setString(7,pincode_driver);
                ps.setString(8,email_driver);
                ps.setString(9,dob_driver);
                ps.setInt(10,0);
                
                    
                if (ps.executeUpdate()>0)
                {
                	//JOptionPane.showMessageDialog(null,"Login Successful!\nDelicious Food Delivered to You");
                    System.out.println("DRIVER ID : "+did_trial);
                    
                }
            }
            catch(SQLException e)
            {
            	flag=1;
            	//JOptionPane.showMessageDialog(null,"An error occurred during login.\nPlease try again shortly.");
            	System.out.println(e);
            }
    		
    		//CUSTOMER_ADDress
    		PreparedStatement ps1;
    		
            String query1="INSERT INTO DRIVER_ADDRESS (Aid, block, street, area) VALUES (?, ?, ?, ?)";
            try
            {
                ps1=MyConnection.getConnection().prepareStatement(query1);
                
                ps1.setString(1,aid_trial);
                ps1.setString(2,block_driver);
                ps1.setString(3,street_driver);
                ps1.setString(4,area_driver);

                
                   
                if (ps1.executeUpdate()>0)
                {
                    //JOptionPane.showMessageDialog(null,"");
                	System.out.println("ADDRESS ID : "+aid_trial);
                }
                
                
            }
            catch(SQLException e)
            {
            	flag=1;
            	//JOptionPane.showMessageDialog(null,"An error occurred during login.\nPlease try again shortly.");
            	System.out.println("driver address :"+e);
            }
            
            //CUSTOMER_ADD_MAP
            PreparedStatement ps2;
    		
            String query2="INSERT INTO DRIVER_ADD_MAP (Aid, Did) VALUES (?, ?)";
            		
            try
            {
                ps2=MyConnection.getConnection().prepareStatement(query2);
                
                ps2.setString(1,aid_trial);
                ps2.setString(2,did_trial);
               
                
                   
                if (ps2.executeUpdate()>0)
                {
                	//JOptionPane.showMessageDialog(null,"Login Successful!\nDelicious Food Delivered to You");
                
                }
                
                
            }
            catch(SQLException e)
            {
            	flag=1;
            	//JOptionPane.showMessageDialog(null,"An error occurred during login.\nPlease try again shortly.");
            	System.out.println("driver_add_map "+ e);
            }
            if (flag==0)
            	JOptionPane.showMessageDialog(null,"Welcome!\nDrive with Us and Earn on Your Own Schedule!");
            else
            	JOptionPane.showMessageDialog(null,"An error occurred during login.\nPlease try again shortly.");
     	}
    	
    	
    	
    	
    	
    }  //login action ends                                   

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
            java.util.logging.Logger.getLogger(Register_driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_driver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_driver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField aadhar;
    private javax.swing.JTextField area;
    private javax.swing.JTextField block;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField pincode;
    private javax.swing.JTextField street;
    // End of variables declaration                   
}
