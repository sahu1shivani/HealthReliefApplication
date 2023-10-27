/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.common;

import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.stream.Collectors;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.SecureRandom;

/**
 *
 * @author shivanisahu
 */
public class SendEmailAndTextMessage {
 
    private static final String SMTP_HOST_NAME = "smtp.gmail.com"; 
    private static final String SMTP_PORT_NUMBER = "587"; 
     private static StringBuilder emailMsgTxt ;
        
        private static String emailSubjectTxt = "Thank you!";
        private static String emailFromAddress = "shreyabaliga248@gmail.com";
    

    public static String generatePassword(String name)
    {
        try
        {
        
            // ASCII range – alphanumeric (0-9, a-z, A-Z)
            final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

            SecureRandom random = new SecureRandom();
            StringBuilder sb = new StringBuilder();

            // each iteration of the loop randomly chooses a character from the given
            // ASCII range and appends it to the `StringBuilder` instance

            for (int i = 0; i < name.length(); i++)
            {
                int randomIndex = random.nextInt(chars.length());
                sb.append(chars.charAt(randomIndex));
            }

            return sb.append(name).toString();
    
    
        } catch(Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public static String generateUserName(String name)
    {
        try
        {
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            // create random string builder
            StringBuilder sb = new StringBuilder().append(name);

            // create an object of Random class
            Random random = new Random();

            for(int i = 0; i < name.length(); i++) {

              // generate random index number
              int index = random.nextInt(alphabet.length());

              // get character specified by index
              // from the string
              char randomChar = alphabet.charAt(index);

              // append the character to string builder
              sb.append(randomChar);
            }

            return sb.toString();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return null;
    }
      

 // Send Email                   
    
    public static boolean sendEmail(String msg, String emailId, String userName, String password)
    {
       
        
      boolean isSent = true;
    
    try {
     Properties props = new Properties();
       
        props.put("mail.smtp.host", "smtp.gmail.com");    
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.auth", "true");  
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.port", "587");
        
        Authenticator mailAuthenticator = new EmailAuthenticator();
        Session mailSession = Session.getDefaultInstance(props,mailAuthenticator);
        Message message = new MimeMessage(mailSession);
        InternetAddress fromAddress ;
        InternetAddress toAddress;
        try
           {
         fromAddress = new InternetAddress(emailFromAddress);
         toAddress = new InternetAddress(emailId);
         }
        
        catch (AddressException ae) {
            ae.printStackTrace();
         isSent= false;
         return isSent;
         }
        
        
        message.setFrom(fromAddress);
        message.setRecipient(RecipientType.TO, toAddress);
        message.setSubject(emailSubjectTxt);
        message.setText(msg);
 
       Transport.send(message);
       System.out.println("Email Sent Successfully !");
        } 
         catch (MessagingException mex) {
            isSent=false;
            return isSent;
       }
       
       catch (Exception e) {
            isSent=false;
       }

         return isSent;
         
    }
    
}