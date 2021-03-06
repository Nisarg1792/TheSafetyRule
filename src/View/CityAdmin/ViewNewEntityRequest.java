/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.CityAdmin;

import Locations.MedicalEntity;
import Roles.CityAdmin;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ViewNewEntityRequest extends javax.swing.JPanel {

    /**
     * Creates new form ViewNewEntityRequest
     */
    JPanel mainJPanel;
    CityAdmin cityAdmin;
    public ViewNewEntityRequest(JPanel mainJPanel,CityAdmin cityAdmin) {
        initComponents();
        this.cityAdmin = cityAdmin;
        this.mainJPanel = mainJPanel;
        warningLbl.setVisible(false);
        setData();
    }

    public void setData(){
        DefaultTableModel dtm = (DefaultTableModel)dataTable.getModel();
        dtm.setNumRows(0);
        for(MedicalEntity me : cityAdmin.getNewMedicalEntityRequest()){
            Object[] row = new Object[2];
            row[0] = me.getName();
            row[1] = me.getAddress();
            dtm.addRow(row);
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
                "Name", "Address"
            }
        ));
        jScrollPane1.setViewportView(dataTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 51, 699, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Entity");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 8, -1, -1));

        warningLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        warningLbl.setForeground(new java.awt.Color(255, 0, 0));
        warningLbl.setText("Please Select a row.");
        add(warningLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackBtnImg.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RemoveBtnImg.jpg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ApproveBtn.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refreshBtnImg.jpg"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/viewBtnImg.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        mainJPanel.remove(this);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.previous(mainJPanel);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        warningLbl.setVisible(false);
        int index = dataTable.getSelectedRow();
        if(index>-1){
            cityAdmin.rejectEntityRequest(index);
        }
        else{
            warningLbl.setVisible(true);
        }
        setData();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        warningLbl.setVisible(false);
        int index = dataTable.getSelectedRow();
        if(index>-1){
            cityAdmin.approveEntityRequest(index);
        }
        else{
            warningLbl.setVisible(true);
        }
        setData();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        setData();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        warningLbl.setVisible(false);
        int index = dataTable.getSelectedRow();
        if(index>-1){
            ViewNewPartiEntityRequest v = new ViewNewPartiEntityRequest(mainJPanel, cityAdmin.getNewMedicalEntityRequest().get(index));
            mainJPanel.add("City Admin View New Entity Parti", v);
            CardLayout layout = (CardLayout) mainJPanel.getLayout();
            layout.next(mainJPanel);
        }
        else{
            warningLbl.setVisible(true);
        }
        setData(); 
    }//GEN-LAST:event_jLabel6MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel warningLbl;
    // End of variables declaration//GEN-END:variables
}
