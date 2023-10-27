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
public class ValidateEmailTextField extends InputVerifier{

     @Override
    public boolean verify(JComponent input) {
        
        String text = ((JTextField) input).getText();
  
        String pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$" ;
     
        Pattern emailPattern = Pattern.compile(pattern);
        Matcher matcher = emailPattern.matcher(text);
        if (text.length() > 0) {
            if (!matcher.matches()) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Valid email address required ", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
          }
            else
            {
             input.setBackground(Color.white);
             return true;  
            }
        }
        else
        {
            input.setBackground(Color.white);
            return true;
        }
    }
}