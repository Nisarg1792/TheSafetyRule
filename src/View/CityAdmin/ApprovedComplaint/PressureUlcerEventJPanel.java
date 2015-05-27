/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.CityAdmin.ApprovedComplaint;

import View.CityAdmin.ViewNewComplainsPkg.*;
import View.ComplaintsPkg.*;
import Complaints.Category.BasicComplaint;
import Complaints.Category.PressureUlcerEvent;
import HelperPkg.Helper;
import Roles.CityAdmin;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class PressureUlcerEventJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PressureUlcerEventJPanel
     */
    PressureUlcerEvent pe;
    JPanel mainJPanel;
    CityAdmin cityAdmin;
    public PressureUlcerEventJPanel(JPanel mainJPanel,CityAdmin cityAdmin,PressureUlcerEvent pe) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cityAdmin = cityAdmin;
        this.pe = pe;
        setValues();
        
    }

    public void setValues(){
        HelperPkg.Helper h = new Helper();
        stageCB.setSelectedIndex(h.getIndexForComboBox(pe.getStage(), stageCB));
        statusCB.setSelectedIndex(h.getIndexForComboBox(pe.getStatus(), statusCB));
        statusAdminCB.setSelectedIndex(h.getIndexForComboBox(pe.getStatusOnAdmission(), statusAdminCB));
        skinCB.setSelectedIndex(h.getIndexForComboBox(pe.getSkinInspection(), skinCB));
        riskCB.setSelectedIndex(h.getIndexForComboBox(pe.getRiskAssess(), riskCB));
        preventCB.setSelectedIndex(h.getIndexForComboBox(pe.getPrevantive(), preventCB));
        deviceCB.setSelectedIndex(h.getIndexForComboBox(pe.getDevice(), deviceCB));
        morbidityCB.setSelectedIndex(h.getIndexForComboBox(pe.getMorbidity(), morbidityCB));
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
        stageCB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        statusCB = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        statusAdminCB = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        skinCB = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        riskCB = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        preventCB = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        deviceCB = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        morbidityCB = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        approveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pressure Ulcer Event");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 32, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("What was the most advanced stage of the pressure ulcer or suspected Deep Tissue Injury?");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 77, -1, -1));

        stageCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        stageCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Stage/Category I ", "Stage/Category II ", "Suspected Deep Tissue Injury", "Stage/Category III ", "Stage/Category IV ", "Unstageable (any type)", "Mucosal, arterial, or venous, diabetic ulcer", "Unknown" }));
        add(stageCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 75, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("What was the status of the suspected Deep Tissue Injury on admission?");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 116, -1, -1));

        statusCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        statusCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Present as suspected Deep Tissue Injury ", "Present as a Stage/Category I pressure ulcer ", "Not present ", "Unknown" }));
        add(statusCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 114, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("What was the status on admission of the unstageable pressure ulcer?");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 155, -1, -1));

        statusAdminCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        statusAdminCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Not present ", "Stage/Category I ", "Stage/Category II ", "Suspected Deep Tissue Injury ", "Stage/Category III ", "Stage/Category IV ", "Unstageable ", "Unknown" }));
        add(statusAdminCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 153, 253, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("On admission to this facility, was a skin inspection documented? ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 194, -1, -1));

        skinCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        skinCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes ", "No ", "Unknown" }));
        add(skinCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 192, 253, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("When was the first pressure ulcer risk assessment documented?");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 233, -1, -1));

        riskCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        riskCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "On admission (within 24 hours) ", "Documented prior to the discovery of a newly-developed", "Documented after discovery of a newly-developed", "No risk assessment documented ", "Unknown" }));
        add(riskCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 231, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Was any preventive intervention implemented?");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 272, -1, -1));

        preventCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        preventCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes - Pressure redistribution device", "Yes - Repositioning", "Yes - Hydration and/or nutritional support", "Yes - Skin care practices", "Yes - Other", "No ", "Unknown" }));
        add(preventCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 270, 251, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Was the use of a device involved in the development of the pressure ulcer?");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 312, -1, -1));

        deviceCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        deviceCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes- Anti-embolic device", "Yes- Intraoperative positioning device", "Yes- Orthopedic appliance", "Yes-  Oxygen delivery device ", "Yes- Restraints ", "Yes-  Endotracheal Tube", "Yes-  Gastrostomy Tube", "Yes-  Nasogastric Tube", "Yes-  Tracheostomy Tube", "Yes-  Indwelling urinary catheter Tube", "Yes-  Other Tube ", "Yes-  Other", "No ", "Unknown" }));
        add(deviceCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 309, 254, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("During the patient’s stay at this facility, did the patient develop a secondary morbidity? ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 350, -1, -1));

        morbidityCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        morbidityCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes due to pressure ulcer", "Yes without pressure ulcer", "Yes pressure ulcer unknow ", "No ", "Unknown" }));
        add(morbidityCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 348, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, -1, -1));

        approveBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        approveBtn.setText("Update");
        approveBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        approveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBtnActionPerformed(evt);
            }
        });
        add(approveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mainJPanel.remove(this);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.previous(mainJPanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void approveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBtnActionPerformed
        // TODO add your handling code here:
        pe.setDevice(deviceCB.getSelectedItem().toString());
        pe.setMorbidity(morbidityCB.getSelectedItem().toString());
        pe.setPrevantive(preventCB.getSelectedItem().toString());
        pe.setRiskAssess(riskCB.getSelectedItem().toString());
        pe.setSkinInspection(skinCB.getSelectedItem().toString());
        pe.setStage(stageCB.getSelectedItem().toString());
        pe.setStatus(statusCB.getSelectedItem().toString());
        pe.setStatusOnAdmission(statusAdminCB.getSelectedItem().toString());
        JOptionPane.showMessageDialog(this, "Event Updated Successfully.");
        approveBtn.setEnabled(false);
    }//GEN-LAST:event_approveBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveBtn;
    private javax.swing.JComboBox deviceCB;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox morbidityCB;
    private javax.swing.JComboBox preventCB;
    private javax.swing.JComboBox riskCB;
    private javax.swing.JComboBox skinCB;
    private javax.swing.JComboBox stageCB;
    private javax.swing.JComboBox statusAdminCB;
    private javax.swing.JComboBox statusCB;
    // End of variables declaration//GEN-END:variables
}
