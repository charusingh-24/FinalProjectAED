/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Divya Sharma
 */
public class ManagePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerJPanel
     */
    
    private JPanel userProcessContainer; 
    private EcoSystem ecosystem; 
    private CustomerDirectory customerdirectory;
    
    
    public ManagePatientJPanel(JPanel userProcessContainer, EcoSystem ecosystem, CustomerDirectory customerdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.customerdirectory = ecosystem.getCustomerDirectory();
        populateTable();
        
    }
    
    public void populateTable() {
        DefaultTableModel deftabmdl = (DefaultTableModel) tblCustomer.getModel();
        deftabmdl.setRowCount(0);
        for(Customer cust : ecosystem.getCustomerDirectory().getCustomerDirectory()){
            Object [] row = new Object[6];
            row[0] = cust;
            row[1] = cust.getName();
            row[2] = cust.getEmail();
            row[3] = cust.getHomeAddress();
            row[4] = cust.getPhoneNumber();
            row[5] = cust.getAge();
            deftabmdl.addRow(row);
        }
    }
    
    public void refreshTable() {
        DefaultTableModel deftabmdl = (DefaultTableModel) tblCustomer.getModel();
        deftabmdl.setRowCount(0);
        for(Customer customer : ecosystem.getCustomerDirectory().getCustomerDirectory()){
            Object [] row = new Object[6];
            row[0] = customer;
            row[1] = customer.getName();
            row[2] = customer.getEmail();
            row[3] = customer.getHomeAddress();
            row[4] = customer.getPhoneNumber();
            row[5] = customer.getAge();
            deftabmdl.addRow(row);
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

        btnModify = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        titleManageCustomer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(151, 145, 151));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModify.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnModify.setText("MODIFY");
        btnModify.setBorder(new javax.swing.border.MatteBorder(null));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 305, 165, 25));

        btnCreate.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnCreate.setText("CREATE");
        btnCreate.setBorder(new javax.swing.border.MatteBorder(null));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, 155, 25));

        btnBack.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 73, 23));

        titleManageCustomer.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleManageCustomer.setForeground(new java.awt.Color(255, 255, 255));
        titleManageCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageCustomer.setText("MANAGE CUSTOMER");
        add(titleManageCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 780, -1));

        tblCustomer.setBorder(new javax.swing.border.MatteBorder(null));
        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Name ", "Email Address", "Address", "Mobile Number", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, 780, 132));

        btnDelete.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setBorder(new javax.swing.border.MatteBorder(null));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 305, 116, 25));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustomer.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Customer customer = (Customer)tblCustomer.getValueAt(selectedRow,0);
        ModifyPatientJPanel modcust = new ModifyPatientJPanel(userProcessContainer, ecosystem, customerdirectory, customer);
        userProcessContainer.add("ModifyCustomersJPanel",modcust);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreatePatientJPanel crtCust = new CreatePatientJPanel(userProcessContainer, ecosystem, customerdirectory);
        userProcessContainer.add("CreateCustomersJPanel",crtCust);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustomer.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Customer customer = (Customer) tblCustomer.getValueAt(selectedRow, 0);
        customerdirectory.removeCustomer(customer);
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JLabel titleManageCustomer;
    // End of variables declaration//GEN-END:variables
}
