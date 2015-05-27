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
public class CityEventGenderPie extends javax.swing.JPanel {

    /**
     * Creates new form CityEventGenderPie
     */
    JPanel mainJPanel;
    CityComplaints cc;
    int male=0, female = 0;
    JFreeChart chart;
    public CityEventGenderPie(JPanel mainJPanel,CityComplaints cc) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cc = cc;
        setChart();
    }

    void setChart(){
        PieDataset dataset = createDataset();
        chart = createChart(dataset, "Gender Event Pie Chart");
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 800));
        chartPanel.setMouseWheelEnabled(true);
        chartJPanel.add(chartPanel);
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
    private PieDataset createDataset() {
        setData();
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Male", new Double(male));
        dataset.setValue("Female", new Double(female));
      
        
        return dataset;        
    }
    void setData(){
        Complaint c = cc.getComplaints();
        for(BloodEvent evt : c.getBloodEvents()){
            switch(evt.getBc().getGender()){
                case "Male":
                    male++;
                    break;
                case "Female" :
                    female++;
                    break;
            }
        }
        for(VenousEvent evt : c.getVenousEvents()){
            switch(evt.getBc().getGender()){
                case "Male":
                    male++;
                    break;
                case "Female" :
                    female++;
                    break;
            }
        }
        for(DeviceSurguryEvent evt : c.getDeviceSurguryEvents()){
            switch(evt.getBc().getGender()){
                case "Male":
                    male++;
                    break;
                case "Female" :
                    female++;
                    break;
            }
        }
        for(FallEvent evt : c.getFallEvents()){
            switch(evt.getBc().getGender()){
                case "Male":
                    male++;
                    break;
                case "Female" :
                    female++;
                    break;
            }
        }
        for(InfectionEvent evt : c.getInfectionEvents()){
            switch(evt.getBc().getGender()){
                case "Male":
                    male++;
                    break;
                case "Female" :
                    female++;
                    break;
            }
        }
        for(MedicationEvent evt : c.getMedicationEvents()){
            switch(evt.getBc().getGender()){
                case "Male":
                    male++;
                    break;
                case "Female" :
                    female++;
                    break;
            }
        }
        for(PeriNatalEvent evt : c.getPeriNatalEvents()){
            switch(evt.getBc().getGender()){
                case "Male":
                    male++;
                    break;
                case "Female" :
                    female++;
                    break;
            }
        }
        for(PressureUlcerEvent evt : c.getPressureUlcerEvents()){
            switch(evt.getBc().getGender()){
                case "Male":
                    male++;
                    break;
                case "Female" :
                    female++;
                    break;
            }
        }
        for(SurgeryEvent evt : c.getSurgeryEvents()){
            switch(evt.getBc().getGender()){
                case "Male":
                    male++;
                    break;
                case "Female" :
                    female++;
                    break;
            }
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
        chartJPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 204));

        chartJPanel.setPreferredSize(new java.awt.Dimension(900, 900));
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(258, 258, 258)
                        .addComponent(saveBtn)
                        .addGap(45, 390, Short.MAX_VALUE))))
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
                .addContainerGap(17, Short.MAX_VALUE))
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
            String filename = "CityDegreeHarmPie" + dateFormat.format(cal.getTime()).toString().trim() + "jpg";
            saveToFile(chart,filename ,500,300,100);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chartJPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
