/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.role.WHOStaffRole;
import Business.role.Role;
import java.util.ArrayList;
/**
 *
 * @author shivanisahu
 */
public class WHOStaffOrganization extends Organization {
    
     public WHOStaffOrganization()
    {
        super(Organization.Type.WHOStaff.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WHOStaffRole());
        return roles;
    }
    
}