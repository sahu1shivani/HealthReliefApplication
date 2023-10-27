/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.role.AdminRole;
import Business.role.PatientsRole;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author anuja
 */
public class PatientsOrganization extends Organization{
    
    public PatientsOrganization()
    {
        super(Organization.Type.Patients.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PatientsRole());
        return roles;
    }
    
}
