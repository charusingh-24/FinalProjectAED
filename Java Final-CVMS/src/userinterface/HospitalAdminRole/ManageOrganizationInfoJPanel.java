/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Divya Sharma
 */
public class ManageOrganizationInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantInfoJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount useraccount;
    private EcoSystem ecosystem;
    private RestaurantDirectory restaurantdirectory;
    private Restaurant restaurant;
    
    
    
    public ManageOrganizationInfoJPanel(JPanel userProcessContainer, UserAccount useraccount, EcoSystem ecosystem, RestaurantDirectory restaurantdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.useraccount = useraccount;
        this.ecosystem = ecosystem;
        this.restaurantdirectory = ecosystem.getRestaurantDirectory();
        System.out.println(restaurantdirectory.getRestaurantDirectory().size() + "   ...... ");
        for(Restaurant res : this.restaurantdirectory.getRestaurantDirectory()) {
            System.out.println(res.getRestaurantName() + " " + useraccount.getEmployee().getName());
            if(useraccount.getEmployee().getName().equals(res.getRestaurantName())) {
                this.restaurant = res;
                break;
            }
        }
        populateTable();
    }
    
     public void populateTable() {
        DefaultTableModel deftabmdl = (DefaultTableModel) tblRestaurant.getModel();
        deftabmdl.setRowCount(0);
        Object [] row = new Object[4];
        row[0] = restaurant;
        row[1] = restaurant.getAddress();
        row[2] = restaurant.getManagerName();
        row[3] = restaurant.getPhoneNumber();
        
        deftabmdl.addRow(row);
    }
     
     public void refreshTable() {
        DefaultTableModel deftabmdl = (DefaultTableModel) tblRestaurant.getModel();
        deftabmdl.setRowCount(0);
        
        Object [] row = new Object[4];
        row[0] = restaurant;
        row[1] = restaurant.getAddress();
        row[2] = restaurant.getManagerName();
        row[3] = restaurant.getPhoneNumber();
        deftabmdl.addRow(row);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleManageRes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurant = new javax.swing.JTable();
        btnBackMR = new javax.swing.JButton();
        btnModifyMR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(151, 145, 151));
        setPreferredSize(new java.awt.Dimension(1680, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleManageRes.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleManageRes.setForeground(new java.awt.Color(255, 255, 255));
        titleManageRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageRes.setText("MANAGE ORGANIZATION");
        add(titleManageRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, 737, 33));

        tblRestaurant.setBorder(new javax.swing.border.MatteBorder(null));
        tblRestaurant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ORGANIZATION ", "ADDRESS", "ADMINISTRATOR", "CONTACT"
            }
        ));
        jScrollPane1.setViewportView(tblRestaurant);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 132, 737, 106));

        btnBackMR.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnBackMR.setText("BACK");
        btnBackMR.setBorder(new javax.swing.border.MatteBorder(null));
        btnBackMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMRActionPerformed(evt);
            }
        });
        add(btnBackMR, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 85, 69, 29));

        btnModifyMR.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnModifyMR.setText("MODIFY");
        btnModifyMR.setBorder(new javax.swing.border.MatteBorder(null));
        btnModifyMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyMRActionPerformed(evt);
            }
        });
        add(btnModifyMR, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 293, 63, 23));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/Hospital.jpeg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, 1680, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyMRActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblRestaurant.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Restaurant restaurant = (Restaurant)tblRestaurant.getValueAt(selectedRow,0);
        ModifyOrganizationInfoJPanel modifyManager = new ModifyOrganizationInfoJPanel(userProcessContainer, ecosystem, restaurantdirectory, restaurant);
        userProcessContainer.add("ModifyRestaurantInfoJPanel",modifyManager);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnModifyMRActionPerformed

    private void btnBackMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMRActionPerformed
                                              
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
                
    }//GEN-LAST:event_btnBackMRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackMR;
    private javax.swing.JButton btnModifyMR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestaurant;
    private javax.swing.JLabel titleManageRes;
    // End of variables declaration//GEN-END:variables
}
