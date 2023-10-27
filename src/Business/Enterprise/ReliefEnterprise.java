/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author anuja
 */
public class ReliefEnterprise extends Enterprise {
      @Override
    public ArrayList<Role> getSupportedRole() {
    return null;
    }
    
    public ReliefEnterprise(String name)
    {
     super(name, Enterprise.EnterpriseType.Relief);  
    }
    
}
