/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.workQueue;

import Business.person.Volunteer;

/**
 *
 * @author anuja
 */
public class NeedTransportWorkRequest extends WorkRequest{
    
    private String transRequestId;
    private static int count = 000;
    private String needTransport;
    private String transReqResult;
    
    
     public NeedTransportWorkRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("TRANS");
        sb.append(count);
        transRequestId = sb.toString();
        count++;
    }
     
    public void setNeedTransport(String needTransport) {
        this.needTransport = needTransport;
    }

    public String getNeedTransport() {
        return needTransport;
    }

    @Override
    public String toString() {
        Volunteer volunteer = (Volunteer)this.getSender().getPerson();
        String address = volunteer.getAddressline1().concat(volunteer.getAddressline2().concat(volunteer.getTown()));
        return address;
                
    }

    public String getTransReqResult() {
        return transReqResult;
    }

    public void setTransReqResult(String transReqResult) {
        this.transReqResult = transReqResult;
    }
     
}

