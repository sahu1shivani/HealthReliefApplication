/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.workQueue;

/**
 *
 * @author shivanisahu
 */
public class ControllerWorkRequest extends WorkRequest{
    
    public static String REQUEST_APPROVED = "GIVEN CONSENT";
    public static String REQUEST_PENDING = "AWAITING DECISION";
    public static String REQUEST_REJECT = "DECLINED";
    public static String REQUEST_COMPLETED = "FINISHED";
    public static String REQUEST_APPROVAL = "REQUEST FOR CONSENT";
    public static String REQUEST_SENT = "SENT";
    public static String REQUEST_ACCEPT = "ACKNOWLEDGED";
    private String testResults;
    private String comments;
    

    public String getTestResults() {
        return testResults;
    }

    public void setTestResults(String testResults) {
        this.testResults = testResults;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

   
    
    
}
