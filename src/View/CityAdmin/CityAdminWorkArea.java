/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.CityAdmin;

import Accounts.CityUA;
import Roles.CityAdmin;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class CityAdminWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form CityAdminWorkArea
     */
    JPanel mainJPanel;
    CityUA cityUA;
    CityAdmin cityAdmin;
    public CityAdminWorkArea(JPanel mainJPanel,CityUA cityUA) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cityUA = cityUA;
        cityAdmin = cityUA.getAdmin();
        welcomeLbl.setText("Welcome "+ cityUA.getAdmin().getP().getName());
        entityLbl.setVisible(false);
        complainLbl.setVisible(false);
        if(cityAdmin.newEntityCount()>0){
            entityLbl.setVisible(true);
        }
        if(cityAdmin.newComplaintCount()>0){
            complainLbl.setVisible(true);
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

        viewNewComplaintBtn = new javax.swing.JButton();
        viewApprovedComplaintsBtn = new javax.swing.JButton();
        viewNewEntityBtn = new javax.swing.JButton();
        viewApprovedEntityBtn = new javax.swing.JButton();
        createEntity = new javax.swing.JButton();
        welcomeLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        complainLbl = new javax.swing.JLabel();
        entityLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewNewComplaintBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewNewComplaintBtn.setText("View New Complaints");
        viewNewComplaintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNewComplaintBtnActionPerformed(evt);
            }
        });
        add(viewNewComplaintBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 140, 217, 50));

        viewApprovedComplaintsBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewApprovedComplaintsBtn.setText("View Approved Complaints");
        viewApprovedComplaintsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewApprovedComplaintsBtnActionPerformed(evt);
            }
        });
        add(viewApprovedComplaintsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 217, 50));

        viewNewEntityBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewNewEntityBtn.setText("View New Entity Requests");
        viewNewEntityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNewEntityBtnActionPerformed(evt);
            }
        });
        add(viewNewEntityBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 217, 50));

        viewApprovedEntityBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewApprovedEntityBtn.setText("View Approved Entity Request");
        viewApprovedEntityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewApprovedEntityBtnActionPerformed(evt);
            }
        });
        add(viewApprovedEntityBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 276, -1, 50));

        createEntity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createEntity.setText("Create Entity");
        createEntity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEntityActionPerformed(evt);
            }
        });
        add(createEntity, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 217, 50));

        welcomeLbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        welcomeLbl.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLbl.setText("Welcome");
        add(welcomeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 19, 368));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 82, 629, 10));

        complainLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/alertLabel.jpg"))); // NOI18N
        add(complainLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 60, 50));

        entityLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/alertLabel.jpg"))); // NOI18N
        add(entityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void viewNewComplaintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewNewComplaintBtnActionPerformed
        // TODO add your handling code here:
        ViewNewComplaintsCityAdmins cp = new ViewNewComplaintsCityAdmins(mainJPanel, cityAdmin);
        mainJPanel.add("City Admin View New Complaints", cp);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_viewNewComplaintBtnActionPerformed

    private void viewApprovedComplaintsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewApprovedComplaintsBtnActionPerformed
        // TODO add your handling code here:
        ViewAppovedComplaints cp = new ViewAppovedComplaints(mainJPanel, cityAdmin);
        mainJPanel.add("City Admin View Appoved Complaints", cp);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_viewApprovedComplaintsBtnActionPerformed

    private void viewNewEntityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewNewEntityBtnActionPerformed
        // TODO add your handling code here:
        ViewNewEntityRequest cp = new ViewNewEntityRequest(mainJPanel, cityAdmin);
        mainJPanel.add("City Admin View New Entity Request", cp);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_viewNewEntityBtnActionPerformed

    private void viewApprovedEntityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewApprovedEntityBtnActionPerformed
        // TODO add your handling code here:
        ViewApprovedEntity cp = new ViewApprovedEntity(mainJPanel, cityAdmin);
        mainJPanel.add("City Admin View Approved Entity Request", cp);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_viewApprovedEntityBtnActionPerformed

    private void createEntityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEntityActionPerformed
        // TODO add your handling code here:
        CreateNewEntity cp = new CreateNewEntity(mainJPanel, cityAdmin);
        mainJPanel.add("City Admin Create New Entity", cp);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_createEntityActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel complainLbl;
    private javax.swing.JButton createEntity;
    private javax.swing.JLabel entityLbl;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton viewApprovedComplaintsBtn;
    private javax.swing.JButton viewApprovedEntityBtn;
    private javax.swing.JButton viewNewComplaintBtn;
    private javax.swing.JButton viewNewEntityBtn;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}
