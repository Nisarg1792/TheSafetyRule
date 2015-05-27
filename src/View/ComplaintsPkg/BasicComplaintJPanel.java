/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ComplaintsPkg;

import Complaints.Category.BasicComplaint;
import Locations.MedicalEntity;
import Roles.CityAdmin;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class BasicComplaintJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BasicComplaintJPanel
     */
    JPanel mainJPanel;
    CityAdmin cityAdmin;
    BasicComplaint bc;
    public BasicComplaintJPanel(JPanel mainJPanel,CityAdmin cityAdmin, MedicalEntity entity) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cityAdmin = cityAdmin;
        bc = new BasicComplaint();
        bc.setEntity(entity);
        warningLbl.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        reportdateCB = new javax.swing.JComboBox();
        reportMonthCB = new javax.swing.JComboBox();
        reportYearCB = new javax.swing.JComboBox();
        discDateCB = new javax.swing.JComboBox();
        discYearCB = new javax.swing.JComboBox();
        discMonthCB = new javax.swing.JComboBox();
        hrCB = new javax.swing.JComboBox();
        minCB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        descTB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        warningLbl = new javax.swing.JLabel();
        eventCB = new javax.swing.JComboBox();
        genderCB = new javax.swing.JComboBox();
        degreeCb = new javax.swing.JComboBox();
        reporterCB = new javax.swing.JComboBox();
        durationCB = new javax.swing.JComboBox();
        categoryCB = new javax.swing.JComboBox();
        ageCB = new javax.swing.JComboBox();
        locCB = new javax.swing.JComboBox();
        raceCB = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Next");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, -1, 50));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, -1, 50));

        reportdateCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(reportdateCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        reportMonthCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        add(reportMonthCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        reportYearCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032" }));
        add(reportYearCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        discDateCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(discDateCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        discYearCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032" }));
        add(discYearCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, -1, -1));

        discMonthCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        add(discMonthCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, -1));

        hrCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        add(hrCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));

        minCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        add(minCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Basic Description");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Report Date");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Event Reported");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Discovery Date");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Discovery Time");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Description");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Location");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        descTB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        add(descTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 600, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Category");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Patient Age range");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Race");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Degree of harm");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Duration of harm to the patient  ");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Reporter information ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        warningLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        warningLbl.setForeground(new java.awt.Color(255, 0, 0));
        warningLbl.setText("Please enter description.");
        add(warningLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        eventCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        eventCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Incident", "Near Miss", "Unsafe Condition" }));
        add(eventCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        genderCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        genderCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male ", "Female" }));
        add(genderCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        degreeCb.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        degreeCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Death", "Severe harm", "Moderate harm", "Mild harm", "No harm", " " }));
        add(degreeCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        reporterCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        reporterCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doctor, dentist ", "Nurse, nurse practitioner, physician assistant", "Pharmacist, pharmacy technician (including student) ", "Allied health professionals ", "Healthcare worker", "Emergency service personnel", "Patient, family member, volunteer, caregiver, or homecare assistant" }));
        add(reporterCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        durationCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        durationCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Permanent", "Temporary" }));
        add(durationCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        categoryCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        categoryCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Blood or Blood Product", "Device or Medical/Surgical Supply", "Fall", "Healthcare-associated Infection", "Medication or Other Substance", "Perinatal", "Pressure Ulcer", "Surgery or Anesthesia", "Venous Thromboembolism" }));
        add(categoryCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, -1, -1));

        ageCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        ageCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Neonate (0-28 days) ", "Infant (>28 days <1 year) ", "Child (1-12 years) ", "Adolescent (13-17 years) ", "Adult (18-64 years) ", "Mature adult (65-74 years) ", "Older adult (75-84 years) ", "Aged adult (85+ years) " }));
        add(ageCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        locCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        locCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inpatient general care area (e.g., medical/surgical unit) ", "Special care area (e.g., ICU, CCU, NICU) ", "Labor and delivery ", "Operating room or procedure area", "Radiology/imaging department, including onsite mobile units ", "Pharmacy ", "Laboratory, including pathology department and blood bank ", "Emergency department ", "Other area within the facility ", "Outpatient care area ", "Outside area (i.e., grounds of the facility)", "Other" }));
        add(locCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        raceCB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        raceCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "American Indian or Alaska Native ", "Asian ", "Black or African American ", "Native Hawaiian or Other Pacific Islander ", "White ", "More than one race " }));
        add(raceCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mainJPanel.remove(this);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.previous(mainJPanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        warningLbl.setVisible(false);
        if(!descTB.getText().trim().isEmpty()){
            bc.setReportDate(reportdateCB.getSelectedItem().toString() +"/" + reportMonthCB.getSelectedItem().toString() + "/"+reportYearCB.getSelectedItem().toString());
            bc.setCategory(categoryCB.getSelectedItem().toString());
            bc.setEventReported(eventCB.getSelectedItem().toString());
            bc.setDicoveryDate(discDateCB.getSelectedItem().toString() + "/" + discMonthCB.getSelectedItem().toString() + "/" +discYearCB.getSelectedItem().toString());
            bc.setDiscoveryTime(hrCB.getSelectedItem().toString()+":" + minCB.getSelectedItem().toString());
            bc.setPatientAge(ageCB.getSelectedItem().toString());
            bc.setDescription(descTB.getText());
            bc.setLocation(locCB.getSelectedItem().toString());
            bc.setGender(genderCB.getSelectedItem().toString());
            bc.setRace(raceCB.getSelectedItem().toString());
            bc.setDegree(degreeCb.getSelectedItem().toString());
            bc.setDuration(durationCB.getSelectedItem().toString());
            bc.setReporter(reporterCB.getSelectedItem().toString());
            switch(bc.getCategory()){
                case "Blood or Blood Product":
                    BloodEventJPanel be = new BloodEventJPanel(mainJPanel, cityAdmin, bc);
                    mainJPanel.add("Guest New Blood Complaint Request.", be);
                    CardLayout layout = (CardLayout) mainJPanel.getLayout();
                    layout.next(mainJPanel);
                    break;
                case "Device or Medical/Surgical Supply":
                    DevicesEventJPanel be1 = new DevicesEventJPanel(mainJPanel, cityAdmin, bc);
                    mainJPanel.add("Guest New Device Complaint Request.", be1);
                    CardLayout layout1 = (CardLayout) mainJPanel.getLayout();
                    layout1.next(mainJPanel);
                    break;
                case "Fall":
                    FallEventJPanel be2 = new FallEventJPanel(mainJPanel, cityAdmin, bc);
                    mainJPanel.add("Guest New Fall Complaint Request.", be2);
                    CardLayout layout2 = (CardLayout) mainJPanel.getLayout();
                    layout2.next(mainJPanel);
                    break;
                case "Healthcare-associated Infection":
                    HealthInfectionEventJPanel be3 = new HealthInfectionEventJPanel(mainJPanel, cityAdmin, bc);
                    mainJPanel.add("Guest New Healthcare Complaint Request.", be3);
                    CardLayout layout3 = (CardLayout) mainJPanel.getLayout();
                    layout3.next(mainJPanel);
                    break;
                case "Medication or Other Substance":
                    MedicalEventJPanel be4 = new MedicalEventJPanel(mainJPanel, cityAdmin, bc);
                    mainJPanel.add("Guest New Medication Complaint Request.", be4);
                    CardLayout layout4 = (CardLayout) mainJPanel.getLayout();
                    layout4.next(mainJPanel);
                    break;
                case "Perinatal":
                    PerinatalEventJPanel be5 = new PerinatalEventJPanel(mainJPanel, cityAdmin, bc);
                    mainJPanel.add("Guest New Perinatal Complaint Request.", be5);
                    CardLayout layout5 = (CardLayout) mainJPanel.getLayout();
                    layout5.next(mainJPanel);
                    break;
                case "Pressure Ulcer":
                    PressureUlcerEventJPanel be6 = new PressureUlcerEventJPanel(mainJPanel, cityAdmin, bc);
                    mainJPanel.add("Guest New Pressure Complaint Request.", be6);
                    CardLayout layout6 = (CardLayout) mainJPanel.getLayout();
                    layout6.next(mainJPanel);
                    break;
                case "Surgery or Anesthesia":
                    SurgeryEventJPanel be7 = new SurgeryEventJPanel(mainJPanel, cityAdmin, bc);
                    mainJPanel.add("Guest New Surgery Complaint Request.", be7);
                    CardLayout layout7 = (CardLayout) mainJPanel.getLayout();
                    layout7.next(mainJPanel);
                    break;
                case "Venous Thromboembolism":
                    VenousEventJPanel be8 = new VenousEventJPanel(mainJPanel, cityAdmin, bc);
                    mainJPanel.add("Guest New Venous Complaint Request.", be8);
                    CardLayout layout8 = (CardLayout) mainJPanel.getLayout();
                    layout8.next(mainJPanel);
                    break;
                    
            }
        }
        else{
            warningLbl.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ageCB;
    private javax.swing.JComboBox categoryCB;
    private javax.swing.JComboBox degreeCb;
    private javax.swing.JTextField descTB;
    private javax.swing.JComboBox discDateCB;
    private javax.swing.JComboBox discMonthCB;
    private javax.swing.JComboBox discYearCB;
    private javax.swing.JComboBox durationCB;
    private javax.swing.JComboBox eventCB;
    private javax.swing.JComboBox genderCB;
    private javax.swing.JComboBox hrCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox locCB;
    private javax.swing.JComboBox minCB;
    private javax.swing.JComboBox raceCB;
    private javax.swing.JComboBox reportMonthCB;
    private javax.swing.JComboBox reportYearCB;
    private javax.swing.JComboBox reportdateCB;
    private javax.swing.JComboBox reporterCB;
    private javax.swing.JLabel warningLbl;
    // End of variables declaration//GEN-END:variables
}