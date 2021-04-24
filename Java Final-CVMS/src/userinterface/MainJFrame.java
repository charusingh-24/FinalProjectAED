/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import Business.Organization;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.ModifyHospitalJPanel;

/**
 *
 * @author Lingfeng
 * @author charusingh
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private CustomerDirectory customerDirectory;
    private RestaurantDirectory restaurantDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private MenuDirectory menuDirectory;
    private OrderDirectory orderDirectory;

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);

        customerDirectory = new CustomerDirectory();
        restaurantDirectory = new RestaurantDirectory();
        deliveryManDirectory = new DeliveryManDirectory();
        menuDirectory = new MenuDirectory();
        orderDirectory = new OrderDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoutJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        container = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1680, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutJButton.setFont(new java.awt.Font("Tahoma", 3, 8)); // NOI18N
        logoutJButton.setText("LOGOUT");
        logoutJButton.setBorder(new javax.swing.border.MatteBorder(null));
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, 92, 26));
        logoutJButton.setVisible(false);

        userNameJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(userNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 150, -1));

        jLabel1.setBackground(new java.awt.Color(222, 213, 213));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER NAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 100, 30));

        passwordField.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 240, 150, -1));

        loginJButton.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(204, 204, 204));
        loginJButton.setText("LOGIN");
        loginJButton.setBorder(new javax.swing.border.MatteBorder(null));
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 118, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("FORGOT PASSWORD");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 150, 20));

        jPasswordField1.setVisible(false);
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 140, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("CHANGE PASSWORD");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.setVisible(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 140, -1));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        label1.setText("NEW PASSWORD");
        label1.setVisible(false);
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 360, 150, -1));

        container.setLayout(new java.awt.CardLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/coronavirus.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(1680, 700));
        jLabel3.setMinimumSize(new java.awt.Dimension(1680, 700));
        jLabel3.setPreferredSize(new java.awt.Dimension(1680, 700));
        container.add(jLabel3, "card2");

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        loginJButton.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        userNameJTextField.setVisible(true);
        passwordField.setVisible(true);
        jButton1.setVisible(true);
        logoutJButton.setVisible(false);
        container.setVisible(false);

        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLout = (CardLayout) container.getLayout();
        crdLout.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed

        String password = String.valueOf(passwordField.getPassword());
        if (userNameJTextField.getText().isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username and Password cannot be empty");
            return;
        } else if (system.getUserAccountDirectory().authenticateUser(userNameJTextField.getText(), password) == null) {
            JOptionPane.showMessageDialog(null, "Invalid UserName");
            return;
        }
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userNameJTextField.getText(), password);       
        System.out.println("ECOSYSTEM MAIN" + system.toString() + system.getUserAccountDirectory().getUserAccountList().size());

        container.setVisible(true);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, system, customerDirectory, restaurantDirectory, deliveryManDirectory, menuDirectory, orderDirectory));
        layout.next(container);
        logoutJButton.setEnabled(true);
        loginJButton.setVisible(false);
        logoutJButton.setVisible(true);
        jButton1.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jPasswordField1.setVisible(false);
        jButton2.setVisible(false);
        label1.setVisible(false);
        userNameJTextField.setVisible(false);
        passwordField.setVisible(false);
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
        label1.setVisible(true);
        jPasswordField1.setVisible(true);
        jButton2.setVisible(true);
//        Forgotpaswrd fPassword = new Forgotpaswrd();
        // TODO add your handling code here:
//        this.setVisible(false);
//        Forgotpaswrd fpassword = new Forgotpaswrd();
//        fpassword.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        String newPassword = String.valueOf(jPasswordField1.getPassword());
        if (userNameJTextField.getText().isEmpty() || newPassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username, New Password field's cannot be empty");
            return;
        } else if (system.getUserAccountDirectory().forgotPasswordUser(userNameJTextField.getText()) == null) {
            JOptionPane.showMessageDialog(null, "Invalid UserName");
            return;
        }
        UserAccount userAccount = system.getUserAccountDirectory().forgotPasswordUser(userNameJTextField.getText());
        system.getUserAccountDirectory().updateUserAccount(userAccount, newPassword);
        jPasswordField1.setVisible(false);
        jButton2.setVisible(false);
        label1.setVisible(false);
        jPasswordField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private java.awt.Label label1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
