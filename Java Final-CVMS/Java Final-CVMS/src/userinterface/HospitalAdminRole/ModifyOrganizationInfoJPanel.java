/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Divya Sharma
 */
public class ModifyOrganizationInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ModifyRestaurantInfoJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private RestaurantDirectory restaurantdirectory;
    private Restaurant restaurant;
    
    
    public ModifyOrganizationInfoJPanel(JPanel userProcessContainer, EcoSystem ecosystem, RestaurantDirectory restaurantdirectory, Restaurant restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.restaurant = restaurant;
        this.restaurantdirectory = ecosystem.getRestaurantDirectory();
        txtRestaurant.setText(restaurant.getRestaurantName());
        txtAddress.setText(restaurant.getAddress());
        txtContact.setText(restaurant.getPhoneNumber());
        txtManager.setText(restaurant.getManagerName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleModifyRestaurant = new javax.swing.JLabel();
        btnBackMR = new javax.swing.JButton();
        lblRestaurant = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblManager = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        txtRestaurant = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtManager = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        btnModifyMR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(151, 145, 151));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleModifyRestaurant.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleModifyRestaurant.setForeground(new java.awt.Color(255, 255, 255));
        titleModifyRestaurant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleModifyRestaurant.setText("MODIFY RESTAURANT");
        add(titleModifyRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, 754, -1));

        btnBackMR.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnBackMR.setText("BACK");
        btnBackMR.setBorder(new javax.swing.border.MatteBorder(null));
        btnBackMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMRActionPerformed(evt);
            }
        });
        add(btnBackMR, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 86, 69, 23));

        lblRestaurant.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblRestaurant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRestaurant.setText("ORGANIZATION");
        add(lblRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 154, 110, -1));

        lblAddress.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddress.setText("ADDRESS");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 221, 79, -1));

        lblManager.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManager.setText("ADMINISTRATOR");
        add(lblManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 292, 100, -1));

        lblContact.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblContact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContact.setText("CONTACT");
        add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 362, 79, -1));

        txtRestaurant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtRestaurant, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 150, 104, -1));

        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 217, 104, -1));

        txtManager.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 288, 104, -1));

        txtContact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 358, 104, -1));

        btnModifyMR.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnModifyMR.setText("MODIFY");
        btnModifyMR.setBorder(new javax.swing.border.MatteBorder(null));
        btnModifyMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyMRActionPerformed(evt);
            }
        });
        add(btnModifyMR, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 413, 71, 23));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/Hospital.jpeg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, 1680, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyMRActionPerformed
        // TODO add your handling code here:
        
        if(txtRestaurant.getText().isEmpty() || txtManager.getText().isEmpty() ||
            txtContact.getText().isEmpty() || txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }

        boolean flag ;

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
        for(Restaurant rstrnt : restaurantdirectory.getRestaurantDirectory()) {
            if(rstrnt.getPhoneNumber().equals(phoneNumber) && this.restaurant != rstrnt) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists");
                return;
            }
        }

        String address = txtAddress.getText();

        restaurant.setRestaurantName(txtRestaurant.getText());
        restaurant.setManagerName(txtManager.getText());
        restaurant.setPhoneNumber(phoneNumber);
        restaurant.setAddress(address);

        JOptionPane.showMessageDialog(null, "Restaurant Updated");
    }//GEN-LAST:event_btnModifyMRActionPerformed

    private void btnBackMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMRActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageOrganizationInfoJPanel manrestIP = (ManageOrganizationInfoJPanel) component;
        manrestIP.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackMRActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackMR;
    private javax.swing.JButton btnModifyMR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblRestaurant;
    private javax.swing.JLabel titleModifyRestaurant;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtManager;
    private javax.swing.JTextField txtRestaurant;
    // End of variables declaration//GEN-END:variables
}
