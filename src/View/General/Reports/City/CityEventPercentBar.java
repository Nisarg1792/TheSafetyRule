/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.General.Reports.City;

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
import static View.General.Reports.City.CityDegreeHarmBar.draw;
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
public class CityEventPercentBar extends javax.swing.JPanel {

    /**
     * Creates new form CityEventPercentBar
     */
    JPanel mainJPanel;
    CityComplaints cc;
    String key = "";
    Integer startInt = new Integer(1);
    Integer tempInt;
    HashMap incident,nearmiss,unsafe;
    JFreeChart chart;
    public CityEventPercentBar(JPanel mainJPanel,CityComplaints cc) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cc = cc;
        incident = new HashMap();
        nearmiss = new HashMap();
        unsafe = new HashMap();
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
                
                case "Incident":
                    if(incident.containsKey(key)){
                        tempInt = (Integer)incident.get(key) + 1;
                        incident.put(key, tempInt);
                    }
                    else{
                        incident.put(key, startInt);
                    }
                    break;
                case "Near Miss":
                    if(nearmiss.containsKey(key)){
                        tempInt = (Integer)nearmiss.get(key) + 1;
                        nearmiss.put(key, tempInt);
                    }
                    else{
                        nearmiss.put(key, startInt);
                    }
                    break;
                case "Unsafe Condition":
                    if(unsafe.containsKey(key)){
                        tempInt = (Integer)unsafe.get(key) + 1;
                        unsafe.put(key, tempInt);
                    }
                    else{
                        unsafe.put(key, startInt);
                    }
                    break;
            }
    }
    void setData(){
        Complaint c = cc.getComplaints();
        
        for(BloodEvent evt : c.getBloodEvents()){
            key = evt.getBc().getEntity().getLocation().getValue();
            setValues(evt.getBc().getEventReported());         
        }
        for(DeviceSurguryEvent evt : c.getDeviceSurguryEvents()){
            key = evt.getBc().getEntity().getLocation().getValue();
            setValues(evt.getBc().getEventReported());
        }
        for(FallEvent evt : c.getFallEvents()){
            key = evt.getBc().getEntity().getLocation().getValue();
            setValues(evt.getBc().getEventReported());
        }
        for(InfectionEvent evt : c.getInfectionEvents()){
            key = evt.getBc().getEntity().getLocation().getValue();
            setValues(evt.getBc().getEventReported());
        }
        for(MedicationEvent evt : c.getMedicationEvents()){
            key = evt.getBc().getEntity().getLocation().getValue();
            setValues(evt.getBc().getEventReported());
        }
        for(PeriNatalEvent evt : c.getPeriNatalEvents()){
            key = evt.getBc().getEntity().getLocation().getValue();
            setValues(evt.getBc().getEventReported());
        }
        for(PressureUlcerEvent evt : c.getPressureUlcerEvents()){
            key = evt.getBc().getEntity().getLocation().getValue();
            setValues(evt.getBc().getEventReported());
        }
        for(SurgeryEvent evt : c.getSurgeryEvents()){
            key = evt.getBc().getEntity().getLocation().getValue();
            setValues(evt.getBc().getEventReported());
        }
        for(VenousEvent evt : c.getVenousEvents()){
            key = evt.getBc().getEntity().getLocation().getValue();
            setValues(evt.getBc().getEventReported());
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
         for (Object key : incident.keySet()) {
		num = (Integer)incident.get(key);
             dataset.addValue(num.intValue(), "Incident", (String)key);
	 }
         for (Object key : nearmiss.keySet()) {
		num = (Integer)nearmiss.get(key);
             dataset.addValue(num.intValue(), "Near Miss", (String)key);
	 }
         for (Object key : unsafe.keySet()) {
		num = (Integer)unsafe.get(key);
             dataset.addValue(num.intValue(), "Unsafe", (String)key);
	 }
         
          return dataset;
     }
     private JFreeChart createChart(final CategoryDataset dataset) {
        
        // create the chart...
        chart = ChartFactory.createBarChart(
            "Bar Chart Demo",         // chart title
            "Category",               // domain axis label
            "Value",                  // range axis label
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(258, 258, 258)
                        .addComponent(saveBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(saveBtn))
                .addContainerGap(18, Short.MAX_VALUE))
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
            String filename = "CityEventPercentageBar" + dateFormat.format(cal.getTime()).toString().trim() + "jpg";
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
