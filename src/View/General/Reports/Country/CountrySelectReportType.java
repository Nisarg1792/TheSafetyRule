/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.General.Reports.Country;

import Complaints.CountryComplaint;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class CountrySelectReportType extends javax.swing.JPanel {

    /**
     * Creates new form CountrySelectReportType
     */
    JPanel mainJPanel;
    CountryComplaint cc;
    public CountrySelectReportType(JPanel mainJPanel,CountryComplaint cc) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cc = cc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barEventPercenBtn = new javax.swing.JButton();
        barGenderBtn = new javax.swing.JButton();
        pieDegreeHarmBtn = new javax.swing.JButton();
        barAgeBtn = new javax.swing.JButton();
        barRacebtn = new javax.swing.JButton();
        pieAgeBtn = new javax.swing.JButton();
        picIncidenceBtn = new javax.swing.JButton();
        pieRacebtn = new javax.swing.JButton();
        pieGenderBtn = new javax.swing.JButton();
        barDegreeHarmBtn = new javax.swing.JButton();
        pieReportBtn = new javax.swing.JButton();
        pieEventPercenBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 153, 204));

        barEventPercenBtn.setText("Event Percentage");
        barEventPercenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barEventPercenBtnActionPerformed(evt);
            }
        });

        barGenderBtn.setText("Gender by Event");
        barGenderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barGenderBtnActionPerformed(evt);
            }
        });

        pieDegreeHarmBtn.setText("Degree of Harm");
        pieDegreeHarmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieDegreeHarmBtnActionPerformed(evt);
            }
        });

        barAgeBtn.setText("Age by Event");
        barAgeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barAgeBtnActionPerformed(evt);
            }
        });

        barRacebtn.setText("Race by Event");
        barRacebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barRacebtnActionPerformed(evt);
            }
        });

        pieAgeBtn.setText("Age by Event");
        pieAgeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieAgeBtnActionPerformed(evt);
            }
        });

        picIncidenceBtn.setText("Incidences");
        picIncidenceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picIncidenceBtnActionPerformed(evt);
            }
        });

        pieRacebtn.setText("Race by Event");
        pieRacebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieRacebtnActionPerformed(evt);
            }
        });

        pieGenderBtn.setText("Gender by Event");
        pieGenderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieGenderBtnActionPerformed(evt);
            }
        });

        barDegreeHarmBtn.setText("Degree of Harm");
        barDegreeHarmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barDegreeHarmBtnActionPerformed(evt);
            }
        });

        pieReportBtn.setText("Reporter");
        pieReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieReportBtnActionPerformed(evt);
            }
        });

        pieEventPercenBtn.setText("Event Percentage");
        pieEventPercenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieEventPercenBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Report by:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pie Charts");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bar Charts");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(284, 284, 284))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(pieDegreeHarmBtn)
                            .addComponent(pieGenderBtn)
                            .addComponent(pieEventPercenBtn)
                            .addComponent(pieRacebtn)
                            .addComponent(pieAgeBtn)
                            .addComponent(pieReportBtn)
                            .addComponent(picIncidenceBtn))
                        .addGap(80, 80, 80)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(barDegreeHarmBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(barGenderBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(barEventPercenBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(barRacebtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(barAgeBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(311, 311, 311))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 133, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pieDegreeHarmBtn)
                            .addComponent(barDegreeHarmBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(barGenderBtn)
                            .addComponent(pieGenderBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(barEventPercenBtn)
                            .addComponent(pieEventPercenBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(barRacebtn)
                            .addComponent(pieRacebtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(barAgeBtn)
                            .addComponent(pieAgeBtn))
                        .addGap(26, 26, 26)
                        .addComponent(picIncidenceBtn)
                        .addGap(18, 18, 18)
                        .addComponent(pieReportBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void barEventPercenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barEventPercenBtnActionPerformed
        // TODO add your handling code here:
        CountryEventPercentBar s = new CountryEventPercentBar(mainJPanel, cc);
        mainJPanel.add("Guest CountrybarEventPercenBtnActionPerformed", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_barEventPercenBtnActionPerformed

    private void barGenderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barGenderBtnActionPerformed
        // TODO add your handling code here:
        CountryEventGenderBar s  = new CountryEventGenderBar(mainJPanel, cc);
        mainJPanel.add("Guest CountrybarGenderBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_barGenderBtnActionPerformed

    private void pieDegreeHarmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieDegreeHarmBtnActionPerformed
        // TODO add your handling code here:
        CountryDegreeHarmPie s = new CountryDegreeHarmPie(mainJPanel, cc);
        mainJPanel.add("Guest CountrypieDegreeHarmBtnActionPerformed", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_pieDegreeHarmBtnActionPerformed

    private void barAgeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barAgeBtnActionPerformed
        // TODO add your handling code here:
        CountryIncidentbyAgeBar s = new CountryIncidentbyAgeBar(mainJPanel, cc);
        mainJPanel.add("Guest CountrybarAgeBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_barAgeBtnActionPerformed

    private void barRacebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barRacebtnActionPerformed
        // TODO add your handling code here:
        CountryEventRaceBar s = new CountryEventRaceBar(mainJPanel, cc);
        mainJPanel.add("Guest CountrybarRacebtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_barRacebtnActionPerformed

    private void pieAgeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieAgeBtnActionPerformed
        // TODO add your handling code here:
        CountryIncidentbyAgePie s = new CountryIncidentbyAgePie(mainJPanel, cc);
        mainJPanel.add("Guest CountrypieAgeBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_pieAgeBtnActionPerformed

    private void picIncidenceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picIncidenceBtnActionPerformed
        // TODO add your handling code here:
        CountryIncidentPercentPie s = new CountryIncidentPercentPie(mainJPanel, cc);
        mainJPanel.add("Guest CountrypicIncidenceBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_picIncidenceBtnActionPerformed

    private void pieRacebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieRacebtnActionPerformed
        // TODO add your handling code here:
        CountryEventRacePie s = new CountryEventRacePie(mainJPanel, cc);
        mainJPanel.add("Guest CountrypieRacebtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_pieRacebtnActionPerformed

    private void pieGenderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieGenderBtnActionPerformed
        // TODO add your handling code here:
        CountryEventGenderPie s = new CountryEventGenderPie(mainJPanel, cc);
        mainJPanel.add("Guest CountrypieGenderBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_pieGenderBtnActionPerformed

    private void barDegreeHarmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barDegreeHarmBtnActionPerformed
        // TODO add your handling code here:
        CountryDegreeHarmBar s = new CountryDegreeHarmBar(mainJPanel, cc);
        mainJPanel.add("Guest CountrybarDegreeHarmBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_barDegreeHarmBtnActionPerformed

    private void pieReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieReportBtnActionPerformed
        // TODO add your handling code here:
        CountryReporterPie s = new CountryReporterPie(mainJPanel, cc);
        mainJPanel.add("Guest Country pieReportBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_pieReportBtnActionPerformed

    private void pieEventPercenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieEventPercenBtnActionPerformed
        // TODO add your handling code here:
        CountryEventPercentPie s = new CountryEventPercentPie(mainJPanel, cc);
        mainJPanel.add("Guest Country pieEventPercenBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_pieEventPercenBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mainJPanel.remove(this);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.previous(mainJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barAgeBtn;
    private javax.swing.JButton barDegreeHarmBtn;
    private javax.swing.JButton barEventPercenBtn;
    private javax.swing.JButton barGenderBtn;
    private javax.swing.JButton barRacebtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton picIncidenceBtn;
    private javax.swing.JButton pieAgeBtn;
    private javax.swing.JButton pieDegreeHarmBtn;
    private javax.swing.JButton pieEventPercenBtn;
    private javax.swing.JButton pieGenderBtn;
    private javax.swing.JButton pieRacebtn;
    private javax.swing.JButton pieReportBtn;
    // End of variables declaration//GEN-END:variables
}