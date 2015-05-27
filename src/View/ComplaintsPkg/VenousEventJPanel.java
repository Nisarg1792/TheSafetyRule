/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ComplaintsPkg;

import Complaints.Category.BasicComplaint;
import Complaints.Category.VenousEvent;
import Roles.CityAdmin;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class VenousEventJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VenousEventJPanel
     */
    VenousEvent ve;
    JPanel mainJPanel;
    CityAdmin cityAdmin;
    public VenousEventJPanel(JPanel mainJPanel,CityAdmin cityAdmin,BasicComplaint bc) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cityAdmin = cityAdmin;
        
        ve = cityAdmin.getComplaint().createVenousEvent();
        ve.setBc(bc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        phyCB = new javax.swing.JComboBox();
        occureedCB = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        documentedCB = new javax.swing.JComboBox();
        testDVTCB = new javax.swing.JComboBox();
        antiCB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        testPECB = new javax.swing.JComboBox();
        pharmCB = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        riskVTECB = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 416, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("What was the patient’s documented risk of VTE?");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 233, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Was any pharmacological anticoagulant prophylaxis administered?");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 311, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Venous Thromboembolism Event");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, -1, -1));

        phyCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        phyCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes ", "No ", "Unknown ", "None" }));
        add(phyCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 270, 240, -1));

        occureedCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        occureedCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Deep Vein Thrombosis- Upper extremity/upper thorax", "Deep Vein Thrombosis-Lower extremity/pelvis", "Deep Vein Thrombosis-Both", "Pulmonary Embolism (PE) ", " ", " " }));
        add(occureedCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 76, 308, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Was any physical or mechanical prophylaxis applied?");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 272, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Which of the following occurred?");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 78, -1, -1));

        documentedCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        documentedCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Low risk of VTE ", "High risk of VTE ", "Unknown", "None" }));
        add(documentedCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 231, 240, -1));

        testDVTCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        testDVTCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Venous compression ultrasound or duplex ultrasound ", "Magnetic resonance imaging (MRI) ", "Computed tomography (CT) ", "Venography ", "None of the above" }));
        add(testDVTCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 115, -1, -1));

        antiCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        antiCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Contraindicated ", "Patient determined to be at low risk ", "Risk/benefit did not warrant prophylaxis ", "Patient refused ", "Unknown ", "Other", "None" }));
        add(antiCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 348, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Which diagnostic test confirmed the DVT?");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 117, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Why the pharmacologic anticoagulant prophylaxis was not given?");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, -1, -1));

        testPECB.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        testPECB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chest CT angiography with contrast ", "Nuclear medicine pulmonary scan ", "Magnetic resonance imaging (MRI) ", "Pulmonary angiography ", "Post-mortem examination finding that PE likely contributed to death of patient ", "None of the above" }));
        add(testPECB, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 154, -1, -1));

        pharmCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        pharmCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes ", "No ", "Unknown", "None" }));
        add(pharmCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 309, 242, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Which diagnostic test confirmed the PE?");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, -1, -1));

        riskVTECB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        riskVTECB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes ", "No ", "Unknown", "None" }));
        add(riskVTECB, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 192, 240, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Was a formal VTE risk assessment documented?");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 194, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        ve.setDocumentedVTE(documentedCB.getSelectedItem().toString());
        ve.setNotGiven(antiCB.getSelectedItem().toString());
        ve.setOccured(occureedCB.getSelectedItem().toString());
        ve.setPharmaProphylaxis(pharmCB.getSelectedItem().toString());
        ve.setPhysicalProphylaxis(phyCB.getSelectedItem().toString());
        ve.setRiskVTE(riskVTECB.getSelectedItem().toString());
        ve.setTestDVT(testDVTCB.getSelectedItem().toString());
        ve.setTestPE(testPECB.getSelectedItem().toString());
        JOptionPane.showMessageDialog(this, "Event Reported Successfully.");
        submitBtn.setEnabled(false);
    }//GEN-LAST:event_submitBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox antiCB;
    private javax.swing.JComboBox documentedCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox occureedCB;
    private javax.swing.JComboBox pharmCB;
    private javax.swing.JComboBox phyCB;
    private javax.swing.JComboBox riskVTECB;
    private javax.swing.JButton submitBtn;
    private javax.swing.JComboBox testDVTCB;
    private javax.swing.JComboBox testPECB;
    // End of variables declaration//GEN-END:variables
}
