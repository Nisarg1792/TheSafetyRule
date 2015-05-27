/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.CityAdmin.ApprovedComplaint;

import Complaints.Category.DeviceSurguryEvent;
import HelperPkg.Helper;
import Roles.CityAdmin;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class DevicesEventJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DevicesEventJPanel
     */
    JPanel mainJPanel;
    CityAdmin cityAdmin;
    DeviceSurguryEvent de;
    public DevicesEventJPanel(JPanel mainJPanel,CityAdmin cityAdmin, DeviceSurguryEvent de) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cityAdmin = cityAdmin;
        this.de = de;
        setValues();
    }

    public void setValues(){
        HelperPkg.Helper h = new Helper();
        nameDeviceTB.setText(de.getDeviceName());
        nameManufacTB.setText(de.getManufactureName());
        describeCB.setSelectedIndex(h.getIndexForComboBox(de.getDescription(), describeCB));
        typeCB.setSelectedIndex(h.getIndexForComboBox(de.getTypeOfDevice(), typeCB));
        singleCB.setSelectedIndex(h.getIndexForComboBox(de.getSingleUse(), singleCB));
        medicationCB.setSelectedIndex(h.getIndexForComboBox(de.getMedicationInvolved(), medicationCB));
        charCB.setSelectedIndex(h.getIndexForComboBox(de.getHITType(), charCB));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        typeCB = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        nameDeviceTB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nameManufacTB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        singleCB = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        medicationCB = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        charCB = new javax.swing.JComboBox();
        approveBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        describeCB = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DEVICE OR MEDICAL/SURGICAL SUPPLY EVENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 41, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Which of the following best describes the event or unsafe condition?");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("What type of device was involved in the event or unsafe condition?");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        typeCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        typeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Implantable device ", "Medical equipment", "Medical/surgical supply, including disposable product", "HIT device" }));
        add(typeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 123, 375, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("What is the name of the device, product, software, or medical/surgical supply?");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, -1, -1));

        nameDeviceTB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        add(nameDeviceTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 162, 200, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("What is the name of the manufacturer?");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 203, -1, -1));

        nameManufacTB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        add(nameManufacTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 201, 200, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Was a device intended for single use involved in the event or unsafe condition?");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, -1, -1));

        singleCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        singleCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes ", "No ", "Unknown" }));
        add(singleCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 240, 401, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Did the event or unsafe condition involve a medication or other substance?");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 281, -1, -1));

        medicationCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        medicationCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes ", "No ", "Unknown" }));
        add(medicationCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 279, 401, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Which of the following best characterizes the type of HIT device related to the event or unsafe condition?");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 318, -1, -1));

        charCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        charCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrative/billing or practice management system ", "Automated dispensing system ", "Electronic health record (EHR) or component of EHR ", "Human interface device  ", "Laboratory information system (LIS)", "Radiology/diagnostic imaging system" }));
        add(charCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 352, 373, -1));

        approveBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        approveBtn.setText("Update");
        approveBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        approveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBtnActionPerformed(evt);
            }
        });
        add(approveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        describeCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        describeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Device defect or failure, including HIT ", "Use error ", "Combination or interaction of device defect or failure and use error ", "Unknown" }));
        add(describeCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 84, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void approveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBtnActionPerformed
        // TODO add your handling code here:
        de.setTypeOfDevice(typeCB.getSelectedItem().toString());
        de.setSingleUse(singleCB.getSelectedItem().toString());
        de.setMedicationInvolved(medicationCB.getSelectedItem().toString());
        de.setManufactureName(nameManufacTB.getText());
        de.setHITType(charCB.getSelectedItem().toString());
        de.setDeviceName(nameDeviceTB.getText());
        de.setDescription(describeCB.getSelectedItem().toString());
        JOptionPane.showMessageDialog(this, "Event Updated Successfully.");
        approveBtn.setEnabled(false);
    }//GEN-LAST:event_approveBtnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mainJPanel.remove(this);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.previous(mainJPanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveBtn;
    private javax.swing.JComboBox charCB;
    private javax.swing.JComboBox describeCB;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox medicationCB;
    private javax.swing.JTextField nameDeviceTB;
    private javax.swing.JTextField nameManufacTB;
    private javax.swing.JComboBox singleCB;
    private javax.swing.JComboBox typeCB;
    // End of variables declaration//GEN-END:variables
}
