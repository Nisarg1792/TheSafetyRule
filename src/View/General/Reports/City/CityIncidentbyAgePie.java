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
import static View.General.Reports.City.CityDegreeHarmPie.draw;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import java.awt.CardLayout;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author admin
 */
public class CityIncidentbyAgePie extends javax.swing.JPanel {

    /**
     * Creates new form CityIncidentbyAgePie
     */
    JPanel mainJPanel;
    CityComplaints cc;
    int neo=0,infant=0,child=0,adol=0,adult=0,mature=0,old=0,aged=0;
    JFreeChart chart;
    public CityIncidentbyAgePie(JPanel mainJPanel,CityComplaints cc) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cc = cc;
        setChart();
    }

    void setChart(){
        PieDataset dataset = createDataset();
        chart = createChart(dataset, "Age Incidences Pie Chart");       
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(600, 400));
        chartPanel.setMouseWheelEnabled(true);
        chartJPanel.add(chartPanel);
    }
    void setData(){
        Complaint c = cc.getComplaints();
        for(BloodEvent evt : c.getBloodEvents()){
            switch(evt.getBc().getPatientAge()){
                case "Neonate (0-28 days)":
                    neo++;
                    break;
                case "Infant (>28 days <1 year)":
                    infant++;
                    break;
                case "Child (1-12 years)":
                    child++;
                    break;
                case "Adolescent (13-17 years)":
                    adol++;
                    break;
                case "Adult (18-64 years)":
                    adult++;
                    break;
                case "Mature adult (65-74 years)":
                    mature++;
                    break;
                case "Older adult (75-84 years)":
                    old++;
                    break;
                case "Aged adult (85+ years)":
                    aged++;
                    break;
            }
        }
        for(DeviceSurguryEvent evt : c.getDeviceSurguryEvents()){
            switch(evt.getBc().getPatientAge()){
                case "Neonate (0-28 days)":
                    neo++;
                    break;
                case "Infant (>28 days <1 year)":
                    infant++;
                    break;
                case "Child (1-12 years)":
                    child++;
                    break;
                case "Adolescent (13-17 years)":
                    adol++;
                    break;
                case "Adult (18-64 years)":
                    adult++;
                    break;
                case "Mature adult (65-74 years)":
                    mature++;
                    break;
                case "Older adult (75-84 years)":
                    old++;
                    break;
                case "Aged adult (85+ years)":
                    aged++;
                    break;
            }
        }
        for(FallEvent evt : c.getFallEvents()){
            switch(evt.getBc().getPatientAge()){
                case "Neonate (0-28 days)":
                    neo++;
                    break;
                case "Infant (>28 days <1 year)":
                    infant++;
                    break;
                case "Child (1-12 years)":
                    child++;
                    break;
                case "Adolescent (13-17 years)":
                    adol++;
                    break;
                case "Adult (18-64 years)":
                    adult++;
                    break;
                case "Mature adult (65-74 years)":
                    mature++;
                    break;
                case "Older adult (75-84 years)":
                    old++;
                    break;
                case "Aged adult (85+ years)":
                    aged++;
                    break;
            }
        }
        for(InfectionEvent evt : c.getInfectionEvents()){
            switch(evt.getBc().getPatientAge()){
                case "Neonate (0-28 days)":
                    neo++;
                    break;
                case "Infant (>28 days <1 year)":
                    infant++;
                    break;
                case "Child (1-12 years)":
                    child++;
                    break;
                case "Adolescent (13-17 years)":
                    adol++;
                    break;
                case "Adult (18-64 years)":
                    adult++;
                    break;
                case "Mature adult (65-74 years)":
                    mature++;
                    break;
                case "Older adult (75-84 years)":
                    old++;
                    break;
                case "Aged adult (85+ years)":
                    aged++;
                    break;
            }
        }
        for(MedicationEvent evt : c.getMedicationEvents()){
            switch(evt.getBc().getPatientAge()){
                case "Neonate (0-28 days)":
                    neo++;
                    break;
                case "Infant (>28 days <1 year)":
                    infant++;
                    break;
                case "Child (1-12 years)":
                    child++;
                    break;
                case "Adolescent (13-17 years)":
                    adol++;
                    break;
                case "Adult (18-64 years)":
                    adult++;
                    break;
                case "Mature adult (65-74 years)":
                    mature++;
                    break;
                case "Older adult (75-84 years)":
                    old++;
                    break;
                case "Aged adult (85+ years)":
                    aged++;
                    break;
            }
        }
        for(PeriNatalEvent evt : c.getPeriNatalEvents()){
            switch(evt.getBc().getPatientAge()){
                case "Neonate (0-28 days)":
                    neo++;
                    break;
                case "Infant (>28 days <1 year)":
                    infant++;
                    break;
                case "Child (1-12 years)":
                    child++;
                    break;
                case "Adolescent (13-17 years)":
                    adol++;
                    break;
                case "Adult (18-64 years)":
                    adult++;
                    break;
                case "Mature adult (65-74 years)":
                    mature++;
                    break;
                case "Older adult (75-84 years)":
                    old++;
                    break;
                case "Aged adult (85+ years)":
                    aged++;
                    break;
            }
        }
        for(PressureUlcerEvent evt : c.getPressureUlcerEvents()){
            switch(evt.getBc().getPatientAge()){
                case "Neonate (0-28 days)":
                    neo++;
                    break;
                case "Infant (>28 days <1 year)":
                    infant++;
                    break;
                case "Child (1-12 years)":
                    child++;
                    break;
                case "Adolescent (13-17 years)":
                    adol++;
                    break;
                case "Adult (18-64 years)":
                    adult++;
                    break;
                case "Mature adult (65-74 years)":
                    mature++;
                    break;
                case "Older adult (75-84 years)":
                    old++;
                    break;
                case "Aged adult (85+ years)":
                    aged++;
                    break;
            }
        }
        for(SurgeryEvent evt : c.getSurgeryEvents()){
            switch(evt.getBc().getPatientAge()){
                case "Neonate (0-28 days)":
                    neo++;
                    break;
                case "Infant (>28 days <1 year)":
                    infant++;
                    break;
                case "Child (1-12 years)":
                    child++;
                    break;
                case "Adolescent (13-17 years)":
                    adol++;
                    break;
                case "Adult (18-64 years)":
                    adult++;
                    break;
                case "Mature adult (65-74 years)":
                    mature++;
                    break;
                case "Older adult (75-84 years)":
                    old++;
                    break;
                case "Aged adult (85+ years)":
                    aged++;
                    break;
            }
        }
        for(VenousEvent evt : c.getVenousEvents()){
            switch(evt.getBc().getPatientAge()){
                case "Neonate (0-28 days)":
                    neo++;
                    break;
                case "Infant (>28 days <1 year)":
                    infant++;
                    break;
                case "Child (1-12 years)":
                    child++;
                    break;
                case "Adolescent (13-17 years)":
                    adol++;
                    break;
                case "Adult (18-64 years)":
                    adult++;
                    break;
                case "Mature adult (65-74 years)":
                    mature++;
                    break;
                case "Older adult (75-84 years)":
                    old++;
                    break;
                case "Aged adult (85+ years)":
                    aged++;
                    break;
            }
        }
    }
    private PieDataset createDataset() {
        setData();
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Neonate", new Double(neo));
        dataset.setValue("Infant ", new Double(infant));
        dataset.setValue("Child ", new Double(child));
        dataset.setValue("Adolescent ", new Double(adol));
        dataset.setValue("Adult", new Double(adult));
        dataset.setValue("Mature ", new Double(mature));
        dataset.setValue("Older ", new Double(old));
        dataset.setValue("Aged  ", new Double(aged));
        
        return dataset;        
    }
    private JFreeChart createChart(PieDataset dataset, String title) {
        
        chart = ChartFactory.createPieChart3D(title,          // chart title
            dataset,                // data
            true,                   // include legend
            true,
            false);

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
        
    }
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(258, 258, 258)
                        .addComponent(saveBtn)
                        .addGap(45, 389, Short.MAX_VALUE))))
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
            String filename = "CityIncidentByAgePie" + dateFormat.format(cal.getTime()).toString().trim() + "jpg";
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
