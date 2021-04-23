/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Divya Sharma
 */
public class CreatePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCustomerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private CustomerDirectory customerdirectory;
    private EmployeeDirectory employeedirectory;
    private UserAccountDirectory userAccountdirectory;
    
    
    
    public CreatePatientJPanel(JPanel userProcessContainer, EcoSystem ecosystem, CustomerDirectory customerdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.customerdirectory = ecosystem.getCustomerDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleCreateCustomer = new javax.swing.JLabel();
        btnBackCC = new javax.swing.JButton();
        btnCreateCC = new javax.swing.JButton();
        lblFname = new javax.swing.JLabel();
        lblLname = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lnlUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(151, 145, 151));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleCreateCustomer.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleCreateCustomer.setForeground(new java.awt.Color(255, 255, 255));
        titleCreateCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleCreateCustomer.setText("CREATE CUSTOMER");
        add(titleCreateCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 789, -1));

        btnBackCC.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnBackCC.setText("BACK");
        btnBackCC.setBorder(new javax.swing.border.MatteBorder(null));
        btnBackCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackCCActionPerformed(evt);
            }
        });
        add(btnBackCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 58, 57, 23));

        btnCreateCC.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnCreateCC.setText("CREATE");
        btnCreateCC.setBorder(new javax.swing.border.MatteBorder(null));
        btnCreateCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCCActionPerformed(evt);
            }
        });
        add(btnCreateCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 513, 75, 25));

        lblFname.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblFname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFname.setText("FIRST NAME");
        add(lblFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 81, 110, -1));

        lblLname.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblLname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLname.setText("LAST NAME");
        add(lblLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 129, 110, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmail.setText("EMAIL");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 110, -1));

        lblAge.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAge.setText("AGE");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 233, 110, -1));

        lblAddress.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress.setText("ADDRESS");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 289, 110, -1));

        lblContact.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblContact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContact.setText("CONTACT");
        add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 345, 110, -1));

        lnlUserName.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lnlUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnlUserName.setText("USERNAME");
        add(lnlUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 403, 110, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("PASSWORD");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 458, 110, -1));

        txtFname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 77, 109, -1));

        txtLname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 125, 109, -1));

        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 176, 109, -1));

        txtAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 229, 109, -1));

        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 285, 109, -1));

        txtContact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 341, 109, -1));

        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 399, 109, -1));

        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 454, 109, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 4, 1680, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnBackCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackCCActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagePatientJPanel mancust = (ManagePatientJPanel) component;
        mancust.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackCCActionPerformed

    private void btnCreateCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCCActionPerformed
        // TODO add your handling code here:
        if(txtFname.getText().isEmpty() || txtLname.getText().isEmpty() || txtEmail.getText().isEmpty() ||
                txtContact.getText().isEmpty() || txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty() ||
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
        
        for(Customer customer : ecosystem.getCustomerDirectory().getCustomerDirectory()) {
            if(customer.getEmail().equals(email)) {
                JOptionPane.showMessageDialog(null, "Email Address already exists");
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
        for(Customer customer : customerdirectory.getCustomerDirectory()) {
            if(customer.getPhoneNumber().equals(phoneNumber)) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists");
            }
        }
        
        int age = 0;
        
        try {
            
            age = Integer.parseInt(txtAge.getText());
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have integers only");
            return;
        }
        
        String homeAddress = txtAddress.getText();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        
        for(UserAccount account : ecosystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                return;
            }
        }
        
//        Customer customer = customerDirectory.newCustomer(name, email, phoneNumber, age, homeAddress, userName);
        System.out.println(ecosystem.toString());
        ecosystem.getCustomerDirectory().newCustomer(name, email, phoneNumber, age, homeAddress, userName);
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(name);
        UserAccount usserAccount = ecosystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new CustomerRole());
        
        JOptionPane.showMessageDialog(null, "Customer Profile Created");
        
        
        
        
    }//GEN-LAST:event_btnCreateCCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackCC;
    private javax.swing.JButton btnCreateCC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lnlUserName;
    private javax.swing.JLabel titleCreateCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
