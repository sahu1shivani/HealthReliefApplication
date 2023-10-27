/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package userInterface.patients;

import Business.person.Patients;
import Business.person.Person;
import Business.userAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author anuja
 */
public class ViewVitalSignInfoJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount; 
    private Person person;
 
    
    /**
     * Creates new form UpdateVitalSignInfo
     */
    public ViewVitalSignInfoJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        person = userAccount.getPerson();
        
         Patients patients = (Patients)person;
        if(patients.isShareVitalInfo() && patients.isHasTumorProblem())
        {
         for(String vs : patients.getVitalSignTrackList())
         {
            vitalSignTrackList.append(vs + System.getProperty("line.separator"));
         }

          if(patients.isHasSensorDevice())
          {
              hasSensorRadioYes1.setSelected(true);
          }
          else
          {
           hasSensorRadioNo1.setSelected(true);
          }
            if(patients.isGetAlerts())
            {
            getAlertJRadioYes1.setSelected(true);
            }
            else
            {
              getAlertJRadioNo1.setSelected(true);
            }
   
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(153,255,255);
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

        getAlert2 = new javax.swing.JLabel();
        getAlert3 = new javax.swing.JLabel();
        getAlertJRadioNo1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        hasSensorRadioNo1 = new javax.swing.JRadioButton();
        viewYourProfile3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignTrackList = new javax.swing.JTextArea();
        hasSensorRadioYes1 = new javax.swing.JRadioButton();
        getAlertJRadioYes1 = new javax.swing.JRadioButton();
        manageEnt1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        getAlert2.setText("Get alert from Relief:");

        getAlert3.setText("Do you have Optune to track your vital signs");

        getAlertJRadioNo1.setText("No");
        getAlertJRadioNo1.setEnabled(false);

        jLabel2.setText("Vital Signs details you want to track:");

        hasSensorRadioNo1.setText("No");
        hasSensorRadioNo1.setEnabled(false);

        viewYourProfile3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile3.setText("Vital Sign Details:");

        vitalSignTrackList.setEditable(false);
        vitalSignTrackList.setColumns(20);
        vitalSignTrackList.setRows(5);
        vitalSignTrackList.setEnabled(false);
        jScrollPane1.setViewportView(vitalSignTrackList);

        hasSensorRadioYes1.setText("Yes");
        hasSensorRadioYes1.setEnabled(false);

        getAlertJRadioYes1.setText("Yes");
        getAlertJRadioYes1.setEnabled(false);

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setText("View Vital Sign Panel");

        backJButton.setText("Previous");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewYourProfile3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(getAlert2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(getAlert3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(getAlertJRadioYes1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(getAlertJRadioNo1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hasSensorRadioYes1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hasSensorRadioNo1)))))
                .addContainerGap(263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(manageEnt1)
                        .addGap(18, 18, 18)
                        .addComponent(viewYourProfile3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(getAlert2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hasSensorRadioYes1)
                                    .addComponent(hasSensorRadioNo1))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(getAlertJRadioYes1)
                                    .addComponent(getAlertJRadioNo1)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(getAlert3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel getAlert2;
    private javax.swing.JLabel getAlert3;
    private javax.swing.JRadioButton getAlertJRadioNo1;
    private javax.swing.JRadioButton getAlertJRadioYes1;
    private javax.swing.JRadioButton hasSensorRadioNo1;
    private javax.swing.JRadioButton hasSensorRadioYes1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel viewYourProfile3;
    private javax.swing.JTextArea vitalSignTrackList;
    // End of variables declaration//GEN-END:variables
}