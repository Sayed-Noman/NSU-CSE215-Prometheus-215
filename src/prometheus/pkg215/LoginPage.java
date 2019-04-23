/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prometheus.pkg215;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class LoginPage extends javax.swing.JFrame {

    //creating connection to database
    Connection connection;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();

        connection = JavaDbConnect.databaseConnect();

        //thes two line will ste the jframe screen into the middle
        //Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        // this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);
        // this.setBackground(new Color(0,0,0,0));
        Login_base_panel.setBackground(new Color(0, 0, 0, 0));
        User_id_textfield.setBackground(new Color(0, 0, 0, 0));
        password_field.setBackground(new Color(0, 0, 0, 0));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login_base_panel = new javax.swing.JPanel();
        welcome_lable = new javax.swing.JLabel();
        User_id_textfield = new javax.swing.JTextField();
        password_lable = new javax.swing.JLabel();
        separetor_username = new javax.swing.JSeparator();
        password_field = new javax.swing.JPasswordField();
        separetor_password = new javax.swing.JSeparator();
        Login_button = new javax.swing.JButton();
        dont_have_account_label = new javax.swing.JLabel();
        login_adminType_combobox = new javax.swing.JComboBox<>();
        user_id_lable = new javax.swing.JLabel();
        forgot_password_label = new javax.swing.JLabel();
        exit_button = new javax.swing.JButton();
        home_button = new javax.swing.JButton();
        login_adminType_label = new javax.swing.JLabel();
        login_background_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Login_base_panel.setMaximumSize(new java.awt.Dimension(1500, 1000));
        Login_base_panel.setMinimumSize(new java.awt.Dimension(1500, 1000));
        Login_base_panel.setPreferredSize(new java.awt.Dimension(950, 510));
        Login_base_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome_lable.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        welcome_lable.setText("Welcome to Prometheus-215");
        Login_base_panel.add(welcome_lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 50));

        User_id_textfield.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        User_id_textfield.setForeground(new java.awt.Color(228, 241, 254));
        User_id_textfield.setText("Enter Username");
        User_id_textfield.setBorder(null);
        User_id_textfield.setOpaque(false);
        User_id_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_id_textfieldActionPerformed(evt);
            }
        });
        Login_base_panel.add(User_id_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 390, 50));

        password_lable.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 20)); // NOI18N
        password_lable.setForeground(new java.awt.Color(255, 255, 255));
        password_lable.setText("Password");
        Login_base_panel.add(password_lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 340, 50));
        Login_base_panel.add(separetor_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 390, 30));

        password_field.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password_field.setForeground(new java.awt.Color(228, 241, 254));
        password_field.setText("password");
        password_field.setBorder(null);
        password_field.setOpaque(false);
        Login_base_panel.add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 390, 50));
        Login_base_panel.add(separetor_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 390, 30));

        Login_button.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        Login_button.setForeground(new java.awt.Color(255, 255, 255));
        Login_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Desktop\\java home examples\\Prometheus-215\\images\\prometheus_icons\\login_big_icon.png")); // NOI18N
        Login_button.setText("Login");
        Login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_buttonActionPerformed(evt);
            }
        });
        Login_base_panel.add(Login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 330, 50));

        dont_have_account_label.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        dont_have_account_label.setForeground(new java.awt.Color(204, 204, 204));
        dont_have_account_label.setText("Don't have an accoun?");
        dont_have_account_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dont_have_account_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dont_have_account_labelMouseClicked(evt);
            }
        });
        Login_base_panel.add(dont_have_account_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 130, 50));

        login_adminType_combobox.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 13)); // NOI18N
        login_adminType_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Traffic Police", "Driver" }));
        Login_base_panel.add(login_adminType_combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 120, 40));

        user_id_lable.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 20)); // NOI18N
        user_id_lable.setForeground(new java.awt.Color(255, 255, 255));
        user_id_lable.setText("User Id");
        Login_base_panel.add(user_id_lable, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 340, 50));

        forgot_password_label.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        forgot_password_label.setForeground(new java.awt.Color(204, 204, 204));
        forgot_password_label.setText("Forgot Password?");
        forgot_password_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgot_password_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgot_password_labelMouseClicked(evt);
            }
        });
        Login_base_panel.add(forgot_password_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 100, 50));

        exit_button.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        exit_button.setForeground(new java.awt.Color(255, 255, 255));
        exit_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Desktop\\java home examples\\Prometheus-215\\images\\prometheus_icons\\exit_big_icon.png")); // NOI18N
        exit_button.setBorder(null);
        exit_button.setOpaque(false);
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });
        Login_base_panel.add(exit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 50, 30));

        home_button.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        home_button.setForeground(new java.awt.Color(255, 255, 255));
        home_button.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Desktop\\java home examples\\Prometheus-215\\images\\prometheus_icons\\home_big_icon.png")); // NOI18N
        home_button.setBorder(null);
        home_button.setOpaque(false);
        home_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_buttonActionPerformed(evt);
            }
        });
        Login_base_panel.add(home_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 40, 30));

        login_adminType_label.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 20)); // NOI18N
        login_adminType_label.setForeground(new java.awt.Color(255, 255, 255));
        login_adminType_label.setText("Admin Type");
        Login_base_panel.add(login_adminType_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 120, 50));

        login_background_image.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Desktop\\java home examples\\Prometheus-215\\images\\prometheus_backgrounds\\Login_background.jpg")); // NOI18N
        Login_base_panel.add(login_background_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -150, 1000, 840));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Login_base_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Login_base_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        setSize(new java.awt.Dimension(976, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_buttonActionPerformed
        // TODO add your handling code here:
        String sql = "select * from accounts where UserId=? and Password=? and AdminType=?";

        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, User_id_textfield.getText());
            pst.setString(2, password_field.getText());
            pst.setString(3, (String) login_adminType_combobox.getSelectedItem());
            String pass_user_Id = User_id_textfield.getText();
            rs = pst.executeQuery();

            if (rs.next()) {

                JOptionPane.showMessageDialog(null, "User Id and Password Matched and You are Loged in as " + rs.getString("AdminType"));
                rs.close();
                pst.close();
                if (login_adminType_combobox.getSelectedIndex() == 0) {
                    
                        this.setVisible(false);
                        TrafficPolicePage tf = new TrafficPolicePage();
                        tf.setVisible(true);
                     
                } else if (login_adminType_combobox.getSelectedIndex() == 1) {
                  
                        this.setVisible(false);
                        DriverPage dp = new DriverPage(pass_user_Id);
                        dp.setVisible(true);
                    
                      
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid UserName and Password");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        } finally {
            try {
                rs.close();
                pst.close();
                connection.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_Login_buttonActionPerformed

    private void home_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_buttonActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        HomePage hp = new HomePage();
        hp.setVisible(true);


    }//GEN-LAST:event_home_buttonActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void forgot_password_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgot_password_labelMouseClicked
        // TODO add your handling code here:
        try {
            this.setVisible(false);
            forgotPasswordPage fp = new forgotPasswordPage();
            fp.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
                pst.close();
                connection.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_forgot_password_labelMouseClicked

    private void dont_have_account_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dont_have_account_labelMouseClicked
        // TODO add your handling code here:
        try{
        this.setVisible(false);
        CreatAccountPage cp = new CreatAccountPage();
        cp.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } finally {
            try {
                rs.close();
                pst.close();
                connection.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_dont_have_account_labelMouseClicked

    private void User_id_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_User_id_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_User_id_textfieldActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login_base_panel;
    private javax.swing.JButton Login_button;
    private javax.swing.JTextField User_id_textfield;
    private javax.swing.JLabel dont_have_account_label;
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel forgot_password_label;
    private javax.swing.JButton home_button;
    private javax.swing.JComboBox<String> login_adminType_combobox;
    private javax.swing.JLabel login_adminType_label;
    private javax.swing.JLabel login_background_image;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JLabel password_lable;
    private javax.swing.JSeparator separetor_password;
    private javax.swing.JSeparator separetor_username;
    private javax.swing.JLabel user_id_lable;
    private javax.swing.JLabel welcome_lable;
    // End of variables declaration//GEN-END:variables
}
