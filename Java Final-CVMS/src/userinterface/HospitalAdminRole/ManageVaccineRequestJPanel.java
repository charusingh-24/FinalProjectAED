/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Order.OrderStatus;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Divya Sharma
 */
public class ManageVaccineRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount useraccount;
    private EcoSystem ecosystem;
    private RestaurantDirectory restaurantdirectory;
    private MenuDirectory menudirectory;
    private OrderDirectory orderdirectory;
    private DeliveryManDirectory deliverymandirectory;
    
    
    
    public ManageVaccineRequestJPanel(JPanel userProcessContainer,UserAccount useraccount, EcoSystem ecosystem, RestaurantDirectory restaurantdirectory, MenuDirectory menudirectory, OrderDirectory orderdirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.useraccount = useraccount;
        this.restaurantdirectory = ecosystem.getRestaurantDirectory();
        this.menudirectory = ecosystem.getMenuDirectory();
        this.orderdirectory = ecosystem.getOrderDirectory();
        
        this.deliverymandirectory = ecosystem.getDeliveryManDirectory();
        populateTable();
        populateRestaurantCombo();
    }
    
    public void populateTable() {
        DefaultTableModel deftabmdl = (DefaultTableModel) tblOrder.getModel();
        deftabmdl.setRowCount(0);
        
        
        
        String orderStatus = "";
        for(Order order : ecosystem.getOrderDirectory().getOrderDirectory()) {
            System.out.println(" Rest  " + useraccount.getEmployee().getName() + "  " + order.getRestaurant().getRestaurantName());
           
            if(useraccount.getEmployee().getName().equals(order.getRestaurant().getRestaurantName())) {
                Object [] row = new Object[5];
                row[0] = order;
                row[1] = order.getMenu().getItemName();
                row[2] = order.getQuantity();
                row[3] = order.getQuantity() * order.getMenu().getPrice();
                row[4] = order.getOrderStatus();
                orderStatus += order.getOrderStatus() + ",";
                deftabmdl.addRow(row);
            }
        }
        loadCSV(orderStatus);
    }
    
    public void loadCSV(String order) {
       
        try{
          FileWriter fileWriter = new FileWriter("src/assests/orderRecords.csv");
          fileWriter.append(order);
          fileWriter.append("\n");
          fileWriter.flush();
          fileWriter.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public final void populateRestaurantCombo(){
    
     comboDelivery.removeAll();
        comboDelivery.addItem(" ");
        for (DeliveryMan deliveryman : deliverymandirectory.getDeliveryManDirectory()) {
            comboDelivery.addItem(deliveryman.getName());
        }}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleManageOrder = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnBackMO = new javax.swing.JButton();
        btnAcceptMO = new javax.swing.JButton();
        btnCompleteMO = new javax.swing.JButton();
        comboDelivery = new javax.swing.JComboBox<>();
        lblAssignDelivery = new javax.swing.JLabel();
        btnAssignDelivery = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(151, 145, 151));
        setPreferredSize(new java.awt.Dimension(1680, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleManageOrder.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleManageOrder.setForeground(new java.awt.Color(255, 255, 255));
        titleManageOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageOrder.setText("MANAGE VACCINE REQUEST");
        add(titleManageOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 719, -1));

        tblOrder.setBorder(new javax.swing.border.MatteBorder(null));
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ORDER ID", "VACCINE NAME", "QUANTITY", "DOSE(required)", " STATUS"
            }
        ));
        jScrollPane1.setViewportView(tblOrder);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, 719, 103));

        btnBackMO.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnBackMO.setText("BACK");
        btnBackMO.setBorder(new javax.swing.border.MatteBorder(null));
        btnBackMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMOActionPerformed(evt);
            }
        });
        add(btnBackMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 87, 71, 22));

        btnAcceptMO.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnAcceptMO.setText("ACCEPT");
        btnAcceptMO.setBorder(new javax.swing.border.MatteBorder(null));
        btnAcceptMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptMOActionPerformed(evt);
            }
        });
        add(btnAcceptMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 288, 83, 24));

        btnCompleteMO.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnCompleteMO.setText("PROCESS");
        btnCompleteMO.setBorder(new javax.swing.border.MatteBorder(null));
        btnCompleteMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteMOActionPerformed(evt);
            }
        });
        add(btnCompleteMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 288, 83, 24));

        add(comboDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 87, 143, -1));

        lblAssignDelivery.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblAssignDelivery.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAssignDelivery.setText("DELIVERY MAN");
        add(lblAssignDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 92, 113, -1));

        btnAssignDelivery.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnAssignDelivery.setText("ASSIGN");
        btnAssignDelivery.setBorder(new javax.swing.border.MatteBorder(null));
        btnAssignDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignDeliveryActionPerformed(evt);
            }
        });
        add(btnAssignDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(618, 87, 66, 22));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/Hospital.jpeg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 500));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteMOActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrder.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals(OrderStatus.VACCINE_APPROVED.getValue())) {
            order.setOrderStatus(OrderStatus.VACCINE_ASSIGNED.getValue());
            order.setAssign(true);
        }
        
        else if(order.getOrderStatus().equals(OrderStatus.AWAITING_APPROVAL)) {
            JOptionPane.showMessageDialog(null, "Request should be approved first.");
            return;
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Request is assigned to pharmacy.");
            return;
        }
        
        populateTable();
    }//GEN-LAST:event_btnCompleteMOActionPerformed

    private void btnAcceptMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptMOActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrder.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals(OrderStatus.AWAITING_APPROVAL.getValue())) {
            order.setOrderStatus(OrderStatus.VACCINE_APPROVED.getValue());
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Request is already accepted or Completed");
            return;
        }
        
        populateTable();
    }//GEN-LAST:event_btnAcceptMOActionPerformed

    private void btnBackMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMOActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackMOActionPerformed

    private void btnAssignDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignDeliveryActionPerformed
        // TODO add your handling code here:int selectedRow = tblOrder.getSelectedRow();
int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        Order order = (Order) tblOrder.getValueAt(selectedRow, 0);
        if (comboDelivery.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please select a delivery man");
            return;
        }
        if (order.getOrderStatus().equals("Request is in Progress")) {
            for (DeliveryMan deliveryman : deliverymandirectory.getDeliveryManDirectory()) {
                if (deliveryman.getName().equals(comboDelivery.getSelectedItem())) {
                    order.setDeliveryMan(deliveryman.getEmail());
                }
            }
            order.setOrderStatus("Order Picked Up");
            JOptionPane.showMessageDialog(null, "Request assigned successfully");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Order is already accepted or Completed");
            return;
        }
    }//GEN-LAST:event_btnAssignDeliveryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptMO;
    private javax.swing.JButton btnAssignDelivery;
    private javax.swing.JButton btnBackMO;
    private javax.swing.JButton btnCompleteMO;
    private javax.swing.JComboBox<String> comboDelivery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAssignDelivery;
    private javax.swing.JTable tblOrder;
    private javax.swing.JLabel titleManageOrder;
    // End of variables declaration//GEN-END:variables
}
