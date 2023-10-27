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

    
    public class CommunityEnterprise extends Enterprise{
    
     public CommunityEnterprise(String name) {
        super(name, EnterpriseType.Community);
    }



   @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
}
    
