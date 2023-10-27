/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.common;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author shivanisahu
 */
public class ValidateDateOfBirth extends InputVerifier{
    
     @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        
         String pattern = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$" ;
         Pattern dobPattern = Pattern.compile(pattern);
            Matcher matcher = dobPattern.matcher(text);
            if (text.length() > 0) {
               if (matcher.matches() != true) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please Enter date Of Birth in the format (MM/DD/YYYY)", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                input.setBackground(Color.white);
                return true;
            }
            }    
        else {
            input.setBackground(Color.white);
            return true;
        }
    
   
    }
  
}