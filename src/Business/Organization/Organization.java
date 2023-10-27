/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.person.PersonDirectory;
import Business.role.Role;
import Business.userAccount.UserAccountDirectory;
import Business.workQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author shivanisahu
 */

    public abstract class Organization {
    
    private String name;
    private UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    private WorkQueue workQueue;
    private int organizationId;
    private static int counter = 000;



   public Organization(String name) {
    this.name = name;
    userAccountDirectory = new UserAccountDirectory();
    personDirectory = new PersonDirectory();
    workQueue = new WorkQueue();
    counter++;
    organizationId = counter;
    }
    
    public enum Type
    {
     Admin("Admin"),
     Volunteer("Volunteer Organization"),
     Patients("Patients Organization"),
     Controller("Controller Organization"),
     Donor("Donor Organization"),
     Transport("Transport Organization"),
     WHOStaff("WHOStaff Organization"),
     Doctor("Doctor Organization");
     
     private String value;
     
     private Type(String value)
     {
         this.value = value;
     }



       public String getValue() {
            return value;
        }
    }



   public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }



   public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }



   public WorkQueue getWorkQueue() {
        return workQueue;
    }



   public String getName() {
        return name;
    }
    
     public abstract ArrayList<Role> getSupportedRole();



   public int getOrganizationId() {
        return organizationId;
    }



   @Override
    public String toString() {
        return this.name;
    }
    
    
}
