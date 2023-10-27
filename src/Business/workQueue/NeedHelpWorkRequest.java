/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.workQueue;

import Business.common.NeedHelp;

/**
 *
 * @author shivanisahu
 */
public class NeedHelpWorkRequest extends WorkRequest {

    
    private String needHelpWorkRequestId;
    private static int count = 000;
    private String comments;
    private NeedHelp needHelp;
    private String requestResult;
   



   public NeedHelpWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("REQUEST");
        sb.append(count);
        needHelpWorkRequestId = sb.toString();
        count++;
    }
    
    public String getComments() {
        return comments;
    }



   public void setComments(String comments) {
        this.comments = comments;
    }



   public String getneedHelpWorkRequestId() {
        return needHelpWorkRequestId;
    }



   public void setNeedHelp(NeedHelp needHelp) {
        this.needHelp = needHelp;
    }



   public NeedHelp getNeedHelp() {
        return needHelp;
    }



   public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }



   public String getRequestResult() {
        return requestResult;
    }




    
    @Override
    public String toString() {
        return getNeedHelp().getHelp();
    }
    
    
    
    
}
