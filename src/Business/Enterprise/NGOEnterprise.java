/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreya baliga
 */
public class NGOEnterprise extends Enterprise
{

    
     public NGOEnterprise(String name) {
        super(name, EnterpriseType.NGO);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
