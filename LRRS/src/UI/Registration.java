/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Databse.Database;
import Enums.UserType;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hiruni CH
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    
    private User user;
    private Connection connection;
    private PreparedStatement statement;
    
    public Registration() {
        initComponents();
        this.setResizable(false); 
        this.setLocationRelativeTo(null);
    }
    
    
    
     public Registration(User user) {
        initComponents();
        this.setResizable(false); 
        this.setLocationRelativeTo(null);
        this.user = user;
        
        connection = Database.openConnection();
        
    }
     
     
     private void clear(){
         txt_first_name.setText("");
         txt_last_name.setText("");
         txt_password.setText("");
         txt_comfirm_password.setText("");
         cmb_userType.setSelectedIndex(-1);
         txt_user_id.setText("");
     }
     
     
      private void showError(String msg){
        JOptionPane.showMessageDialog(this, msg, "ERROR", JOptionPane.ERROR_MESSAGE);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_first_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_last_name = new javax.swing.JTextField();
        txt_user_id = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_comfirm_password = new javax.swing.JPasswordField();
        btn_register = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        cmb_userType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(13, 13, 41));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Register New User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(10, 10, 10))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Password");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("User ID");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("User Type");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("First Name");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Last Name");

        txt_first_name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Comfirm Password");

        txt_last_name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_last_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_last_nameActionPerformed(evt);
            }
        });

        txt_user_id.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_user_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_user_idActionPerformed(evt);
            }
        });

        txt_password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        txt_comfirm_password.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_comfirm_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_comfirm_passwordActionPerformed(evt);
            }
        });

        btn_register.setBackground(new java.awt.Color(0, 100, 0));
        btn_register.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_register.setForeground(java.awt.Color.white);
        btn_register.setText("Register");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        btn_cancel.setBackground(java.awt.Color.red);
        btn_cancel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_cancel.setForeground(java.awt.Color.white);
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_clear.setBackground(java.awt.Color.blue);
        btn_clear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_clear.setForeground(java.awt.Color.white);
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        cmb_userType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "STUDENT", "NON ACADEMIC", "STAFF" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_first_name)
                            .addComponent(txt_last_name)
                            .addComponent(txt_user_id)
                            .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txt_comfirm_password, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(cmb_userType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(116, Short.MAX_VALUE)
                        .addComponent(btn_clear)
                        .addGap(84, 84, 84)
                        .addComponent(btn_register)
                        .addGap(54, 54, 54)))
                .addGap(33, 33, 33)
                .addComponent(btn_cancel)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmb_userType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_user_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_comfirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_register)
                    .addComponent(btn_cancel)
                    .addComponent(btn_clear))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_comfirm_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_comfirm_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_comfirm_passwordActionPerformed

    private void txt_last_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_last_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_last_nameActionPerformed

    private void txt_user_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_user_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_user_idActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
        
        
        String firstName = txt_first_name.getText().trim();
        String lastName = txt_last_name.getText().trim();
        
//        ADMIN, STUDENT, NON ACADEMIC, STAFF
        
        String userType = cmb_userType.getSelectedItem().toString();
        
        UserType userTypeEnum;
        
        if(userType.equals("ADMIN")){
            userTypeEnum = UserType.ADMIN;
        }else if(userType.equals("STUDENT")){
            userTypeEnum = UserType.STUDENT;
        }else if(userType.equals("STAFF")){
            userTypeEnum = UserType.STAFF;
        }else{
            userTypeEnum = UserType.NON_ACADEMIC;
        }
        
        String userID = txt_user_id.getText().trim();
        
        String password = String.valueOf(txt_password.getPassword());
        String confirmPassword = String.valueOf(txt_comfirm_password.getPassword());
        
        
        if(firstName.isEmpty() || lastName.isEmpty() || userID.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()){
            showError("All fields required");
        }else if(!password.equals(confirmPassword)){
            showError("Passwords doesn't match");
        }else{
            
            try {
                statement = connection.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?)");
                
                statement.setString(1, userID);
                statement.setString(2, userTypeEnum.toString());
                statement.setString(3, lastName);
                statement.setString(4, firstName);
                statement.setString(5, password);
                
                int res = statement.executeUpdate();
                
                if(res == 1){
                    
                    JOptionPane.showMessageDialog(this, "Registration Success", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    
                }else {
                    showError("Registration failed");
                }
                
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
        
        
    }//GEN-LAST:event_btn_registerActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        
        clear();
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_register;
    private javax.swing.JComboBox<String> cmb_userType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txt_comfirm_password;
    private javax.swing.JTextField txt_first_name;
    private javax.swing.JTextField txt_last_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user_id;
    // End of variables declaration//GEN-END:variables
}
