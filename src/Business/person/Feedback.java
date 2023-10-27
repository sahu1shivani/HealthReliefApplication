/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.person;

/**
 *
 * @author shivanisahu
 */
public class Feedback {
    private static int count=0;
    private int feedbackID;
    private String feedbackText;
    private String authorName;
    private String date;
    
    public Feedback()
    {
        count++;
       feedbackID = count;
    }

    public int getFeedbackID() {
        return feedbackID;
    }


    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.valueOf(this.feedbackID);
    }
    
    
}
