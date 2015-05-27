/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.CityAdmin;

import Complaints.Category.BasicComplaint;
import Complaints.Category.BloodEvent;
import Complaints.Category.DeviceSurguryEvent;
import Complaints.Category.FallEvent;
import Complaints.Category.InfectionEvent;
import Complaints.Category.MedicationEvent;
import Complaints.Category.PeriNatalEvent;
import Complaints.Category.PressureUlcerEvent;
import Complaints.Category.SurgeryEvent;
import Complaints.Category.VenousEvent;
import Roles.CityAdmin;
import View.CityAdmin.ViewNewComplainsPkg.BasicComplaintJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ViewNewComplaintsCityAdmins extends javax.swing.JPanel {

    /**
     * Creates new form ViewNewComplaintsCityAdmins
     */
    JPanel mainJPanel;
    CityAdmin cityAdmin;
    public ViewNewComplaintsCityAdmins(JPanel mainJPanel,CityAdmin cityAdmin) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cityAdmin = cityAdmin;
        warningLbl.setVisible(false);
    }

    void popData(String type){
      DefaultTableModel dtm = (DefaultTableModel)dataTable.getModel();
        dtm.setNumRows(0);
        BasicComplaint bc;
        switch(type){
            case "Blood or Blood Product":
                for(BloodEvent e : cityAdmin.getComplaint().getBloodEvents()){
                    bc= e.getBc();
                    Object[] row = new Object[4];
                    row[0] = bc.getReportDate();
                    row[1] = bc.getCategory();
                    row[2] = bc.getEntity().getName();
                    row[3] = bc.getDegree();
                    dtm.addRow(row);
                }
                break;
            case "Device or Medical/Surgical Supply":
                for(DeviceSurguryEvent e : cityAdmin.getComplaint().getDeviceSurguryEvents()){
                    bc= e.getBc();
                    Object[] row = new Object[4];
                    row[0] = bc.getReportDate();
                    row[1] = bc.getCategory();
                    row[2] = bc.getEntity().getName();
                    row[3] = bc.getDegree();
                    dtm.addRow(row);
                }
                break;
            case "Fall":
                for(FallEvent e : cityAdmin.getComplaint().getFallEvents()){
                    bc= e.getBc();
                    Object[] row = new Object[4];
                    row[0] = bc.getReportDate();
                    row[1] = bc.getCategory();
                    row[2] = bc.getEntity().getName();
                    row[3] = bc.getDegree();
                    dtm.addRow(row);
                }
                break;
            case "Healthcare-associated Infection":
                for(InfectionEvent e : cityAdmin.getComplaint().getInfectionEvents()){
                    bc= e.getBc();
                    Object[] row = new Object[4];
                    row[0] = bc.getReportDate();
                    row[1] = bc.getCategory();
                    row[2] = bc.getEntity().getName();
                    row[3] = bc.getDegree();
                    dtm.addRow(row);
                }
                break;
            case "Medication or Other Substance":
                for(MedicationEvent e : cityAdmin.getComplaint().getMedicationEvents()){
                    bc= e.getBc();
                    Object[] row = new Object[4];
                    row[0] = bc.getReportDate();
                    row[1] = bc.getCategory();
                    row[2] = bc.getEntity().getName();
                    row[3] = bc.getDegree();
                    dtm.addRow(row);
                }
                break;
            case "Perinatal":
                for(PeriNatalEvent e : cityAdmin.getComplaint().getPeriNatalEvents()){
                    bc= e.getBc();
                    Object[] row = new Object[4];
                    row[0] = bc.getReportDate();
                    row[1] = bc.getCategory();
                    row[2] = bc.getEntity().getName();
                    row[3] = bc.getDegree();
                    dtm.addRow(row);
                }
                break;
            case "Pressure Ulcer":
                for(PressureUlcerEvent e : cityAdmin.getComplaint().getPressureUlcerEvents()){
                    bc= e.getBc();
                    Object[] row = new Object[4];
                    row[0] = bc.getReportDate();
                    row[1] = bc.getCategory();
                    row[2] = bc.getEntity().getName();
                    row[3] = bc.getDegree();
                    dtm.addRow(row);
                }
                break;
            case "Surgery or Anesthesia":
                for(SurgeryEvent e : cityAdmin.getComplaint().getSurgeryEvents()){
                    bc= e.getBc();
                    Object[] row = new Object[4];
                    row[0] = bc.getReportDate();
                    row[1] = bc.getCategory();
                    row[2] = bc.getEntity().getName();
                    row[3] = bc.getDegree();
                    dtm.addRow(row);
                }
                break;
            case "Venous Thromboembolism":
                for(VenousEvent e : cityAdmin.getComplaint().getVenousEvents()){
                    bc= e.getBc();
                    Object[] row = new Object[4];
                    row[0] = bc.getReportDate();
                    row[1] = bc.getCategory();
                    row[2] = bc.getEntity().getName();
                    row[3] = bc.getDegree();
                    dtm.addRow(row);
                }
                break;
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
        dataTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        categoryCB = new javax.swing.JComboBox();
        viewBtn = new javax.swing.JButton();
        warningLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Report Date", "Event", "Medical Entity", "Degree of harm"
            }
        ));
        jScrollPane1.setViewportView(dataTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, 722, 392));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Category :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, -1, -1));

        categoryCB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        categoryCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Blood or Blood Product", "Device or Medical/Surgical Supply", "Fall", "Healthcare-associated Infection", "Medication or Other Substance", "Perinatal", "Pressure Ulcer", "Surgery or Anesthesia", "Venous Thromboembolism" }));
        add(categoryCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 23, -1, -1));

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 24, -1, -1));

        warningLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        warningLbl.setForeground(new java.awt.Color(255, 0, 0));
        warningLbl.setText("Please select a row.");
        add(warningLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 27, 217, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackBtnImg.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RemoveBtnImg.jpg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ApproveBtn.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refreshBtnImg.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/viewBtnImg.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        popData(categoryCB.getSelectedItem().toString());
    }//GEN-LAST:event_viewBtnActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        mainJPanel.remove(this);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.previous(mainJPanel);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        warningLbl.setVisible(false);
        int selectedIndex = dataTable.getSelectedRow();
        if(selectedIndex>-1){
            cityAdmin.rejectNewComplaint(categoryCB.getSelectedItem().toString(), selectedIndex);
        }
        else{
            warningLbl.setVisible(true);
        }
       popData(categoryCB.getSelectedItem().toString());
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        warningLbl.setVisible(false);
        int selectedIndex = dataTable.getSelectedRow();
        if(selectedIndex>-1){
            cityAdmin.approveNewComplaint(categoryCB.getSelectedItem().toString(), selectedIndex);
        }
        else{
            warningLbl.setVisible(true);
        }
       popData(categoryCB.getSelectedItem().toString());
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        popData(categoryCB.getSelectedItem().toString());
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        warningLbl.setVisible(false);
        int selectedIndex = dataTable.getSelectedRow();
        if(selectedIndex>-1){
            BasicComplaintJPanel bc = new BasicComplaintJPanel(mainJPanel, cityAdmin, categoryCB.getSelectedItem().toString(), selectedIndex);
            mainJPanel.add("City Admin View New Event Update", bc);
            CardLayout layout = (CardLayout) mainJPanel.getLayout();
            layout.next(mainJPanel);
        }    
        else{
            warningLbl.setVisible(true);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox categoryCB;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewBtn;
    private javax.swing.JLabel warningLbl;
    // End of variables declaration//GEN-END:variables
}
