/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Divya Sharma
 */
public class ManageHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private RestaurantDirectory restaurantdirectory;
    
    
    public ManageHospitalJPanel(JPanel userProcessContainer, EcoSystem ecosystem, RestaurantDirectory restaurantdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem =  ecosystem;
        this.restaurantdirectory = ecosystem.getRestaurantDirectory();
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel deftabmdl = (DefaultTableModel) tblRestaurant.getModel();
        deftabmdl.setRowCount(0);
        for(Restaurant restrnt : ecosystem.getRestaurantDirectory().getRestaurantDirectory()){
            Object [] row = new Object[4];
            row[0] = restrnt;
            row[1] = restrnt.getAddress();
            row[2] = restrnt.getManagerName();
            row[3] = restrnt.getPhoneNumber();
            deftabmdl.addRow(row);
        }
    }
    
    public void refreshTable() {
        DefaultTableModel deftabmdl = (DefaultTableModel) tblRestaurant.getModel();
        deftabmdl.setRowCount(0);
        for(Restaurant rstrnt : restaurantdirectory.getRestaurantDirectory()){
            Object [] row = new Object[4];
            row[0] = rstrnt;
            row[1] = rstrnt.getAddress();
            row[2] = rstrnt.getManagerName();
            row[3] = rstrnt.getPhoneNumber();
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

        titleManageRestaurant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurant = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(151, 145, 151));
        setSize(new java.awt.Dimension(1680, 800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleManageRestaurant.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleManageRestaurant.setForeground(new java.awt.Color(255, 255, 255));
        titleManageRestaurant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageRestaurant.setText("MANAGE HOSPITALS");
        add(titleManageRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 550, 35));

        tblRestaurant.setBorder(new javax.swing.border.MatteBorder(null));
        tblRestaurant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Address", "Contact Name", "Contact Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRestaurant);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, 818, 132));

        btnModify.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnModify.setText("MODIFY");
        btnModify.setActionCommand("");
        btnModify.setBorder(new javax.swing.border.MatteBorder(null));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        add(btnModify, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 286, 165, 24));

        btnCreate.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnCreate.setText("ADD");
        btnCreate.setBorder(new javax.swing.border.MatteBorder(null));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 286, 165, 23));

        btnDelete.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnDelete.setText("REMOVE");
        btnDelete.setActionCommand("DELETE");
        btnDelete.setBorder(new javax.swing.border.MatteBorder(null));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 286, 165, 24));

        btnBack.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, 63, 23));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/Hospital_bg2.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1680, 800));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblRestaurant.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Restaurant restaurant = (Restaurant)tblRestaurant.getValueAt(selectedRow,0);
        ModifyHospitalJPanel restrnt = new ModifyHospitalJPanel(userProcessContainer, ecosystem, restaurantdirectory, restaurant);
        userProcessContainer.add("ModifyManagerJPanel",restrnt);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateHospitalJPanel crtrest = new CreateHospitalJPanel(userProcessContainer, ecosystem, restaurantdirectory);
        userProcessContainer.add("CreateCustomersJPanel",crtrest);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestaurant.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Restaurant restaurant = (Restaurant) tblRestaurant.getValueAt(selectedRow, 0);
        restaurantdirectory.removeRestaurant(restaurant);
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestaurant;
    private javax.swing.JLabel titleManageRestaurant;
    // End of variables declaration//GEN-END:variables
}
