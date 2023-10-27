/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userInterface.WHOStaff;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author shreya baliga
 */
public class ViewDetailedReportWHOStaffJPanel extends javax.swing.JPanel {
    private HashMap<String,Integer> communitydetailsmap;
    private JPanel userProcessContainer;
   
    public ViewDetailedReportWHOStaffJPanel(JPanel userProcessContainer,HashMap<String,Integer> communitydetailsmap) {
        initComponents();
        this.communitydetailsmap = communitydetailsmap;
        this.userProcessContainer = userProcessContainer;
        
        populateDetailsForCommunity();
        populatePieDataChartPanel();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(227,242,227);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
    public void populateDetailsForCommunity()
    {
         try
        {
       seniorsWithHeartPrbField.setText(String.valueOf(communitydetailsmap.get("patientswithTumorProblem")));
       senWithNoHeartProbField.setText(String.valueOf(communitydetailsmap.get("patientsswithNoTumorProblem")));
       totSeniorPPLField.setText(String.valueOf(communitydetailsmap.get("TotalNoOfpatients")));
       senSendDataToDocField.setText(String.valueOf(communitydetailsmap.get("patientsSendInfoToDoctor")));
       senShareInfoField.setText(String.valueOf(communitydetailsmap.get("patientsShareVitalInfo")));
       senNoSensorDevField.setText(String.valueOf(communitydetailsmap.get("patientsWithSensorDevice")));
       senWithSensorField.setText(String.valueOf(communitydetailsmap.get("patientsWithNoSensorDevice")));
        }
       catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " Data not available!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
       }  
    }
    
    public void populatePieDataChartPanel()
    {
        pieChartDetailedReportPanel.removeAll();
        
        try
        {
         DefaultPieDataset dataSet = new DefaultPieDataset(); 
         dataSet.setValue("patientswithTumorProblem",communitydetailsmap.get("patientswithTumorProblem"));
         dataSet.setValue("patientsswithNoTumorProblem", communitydetailsmap.get("patientsswithNoTumorProblem") );
         dataSet.setValue("TotalNoOfpatients", communitydetailsmap.get("TotalNoOfpatients"));
         dataSet.setValue("patientsSendInfoToDoctor",communitydetailsmap.get("patientsSendInfoToDoctor"));
         dataSet.setValue("patientsShareVitalInfo",  communitydetailsmap.get("patientsShareVitalInfo"));
         dataSet.setValue("patientsWithSensorDevice", communitydetailsmap.get("patientsWithSensorDevice"));
         dataSet.setValue("patientsWithNoSensorDevice", communitydetailsmap.get("patientsWithNoSensorDevice"));
     
         JFreeChart  chart = ChartFactory.createPieChart3D("Pie Chart ", dataSet, true, true, Locale.ENGLISH);
          chart.setBackgroundPaint(Color.WHITE);
          chart.getTitle().setPaint(Color.BLACK);
            ChartPanel chartpanel = new ChartPanel(chart);
          chartpanel.setDomainZoomable(true);
          chartpanel.setBackground(Color.GRAY);
        pieChartDetailedReportPanel.setLayout(new BorderLayout());
        pieChartDetailedReportPanel.add(chartpanel, BorderLayout.EAST);
        pieChartDetailedReportPanel.revalidate();
        pieChartDetailedReportPanel.setVisible(true);
       }
       
       catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " Data not available!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
       }
    }
    
    public void populateBarDataChartPanel()
    {
        if(communitydetailsmap==null || communitydetailsmap.isEmpty())
        {
        JOptionPane.showMessageDialog(null, " Data not available!","warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        try
        {
            DefaultCategoryDataset dataSet = new DefaultCategoryDataset(); 
        if(communitydetailsmap.get("patientswithTumorProblem")!=0)
        {
         dataSet.setValue(communitydetailsmap.get("patientswithTumorProblem"),"Values","patientswithTumorProblem");
        }
        if(communitydetailsmap.get("patientsswithNoTumorProblem")!=0)
        {
         dataSet.setValue(communitydetailsmap.get("patientsswithNoTumorProblem"),"Values","patientsswithNoTumorProblem" );
        }
        if(communitydetailsmap.get("TotalNoOfpatients")!=0)
        {
         dataSet.setValue(communitydetailsmap.get("TotalNoOfpatients"),"Values","TotalNoOfpatients" );
        }
        if(communitydetailsmap.get("patientsSendInfoToDoctor")!=0)
        {
         dataSet.setValue(communitydetailsmap.get("patientsSendInfoToDoctor"),"Values","patientsSendInfoToDoctor");
        }
        if(communitydetailsmap.get("patientsShareVitalInfo")!=0)
        {
        dataSet.setValue(communitydetailsmap.get("patientsShareVitalInfo"),"Values","patientsShareVitalInfo"  );
        }
        if(communitydetailsmap.get("patientsWithSensorDevice")!=0)
        {
        dataSet.setValue(communitydetailsmap.get("patientsWithSensorDevice"),"Values","patientsWithSensorDevice" );
        }
        if(communitydetailsmap.get("patientsWithNoSensorDevice")!=0)
        {
        dataSet.setValue(communitydetailsmap.get("patientsWithNoSensorDevice"),"Values","patientsWithNoSensorDevice");
        }
        JFreeChart barchart = ChartFactory.createBarChart(" Bar Chart" ," Values " ,"Community Info", dataSet,PlotOrientation.VERTICAL, false, true, false);
             barchart.setBackgroundPaint(Color.WHITE);
             barchart.getTitle().setPaint(Color.BLUE);
             CategoryPlot plot = barchart.getCategoryPlot();
             plot.setBackgroundPaint(Color.CYAN);
             
            ChartFrame frame = new ChartFrame("Bar Chart  ", barchart);
            frame.setVisible(true);
            frame.setSize(450,350);
       }
       
       catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " Data not available!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
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

        manageEnt1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        senSendDataToDocField = new javax.swing.JTextField();
        sendToDoc = new javax.swing.JLabel();
        seniorsWithHeartPrbField = new javax.swing.JTextField();
        totTransReq1 = new javax.swing.JLabel();
        totalSeniorPpl = new javax.swing.JLabel();
        senShareInfoField = new javax.swing.JTextField();
        noheartPrblm = new javax.swing.JLabel();
        hasHeartPblm = new javax.swing.JLabel();
        senWithNoHeartProbField = new javax.swing.JTextField();
        totSeniorPPLField = new javax.swing.JTextField();
        hasNoSensor = new javax.swing.JLabel();
        senWithSensorField = new javax.swing.JTextField();
        hasSensor = new javax.swing.JLabel();
        senNoSensorDevField = new javax.swing.JTextField();
        pieChartDetailedReportPanel = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        barchartBtn = new javax.swing.JButton();
        manageEnt2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(227, 242, 227));

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setText("View Detailed Information");

        jLayeredPane1.setBackground(new java.awt.Color(255, 204, 204));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        senSendDataToDocField.setEditable(false);
        senSendDataToDocField.setBackground(new java.awt.Color(228, 216, 216));
        senSendDataToDocField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senSendDataToDocFieldActionPerformed(evt);
            }
        });

        sendToDoc.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        sendToDoc.setText("Total No of patients who send information to doctor");

        seniorsWithHeartPrbField.setEditable(false);
        seniorsWithHeartPrbField.setBackground(new java.awt.Color(228, 216, 216));

        totTransReq1.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        totTransReq1.setText("Total No of patients who have sent  Vital Info");

        totalSeniorPpl.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        totalSeniorPpl.setText("Total No of  People who are in need of Help");

        senShareInfoField.setEditable(false);
        senShareInfoField.setBackground(new java.awt.Color(228, 216, 216));

        noheartPrblm.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        noheartPrblm.setText("No of patients with no Tumor");

        hasHeartPblm.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        hasHeartPblm.setText("No of patients with Tumor");

        senWithNoHeartProbField.setEditable(false);
        senWithNoHeartProbField.setBackground(new java.awt.Color(228, 216, 216));

        totSeniorPPLField.setEditable(false);
        totSeniorPPLField.setBackground(new java.awt.Color(228, 216, 216));

        hasNoSensor.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        hasNoSensor.setText("Total No of patients who dont have sensor device");

        senWithSensorField.setEditable(false);
        senWithSensorField.setBackground(new java.awt.Color(228, 216, 216));

        hasSensor.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        hasSensor.setText("Total No of patients with sensor device");

        senNoSensorDevField.setEditable(false);
        senNoSensorDevField.setBackground(new java.awt.Color(228, 216, 216));

        jLayeredPane1.setLayer(senSendDataToDocField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(sendToDoc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(seniorsWithHeartPrbField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(totTransReq1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(totalSeniorPpl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(senShareInfoField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(noheartPrblm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(hasHeartPblm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(senWithNoHeartProbField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(totSeniorPPLField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(hasNoSensor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(senWithSensorField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(hasSensor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(senNoSensorDevField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hasNoSensor)
                    .addComponent(totalSeniorPpl, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hasHeartPblm, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(hasSensor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noheartPrblm, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(totTransReq1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendToDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senNoSensorDevField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senShareInfoField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senWithSensorField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senWithNoHeartProbField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seniorsWithHeartPrbField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totSeniorPPLField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senSendDataToDocField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalSeniorPpl)
                    .addComponent(totSeniorPPLField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasHeartPblm)
                    .addComponent(seniorsWithHeartPrbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noheartPrblm)
                    .addComponent(senWithNoHeartProbField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasSensor)
                    .addComponent(senWithSensorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totTransReq1)
                    .addComponent(senShareInfoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasNoSensor)
                    .addComponent(senNoSensorDevField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendToDoc)
                    .addComponent(senSendDataToDocField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pieChartDetailedReportPanelLayout = new javax.swing.GroupLayout(pieChartDetailedReportPanel);
        pieChartDetailedReportPanel.setLayout(pieChartDetailedReportPanelLayout);
        pieChartDetailedReportPanelLayout.setHorizontalGroup(
            pieChartDetailedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );
        pieChartDetailedReportPanelLayout.setVerticalGroup(
            pieChartDetailedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        backJButton.setBackground(new java.awt.Color(209, 209, 220));
        backJButton.setText("Previous");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        barchartBtn.setBackground(new java.awt.Color(209, 209, 220));
        barchartBtn.setText("Display Bar Chart");
        barchartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barchartBtnActionPerformed(evt);
            }
        });

        manageEnt2.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt2.setText("      WHO STAFF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(manageEnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(312, 312, 312)
                        .addComponent(barchartBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(pieChartDetailedReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(manageEnt2)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manageEnt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pieChartDetailedReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barchartBtn)
                    .addComponent(backJButton))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void barchartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barchartBtnActionPerformed
       populateBarDataChartPanel();
    }//GEN-LAST:event_barchartBtnActionPerformed

    private void senSendDataToDocFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senSendDataToDocFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senSendDataToDocFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton barchartBtn;
    private javax.swing.JLabel hasHeartPblm;
    private javax.swing.JLabel hasNoSensor;
    private javax.swing.JLabel hasSensor;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel manageEnt2;
    private javax.swing.JLabel noheartPrblm;
    private javax.swing.JPanel pieChartDetailedReportPanel;
    private javax.swing.JTextField senNoSensorDevField;
    private javax.swing.JTextField senSendDataToDocField;
    private javax.swing.JTextField senShareInfoField;
    private javax.swing.JTextField senWithNoHeartProbField;
    private javax.swing.JTextField senWithSensorField;
    private javax.swing.JLabel sendToDoc;
    private javax.swing.JTextField seniorsWithHeartPrbField;
    private javax.swing.JTextField totSeniorPPLField;
    private javax.swing.JLabel totTransReq1;
    private javax.swing.JLabel totalSeniorPpl;
    // End of variables declaration//GEN-END:variables
}
