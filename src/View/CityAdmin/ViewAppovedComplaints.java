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
import View.CityAdmin.ApprovedComplaint.BasicComplaintJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ViewAppovedComplaints extends javax.swing.JPanel {

    /**
     * Creates new form ViewAppovedComplaints
     */
    JPanel mainJPanel;
    CityAdmin cityAdmin;
    public ViewAppovedComplaints(JPanel mainJPanel,CityAdmin cityAdmin) {
        initComponents();
       this.mainJPanel = mainJPanel;
        this.cityAdmin = cityAdmin;
        warningLbl.setVisible(false); 
    }

     void popData(String type){
      DefaultTableModel dtm = (DefaultTableModel)dataTable.getModel();
        dtm.setNumRows(0);
        BasicComplaint bc;
        switch(type.trim()){
            case "Blood or Blood Product":
                for(BloodEvent e : cityAdmin.getCityComplaints().getComplaints().getBloodEvents()){
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
                for(DeviceSurguryEvent e : cityAdmin.getCityComplaints().getComplaints().getDeviceSurguryEvents()){
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
                for(FallEvent e : cityAdmin.getCityComplaints().getComplaints().getFallEvents()){
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
                for(InfectionEvent e : cityAdmin.getCityComplaints().getComplaints().getInfectionEvents()){
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
                for(MedicationEvent e : cityAdmin.getCityComplaints().getComplaints().getMedicationEvents()){
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
                for(PeriNatalEvent e : cityAdmin.getCityComplaints().getComplaints().getPeriNatalEvents()){
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
                for(PressureUlcerEvent e : cityAdmin.getCityComplaints().getComplaints().getPressureUlcerEvents()){
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
                for(SurgeryEvent e : cityAdmin.getCityComplaints().getComplaints().getSurgeryEvents()){
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
                for(VenousEvent e : cityAdmin.getCityComplaints().getComplaints().getVenousEvents()){
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
        warningLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 92, 722, 392));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Category :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 32, -1, -1));

        categoryCB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        categoryCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Blood or Blood Product", "Device or Medical/Surgical Supply", "Fall", "Healthcare-associated Infection", "Medication or Other Substance", "Perinatal", "Pressure Ulcer", "Surgery or Anesthesia", "Venous Thromboembolism" }));
        add(categoryCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 36, -1, -1));

        warningLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        warningLbl.setForeground(new java.awt.Color(255, 0, 51));
        warningLbl.setText("Please select a row.");
        add(warningLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 217, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/viewBtnImg.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 70, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackBtnImg.jpg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refreshBtnImg.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FwdBtnImg.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        popData(categoryCB.getSelectedItem().toString());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        mainJPanel.remove(this);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.previous(mainJPanel);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        warningLbl.setVisible(false);
        int selectedIndex = dataTable.getSelectedRow();
        if(selectedIndex>-1){
            BasicComplaintJPanel bc = new BasicComplaintJPanel(mainJPanel, cityAdmin, categoryCB.getSelectedItem().toString(), selectedIndex);
            mainJPanel.add("City Admin View New Event Update...,,,,", bc);
            CardLayout layout = (CardLayout) mainJPanel.getLayout();
            layout.next(mainJPanel);
        }    
        else{
            warningLbl.setVisible(true);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        popData(categoryCB.getSelectedItem().toString());
    }//GEN-LAST:event_jLabel4MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox categoryCB;
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel warningLbl;
    // End of variables declaration//GEN-END:variables
}
