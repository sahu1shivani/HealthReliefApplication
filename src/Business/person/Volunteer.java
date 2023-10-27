/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.person;

import java.util.ArrayList;

/**
 *
 * @author shivanisahu
 */
public class Volunteer extends Person{
 
    private String volunteerId;
    private static int count = 001;
    private String latitiude;
    private String longitude;
    private ArrayList<Feedback> feedbackList;
    
    
    public Volunteer()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("V");
        sb.append(count);
        volunteerId = sb.toString();
        count++;
       feedbackList= new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.getName();
    }

  
    public String getVolunteerId() {
        return volunteerId;
    }

    public String getLatitiude() {
        return latitiude;
    }

    public void setLatitiude(String latitiude) {
        this.latitiude = latitiude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public ArrayList<Feedback> getFeedbackList() {
        return feedbackList;
    }

   
    public Feedback addFeedback()
    {
        Feedback feedback = new Feedback();
        feedbackList.add(feedback);
        return feedback;
    }
}