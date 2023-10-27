/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shivanisahu
 */

    
    public class WHOEnterprise extends Enterprise{
    
     public WHOEnterprise(String name) {
        super(name, EnterpriseType.WHO);
    }



   @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
    

