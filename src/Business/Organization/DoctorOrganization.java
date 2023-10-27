/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.role.DoctorRole;
import Business.role.DonorRole;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreya baliga
 */
public class DoctorOrganization extends Organization {
    
     public DoctorOrganization()
    {
        super(Organization.Type.Doctor.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new DoctorRole());
        return roles;
    }
    
}
