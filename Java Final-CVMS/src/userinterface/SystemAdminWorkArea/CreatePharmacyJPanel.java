/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Divya Sharma
 */
public class CreatePharmacyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDeliveryManJPanel
     */
    
     private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private DeliveryManDirectory deliveryMandirectory;
    
    
    public CreatePharmacyJPanel(JPanel userProcessContainer, EcoSystem ecosystem, DeliveryManDirectory deliveryMandirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.deliveryMandirectory = ecosystem.getDeliveryManDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmailCDM = new javax.swing.JLabel();
        btnBackCDM = new javax.swing.JButton();
        lblAgeCDM = new javax.swing.JLabel();
        lblUserNameCDM = new javax.swing.JLabel();
        lblAddressCDM = new javax.swing.JLabel();
        lblPasswordCDM = new javax.swing.JLabel();
        lblContactCDM = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        titleCreateDeliveryMan = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblFname = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblLname = new javax.swing.JLabel();
        btnCreateCDM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(151, 145, 151));
        setPreferredSize(new java.awt.Dimension(1680, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmailCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblEmailCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmailCDM.setText("EMAIL");
        add(lblEmailCDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 187, 103, -1));

        btnBackCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnBackCDM.setText("BACK");
        btnBackCDM.setBorder(new javax.swing.border.MatteBorder(null));
        btnBackCDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackCDMActionPerformed(evt);
            }
        });
        add(btnBackCDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 43, 61, 23));

        lblAgeCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblAgeCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgeCDM.setText("AGE");
        add(lblAgeCDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 232, 103, -1));

        lblUserNameCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblUserNameCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserNameCDM.setText("USER NAME");
        add(lblUserNameCDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 383, 103, -1));

        lblAddressCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblAddressCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddressCDM.setText("ADDRESS");
        add(lblAddressCDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 283, 103, -1));

        lblPasswordCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblPasswordCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPasswordCDM.setText("PASSWORD");
        add(lblPasswordCDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 424, 103, -1));

        lblContactCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblContactCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContactCDM.setText("CONTACT");
        add(lblContactCDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 333, 103, -1));

        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 376, 165, -1));

        txtContact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 329, 165, -1));

        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 420, 165, -1));

        txtFname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 97, 165, -1));

        txtLname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 140, 165, -1));

        txtAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 228, 165, -1));

        titleCreateDeliveryMan.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleCreateDeliveryMan.setForeground(new java.awt.Color(255, 255, 255));
        titleCreateDeliveryMan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleCreateDeliveryMan.setText("CREATE DELIVERYMAN");
        add(titleCreateDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, 677, -1));

        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 183, 165, -1));

        lblFname.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblFname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFname.setText("FIRST NAME");
        add(lblFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 101, 100, -1));

        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 279, 165, -1));

        lblLname.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblLname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLname.setText("LAST NAME");
        add(lblLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 144, 103, -1));

        btnCreateCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnCreateCDM.setText("CREATE");
        btnCreateCDM.setBorder(new javax.swing.border.MatteBorder(null));
        btnCreateCDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCDMActionPerformed(evt);
            }
        });
        add(btnCreateCDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 451, 69, 25));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Divya Sharma\\Downloads\\Java Final-CVMS\\Java Final-CVMS\\src\\Assests\\coronavirus.jpg")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackCDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackCDMActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagePharmacyJPanel mcjp = (ManagePharmacyJPanel) component;
        mcjp.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackCDMActionPerformed

    private void btnCreateCDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCDMActionPerformed
        // TODO add your handling code here:
        if(txtFname.getText().isEmpty() || txtLname.getText().isEmpty() || txtEmail.getText().isEmpty() ||
            txtContact.getText().isEmpty() || txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty() ||
            txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }

        String firstName = txtFname.getText();
        String lastName = txtLname.getText();

        boolean flag ;

        flag = firstName.matches("^[a-zA-Z]+$");

        if(flag == false) {
            JOptionPane.showMessageDialog(null, "First name cannot have integer values");
            return;
        }

        flag = lastName.matches("^[a-zA-Z]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Last name cannot have integer values");
            return;
        }

        String name = firstName + " " + lastName;

        String email = txtEmail.getText();

        flag = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format of X@Y.Z");
            return;
        }

        for(DeliveryMan deliveryMan : deliveryMandirectory.getDeliveryManDirectory()) {
            if(deliveryMan.getEmail().equals(email)) {
                JOptionPane.showMessageDialog(null, "Email Address already exists");
                return;
            }
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
        for(DeliveryMan deliveryMan : deliveryMandirectory.getDeliveryManDirectory()) {
            if(deliveryMan.getPhoneNumber().equals(phoneNumber)) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists");
                return;
            }
        }

        int age = 0;

        try {

            age = Integer.parseInt(txtAge.getText());

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have integers only");
            return;
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

        ecosystem.getDeliveryManDirectory().newDeliveryMan(name, address, email, phoneNumber, age);
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(email);
        ecosystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new DeliverManRole());

        JOptionPane.showMessageDialog(null, "DeliveryMan Profile Created");

    }//GEN-LAST:event_btnCreateCDMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackCDM;
    private javax.swing.JButton btnCreateCDM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddressCDM;
    private javax.swing.JLabel lblAgeCDM;
    private javax.swing.JLabel lblContactCDM;
    private javax.swing.JLabel lblEmailCDM;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblPasswordCDM;
    private javax.swing.JLabel lblUserNameCDM;
    private javax.swing.JLabel titleCreateDeliveryMan;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
