/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.MainAdminPkg;

import Roles.MasterAdminList;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class MainAdmin extends javax.swing.JPanel {

    /**
     * Creates new form MainAdmin
     */
    JPanel mainJPanel;
    MasterAdminList masterAdminList;
    public MainAdmin(JPanel mainJPanel, MasterAdminList masterAdminList) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.masterAdminList = masterAdminList;
        welcomeLbl.setText("Welcome " +masterAdminList.getP().getName());
        adminJPanel.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        adminJPanel = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        welcomeLbl.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLbl.setText("Welcome");
        add(welcomeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 43, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Create Person");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 140, 147, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Create Continent Admin");
        jButton2.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 190, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("View Admins");
        jButton3.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 190, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("View Persons");
        jButton4.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 222, -1, -1));

        adminJPanel.setBackground(new java.awt.Color(0, 153, 204));
        adminJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setText("Continent");
        jButton5.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setText("Country");
        jButton6.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton7.setText("State");
        jButton7.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton8.setText("City");
        jButton8.setPreferredSize(new java.awt.Dimension(150, 50));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View All Admin by :");

        javax.swing.GroupLayout adminJPanelLayout = new javax.swing.GroupLayout(adminJPanel);
        adminJPanel.setLayout(adminJPanelLayout);
        adminJPanelLayout.setHorizontalGroup(
            adminJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminJPanelLayout.createSequentialGroup()
                .addGroup(adminJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminJPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2))
                    .addGroup(adminJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        adminJPanelLayout.setVerticalGroup(
            adminJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminJPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(adminJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(adminJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(adminJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 360, 210));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 104, 13, 405));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 86, 744, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CreatePersonMainAdmin cpma = new CreatePersonMainAdmin(mainJPanel, masterAdminList.getPd());
        mainJPanel.add("Main Admin Create Person by Main Admin", cpma);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        
        layout.next(mainJPanel);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CreateContinentAdmin cca = new CreateContinentAdmin(mainJPanel, masterAdminList);
        mainJPanel.add("Main Admin Create Continent Admin by Main Admin", cca);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        ViewPersonsMainAdmin vpma = new ViewPersonsMainAdmin(mainJPanel, masterAdminList.getPd());
        mainJPanel.add("Main Admin View Persons by Main Admin", vpma);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(adminJPanel.isVisible()==true){
            adminJPanel.setVisible(false);
        }
        else{
            adminJPanel.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ViewAdminsMainAdmin v = new ViewAdminsMainAdmin(mainJPanel, masterAdminList.getMasAccDir(), "Continent");
        mainJPanel.add("Main Admin View Continental All Admins by Main Admin", v);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ViewAdminsMainAdmin v = new ViewAdminsMainAdmin(mainJPanel, masterAdminList.getMasAccDir(), "Country");
        mainJPanel.add("Main Admin View Country All Admins by Main Admin", v);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        ViewAdminsMainAdmin v = new ViewAdminsMainAdmin(mainJPanel, masterAdminList.getMasAccDir(), "State");
        mainJPanel.add("Main Admin View State All Admins by Main Admin", v);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        ViewAdminsMainAdmin v = new ViewAdminsMainAdmin(mainJPanel, masterAdminList.getMasAccDir(), "City");
        mainJPanel.add("Main Admin View City All Admins by Main Admin", v);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_jButton8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminJPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}
