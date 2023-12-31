/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userInterface.sensor;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.person.Patients;
import Business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userInterface.patients.ViewVitalSignHistoryJPanel;
import userInterface.patients.UpdatePatientsProfile;
import userInterface.patients.ViewVitalSignInfoJPanel;

/**
 *
 * @author shivanisahu
 */
public class ManagePatientsProfileJPanel extends javax.swing.JPanel {
       private JPanel userProcessContainer;
    private UserAccount userAccount; 
   private Enterprise enterprise;
   private EcoSystem ecoSystem;
    
    /**
     * Creates new form GetAlertFromReliefJPanel
     */
    public ManagePatientsProfileJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        patientsName.setText(userAccount.getPerson().getName());
       
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(204,255,204);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        getAlertFromHH = new javax.swing.JLabel();
        manageVitalSignJBtn = new javax.swing.JButton();
        viewAndUpdateProfileBtn = new javax.swing.JButton();
        patientsName = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        viewVitalSignHistory = new javax.swing.JButton();
        SendVitalDataToDoctorBtn = new javax.swing.JButton();
        viewVitalSignInfo = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        getAlertFromHH.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        getAlertFromHH.setText("Patients Profile Manage Panel");

        manageVitalSignJBtn.setText("Vital Signs Manage Panel");
        manageVitalSignJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageVitalSignJBtnActionPerformed(evt);
            }
        });

        viewAndUpdateProfileBtn.setText("View and Update Profile Panel");
        viewAndUpdateProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAndUpdateProfileBtnActionPerformed(evt);
            }
        });

        patientsName.setText("Patient Name");

        backJButton.setText("Previous");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        viewVitalSignHistory.setText("Vital Sign History View Panel");
        viewVitalSignHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalSignHistoryActionPerformed(evt);
            }
        });

        SendVitalDataToDoctorBtn.setText("Send Vital Information To Doctor");
        SendVitalDataToDoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendVitalDataToDoctorBtnActionPerformed(evt);
            }
        });

        viewVitalSignInfo.setText("View Vital Sign Details");
        viewVitalSignInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalSignInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(getAlertFromHH, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(patientsName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(viewAndUpdateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manageVitalSignJBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SendVitalDataToDoctorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viewVitalSignHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(viewVitalSignInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(405, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getAlertFromHH)
                    .addComponent(patientsName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAndUpdateProfileBtn)
                    .addComponent(viewVitalSignHistory))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageVitalSignJBtn)
                    .addComponent(SendVitalDataToDoctorBtn))
                .addGap(39, 39, 39)
                .addComponent(viewVitalSignInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageVitalSignJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageVitalSignJBtnActionPerformed
        ManageVitalSignJPanel manageVitalSignJPanel = new ManageVitalSignJPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageVitalSignJPanel", manageVitalSignJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageVitalSignJBtnActionPerformed

    private void viewAndUpdateProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAndUpdateProfileBtnActionPerformed
        UpdatePatientsProfile viewVolunteerProfile = new UpdatePatientsProfile(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVolunteerProfile);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAndUpdateProfileBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewVitalSignHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalSignHistoryActionPerformed
       Patients customer = (Patients)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
        JOptionPane.showMessageDialog(this, "First Update vital sign information", "warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        ViewVitalSignHistoryJPanel viewVitalSignHistoryJPanel = new ViewVitalSignHistoryJPanel(userProcessContainer, userAccount, enterprise.getUserAccountDirectory());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVolunteerProfile", viewVitalSignHistoryJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVitalSignHistoryActionPerformed

    private void SendVitalDataToDoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendVitalDataToDoctorBtnActionPerformed
       Patients customer = (Patients)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
        JOptionPane.showMessageDialog(this, "First Update vital sign information ", "warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        SendVitalSignInfoToDoctorPanel sendVitalSignDataToDoctorPanel = new SendVitalSignInfoToDoctorPanel(userProcessContainer, userAccount, ecoSystem);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("SendVitalSignDataToDoctorPanel", sendVitalSignDataToDoctorPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_SendVitalDataToDoctorBtnActionPerformed

    private void viewVitalSignInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalSignInfoActionPerformed
        Patients customer = (Patients)userAccount.getPerson();
        if(customer.getVitalSignList().isEmpty())
        {
        JOptionPane.showMessageDialog(this, "First update vital sign information", "warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        ViewVitalSignInfoJPanel viewVitalSignInfoJPanel = new ViewVitalSignInfoJPanel(userProcessContainer, userAccount);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewVitalSignInfoJPanel", viewVitalSignInfoJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewVitalSignInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SendVitalDataToDoctorBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel getAlertFromHH;
    private javax.swing.JButton manageVitalSignJBtn;
    private javax.swing.JLabel patientsName;
    private javax.swing.JButton viewAndUpdateProfileBtn;
    private javax.swing.JButton viewVitalSignHistory;
    private javax.swing.JButton viewVitalSignInfo;
    // End of variables declaration//GEN-END:variables
}
