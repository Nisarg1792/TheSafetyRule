/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ComplaintsPkg;

import Complaints.Category.BasicComplaint;
import Complaints.Category.BloodEvent;
import Roles.CityAdmin;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class BloodEventJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodEventJPanel
     */
    JPanel mainJPanel;
    CityAdmin cityAdmin;
    
    BloodEvent be;
    public BloodEventJPanel(JPanel mainJPanel,CityAdmin cityAdmin,BasicComplaint bc) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cityAdmin = cityAdmin;
        
        be = cityAdmin.getComplaint().createBloodEvent();
        be.setBc(bc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        involvedCB = new javax.swing.JComboBox();
        charCB = new javax.swing.JComboBox();
        actionCB = new javax.swing.JComboBox();
        discoverCB = new javax.swing.JComboBox();
        originCB = new javax.swing.JComboBox();
        submitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        involvedCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Whole blood", "Red blood cells", "Platelets", "Plasma", "Cryoprecipitate", "Granulocytes", "Lymphocytes", "Albumin", "Factors (e.g., VII, VIII, IX, AT III)", "IV immunoglobulin", "RhIg" }));
        add(involvedCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 79, -1, -1));

        charCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Incorrect action (e.g., patient given blood of wrong ABO type)", "Adverse reaction during or following administration without any apparent incorrect action", "Unknown" }));
        add(charCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 113, 344, -1));

        actionCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Incorrect patient", "Incorrect ABO/Rh type", "Incorrect product", "Incorrect sequence of administration of products", "Incorrect use of expired or unacceptably stored products", "Incorrect volume (e.g., number of units or milliliters)", "Incorrect IV fluid (i.e., administered product with incorrect IV fluid)", "Incorrect timing (e.g., delay in administration)", "Incorrect rate", "Unknown" }));
        add(actionCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 151, -1, -1));

        discoverCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Product test or request", "Sample collection", "Sample handling", "Sample receipt", "Sample testing", "Product storage", "Available for issue", "Product selection", "Product manipulation", "Request for pickup", "Product issue", "Product administration (transfusion or infusion)", "Post-transfusion or administration", "Unknown" }));
        add(discoverCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 182, -1, -1));

        originCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Product check-in", "Product test or request", "Sample collection", "Sample handling", "Sample receipt", "Sample testing", "Product storage", "Available for issue", "Product selection", "Product manipulation", "Request for pickup", "Product issue", "Product administration (transfusion or infusion)", "Post-transfusion or administration", "Unknown" }));
        add(originCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 220, -1, -1));

        submitBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 365, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Blood Event");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 37, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 426, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("What type of blood product was involved in the event or unsafe condition?");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 426, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Which of the following best characterizes the event?");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 117, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("What incorrect action was involved in administering the blood or blood product?");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 151, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("During which stage was the event discovered ?");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 185, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("During which stage did the event originate ?");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 219, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        be.setType(involvedCB.getSelectedItem().toString());
        be.setIncorrectaction(actionCB.getSelectedItem().toString());
        be.setEventOriginated(originCB.getSelectedItem().toString());
        be.setEventDiscovered(discoverCB.getSelectedItem().toString());
        be.setEventCharacterize(charCB.getSelectedItem().toString());
        JOptionPane.showMessageDialog(this, "Event Reported Successfully.");
        submitBtn.setEnabled(false);
    }//GEN-LAST:event_submitBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox actionCB;
    private javax.swing.JComboBox charCB;
    private javax.swing.JComboBox discoverCB;
    private javax.swing.JComboBox involvedCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox originCB;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
