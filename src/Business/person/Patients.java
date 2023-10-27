/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.person;

import Business.sensor.Measurements;
import Business.sensor.SensorDevice;
import Business.sensor.VitalSign;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author anuja
 */
public class Patients extends Person{
    
    private String patientsId;
    private static int count = 001;
    private boolean shareVitalInfo = false;
    private boolean hasSensorDevice = false;
    private boolean hasTumorProblem = false;
    private boolean getAlerts = false;
    private ArrayList<VitalSign> vitalSignList;
    private ArrayList<String> vitalSignTrackList;
    private boolean sendInfoToDoctor = false;
    private SensorDevice sensorDevice;
    
    
    public Patients()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("C");
        sb.append(count);
        patientsId = sb.toString();
        count++;
        vitalSignList = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return this.getName();
    }

    public SensorDevice getSensorDevice() {
        return sensorDevice;
    }

  
    public String getPatientsId() {
        return patientsId;
    }
    private VitalSign vitalSign = null;
    
    private volatile boolean stop = false;
    private int counter = 0;
  
 
    public void addVitalSign(){
        counter =0;
        System.out.println("counter"+counter);
       Measurements hRSensorMeasurements  = new Measurements();
        hRSensorMeasurements.start();
        System.out.println("counter"+counter);
       Timer timer =  new Timer(true);
       TimerTask addtask = new TimerTask () {
      
            @Override
            public void run () {
             while(counter<5)
             {
           ArrayList<VitalSign> list = hRSensorMeasurements.generateVitalSign(vitalSignTrackList, vitalSignList);
               counter ++;   
               
               System.out.println(">list>> "+list.toString());
                vitalSignList = list;
             }
             if (counter >= 5) {
                stop=true;
                timer.cancel();
                timer.purge();
                this.cancel();
                
                return;
                
                }
          hRSensorMeasurements.requestStop();
            }
        };
      timer.schedule(addtask, 5000);  
      if(counter >= 5)
      {
          addtask.cancel();
      }
      
       
  }
  
  
    public void removeVitalSign(VitalSign vitalSign)
    {
        vitalSignList.remove(vitalSign);
    }
    
    public ArrayList<VitalSign> getPatientVitalSignHistory() {
        return vitalSignList;
    }

   
     public String patientCondition(int age, VitalSign patientVitalSign)
    {
    
       float oxygenRate;
       int heartRate ;
       int systolicBloodpressure ;
       float weightValue; 
       String patientCondition = null;
      
           oxygenRate = patientVitalSign.getOxygenRate();
           heartRate = patientVitalSign.getHeartRate();
           systolicBloodpressure = patientVitalSign.getSystolicBloodpressure();
           weightValue = patientVitalSign.getWeight();
           
       if( age >=1 && age <=3 )
       {
           if(oxygenRate >= 20 && oxygenRate <=30 && 
                   heartRate >= 80 && heartRate <= 130 &&
                   systolicBloodpressure >= 80 && systolicBloodpressure <= 110 &&
                   weightValue >= 22 && weightValue <= 31)
           {
              patientCondition = "NORMAL";
           }
            else
            {
               patientCondition = "ABNORMAL";
            }
       }
       else if( age >= 4 && age <= 5 )
       {
           if(oxygenRate >= 20 && oxygenRate <= 30 && 
                   heartRate >= 80 && heartRate <= 120 &&
                   systolicBloodpressure >= 80 && systolicBloodpressure <= 110 &&
                   weightValue >= 31 && weightValue <= 40)
           {
             patientCondition = "NORMAL";
           }
            else
            {
               patientCondition = "ABNORMAL";
            }
           
       }
       else if( age >= 6 && age <= 12 )
       {
           if(oxygenRate >= 20 && oxygenRate <= 30 && 
                   heartRate >= 70 && heartRate <= 110 &&
                   systolicBloodpressure >= 80 && systolicBloodpressure <= 120 &&
                   weightValue >= 41 && weightValue <= 92)
           {
             patientCondition = "NORMAL";
           }
            else
            {
               patientCondition = "ABNORMAL";
            }
       }
       else if ( age >= 13)
       {
           if(oxygenRate >= 12 && oxygenRate <= 20 && 
                   heartRate >= 55 && heartRate <= 105 &&
                   systolicBloodpressure >= 110 && systolicBloodpressure <= 120 &&
                   weightValue > 110)
           {
             patientCondition = "NORMAL";
           }
            else
            {
               patientCondition = "ABNORMAL";
            }
           
       }
      
        return patientCondition;   
    }

    public void setVitalSignTrackList(ArrayList<String> vitalSignTrackList) {
        this.vitalSignTrackList = new ArrayList<>();
        this.vitalSignTrackList = vitalSignTrackList;
    }

  public ArrayList<String> getVitalSignTrackList() {
        return vitalSignTrackList;
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public boolean isShareVitalInfo() {
        return shareVitalInfo;
    }

    public void setShareVitalInfo(boolean shareVitalInfo) {
        this.shareVitalInfo = shareVitalInfo;
    }

    public boolean isHasSensorDevice() {
        return hasSensorDevice;
    }

    public void setHasSensorDevice(boolean hasSensorDevice) {
        this.hasSensorDevice = hasSensorDevice;
    }

    public boolean isGetAlerts() {
        return getAlerts;
    }

    public void setGetAlerts(boolean getAlerts) {
        this.getAlerts = getAlerts;
    }

    public boolean isHasTumorProblem() {
        return hasTumorProblem;
    }

    public void setHasTumorProblem(boolean hasTumorProblem) {
        this.hasTumorProblem = hasTumorProblem;
    }

    public boolean isSendInfoToDoctor() {
        return sendInfoToDoctor;
    }

    public void setSendInfoToDoctor(boolean sendInfoToDoctor) {
        this.sendInfoToDoctor = sendInfoToDoctor;
    }
 
}