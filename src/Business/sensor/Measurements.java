/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.sensor;

import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author anuja
 */
public class Measurements extends Thread {
    
    private String measuredTimeStamp;
    private static int count; 
    

    public ArrayList<VitalSign> generateVitalSign(ArrayList<String> trackList,  ArrayList<VitalSign> vitalSignList)
    {
   
    VitalSign vitalSign ;
     Random random = new Random();
     while(count < 5)
    {
     vitalSign = new VitalSign();
    for(String vs : trackList)
    {
     if(vs.equals("Pulse Rate"))
     {
     int heartRate = (random.nextInt(75))+55;
  //        System.out.println("setHeartRate >> "+ heartRate);
          vitalSign.setHeartRate(heartRate);
     }
   
     if(vs.equals("Blood Pressure"))
     {
    int sysBP = (random.nextInt(40))+80;
  //       System.out.println("setSystolicBloodpressure >> "+ sysBP);
         vitalSign.setSystolicBloodpressure(sysBP);
       
     }
     
     if(vs.equals("Oxygen Rate"))
     {
      float oxygenRate = (random.nextInt(20))+12;
  //    System.out.println("oxygenRate >> "+ (float)(Math.random()*20)+12);
       vitalSign.setOxygenRate(oxygenRate);
     }
    
      if(vs.equals("Weight"))
     {
        float weight = (random.nextInt(160))+20;
  //    System.out.println("weight >> "+ weight);
      vitalSign.setWeight(weight);
     
     }
   
    }
       DateFormat df = new SimpleDateFormat("EEE, MMM d, YYYY hh:mm aaa");
         Calendar cal = Calendar.getInstance();
       String timestamp = df.format(cal.getTime());
       
       vitalSign.setTimeStamp(timestamp);
        count ++;  
  //      System.out.println("count " +count);
        
      vitalSignList.add(vitalSign);
    }
    if(count>=5)
     {
  //    System.out.println("count before return "+count);
      count=0;   
      return vitalSignList;   
     }
    return vitalSignList;
   
    }
    
  
    @Override
    public String toString() {
        return this.measuredTimeStamp;
    }

  
 private volatile boolean stop = false;

  private static int counter = 0;

  public void run() {
    while (!stop && counter < 3) {
        counter++;
      System.out.println();
    }
  
    if (stop)
    {
      System.out.println("Detected stop");
    }
    
  }

  public void requestStop() {
    stop = true;
  }
  
 
  
}
