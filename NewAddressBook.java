/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummyproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nancy
 */
public class NewAddressBook extends javax.swing.JFrame {

    String uname="root";
     String pass="1602@nancy";
     String  name,address,gender,office,bankname,ifsccode,emailid,city,phone,accountno;
      
     String query;
     
     
     Connection con;
     Statement smt;
     String url="jdbc:mysql://localhost:3306/demo3schema";
     
     DefaultTableModel dtbl;
   // private JButtonInputAction aThis;
   // private Table_Swing This;
    public NewAddressBook() {
        initComponents();
    }
    
    public void connect() throws Exception
    {
        con=DriverManager.getConnection(url,uname,pass);
        System.out.println("Connected");
        query ="select*from new_table3";
        smt=con.createStatement();
        ResultSet rs=smt.executeQuery(query);
        while(rs.next())
        {
            
            name=rs.getString("name");
           address=rs.getString("address");
           phone=rs.getString("phone");
           gender=rs.getString("gender");
           office=rs.getString("office");
           bankname=rs.getString("bankname");
           accountno=rs.getString("accountno");
           ifsccode=rs.getString("ifsccode");
           emailid=rs.getString("emailid");
           city=rs.getString("city");  
           String[] tb1data={name,address,phone,gender,office,bankname,accountno,ifsccode,emailid,city};
           dtbl = (DefaultTableModel)Addressjtable.getModel();
           dtbl.addRow(tb1data);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        officejTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phonejTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressjTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        malejRadioButton = new javax.swing.JRadioButton();
        femalejRadioButton = new javax.swing.JRadioButton();
        otherjRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        banknamejTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        accountnojTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ifsccodejTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        emailidjTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cityjComboBox = new javax.swing.JComboBox<>();
        addjButton = new javax.swing.JButton();
        searchjButton = new javax.swing.JButton();
        updatejButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        canceljButton = new javax.swing.JButton();
        resetjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Addressjtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Address Book");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name");

        namejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Address");

        officejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                officejTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Phone");

        phonejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonejTextFieldActionPerformed(evt);
            }
        });

        addressjTextArea.setColumns(20);
        addressjTextArea.setRows(5);
        jScrollPane1.setViewportView(addressjTextArea);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gender");

        malejRadioButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        malejRadioButton.setText("Male");
        malejRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malejRadioButtonActionPerformed(evt);
            }
        });

        femalejRadioButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        femalejRadioButton.setText("Female");
        femalejRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femalejRadioButtonActionPerformed(evt);
            }
        });

        otherjRadioButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        otherjRadioButton.setText("Other");
        otherjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherjRadioButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Office");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Bank Name");

        banknamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banknamejTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Account no.");

        accountnojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountnojTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("IFSC Code");

        ifsccodejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ifsccodejTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Email ID");

        emailidjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailidjTextFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("City ");

        cityjComboBox.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cityjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Jaipur", "Mumbai", "Kolkata", "Chennai", "Delhi", "Bengaluru", "Hyderabad", "Ahmedabad", "Pune", "Lucknow", "Other" }));
        cityjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityjComboBoxActionPerformed(evt);
            }
        });

        addjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addjButton.setText("Add");
        addjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButtonActionPerformed(evt);
            }
        });

        searchjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchjButton.setText("Search");
        searchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButtonActionPerformed(evt);
            }
        });

        updatejButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        deletejButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deletejButton.setText("Delete");
        deletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButtonActionPerformed(evt);
            }
        });

        canceljButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        canceljButton.setText("Cancel");
        canceljButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceljButtonActionPerformed(evt);
            }
        });

        resetjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        resetjButton.setText("Recet");
        resetjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetjButtonActionPerformed(evt);
            }
        });

        Addressjtable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Addressjtable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Addressjtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Address", "Phone", "Gender", "Office", "Bankname", "Account no", "IFSCCode", "Email ID", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Addressjtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddressjtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Addressjtable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(malejRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(femalejRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(otherjRadioButton))
                    .addComponent(officejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(banknamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountnojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ifsccodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailidjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deletejButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchjButton)
                            .addComponent(canceljButton))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updatejButton)
                            .addComponent(resetjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(809, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(malejRadioButton)
                            .addComponent(femalejRadioButton)
                            .addComponent(otherjRadioButton))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(officejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(banknamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(accountnojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ifsccodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailidjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cityjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addjButton)
                    .addComponent(searchjButton)
                    .addComponent(updatejButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canceljButton)
                    .addComponent(deletejButton)
                    .addComponent(resetjButton))
                .addGap(28, 28, 28))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namejTextFieldActionPerformed

    private void phonejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonejTextFieldActionPerformed

    private void officejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_officejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_officejTextFieldActionPerformed

    private void banknamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banknamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_banknamejTextFieldActionPerformed

    private void accountnojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountnojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountnojTextFieldActionPerformed

    private void ifsccodejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ifsccodejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ifsccodejTextFieldActionPerformed

    private void emailidjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailidjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailidjTextFieldActionPerformed

    private void cityjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityjComboBoxActionPerformed

    private void addjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButtonActionPerformed
       
        accept();
        try {
            adddata();
        } catch (SQLException ex) {
            Logger.getLogger(NewAddressBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
       {
           connect();
       } catch (Exception ex) {
            Logger.getLogger(NewAddressBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addjButtonActionPerformed

    private void searchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButtonActionPerformed
               String text;
        text = JoptionPane.showInputDialog(this, "enter name");
        try{
            
            connect();
        } catch (Exception ex) {
            Logger.getLogger(NewAddressBook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchjButtonActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
       gatdata();
        System.out.println("name"+name);
        System.out.println("address"+address);
        System.out.println("phone"+phone);
        System.out.println("emailid"+emailid);
       
        
        try
        {
             update();
        } catch (SQLException ex) {
            Logger.getLogger(NewAddressBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
       
    }//GEN-LAST:event_updatejButtonActionPerformed

    private void deletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButtonActionPerformed
       // dispose();
    }//GEN-LAST:event_deletejButtonActionPerformed

    private void canceljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceljButtonActionPerformed
       //this.dispose();
    }//GEN-LAST:event_canceljButtonActionPerformed

    private void resetjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetjButtonActionPerformed
        namejTextField.setText("");
        addressjTextArea.setText(" ");
        phonejTextField.setText("");
        officejTextField.setText("");
        banknamejTextField.setText("");
        accountnojTextField.setText("");
        ifsccodejTextField.setText("");
        emailidjTextField.setText("");
        cityjComboBox.setSelectedItem("Select");
        malejRadioButton.setSelected(false);
        femalejRadioButton.setSelected(false);
        otherjRadioButton.setSelected(false);
       

        
    }//GEN-LAST:event_resetjButtonActionPerformed

    private void malejRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malejRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_malejRadioButtonActionPerformed

    private void femalejRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femalejRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femalejRadioButtonActionPerformed

    private void otherjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherjRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otherjRadioButtonActionPerformed

    private void AddressjtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddressjtableMouseClicked
        DefaultTableModel tb1=(DefaultTableModel)Addressjtable.getModel();
        name=tb1.getValueAt(Addressjtable.getSelectedRow(),0).toString();
        address=tb1.getValueAt(Addressjtable.getSelectedRow(),1).toString();
        gender=tb1.getValueAt(Addressjtable.getSelectedRow(),2).toString();
        phone=tb1.getValueAt(Addressjtable.getSelectedRow(),3).toString();
        office=tb1.getValueAt(Addressjtable.getSelectedRow(),4).toString();
        bankname=tb1.getValueAt(Addressjtable.getSelectedRow(),5).toString();
        accountno=tb1.getValueAt(Addressjtable.getSelectedRow(),6).toString();
        ifsccode=tb1.getValueAt(Addressjtable.getSelectedRow(),7).toString();
        emailid=tb1.getValueAt(Addressjtable.getSelectedRow(),8).toString();
        city=tb1.getValueAt(Addressjtable.getSelectedRow(),9).toString();
        namejTextField.setText(name);
        phonejTextField.setText(phone);
        officejTextField.setText(office);
        banknamejTextField.setText(bankname);
        accountnojTextField.setText(accountno);
        ifsccodejTextField.setText(ifsccode);
        emailidjTextField.setText(emailid);
        cityjComboBox.setSelectedItem(city);
        addressjTextArea.setText(address); 
    }//GEN-LAST:event_AddressjtableMouseClicked

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
            java.util.logging.Logger.getLogger(NewAddressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAddressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAddressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAddressBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAddressBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Addressjtable;
    private javax.swing.JTextField accountnojTextField;
    private javax.swing.JButton addjButton;
    private javax.swing.JTextArea addressjTextArea;
    private javax.swing.JTextField banknamejTextField;
    private javax.swing.JButton canceljButton;
    private javax.swing.JComboBox<String> cityjComboBox;
    private javax.swing.JButton deletejButton;
    private javax.swing.JTextField emailidjTextField;
    private javax.swing.JRadioButton femalejRadioButton;
    private javax.swing.JTextField ifsccodejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton malejRadioButton;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JTextField officejTextField;
    private javax.swing.JRadioButton otherjRadioButton;
    private javax.swing.JTextField phonejTextField;
    private javax.swing.JButton resetjButton;
    private javax.swing.JButton searchjButton;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables

    private void gatdata() {
        name=namejTextField.getText();
        addressjTextArea.getText(); 
       phone= phonejTextField.getText();
        office=officejTextField.getText();
        bankname=banknamejTextField.getText();
        accountno=accountnojTextField.getText();
        ifsccode=ifsccodejTextField.getText();
       emailid= emailidjTextField.getText();
        city=(String)cityjComboBox.getSelectedItem();
        malejRadioButton.getSelectedIcon();
        femalejRadioButton.getSelectedIcon();
        otherjRadioButton.getSelectedIcon();
        
    }

    private void accept() {
       namejTextField.getText();
       addressjTextArea.getText();
        phonejTextField.getText();
        officejTextField.getText();
        banknamejTextField.getText();
        accountnojTextField.getText();
        ifsccodejTextField.getText();
        emailidjTextField.getText();
        cityjComboBox.getSelectedItem();
        malejRadioButton.getSelectedIcon();
        femalejRadioButton.getSelectedIcon();
        otherjRadioButton.getSelectedIcon();
         
        

          
    }

   

    private void update() throws SQLException {
        
        con=DriverManager.getConnection(url,uname,pass);
        System.out.println("connection");
        query="update  new_table3  set name='"+name+"',address='"+address+"',phone='"+phone+"',emailid='"+emailid+"'";
        
        
        PreparedStatement ps=con.prepareStatement(query);
        ps.executeUpdate();
        
        JoptionPane.showMessageDialog(this, "update Successfully");
        
    }
    
     private void adddata() throws SQLException {
        
        con=DriverManager.getConnection(url,uname,pass);
        System.out.println("connection");
        query=" insert into new_table3 values(?,?,?,?,?,?,?,?,?,?)"; 
        
        PreparedStatement smt=con.prepareStatement(query);
        smt.setString(1, name);
        smt.setString(2, address);
        smt.setString(3, phone);
        smt.setString(4,gender);
        smt.setString(5, office);
        smt.setString(6, bankname);
        smt.setString(7, accountno);
        smt.setString(8, ifsccode);
        smt.setString(9, emailid);
        smt.setString(10, city);
        
        
        
        smt.executeUpdate();
        smt.close();
        con.close();
        
    }
    

   

   
}
