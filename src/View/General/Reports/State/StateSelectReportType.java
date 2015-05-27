/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.General.Reports.State;

import Complaints.StateComplaints;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class StateSelectReportType extends javax.swing.JPanel {

    /**
     * Creates new form StateSelectReportType
     */
    JPanel mainJPanel;
    StateComplaints cc;
    public StateSelectReportType(JPanel mainJPanel,StateComplaints cc) {
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

        pieEventPercenBtn = new javax.swing.JButton();
        barEventPercenBtn = new javax.swing.JButton();
        pieReportBtn = new javax.swing.JButton();
        barDegreeHarmBtn = new javax.swing.JButton();
        barGenderBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pieGenderBtn = new javax.swing.JButton();
        barAgeBtn = new javax.swing.JButton();
        barRacebtn = new javax.swing.JButton();
        pieDegreeHarmBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        pieRacebtn = new javax.swing.JButton();
        pieAgeBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        picIncidenceBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 153, 204));

        pieEventPercenBtn.setText("Event Percentage");
        pieEventPercenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieEventPercenBtnActionPerformed(evt);
            }
        });

        barEventPercenBtn.setText("Event Percentage");
        barEventPercenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barEventPercenBtnActionPerformed(evt);
            }
        });

        pieReportBtn.setText("Reporter");
        pieReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieReportBtnActionPerformed(evt);
            }
        });

        barDegreeHarmBtn.setText("Degree of Harm");
        barDegreeHarmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barDegreeHarmBtnActionPerformed(evt);
            }
        });

        barGenderBtn.setText("Gender by Event");
        barGenderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barGenderBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Report by:");

        pieGenderBtn.setText("Gender by Event");
        pieGenderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieGenderBtnActionPerformed(evt);
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

        pieDegreeHarmBtn.setText("Degree of Harm");
        pieDegreeHarmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieDegreeHarmBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bar Charts");

        pieRacebtn.setText("Race by Event");
        pieRacebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieRacebtnActionPerformed(evt);
            }
        });

        pieAgeBtn.setText("Age by Event");
        pieAgeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieAgeBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pie Charts");

        picIncidenceBtn.setText("Incidences");
        picIncidenceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picIncidenceBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(300, 300, 300)
                                .addComponent(jButton1)
                                .addGap(218, 218, 218))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pieDegreeHarmBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(barDegreeHarmBtn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(pieEventPercenBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                                        .addComponent(barEventPercenBtn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(pieRacebtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(barRacebtn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(pieAgeBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(barAgeBtn))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pieReportBtn)
                                            .addComponent(picIncidenceBtn))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pieGenderBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(barGenderBtn))))
                                .addGap(311, 311, 311))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pieEventPercenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieEventPercenBtnActionPerformed
        // TODO add your handling code here:
        StateEventPercentPie s = new StateEventPercentPie(mainJPanel, cc);
        mainJPanel.add("Guest State pieEventPercenBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_pieEventPercenBtnActionPerformed

    private void barEventPercenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barEventPercenBtnActionPerformed
        // TODO add your handling code here:
        StateEventPercentBar s = new StateEventPercentBar(mainJPanel, cc);
        mainJPanel.add("Guest StatebarEventPercenBtnActionPerformed", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_barEventPercenBtnActionPerformed

    private void pieReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieReportBtnActionPerformed
        // TODO add your handling code here:
        StateReporterPie s = new StateReporterPie(mainJPanel, cc);
        mainJPanel.add("Guest State pieReportBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_pieReportBtnActionPerformed

    private void barDegreeHarmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barDegreeHarmBtnActionPerformed
        // TODO add your handling code here:
        StateDegreeHarmBar s = new StateDegreeHarmBar(mainJPanel, cc);
        mainJPanel.add("Guest StatebarDegreeHarmBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_barDegreeHarmBtnActionPerformed

    private void barGenderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barGenderBtnActionPerformed
        // TODO add your handling code here:
        StateEventGenderBar s  = new StateEventGenderBar(mainJPanel, cc);
        mainJPanel.add("Guest StatebarGenderBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_barGenderBtnActionPerformed

    private void pieGenderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieGenderBtnActionPerformed
        // TODO add your handling code here:
        StateEventGenderPie s = new StateEventGenderPie(mainJPanel, cc);
        mainJPanel.add("Guest StatepieGenderBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_pieGenderBtnActionPerformed

    private void barAgeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barAgeBtnActionPerformed
        // TODO add your handling code here:
        StateIncidentbyAgeBar s = new StateIncidentbyAgeBar(mainJPanel, cc);
        mainJPanel.add("Guest StatebarAgeBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_barAgeBtnActionPerformed

    private void barRacebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barRacebtnActionPerformed
        // TODO add your handling code here:
        StateEventRaceBar s = new StateEventRaceBar(mainJPanel, cc);
        mainJPanel.add("Guest StatebarRacebtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_barRacebtnActionPerformed

    private void pieDegreeHarmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieDegreeHarmBtnActionPerformed
        // TODO add your handling code here:
        StateDegreeHarmPie s = new StateDegreeHarmPie(mainJPanel, cc);
        mainJPanel.add("Guest StatepieDegreeHarmBtnActionPerformed", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_pieDegreeHarmBtnActionPerformed

    private void pieRacebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieRacebtnActionPerformed
        // TODO add your handling code here:
        StateEventRacePie s = new StateEventRacePie(mainJPanel, cc);
        mainJPanel.add("Guest StatepieRacebtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_pieRacebtnActionPerformed

    private void pieAgeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieAgeBtnActionPerformed
        // TODO add your handling code here:
        StateIncidentbyAgePie s = new StateIncidentbyAgePie(mainJPanel, cc);
        mainJPanel.add("Guest StatepieAgeBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_pieAgeBtnActionPerformed

    private void picIncidenceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picIncidenceBtnActionPerformed
        // TODO add your handling code here:
        StateIncidentPercentPie s = new StateIncidentPercentPie(mainJPanel, cc);
        mainJPanel.add("Guest StatepicIncidenceBtnActionPerformed.", s);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_picIncidenceBtnActionPerformed

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