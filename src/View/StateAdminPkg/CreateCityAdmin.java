/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.StateAdminPkg;

import Accounts.StateUA;
import HelperPkg.Helper;
import Roles.CityAdmin;
import Roles.Person;
import Roles.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class CreateCityAdmin extends javax.swing.JPanel {

    /**
     * Creates new form CreateCityAdmin
     */
    JPanel mainJPanel;
    StateUA stateUA;
    PersonDirectory pd;
    public CreateCityAdmin(JPanel mainJPanel,StateUA stateUA) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.stateUA = stateUA;
        pd = stateUA.getAdmin().getPd();
        warningLbl.setVisible(false);
        setData();
    }

    void setData(){
        DefaultTableModel dtm = (DefaultTableModel)dataTable.getModel();
        dtm.setNumRows(0);
        for(Person p : pd.getPersons()){
            Object[] row = new Object[4];
            row[0] = p.getName();
            row[1] = p.getCity();
            row[2] = p.getState();
            row[3] = p.getCountry();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dataTableScrollPane = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userNameTB = new javax.swing.JTextField();
        passwordTB = new javax.swing.JTextField();
        assignedContinentTB = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        warningLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create City Admin");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 29, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Person");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 90, -1, -1));

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "City", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTableScrollPane.setViewportView(dataTable);
        dataTable.getColumnModel().getColumn(0).setResizable(false);
        dataTable.getColumnModel().getColumn(1).setResizable(false);
        dataTable.getColumnModel().getColumn(2).setResizable(false);

        add(dataTableScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 90, 267, 438));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("UserName");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 96, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 132, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Assigned City");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 175, -1, -1));

        userNameTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(userNameTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 116, -1));

        passwordTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(passwordTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 132, 116, -1));

        assignedContinentTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(assignedContinentTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 172, 116, -1));

        createBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createBtn.setText("Create Admin");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 386, 194, 50));

        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 454, 194, 50));

        warningLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        warningLbl.setForeground(new java.awt.Color(255, 0, 0));
        warningLbl.setText("Please fill in and select proper Values.");
        add(warningLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 283, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 62, 652, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 90, 13, 438));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         mainJPanel.remove(this);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.previous(mainJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        warningLbl.setVisible(false);
        int index = dataTable.getSelectedRow();
        if(validateFields() && index>-1){
            
            CityAdmin admin =stateUA.getAdmin().createCityAdmin(userNameTB.getText(), passwordTB.getText(), assignedContinentTB.getText(), index);
            if(admin==null){
                JOptionPane.showMessageDialog(this, "UserName already exists.");
            }
            else{
            clearFields();
            JOptionPane.showMessageDialog(this, "City Admin Created Successfully.");
            }
        }
        else{
            warningLbl.setVisible(true);
        }
    }//GEN-LAST:event_createBtnActionPerformed

    boolean validateFields(){
        HelperPkg.Helper h = new Helper();
        boolean flag =  h.isStringProper(userNameTB.getText(), passwordTB.getText(), assignedContinentTB.getText()); 
        
        return  flag;
    }
    void clearFields(){
        userNameTB.setText("");
        passwordTB.setText("");
        assignedContinentTB.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField assignedContinentTB;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JTable dataTable;
    private javax.swing.JScrollPane dataTableScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField passwordTB;
    private javax.swing.JTextField userNameTB;
    private javax.swing.JLabel warningLbl;
    // End of variables declaration//GEN-END:variables
}
