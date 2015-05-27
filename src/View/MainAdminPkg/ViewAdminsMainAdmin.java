/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.MainAdminPkg;

import Accounts.CityUA;
import Accounts.ContinentUA;
import Accounts.CountryUA;
import Accounts.MasterAccountsDirectory;
import Accounts.StateUA;
import Roles.CityAdmin;
import Roles.ContinentAdmin;
import Roles.CountryAdmin;
import Roles.StateAdmin;
import java.awt.CardLayout;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ViewAdminsMainAdmin extends javax.swing.JPanel {

    /**
     * Creates new form ViewAdminsMainAdmin
     */
    JPanel mainJPanel;
    MasterAccountsDirectory masterAccountDirectory;
    String type;
    public ViewAdminsMainAdmin(JPanel mainJPanel, MasterAccountsDirectory masterAccountDirectory, String type) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.masterAccountDirectory = masterAccountDirectory;
        this.type = type;
        warningLbl.setVisible(false);
        popData();
    }

    void popData(){
      DefaultTableModel dtm = (DefaultTableModel)dataTable.getModel();
        dtm.setNumRows(0);
        switch(type){
            case "Continent":
                for(ContinentUA adminUA : masterAccountDirectory.getContinentAdmins()){
                    ContinentAdmin admin = adminUA.getAdmin();
                    Object[] row = new Object[4];
                    row[0] = admin.getP().getName();
                    row[1] = admin.getUserAccount().getUserName();
                    row[2] = admin.getP().getCity()+"," + admin.getP().getState();
                    row[3] = admin.getContinent().getLocation().getValue();
                    dtm.addRow(row);
                } 
                break;
            case "Country" :
                for(CountryUA adminUA : masterAccountDirectory.getCountryAdmins()){
                    CountryAdmin admin = adminUA.getAdmin();
                    Object[] row = new Object[4];
                    row[0] = admin.getP().getName();
                    row[1] = admin.getUserAccount().getUserName();
                    row[2] = admin.getP().getCity()+"," + admin.getP().getState();
                    row[3] = admin.getCountry().getLocation().getValue();
                    dtm.addRow(row);
                } 
                break;
            case "State" :
                for(StateUA adminUA : masterAccountDirectory.getStateAdmins()){
                    StateAdmin admin = adminUA.getAdmin();
                    Object[] row = new Object[4];
                    row[0] = admin.getP().getName();
                    row[1] = admin.getUserAccount().getUserName();
                    row[2] = admin.getP().getCity()+"," + admin.getP().getState();
                    row[3] = admin.getState().getLocation().getValue();
                    dtm.addRow(row);
                }
                break;
            case "City" :
                for(CityUA adminUA : masterAccountDirectory.getCityAdmins()){
                    CityAdmin admin = adminUA.getAdmin();
                    Object[] row = new Object[4];
                    row[0] = admin.getP().getName();
                    row[1] = admin.getUserAccount().getUserName();
                    row[2] = admin.getP().getCity()+"," + admin.getP().getState();
                    row[3] = admin.getCity().getLocation().getValue();
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

        jLabel1 = new javax.swing.JLabel();
        dataTableScrollPane = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        warningLbl = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Admins");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "UserName", "Location", "Assign Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTableScrollPane.setViewportView(dataTable);
        dataTable.getColumnModel().getColumn(0).setResizable(false);
        dataTable.getColumnModel().getColumn(1).setResizable(false);
        dataTable.getColumnModel().getColumn(2).setResizable(false);
        dataTable.getColumnModel().getColumn(3).setResizable(false);

        add(dataTableScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 81, 702, 306));

        viewBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        viewBtn.setText("View/Update");
        viewBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, -1, -1));

        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        warningLbl.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        warningLbl.setForeground(new java.awt.Color(255, 0, 0));
        warningLbl.setText("Please select Admin from Table.");
        add(warningLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, -1, -1));

        refreshBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 61, 740, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        mainJPanel.remove(this);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.previous(mainJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        warningLbl.setVisible(false);
        int selectedIndex = dataTable.getSelectedRow();
        if(selectedIndex>-1){
            switch(type){
                case "Continent":
                    UpdateAdminContinentAdminMA uama = new UpdateAdminContinentAdminMA(mainJPanel, masterAccountDirectory.getContinentAdmins().get(selectedIndex).getAdmin());
                    mainJPanel.add("Main Admin View Parti Continent Admin", uama);
                    CardLayout layout = (CardLayout) mainJPanel.getLayout();
                    layout.next(mainJPanel);
                    break;
                case "Country" :
                    UpdateAdminCountryAdminMA uama1 = new UpdateAdminCountryAdminMA(mainJPanel, masterAccountDirectory.getCountryAdmins().get(selectedIndex).getAdmin());
                    mainJPanel.add("Main Admin View Parti Country Admin", uama1);
                    CardLayout layout1 = (CardLayout) mainJPanel.getLayout();
                    layout1.next(mainJPanel);
                    break;
                case "State" :
                    UpdateAdminStateAdminMA uama2 = new UpdateAdminStateAdminMA(mainJPanel, masterAccountDirectory.getStateAdmins().get(selectedIndex).getAdmin());
                    mainJPanel.add("Main Admin View State Asdmin", uama2);
                    CardLayout layout2 = (CardLayout) mainJPanel.getLayout();
                    layout2.next(mainJPanel);
                    break;
                case "City" :
                    UpdateAdminCityAdminMA uama3 = new UpdateAdminCityAdminMA(mainJPanel, masterAccountDirectory.getCityAdmins().get(selectedIndex).getAdmin());
                    mainJPanel.add("Main Admin View City Admin", uama3);
                    CardLayout layout3 = (CardLayout) mainJPanel.getLayout();
                    layout3.next(mainJPanel);
                    break;
                
            }
            
        }
        else{
            warningLbl.setVisible(true);
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        popData();
    }//GEN-LAST:event_refreshBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable dataTable;
    private javax.swing.JScrollPane dataTableScrollPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton viewBtn;
    private javax.swing.JLabel warningLbl;
    // End of variables declaration//GEN-END:variables
}
