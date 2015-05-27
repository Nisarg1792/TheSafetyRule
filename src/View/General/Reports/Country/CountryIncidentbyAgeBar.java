/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.General.Reports.Country;

import Complaints.Category.BloodEvent;
import Complaints.Category.DeviceSurguryEvent;
import Complaints.Category.FallEvent;
import Complaints.Category.InfectionEvent;
import Complaints.Category.MedicationEvent;
import Complaints.Category.PeriNatalEvent;
import Complaints.Category.PressureUlcerEvent;
import Complaints.Category.SurgeryEvent;
import Complaints.Category.VenousEvent;
import Complaints.CityComplaints;
import Complaints.Complaint;
import Complaints.CountryComplaint;
import Complaints.StateComplaints;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author admin
 */
public class CountryIncidentbyAgeBar extends javax.swing.JPanel {

    /**
     * Creates new form CountryIncidentbyAgeBar
     */
    JPanel mainJPanel;
    CountryComplaint cc;
    String key = "";
    Integer startInt = new Integer(1);
    Integer tempInt;
    HashMap neo,infant,child,adol,adult,mature,old,aged;
    JFreeChart chart;
    public CountryIncidentbyAgeBar(JPanel mainJPanel,CountryComplaint cc) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cc = cc;
        neo = new HashMap();
        infant= new HashMap();
        child= new HashMap();
        adol= new HashMap();
        adult= new HashMap();
        mature= new HashMap();
        old= new HashMap();
        aged= new HashMap();
        setData();
        setChart();
    }

     void setChart(){
        CategoryDataset dataset = createDataset();
        chart = createChart(dataset);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(600, 400));
        chartPanel.setMouseWheelEnabled(true);
        chartJPanel.add(chartPanel);
    }
     
     
     void setValues(String s){
        switch(s.trim()){
                
                case "Neonate (0-28 days)":
                    if(neo.containsKey(key)){
                        tempInt = (Integer)neo.get(key) + 1;
                        neo.put(key, tempInt);
                    }
                    else{
                        neo.put(key, startInt);
                    }
                    break;
                case "Infant (>28 days <1 year)":
                    if(infant.containsKey(key)){
                        tempInt = (Integer)infant.get(key) + 1;
                        infant.put(key, tempInt);
                    }
                    else{
                        infant.put(key, startInt);
                    }
                    break;
                case "Child (1-12 years)":
                    if(child.containsKey(key)){
                        tempInt = (Integer)child.get(key) + 1;
                        child.put(key, tempInt);
                    }
                    else{
                        child.put(key, startInt);
                    }
                    break;
                case "Adolescent (13-17 years)":
                    if(adol.containsKey(key)){
                        tempInt = (Integer)adol.get(key) + 1;
                        adol.put(key, tempInt);
                    }
                    else{
                        adol.put(key, startInt);
                    }
                    break;
                case "Adult (18-64 years)":
                    if(adult.containsKey(key)){
                        tempInt = (Integer)adult.get(key) + 1;
                        adult.put(key, tempInt);
                    }
                    else{
                        adult.put(key, startInt);
                    }
                    break;
                case "Mature adult (65-74 years)":
                    if(mature.containsKey(key)){
                        tempInt = (Integer)mature.get(key) + 1;
                        mature.put(key, tempInt);
                    }
                    else{
                        mature.put(key, startInt);
                    }
                    break;
                case "Older adult (75-84 years)":
                    if(old.containsKey(key)){
                        tempInt = (Integer)old.get(key) + 1;
                        old.put(key, tempInt);
                    }
                    else{
                        old.put(key, startInt);
                    }
                    break;
                case "Aged adult (85+ years)":
                    if(aged.containsKey(key)){
                        tempInt = (Integer)aged.get(key) + 1;
                        aged.put(key, tempInt);
                    }
                    else{
                        aged.put(key, startInt);
                    }
                    break;
            }
    }
    void setData(){
        for(StateComplaints s : cc.getCountryComplaintList()){
            for(CityComplaints cityC : s.getStateComplaintList()){
                Complaint c = cityC.getComplaints();

                for(BloodEvent evt : c.getBloodEvents()){
                    key = evt.getBc().getEntity().getLocation().getValue();
                    setValues(evt.getBc().getPatientAge());         
                }
                for(DeviceSurguryEvent evt : c.getDeviceSurguryEvents()){
                    key = evt.getBc().getEntity().getLocation().getValue();
                    setValues(evt.getBc().getPatientAge());
                }
                for(FallEvent evt : c.getFallEvents()){
                    key = evt.getBc().getEntity().getLocation().getValue();
                    setValues(evt.getBc().getPatientAge());
                }
                for(InfectionEvent evt : c.getInfectionEvents()){
                    key = evt.getBc().getEntity().getLocation().getValue();
                    setValues(evt.getBc().getPatientAge());
                }
                for(MedicationEvent evt : c.getMedicationEvents()){
                    key = evt.getBc().getEntity().getLocation().getValue();
                    setValues(evt.getBc().getPatientAge());
                }
                for(PeriNatalEvent evt : c.getPeriNatalEvents()){
                    key = evt.getBc().getEntity().getLocation().getValue();
                    setValues(evt.getBc().getPatientAge());
                }
                for(PressureUlcerEvent evt : c.getPressureUlcerEvents()){
                    key = evt.getBc().getEntity().getLocation().getValue();
                    setValues(evt.getBc().getPatientAge());
                }
                for(SurgeryEvent evt : c.getSurgeryEvents()){
                    key = evt.getBc().getEntity().getLocation().getValue();
                    setValues(evt.getBc().getPatientAge());
                }
                for(VenousEvent evt : c.getVenousEvents()){
                    key = evt.getBc().getEntity().getLocation().getValue();
                    setValues(evt.getBc().getPatientAge());
                }
            }
        
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     public static void saveToFile(JFreeChart chart,
    String aFileName,
    int width,
    int height,
    double quality)
    throws FileNotFoundException, IOException
    {
        BufferedImage img = draw( chart, width, height );
 
        FileOutputStream fos = new FileOutputStream(aFileName);
        JPEGImageEncoder encoder2 =
        JPEGCodec.createJPEGEncoder(fos);
        JPEGEncodeParam param2 =
        encoder2.getDefaultJPEGEncodeParam(img);
        param2.setQuality((float) quality, true);
        encoder2.encode(img,param2);
        fos.close();
    }
    
    protected static BufferedImage draw(JFreeChart chart, int width, int height)
    {
        BufferedImage img =
        new BufferedImage(width , height,
        BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = img.createGraphics();
                       
        chart.draw(g2, new Rectangle2D.Double(0, 0, width, height));
 
        g2.dispose();
        return img;
    }
     private CategoryDataset createDataset(){
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         Integer num;
         for (Object key : neo.keySet()) {
		num = (Integer)neo.get(key);
             dataset.addValue(num.intValue(), "neo", (String)key);
	 }
         for (Object key : infant.keySet()) {
		num = (Integer)infant.get(key);
             dataset.addValue(num.intValue(), "infant", (String)key);
	 }
         for (Object key : child.keySet()) {
		num = (Integer)child.get(key);
             dataset.addValue(num.intValue(), "child", (String)key);
	 }
         for (Object key : adol.keySet()) {
		num = (Integer)adol.get(key);
             dataset.addValue(num.intValue(), "adol", (String)key);
	 }
         for (Object key : adult.keySet()) {
		num = (Integer)adult.get(key);
             dataset.addValue(num.intValue(), "adult", (String)key);
	 }
         for (Object key : mature.keySet()) {
		num = (Integer)mature.get(key);
             dataset.addValue(num.intValue(), "mature", (String)key);
	 }
         for (Object key : old.keySet()) {
		num = (Integer)old.get(key);
             dataset.addValue(num.intValue(), "old", (String)key);
	 }
         for (Object key : aged.keySet()) {
		num = (Integer)aged.get(key);
             dataset.addValue(num.intValue(), "aged", (String)key);
	 }
          return dataset;
     }
     private JFreeChart createChart(final CategoryDataset dataset) {
        
        // create the chart...
        chart = ChartFactory.createBarChart(
            "Age-By Incidents",         // chart title
            "Hospital",               // domain axis label
            "Count",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );
        return chart;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        chartJPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 204));

        chartJPanel.setLayout(new java.awt.BorderLayout());
        jScrollPane1.setViewportView(chartJPanel);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(258, 258, 258)
                        .addComponent(saveBtn)
                        .addGap(0, 380, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(saveBtn))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mainJPanel.remove(this);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.previous(mainJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        try{
            String filename = "CountryIncidentAgeBar" + dateFormat.format(cal.getTime()).toString().trim() + "jpg";
            saveToFile(chart,filename ,500,300,100);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chartJPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
