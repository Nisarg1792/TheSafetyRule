/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Accounts.CityUA;
import Accounts.ContinentUA;
import Accounts.CountryUA;
import Accounts.MasterAccountsDirectory;
import Accounts.StateUA;
import HelperPkg.Helper;
import Roles.MasterAdminList;
import MySystem.DB4OUtil;
import MySystem.EcoSystem;
import View.CityAdmin.CityAdminWorkArea;
import View.ContinentAdminPkg.ContinentAdminWorkArea;
import View.CountryAdminPkg.CountryAdminWorkArea;
import View.General.ComplaintView;
import View.MainAdminPkg.MainAdmin;
import View.StateAdminPkg.StateAdminWorkArea;
import java.awt.CardLayout;
import java.awt.Toolkit;

/**
 *
 * @author admin
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    MasterAdminList ma ;
    MasterAccountsDirectory mad;
    DB4OUtil db40;
    EcoSystem ecoSystem;
    public MainJFrame() {
        initComponents();
        db40 = DB4OUtil.getInstance();
        ecoSystem = db40.retrieveSystem();
        //ecoSystem = new EcoSystem();
        ma = ecoSystem.getMa();
        mad = ma.getMasAccDir();
        warningLbl.setVisible(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth()); 
        int ySize = ((int) tk.getScreenSize().getHeight());
        setSize(xSize, ySize-50);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        unameTB = new javax.swing.JTextField();
        passwordTB = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        levelCB = new javax.swing.JComboBox();
        loginBtn = new javax.swing.JButton();
        warningLbl = new javax.swing.JLabel();
        guestBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        mainJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                windowsClosing(evt);
            }
        });

        jSplitPane1.setDividerLocation(200);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("UserName");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Password");

        unameTB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        unameTB.setForeground(new java.awt.Color(0, 153, 204));

        passwordTB.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        passwordTB.setForeground(new java.awt.Color(0, 153, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("Level");

        levelCB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        levelCB.setForeground(new java.awt.Color(0, 153, 204));
        levelCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "City", "State", "Country", "Continent" }));

        loginBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginBtn.setText("LogIn");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        warningLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        warningLbl.setForeground(new java.awt.Color(255, 0, 51));
        warningLbl.setText("Incorrect UserName/Password");

        guestBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        guestBtn.setText("Guest Login");
        guestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("Guest Log in Here");

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Admin Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warningLbl))
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(levelCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(unameTB)
                                .addComponent(passwordTB, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(guestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(unameTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(passwordTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(levelCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(loginBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(warningLbl)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(guestBtn)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        mainJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(mainJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        Helper h = new Helper();
        boolean flag = false;
        warningLbl.setVisible(flag);
        
        if(h.isStringProper(unameTB.getText(),passwordTB.getText())){
            if(unameTB.getText().equalsIgnoreCase("admin") && passwordTB.getText().equalsIgnoreCase("admin")){
                //jSplitPane1.setRightComponent(new MainAdmin(mainJPanel, ma));
                MainAdmin maaa = new MainAdmin(mainJPanel, ma);
                mainJPanel.add("Getting to Main Admin", maaa);
                CardLayout layout = (CardLayout) mainJPanel.getLayout();
        
                layout.next(mainJPanel);
            }
            else{
                    flag=true;
                    switch(levelCB.getSelectedItem().toString()){
                        case "City":
                            CityUA ua =mad.verifyCityUA(unameTB.getText(), passwordTB.getText());
                            if(ua!=null){
                                flag = false;
                                CityAdminWorkArea cAWA = new CityAdminWorkArea(mainJPanel, ua);
                                mainJPanel.add("Getting to City Admin", cAWA);
                                CardLayout layout = (CardLayout) mainJPanel.getLayout();
        
                                layout.next(mainJPanel);
                            }
                            break;
                        case "State":
                            StateUA ua1 =mad.verifyStateUA(unameTB.getText(), passwordTB.getText());
                            if(ua1!=null){
                                flag = false;
                                StateAdminWorkArea sswa = new StateAdminWorkArea(mainJPanel, ua1);
                                mainJPanel.add("Getting to State Admin", sswa);
                                CardLayout layout = (CardLayout) mainJPanel.getLayout();
        
                                layout.next(mainJPanel);
                            }
                            break;
                        case "Country":
                            CountryUA ua2 =mad.verifyCountryUA(unameTB.getText(), passwordTB.getText());
                            if(ua2!=null){
                                flag = false;
                                CountryAdminWorkArea coawa = new CountryAdminWorkArea(mainJPanel, ua2);
                                mainJPanel.add("Getting to Country Admin", coawa);
                                CardLayout layout = (CardLayout) mainJPanel.getLayout();
        
                                layout.next(mainJPanel);
                            }
                            break;
                         case "Continent":
                            ContinentUA ua3 =mad.verifyContinentUA(unameTB.getText(), passwordTB.getText());
                            if(ua3!=null){
                                flag = false;
                                ContinentAdminWorkArea conawa = new ContinentAdminWorkArea(mainJPanel, ua3);
                                mainJPanel.add("Getting to Continent Admin", conawa);
                                CardLayout layout = (CardLayout) mainJPanel.getLayout();
        
                                layout.next(mainJPanel);
                            }
                            break; 

                    }
            }
        }
        else{
            flag=true;
        }
        warningLbl.setVisible(flag);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void guestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestBtnActionPerformed
        // TODO add your handling code here:
        mainJPanel.removeAll();
        ComplaintView c = new ComplaintView(mainJPanel, mad);
        mainJPanel.add("Getting to General", c);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        
                                layout.next(mainJPanel);
    }//GEN-LAST:event_guestBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        db40.storeSystem(ecoSystem);
        mainJPanel.removeAll();
        ComplaintView c = new ComplaintView(mainJPanel, mad);
        mainJPanel.add("Getting to General.,./", c);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        
                                layout.next(mainJPanel);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void windowsClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowsClosing
        // TODO add your handling code here:
       db40.storeSystem(ecoSystem); 
    }//GEN-LAST:event_windowsClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guestBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JComboBox levelCB;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainJPanel;
    private javax.swing.JPasswordField passwordTB;
    private javax.swing.JTextField unameTB;
    private javax.swing.JLabel warningLbl;
    // End of variables declaration//GEN-END:variables
}
