/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.role.Role;
import Business.role.VolunteerRole;
import java.util.ArrayList;

/**
 *
 * @author shreya baliga
 */
public class VolunteerOrganization extends Organization {
    
    public VolunteerOrganization()
    {
        super(Organization.Type.Volunteer.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new VolunteerRole());
        return roles;
    }
}

