/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.common;

import java.util.ArrayList;

/**
 *
 * @author shreya baliga
 */
public class NeedHelp {
     private String needHelp;
    private String time;
    private String serviceType;
    private String needHelpId;
    
    private String newNeedHelp;
    
    private ArrayList<String> otherHelpList;
    
    private static int count = 01;
    
    public NeedHelp()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("HELP");
        sb.append(count);
        needHelpId = sb.toString();
        count++;
        
    }

    public String getHelp() {
        return needHelp;
    }

    public void setHelp(String needHelp) {
        this.needHelp = needHelp;
    }

    

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return this.needHelpId;
    }
    

    public ArrayList<String> getOtherHelpList() {
        return otherHelpList;
    }

    public String getNewHelp() {
        return newNeedHelp;
    }

    public void setNewHelp(String newNeedHelp) {
        this.newNeedHelp = newNeedHelp;
    }

    

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
}
