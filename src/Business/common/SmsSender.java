/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.common;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author anuja
 */
// send message to phone number
public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "AC71cf36ea8bd25b5f8b87c9ee46d81ef5";
    public static final String AUTH_TOKEN =
            "d140945574371ad3231c2efc3634aafe";



   public static boolean sendSms(String toPhone, String msg) {
       boolean isSent = true;
       
       try {
            System.out.println("Start");
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            System.out.println(toPhone);
            System.out.println(msg);
            System.out.println("Start");
            
            Message message = Message
                .creator(new com.twilio.type.PhoneNumber("+1"+ toPhone), // to
                        new com.twilio.type.PhoneNumber("+13609971635"), // from
                        msg)
                .create();
            System.out.println("end");
            System.out.println(message.getSid());
           } catch(Exception e) {
               System.out.println(e);
               isSent=false;
       }
       
       return isSent;
        
    }
};
