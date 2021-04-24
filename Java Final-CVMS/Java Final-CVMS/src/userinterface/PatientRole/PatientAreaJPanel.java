/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.Menu;
import Business.Menu.MenuDirectory;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class PatientAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private CustomerDirectory customerdirectory;
    private RestaurantDirectory restaurantdirectory;
    private DeliveryManDirectory deliverymanDirectory;
    private MenuDirectory menudirectory;
    private OrderDirectory orderdirectory;
    private static int count=1;

    private UserAccount userAccount;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public PatientAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem, 
            CustomerDirectory customerdirectory, RestaurantDirectory restaurantdirectory, 
            DeliveryManDirectory deliverymanDirectory, MenuDirectory menudirectory, OrderDirectory orderDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem=ecosystem;
        this.deliverymanDirectory=ecosystem.getDeliveryManDirectory();
        this.menudirectory = ecosystem.getMenuDirectory();
        this.restaurantdirectory= ecosystem.getRestaurantDirectory();
        this.customerdirectory=ecosystem.getCustomerDirectory();
        this.orderdirectory=ecosystem.getOrderDirectory();
      
        this.userAccount = userAccount;
        valueLabel.setText(userAccount.getUsername());
        populateRequestTable();
        populateRestaurantCombo();
    }
    
    public void populateRequestTable(){
        
        DefaultTableModel model=(DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for(Order order:ecosystem.getOrderDirectory().getOrderDirectory()){
            
            if(userAccount.getEmployee().getName().equals(order.getCustomer().getName())){
            
            Object[] row=new Object[8];
            row[0]=order;
            row[1]=order.getMenu().getItemName();
            row[2]=order.getQuantity() * order.getMenu().getPrice();
            row[3]=order.getRestaurant().getRestaurantName();
            row[4]=order.getMessage();
            row[5]=order.getCustomer().getName();
            row[6]=order.getOrderStatus();
            row[7]=order.getQuantity();
            model.addRow(row);
                  
            }
        }
        
    }
    
    public void populateRestaurantCombo(){
    
    boxItemList.removeAllItems();
    boxItemList.addItem(" ");
    for(Restaurant restaur :ecosystem.getRestaurantDirectory().getRestaurantDirectory()){
        
        boxItemList.addItem(restaur.getRestaurantName());
    }
    }
    
    public void populateTable(){
    
        DefaultTableModel deftblemdl=(DefaultTableModel) tblItemPrice.getModel();
        deftblemdl.setRowCount(0);
        String restaurantName= boxItemList.getSelectedItem().toString();
        Restaurant restaurant=ecosystem.getRestaurantDirectory().getRestaurant(restaurantName);
        for(Menu menu : ecosystem.getMenuDirectory().getMenuDirectory()){
            
            if(restaurant.getRestaurantName().equals(menu.getRestaurantName())){
            
                Object [] row=new Object[2];
                row[0]=menu;
                row[1]=menu.getPrice();
                 deftblemdl.addRow(row);
            }
        
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        btnConfirm = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblItemPrice = new javax.swing.JTable();
        boxItemList = new javax.swing.JComboBox<>();
        lblComment = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        btnAddComment = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(151, 145, 151));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setBorder(new javax.swing.border.MatteBorder(null));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ORDER-ID", "VACCINE-NAME", "PRICEDDOSES", "ORGANIZATION", "ALLERGIES", "PATIENT", "STATUS", " QUANTITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 292, 857, 97));

        btnConfirm.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnConfirm.setText("CONFIRM");
        btnConfirm.setBorder(new javax.swing.border.MatteBorder(null));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 72, 25));

        refreshTestJButton.setFont(new java.awt.Font("Tahoma", 3, 8)); // NOI18N
        refreshTestJButton.setText("REFRESH");
        refreshTestJButton.setBorder(new javax.swing.border.MatteBorder(null));
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 84, 26));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseLabel.setText("PATIENT");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 27, 127, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 27, 140, 26));

        lblQuantity.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuantity.setText("ALLERGIES(if any):");
        add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 77, 20));

        txtQuantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 114, -1));

        btnMenu.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnMenu.setText("VACCINES");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 30, -1, -1));

        tblItemPrice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "VACCINES", "DOSES(REQUIRED)"
            }
        ));
        jScrollPane2.setViewportView(tblItemPrice);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 105, -1, 106));

        boxItemList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(boxItemList, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 30, 223, -1));

        lblComment.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblComment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComment.setText("ALLERGIES(if any):");
        add(lblComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 414, 150, -1));

        txtComment.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        add(txtComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 189, -1));

        btnAddComment.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnAddComment.setText("ADD COMMENT");
        btnAddComment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAddComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCommentActionPerformed(evt);
            }
        });
        add(btnAddComment, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 445, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/patient.jpeg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 0, 1680, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        
      int selectedRow= tblItemPrice.getSelectedRow();
      if(selectedRow<0){
      JOptionPane.showMessageDialog(null,"Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
      return;
      }
      
      int quantity=Integer.parseInt(txtQuantity.getText());
      String restaurantName= boxItemList.getSelectedItem().toString();
      Restaurant restaurant = ecosystem.getRestaurantDirectory().getRestaurant(restaurantName);
      Customer customer=ecosystem.getCustomerDirectory().getCustomer(userAccount.getEmployee().getName());
      Menu menu=(Menu) tblItemPrice.getValueAt(selectedRow, 0);
      String status="Order Placed";
      
      Order order=ecosystem.getOrderDirectory().newOrder();
      order.setCustomer(customer);
      order.setOrderId(String.valueOf(count++));
      order.setQuantity(quantity);
      order.setMenu(menu);
      order.setRestaurant(restaurant);
      order.setOrderStatus(status);
      order.setAssign(false);
      
      
      JOptionPane.showMessageDialog(null,"Order Placed");
      populateRequestTable();
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        
        if(boxItemList.getSelectedIndex()==0){
        
        JOptionPane.showMessageDialog(null, "Please select a organization");
        return;
        }
        
        populateTable();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnAddCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCommentActionPerformed
         //TODO add your handling code here:
        if(txtComment.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Field cannot be empty");
              return;
        }
        
        int selectedRow = workRequestJTable.getSelectedRow();
        if(selectedRow<0){
        JOptionPane.showMessageDialog(null, "Please select a row from table first ","Warning",JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        Order ord=(Order)workRequestJTable.getValueAt(selectedRow, 0);
        ord.setMessage(txtComment.getText());
       populateRequestTable();
    }//GEN-LAST:event_btnAddCommentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxItemList;
    private javax.swing.JButton btnAddComment;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JTable tblItemPrice;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}