/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.CityAdmin;

import HelperPkg.Helper;
import Locations.Location;
import Locations.MedicalEntity;
import Roles.CityAdmin;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class CreateNewEntity extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewEntity
     */
    JPanel mainJPanel;
    CityAdmin cityAdmin;
    public CreateNewEntity(JPanel mainJPanel, CityAdmin cityAdmin) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cityAdmin = cityAdmin;
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

        jLabel1 = new javax.swing.JLabel();
        addressTB = new javax.swing.JTextField();
        nameTB = new javax.swing.JTextField();
        telephoneTb = new javax.swing.JTextField();
        warningLbl = new javax.swing.JLabel();
        webTB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailTB = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Entity");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 37, -1, -1));

        addressTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(addressTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 149, 300, -1));

        nameTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(nameTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 109, 151, -1));

        telephoneTb.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(telephoneTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 189, 152, -1));

        warningLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        warningLbl.setForeground(new java.awt.Color(255, 0, 0));
        warningLbl.setText("Please fill all value.");
        add(warningLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        webTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(webTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 269, 152, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 232, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 152, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Website");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 272, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telephone");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 192, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 112, -1, -1));

        emailTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(emailTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 229, 152, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 80, 700, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CreateBtnImg.jpg"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BackBtnImg.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 339, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    void clearFields(){
        nameTB.setText("");
        addressTB.setText("");
        telephoneTb.setText("");
        emailTB.setText("");
        webTB.setText("");
    }
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        mainJPanel.remove(this);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.previous(mainJPanel);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        warningLbl.setVisible(false);
        Helper h = new Helper();
        if(h.isStringProper(nameTB.getText(), addressTB.getText(),telephoneTb.getText(),emailTB.getText(),webTB.getText())){
            MedicalEntity m=cityAdmin.createNewMedicalEntity(nameTB.getText(), addressTB.getText(), telephoneTb.getText(), emailTB.getText(), webTB.getText());
            m.setLocation(new Location("Medical Entity", cityAdmin.getCity().getLocation().getValue()));
            clearFields();
            JOptionPane.showMessageDialog(this, "Created Successfully.");
        }
        else{
            warningLbl.setVisible(true);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTB;
    private javax.swing.JTextField emailTB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTB;
    private javax.swing.JTextField telephoneTb;
    private javax.swing.JLabel warningLbl;
    private javax.swing.JTextField webTB;
    // End of variables declaration//GEN-END:variables
}
