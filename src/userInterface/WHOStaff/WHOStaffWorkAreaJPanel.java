/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userInterface.WHOStaff;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.PatientsOrganization;
import Business.Organization.WHOStaffOrganization;
import Business.Organization.Organization;
import Business.person.Patients;
import Business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shreya baliga
 */
public class WHOStaffWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private UserAccount userAccount;
    private WHOStaffOrganization WHOStaffOrganization; //
    private HashMap<String,Integer> communitydetailsmap;

    public WHOStaffWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, EcoSystem ecoSystem ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.WHOStaffOrganization = (WHOStaffOrganization)organization;
        
        populateWorkRequestTable();
        
        
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
    
    public void populateWorkRequestTable()
    {
        DefaultTableModel model = (DefaultTableModel)communityHealthTable.getModel();
        model.setRowCount(0);
        
        try
        {
        communitydetailsmap = getPatientsData();
        }
        catch(NullPointerException npe)
        {
        npe.printStackTrace();
        JOptionPane.showMessageDialog(null, " Data not available!","warning", JOptionPane.WARNING_MESSAGE);
        return;     
        }
         if(communitydetailsmap.isEmpty() || communitydetailsmap == null)
         {
        JOptionPane.showMessageDialog(null, " Data not available!","warning", JOptionPane.WARNING_MESSAGE);
        return;      
         }
    
         Object[] rowData = new Object[4];
         rowData[0] = communitydetailsmap.get("TotalNoOfpatients");
         rowData[1] = communitydetailsmap.get("AverageAge");
         rowData[2] = communitydetailsmap.get("patientswithTumorProblem");
         rowData[3] = communitydetailsmap.get("patientsswithNoTumorProblem");
         
         model.addRow(rowData);
    }
    
    public PatientsOrganization getPatientsOrg()
    {
        PatientsOrganization patientsOrg = null;
        
        for(Network network : ecoSystem.getNetworkList())
        {
         if(network.equals(userAccount.getNetwork()))
         {
          for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList())
          {
            if(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Relief))
            {
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            {
             if(organization instanceof PatientsOrganization)
             {
              patientsOrg = (PatientsOrganization)organization; 
             }
            }
            }
          }
         }
        }
        return patientsOrg;
    }
    
    public HashMap<String,Integer> getPatientsData()
    {
        int patientTumorProblem = 0;
        int patientNoTumorProblem = 0;
        int avgAge = 0;
        int patientWithSensorDevice = 0;
        int patientShareVitalInfo = 0;
        int patientSendInfoToDoctor = 0;
        int patientWithNoSensorDevice = 0;
        
        PatientsOrganization patientsOrganization = getPatientsOrg();
        if(patientsOrganization == null)
        {
        JOptionPane.showMessageDialog(null, " Patient Organization does not exist!","warning", JOptionPane.WARNING_MESSAGE);
        return null;     
        }
        if(patientsOrganization.getPersonDirectory().getPatientsList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Patients Not Registered!","warning", JOptionPane.WARNING_MESSAGE);
        return null; 
        }
        int totalSeniors = patientsOrganization.getPersonDirectory().getPatientsList().size();
      HashMap<String,Integer> tumorPatientMap = new HashMap<>();
       for(Patients patients : patientsOrganization.getPersonDirectory().getPatientsList())
          {
           if(patients.isHasTumorProblem())     
           {
            patientTumorProblem ++;  
           } 
           if(!patients.isHasTumorProblem())
           {
            patientNoTumorProblem ++;   
           }
           if(patients.isHasSensorDevice())
           {
            patientWithSensorDevice ++;   
           } 
           if(!patients.isHasSensorDevice())
           {
            patientWithNoSensorDevice++;   
           }
           if(patients.isSendInfoToDoctor())
           {
            patientSendInfoToDoctor ++;   
           } 
           if(patients.isShareVitalInfo())
           {
            patientShareVitalInfo ++;   
           } 
           avgAge+=patients.getAge();
          } 
        
               
       tumorPatientMap.put("patientswithTumorProblem", patientTumorProblem);
       tumorPatientMap.put("patientsswithNoTumorProblem",  patientNoTumorProblem);
       tumorPatientMap.put("TotalNoOfpatients", totalSeniors);
       tumorPatientMap.put("AverageAge", avgAge/totalSeniors);
       tumorPatientMap.put("patientsSendInfoToDoctor",patientSendInfoToDoctor);
       tumorPatientMap.put("patientsShareVitalInfo",patientShareVitalInfo);
       tumorPatientMap.put("patientsWithSensorDevice", patientWithSensorDevice);
       tumorPatientMap.put("patientsWithNoSensorDevice",patientWithNoSensorDevice);
       
       return tumorPatientMap;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        viewDetailedRprtMayorBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        communityHealthTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(227, 242, 227));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel6.setText("          WHO STAFF ");

        viewDetailedRprtMayorBtn.setBackground(new java.awt.Color(209, 209, 220));
        viewDetailedRprtMayorBtn.setText("Display Detailed Report");
        viewDetailedRprtMayorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailedRprtMayorBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel7.setText("Community Health Report:");

        communityHealthTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Patients", "Average age ", "Patients with Tumor", "Patients without Tumor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(communityHealthTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewDetailedRprtMayorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(viewDetailedRprtMayorBtn)
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailedRprtMayorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailedRprtMayorBtnActionPerformed
          if(communitydetailsmap.isEmpty() || communitydetailsmap == null)
         {
        JOptionPane.showMessageDialog(null, " Data not available!","warning", JOptionPane.WARNING_MESSAGE);
        return;      
         }
        ViewDetailedReportWHOStaffJPanel viewDetailedReportWHOStaffJPanel = new ViewDetailedReportWHOStaffJPanel(userProcessContainer, communitydetailsmap);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewDetailedReportWHOStaffJPanel", viewDetailedReportWHOStaffJPanel);
        layout.next(userProcessContainer);       
    }//GEN-LAST:event_viewDetailedRprtMayorBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable communityHealthTable;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewDetailedRprtMayorBtn;
    // End of variables declaration//GEN-END:variables
}
