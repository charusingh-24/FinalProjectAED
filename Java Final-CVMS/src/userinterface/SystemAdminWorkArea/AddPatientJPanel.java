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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Divya Sharma
 * @author charusingh
 */
public class AddPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCustomerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private CustomerDirectory customerdirectory;
    private EmployeeDirectory employeedirectory;
    private UserAccountDirectory userAccountdirectory;

    public AddPatientJPanel(JPanel userProcessContainer, EcoSystem ecosystem, CustomerDirectory customerdirectory) {
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
        jLabel2 = new javax.swing.JLabel();
        jComboMonth = new javax.swing.JComboBox<>();
        jComboDate = new javax.swing.JComboBox<>();
        jComboYear = new javax.swing.JComboBox<>();
        calculatedAge = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblBackground = new javax.swing.JLabel();

        setBackground(new java.awt.Color(151, 145, 151));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleCreateCustomer.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleCreateCustomer.setForeground(new java.awt.Color(255, 255, 255));
        titleCreateCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleCreateCustomer.setText("ADD  PATIENT");
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
        btnCreateCC.setText("ADD");
        btnCreateCC.setBorder(new javax.swing.border.MatteBorder(null));
        btnCreateCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCCActionPerformed(evt);
            }
        });
        add(btnCreateCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, 75, 25));

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
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 110, -1));

        lblAddress.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress.setText("ADDRESS");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 110, -1));

        lblContact.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblContact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContact.setText("CONTACT");
        add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 110, -1));

        lnlUserName.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lnlUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lnlUserName.setText("USERNAME");
        add(lnlUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 110, -1));

        lblPassword.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("PASSWORD");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 110, -1));

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
        txtAge.setEnabled(false);
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 109, -1));

        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 109, -1));

        txtContact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 109, -1));

        txtUserName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 109, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DATE OF BIRTH");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 110, -1));

        jComboMonth.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jComboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMonthActionPerformed(evt);
            }
        });
        add(jComboMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        jComboDate.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jComboDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDateActionPerformed(evt);
            }
        });
        add(jComboDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        jComboYear.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jComboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1980", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000" }));
        jComboYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboYearActionPerformed(evt);
            }
        });
        add(jComboYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 70, -1));
        add(calculatedAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 150, 20));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 110, -1));

        lblBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/patient.jpeg"))); // NOI18N
        lblBackground.setMaximumSize(new java.awt.Dimension(1680, 700));
        lblBackground.setPreferredSize(new java.awt.Dimension(1680, 700));
        add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, 1680, 700));
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
        if (txtFname.getText().isEmpty() || txtLname.getText().isEmpty() || txtEmail.getText().isEmpty()
                || txtContact.getText().isEmpty() || txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty()
                || txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }

        String firstName = txtFname.getText();
        String lastName = txtLname.getText();

        boolean flag;

        flag = firstName.matches("^[a-zA-Z '-]+$");

        if (flag == false) {
            JOptionPane.showMessageDialog(null, "First name cannot have integer values");
            return;
        }

        flag = lastName.matches("^[a-zA-Z '-]+$");

        if (!flag) {
            JOptionPane.showMessageDialog(null, "Last name cannot have integer values");
            return;
        }

        String name = firstName + " " + lastName;

        String email = txtEmail.getText();

        flag = email.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+.[a-zA-Z]+$");

        if (!flag) {
            JOptionPane.showMessageDialog(null, "Email must be in format of example@domain.com");
            return;
        }

        for (Customer customer : ecosystem.getCustomerDirectory().getCustomerDirectory()) {
            if (customer.getEmail().equals(email)) {
                JOptionPane.showMessageDialog(null, "Email address already exists");
            }
        }

        String phoneNumber = txtContact.getText();

        if (phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "Phone Number must be of 10 digits");
            return;
        }
        flag = phoneNumber.matches("^[0-9]+$");
        if (!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }
        for (Customer customer : customerdirectory.getCustomerDirectory()) {
            if (customer.getPhoneNumber().equals(phoneNumber)) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists");
            }
        }

        int age = 0;

        try {

            age = Integer.parseInt(txtAge.getText());
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have integers only");
            return;
        }

        String homeAddress = txtAddress.getText();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();

        for (UserAccount account : ecosystem.getUserAccountDirectory().getUserAccountList()) {
            if (account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username already exists");
                return;
            }
        }

//        Customer customer = customerDirectory.newCustomer(name, email, phoneNumber, age, homeAddress, userName);
        System.out.println(ecosystem.toString());
        ecosystem.getCustomerDirectory().newCustomer(name, email, phoneNumber, age, homeAddress, userName);
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(name);
        UserAccount usserAccount = ecosystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new CustomerRole());

        JOptionPane.showMessageDialog(null, "Patient added successfully!!");

        clearAll();

    }//GEN-LAST:event_btnCreateCCActionPerformed
    
    private void clearAll() {
        
        txtAddress.setText("");
        txtContact.setText("");
        txtEmail.setText("");
        txtAge.setText("");
        txtFname.setText("");
        txtLname.setText("");
        txtUserName.setText("");
        txtPassword.setText("");
    }
    
    private void calculateAge() {
        String dob = jComboDate.getSelectedItem() + "-" + jComboMonth.getSelectedItem() + "-" + jComboYear.getSelectedItem();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date date;
        try {
            date = formatter.parse(dob);
            Instant instant = date.toInstant();
            ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
            LocalDate givenDate = zone.toLocalDate();
            Period period = Period.between(givenDate, LocalDate.now());
            System.out.print(period.getYears());
            txtAge.setText(String.valueOf(period.getYears()));

        } catch (ParseException ex) {
            Logger.getLogger(AddPatientJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    private void jComboMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMonthActionPerformed
        //Converting obtained Date object to LocalDate object
        this.calculateAge();
    }//GEN-LAST:event_jComboMonthActionPerformed

    private void jComboDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDateActionPerformed
        this.calculateAge();// TODO add your handling code here:
    }//GEN-LAST:event_jComboDateActionPerformed

    private void jComboYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboYearActionPerformed
        this.calculateAge();// TODO add your handling code here:
    }//GEN-LAST:event_jComboYearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackCC;
    private javax.swing.JButton btnCreateCC;
    private javax.swing.JLabel calculatedAge;
    private javax.swing.JComboBox<String> jComboDate;
    private javax.swing.JComboBox<String> jComboMonth;
    private javax.swing.JComboBox<String> jComboYear;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBackground;
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
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
