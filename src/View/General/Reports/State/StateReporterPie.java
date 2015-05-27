/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.General.Reports.State;

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
import Complaints.StateComplaints;
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
public class StateReporterPie extends javax.swing.JPanel {

    /**
     * Creates new form StateReporterPie
     */
    JPanel mainJPanel;
    StateComplaints cc;
    int doctor=0, nurse=0, pharma=0,allied=0, healthcare=0,emergency=0,patient=0;
    JFreeChart chart;
    public StateReporterPie(JPanel mainJPanel,StateComplaints cc) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.cc = cc;
        setChart();
    }

    void setChart(){
        PieDataset dataset = createDataset();
        chart = createChart(dataset, "Reporter Type ");       
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(600, 400));
        chartPanel.setMouseWheelEnabled(true);
        chartJPanel.add(chartPanel);
    }
    
    void setValue(String s){
        switch(s){
                case "Doctor, dentist":
                    doctor++;
                    break;
                case "Nurse, nurse practitioner, physician assistant":
                    nurse++;
                    break;
                case "Pharmacist, pharmacy technician (including student)":
                    pharma++;
                    break;
                case "Allied health professionals":
                    allied++;
                    break;
                case "Healthcare worker":
                    healthcare++;
                    break;
                case "Emergency service personnel":
                    emergency++;
                    break;
                case "Patient, family member, volunteer, caregiver, or homecare assistant":
                    patient++;
                    break;
            }
    }
    void setData(){
       
            for(CityComplaints cityC : cc.getStateComplaintList()){
                Complaint c = cityC.getComplaints();
        for(BloodEvent evt : c.getBloodEvents()){
            setValue(evt.getBc().getReporter());
        }
        for(DeviceSurguryEvent evt : c.getDeviceSurguryEvents()){
            setValue(evt.getBc().getReporter());
        }
        for(FallEvent evt : c.getFallEvents()){
            setValue(evt.getBc().getReporter());
        }
        for(InfectionEvent evt : c.getInfectionEvents()){
            setValue(evt.getBc().getReporter());
        }
        for(MedicationEvent evt : c.getMedicationEvents()){
            setValue(evt.getBc().getReporter());
        }
        for(PeriNatalEvent evt : c.getPeriNatalEvents()){
            setValue(evt.getBc().getReporter());
        }
        for(PressureUlcerEvent evt : c.getPressureUlcerEvents()){
            setValue(evt.getBc().getReporter());
        }
        for(SurgeryEvent evt : c.getSurgeryEvents()){
            setValue(evt.getBc().getReporter());
        }
        for(VenousEvent evt : c.getVenousEvents()){
            setValue(evt.getBc().getReporter());
        }
            }
        
        
    }
    private PieDataset createDataset() {
        setData();
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Doctor", new Double(doctor));
        dataset.setValue("Nurse", new Double(nurse));
        dataset.setValue("Pharmacist", new Double(pharma));
        dataset.setValue("Health professional", new Double(allied));
        dataset.setValue("Healthcare worker", new Double(healthcare));
        dataset.setValue("Emergency ", new Double(emergency));
        dataset.setValue("Patient", new Double(patient));
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
                .addContainerGap(16, Short.MAX_VALUE))
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
            String filename = "StateReporterPie" + dateFormat.format(cal.getTime()).toString().trim() + "jpg";
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
