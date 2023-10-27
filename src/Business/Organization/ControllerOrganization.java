/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.role.ReliefManagerRole;
import Business.role.Role;
import Business.role.ControllerRole;
import java.util.ArrayList;

/**
 *
 * @author anuja
 */
public class ControllerOrganization extends Organization {
    
    public ControllerOrganization()
    {
        super(Organization.Type.Controller.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ControllerRole());
        roles.add(new ReliefManagerRole());
        return roles;
    }
    
    
}
