/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Divya Sharma
 */
public class CreateHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateRestaurantJPanel
     */
     private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private RestaurantDirectory restaurantdirectory;
    
    
    public CreateHospitalJPanel(JPanel userProcessContainer, EcoSystem ecosystem, RestaurantDirectory restaurantdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.restaurantdirectory = ecosystem.getRestaurantDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        titleCreateRestaurant = new javax.swing.JLabel();
        lblRestaurant = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtRestaurant = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblManager = new javax.swing.JLabel();
        txtManager = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(151, 145, 151));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1685, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 306, 165, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 66, 49, 23));

        titleCreateRestaurant.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleCreateRestaurant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleCreateRestaurant.setText("CREATE RESTAURANT");
        add(titleCreateRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 29, 734, -1));

        lblRestaurant.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblRestaurant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestaurant.setText("RESTAURANT");
        add(lblRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 102, 121, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("PASSWORD");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 361, 121, -1));

        txtRestaurant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 95, 165, -1));

        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 357, 165, -1));

        lblManager.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManager.setText("MANAGER");
        add(lblManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 213, 121, -1));

        txtManager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 206, 165, -1));

        lblContact.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblContact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContact.setText("CONTACT");
        add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 256, 121, 20));

        txtContact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 256, 165, -1));

        lblAddress.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress.setText("ADDRESS");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 155, 121, -1));

        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 148, 165, -1));

        btnCreate.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnCreate.setText("CREATE");
        btnCreate.setBorder(new javax.swing.border.MatteBorder(null));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 439, 94, 29));

        lblUserName.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("USERNAME");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 310, 121, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 4, 1680, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageHospitalJPanel mrjp = (ManageHospitalJPanel) component;
        mrjp.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if(txtRestaurant.getText().isEmpty() || txtAddress.getText().isEmpty() || txtContact.getText().isEmpty() || 
                txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty() || txtManager.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }

        String restaurantName = txtRestaurant.getText();
        String managerName = txtManager.getText();

        boolean flag ;

        flag = restaurantName.matches("^[a-zA-Z]+$");

        if(flag == false) {
            JOptionPane.showMessageDialog(null, "First name cannot have integer values");
            return;
        }

        flag = managerName.matches("^[a-zA-Z]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Last name cannot have integer values");
            return;
        }

        String phoneNumber = txtContact.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }
        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }
        
        for(Restaurant restaurant : restaurantdirectory.getRestaurantDirectory()) {
            if(restaurant.getPhoneNumber().equals(phoneNumber)) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists");
                return;
            }
        }


        String address = txtAddress.getText();
        String userName = txtUsername.getText();
        String password = txtPassword.getText();

        for(UserAccount account : ecosystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                return;
            }
        }

        //Restaurant restaurant = restaurantDirectory.newRestaurant(restaurantName, address, managerName, phoneNumber);
        //System.out.println(restaurant.getRestaurantName() + " + ");
        System.out.println("Eco" + ecosystem.getRestaurantDirectory().getRestaurantDirectory().size());
        ecosystem.getRestaurantDirectory().newRestaurant(restaurantName, address, managerName, phoneNumber);
        
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(restaurantName);
        UserAccount userAccount = ecosystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new AdminRole());

        JOptionPane.showMessageDialog(null, "Restaurant Created");

    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRestaurant;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel titleCreateRestaurant;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtManager;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRestaurant;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}