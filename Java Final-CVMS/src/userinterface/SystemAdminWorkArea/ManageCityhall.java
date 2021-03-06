/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Order.Order;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import userinterface.PatientRole.PatientAreaJPanel;

/**
 *
 * @author LUCKY
 */

public class ManageCityhall extends javax.swing.JPanel {
    Employee employeeObject;
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private DeliveryManDirectory deliveryMandirectory;

    /**
     * Creates new form ManageCityhall
     */
    
//    private void visualizeHospitalization(java.awt.event.ActionEvent evt) throws IOException {
//        Map<String, Integer> map = new HashMap<>();
//        BufferedReader br;
//        try {
//            br = new BufferedReader(new FileReader("src/Assests/patientRecord.csv"));
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] cols = line.split(",");
//                System.out.println(cols[7]);
////                if (cols[7].equals(employeeObject.getEmployeeDepartment())) {
//                    if (map.containsKey(cols[8])) {
//                        map.put(cols[8], map.get(cols[8]) + 1);
//                    } else {
//                        map.put(cols[8], 1);
//                    }
//                }
////            }
//            System.out.println(map);
//        } catch (FileNotFoundException ex) {
////            Logger.getLogger(DoctorsView.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        // TODO add your handling code here:
//        DefaultPieDataset pieDataSet = new DefaultPieDataset();
//        for (String name : map.keySet()) {
//            pieDataSet.setValue(name, map.get(name));
//        }
//        JFreeChart chart = ChartFactory.createPieChart("Pie Chart for Hospital Pateint Status", pieDataSet, true, true, true);
//
//        PiePlot p = (PiePlot) chart.getPlot();
//        p.setSectionPaint("Treatment Completed", Color.BLUE);
//        p.setSectionPaint("Admitted", Color.MAGENTA);
//        p.setSectionPaint("Doctor Assigned", Color.green);
//        ChartPanel chartPanel = new ChartPanel(chart, false);
//        chartPane.add(chartPanel);
//        chartPanel.setSize(500, 500);
//        chartPanel.setVisible(true);
//
//    }
    
    private void visualizeHospitalization(java.awt.event.ActionEvent evt) throws IOException {
       Map<String, Integer> map = new HashMap<>();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("src/Assests/orderRecords.csv"));
            String line;
            String[] cols = br.readLine().split(",");
            for(int i = 0; i<cols.length;i++) {
                
                System.out.println(cols[i]);
//                if (cols[7].equals(employeeObject.getEmployeeDepartment())) {
                    if (map.containsKey(cols[i])) {
                        map.put(cols[i], map.get(cols[i]) + 1);
                    } else {
                        map.put(cols[i], 1);
                    }
                }
//            }
            System.out.println(map);
        } catch (FileNotFoundException ex) {
//            Logger.getLogger(DoctorsView.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
        DefaultPieDataset pieDataSet = new DefaultPieDataset();
        for (String name : map.keySet()) {
            pieDataSet.setValue(name, map.get(name));
        }
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart for Hospital Patient Status", pieDataSet, true, true, true);

        PiePlot p = (PiePlot) chart.getPlot();
        p.setSectionPaint("Treatment Completed", Color.BLUE);
        p.setSectionPaint("Admitted", Color.MAGENTA);
        p.setSectionPaint("Doctor Assigned", Color.green);
        ChartPanel chartPanel = new ChartPanel(chart, false);
        chartPane.add(chartPanel);
        chartPanel.setSize(500, 500);
        chartPanel.setVisible(true);

    }
    
    public ManageCityhall(JPanel userProcessContainer, EcoSystem ecosystem, DeliveryManDirectory deliveryMandirectory) throws IOException {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.deliveryMandirectory = ecosystem.getDeliveryManDirectory();
        visualizeHospitalization(null);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        chartPane = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 153, 153));

        button1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        button1.setLabel("BACK");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        chartPane.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout chartPaneLayout = new javax.swing.GroupLayout(chartPane);
        chartPane.setLayout(chartPaneLayout);
        chartPaneLayout.setHorizontalGroup(
            chartPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );
        chartPaneLayout.setVerticalGroup(
            chartPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chartPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chartPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JPanel chartPane;
    // End of variables declaration//GEN-END:variables

}
