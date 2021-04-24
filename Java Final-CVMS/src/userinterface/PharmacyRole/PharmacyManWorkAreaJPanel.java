/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyRole;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderStatus;
import Business.Order.OrderDirectory;
import Business.UserAccount.UserAccount;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Message.RecipientType;

/**
 *
 * @author raunak
 * @author charusingh
 */
public class PharmacyManWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private DeliveryManDirectory deliverymandirectory;
    private OrderDirectory orderdirectory;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public PharmacyManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, DeliveryManDirectory deliveryManDirectory, OrderDirectory orderDirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.orderdirectory = business.getOrderDirectory();
        this.deliverymandirectory = business.getDeliveryManDirectory();
        
        populateTable();
        
        populateDeliveryManTable();
    }
    
    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (Order ord : business.getOrderDirectory().getOrderDirectory()) {
            
            if (ord.getOrderStatus() != null && ord.getOrderStatus().equals(OrderStatus.Vaccine_Assigned.getValue())) {
                
                Object[] row = new Object[7];
                row[0] = ord;
                row[1] = ord.getMessage();
                row[2] = ord.getOrderStatus();
                row[3] = ord.getCustomer().getName();
                row[4] = ord.getCustomer().getHomeAddress();
                row[5] = ord.getRestaurant().getRestaurantName();
                row[6] = ord.getRestaurant().getAddress();
                model.addRow(row);
                
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
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldeliveryMan = new javax.swing.JTable();
        titleDeliveryMan = new javax.swing.JLabel();
        sendEmail = new java.awt.Button();
        emailText = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(151, 145, 151));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Allergies", "Status", "Patient Name", "Patient Address", "Hospital Name", "Hospital Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 760, 96));

        assignJButton.setBackground(new java.awt.Color(0, 0, 0));
        assignJButton.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("ASSIGN REQUEST");
        assignJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 110, 20));

        processJButton.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        processJButton.setText("CONFIRM VACCINATION");
        processJButton.setBorder(new javax.swing.border.MatteBorder(null));
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 160, 20));

        refreshJButton.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        refreshJButton.setText("REFRESH TABLES");
        refreshJButton.setBorder(new javax.swing.border.MatteBorder(null));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 110, 20));

        tbldeliveryMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Patient Address", "Patient Email", "Hospital Name", "Hospital Address"
            }
        ));
        jScrollPane2.setViewportView(tbldeliveryMan);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 270, 740, 120));

        titleDeliveryMan.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleDeliveryMan.setForeground(new java.awt.Color(255, 255, 255));
        titleDeliveryMan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleDeliveryMan.setText("PHARMACY WORK PAGE");
        add(titleDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 230, -1));

        sendEmail.setActionCommand("sendEmail");
        sendEmail.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        sendEmail.setLabel("Send Email");
        sendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendEmailActionPerformed(evt);
            }
        });
        add(sendEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));

        emailText.setText("Patient vaccinated.");
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });
        add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 330, 150));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/resize-1618977884522140887Pharmacy.jpeg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 700));
    }// </editor-fold>//GEN-END:initComponents

    public void populateDeliveryManTable() {
        
        DefaultTableModel model = (DefaultTableModel) tbldeliveryMan.getModel();
        model.setRowCount(0);
        for (Order order : business.getOrderDirectory().getOrderDirectory()) {
            if (order.getDeliveryMan() != null && order.getDeliveryMan().equals(userAccount.getEmployee().getName())
                    && order.getOrderStatus().equals(OrderStatus.Vaccine_InProgress.getValue())) {
                
                Object[] row = new Object[6];
                row[0] = order;
                row[1] = order.getCustomer().getName();
                row[2] = order.getCustomer().getHomeAddress();
                row[3] = order.getCustomer().getEmail();
                row[4] = order.getRestaurant().getRestaurantName();
                row[5] = order.getRestaurant().getAddress();
                // row[6]=order.getCustomer().getEmail();
                model.addRow(row);
            }
        }
        
    }
    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = tbldeliveryMan.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to proceed.");
            return;
        }
        
        Order order = (Order) tbldeliveryMan.getValueAt(selectedRow, 0);
        if (order.getOrderStatus().equals(OrderStatus.Vaccine_InProgress.getValue())) {
            JOptionPane.showMessageDialog(null, "Patient vaccinated.");
            order.setOrderStatus(OrderStatus.Vaccinated.getValue());
            return;
        } else if (order.getOrderStatus().equals(OrderStatus.Vaccinated.getValue())) {
            JOptionPane.showMessageDialog(null, "Patient already vaccinated.");
            return;
        }
        
        populateDeliveryManTable();

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        
        populateDeliveryManTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to proceed.");
            return;
        }
        
        Order order = (Order) workRequestJTable.getValueAt(selectedRow, 0);
        order.setDeliveryMan(userAccount.getEmployee().getName());
        order.setOrderStatus(OrderStatus.Vaccine_InProgress.getValue());
        populateTable();
        populateDeliveryManTable();

    }//GEN-LAST:event_assignJButtonActionPerformed
    
    private void SendMail(String toMail, String text) {
        String ToEmail = toMail;
        String FromEmail = "dsharma141049@gmail.com"; // Your Email
        String FromEmailPassword = "Divya*1049"; // Email Password
        String Subjects = "Demo Report";
        
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FromEmail, FromEmailPassword);
            }
        });
        System.out.println("aaa" + session);
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FromEmail));
            message.addRecipient(RecipientType.TO, new InternetAddress(ToEmail));
            message.setSubject(Subjects);
            message.setContent("<h1>" + text + "</h1>", "text/html");
            Transport.send(message);
            System.out.println("Sent message successfully....");
            JOptionPane.showMessageDialog(null, "Sent email to patient !!");
        } catch (Exception ex) {
            System.out.println("" + ex);
        }
    }

    private void sendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendEmailActionPerformed
        int selectedRow = tbldeliveryMan.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            String text = emailText.getText();
            SendMail((String) tbldeliveryMan.getValueAt(selectedRow, 3), text);        // TODO add your handling code here:
        }
        emailText.setText("");
    }//GEN-LAST:event_sendEmailActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private java.awt.TextField emailText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private java.awt.Button sendEmail;
    private javax.swing.JTable tbldeliveryMan;
    private javax.swing.JLabel titleDeliveryMan;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
