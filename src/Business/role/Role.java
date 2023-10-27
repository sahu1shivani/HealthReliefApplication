/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.userAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author shivanisahu
 */
    public abstract class Role {
    
    public enum RoleType{
        AdminRole("Admin"),
        Volunteer("Volunteer"),
        Controller("Controller"),
        Patients("Help Seeker"),
        Driver("Driver"),
        WHOStaff("WHOStaff"),
        ReliefManager("Heart Help Manager"),
        Doctor("Doctor"),
        Donor("Donor");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }



       public String getValue() {
            return value;
        }



       @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem ecoSystem);



   @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    
    
}
    

