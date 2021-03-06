/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.CountryAdminPkg;

import Accounts.ContinentUA;
import Accounts.CountryUA;
import View.ContinentAdminPkg.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class CountryAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form CountryAdminWorkArea
     */
    JPanel mainJPanel;
    CountryUA countryUA;
    public CountryAdminWorkArea(JPanel mainJPanel,CountryUA countryUA) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.countryUA = countryUA;
        welcomeLbl.setText("Welcome "+ countryUA.getAdmin().getP().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createStateAdminBtn = new javax.swing.JButton();
        createPersonBtn = new javax.swing.JButton();
        viewAdminsBtn = new javax.swing.JButton();
        viewPersonBtn = new javax.swing.JButton();
        welcomeLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createStateAdminBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createStateAdminBtn.setText("Create State Admin");
        createStateAdminBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        createStateAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStateAdminBtnActionPerformed(evt);
            }
        });
        add(createStateAdminBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 160, -1));

        createPersonBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createPersonBtn.setText("Create Person");
        createPersonBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        createPersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPersonBtnActionPerformed(evt);
            }
        });
        add(createPersonBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 118, 160, -1));

        viewAdminsBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewAdminsBtn.setText("View Admins");
        viewAdminsBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        viewAdminsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdminsBtnActionPerformed(evt);
            }
        });
        add(viewAdminsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 180, -1));

        viewPersonBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewPersonBtn.setText("View Persons");
        viewPersonBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        viewPersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPersonBtnActionPerformed(evt);
            }
        });
        add(viewPersonBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 118, 180, -1));

        welcomeLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        welcomeLbl.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLbl.setText("Welcome");
        add(welcomeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 33, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 64, 766, 12));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 64, 12, 405));
    }// </editor-fold>//GEN-END:initComponents

    private void createPersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonBtnActionPerformed
        // TODO add your handling code here:
        CreatePersonCountryAdmin cp = new CreatePersonCountryAdmin(mainJPanel, countryUA.getAdmin().getPd());
        mainJPanel.add("Conuntry Admin Create Person", cp);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_createPersonBtnActionPerformed

    private void createStateAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStateAdminBtnActionPerformed
        // TODO add your handling code here:
        CreateStateAdmin cp = new CreateStateAdmin(mainJPanel, countryUA);
        mainJPanel.add("Country Admin Create State Admin", cp);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_createStateAdminBtnActionPerformed

    private void viewPersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPersonBtnActionPerformed
        // TODO add your handling code here:
        ViewPersonsCountryAdmin cp = new ViewPersonsCountryAdmin(mainJPanel, countryUA.getAdmin().getPd());
        mainJPanel.add("Country Admin View Person", cp);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_viewPersonBtnActionPerformed

    private void viewAdminsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdminsBtnActionPerformed
        // TODO add your handling code here:
        ViewAdminsCountryAdmin cp = new ViewAdminsCountryAdmin(mainJPanel, countryUA.getAdmin());
        mainJPanel.add("Country Admin View Admins", cp);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_viewAdminsBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createPersonBtn;
    private javax.swing.JButton createStateAdminBtn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton viewAdminsBtn;
    private javax.swing.JButton viewPersonBtn;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}
