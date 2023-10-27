/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Business.common.NeedHelp;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.person.Person;
import Business.role.AdminRole;
import Business.role.DoctorRole;
import Business.role.DonorRole;
import Business.role.DriverRole;
import Business.role.ReliefManagerRole;
import Business.role.WHOStaffRole;
import Business.role.ControllerRole;
import Business.role.SystemAdminRole;
import Business.userAccount.UserAccount;


/**
 *
 * @author shreya baliga
 */
public class ConfigureASystem {
    public static EcoSystem configure()
    {
        EcoSystem system = EcoSystem.getInstance();
        Person person = system.getPersonDirectory().addPerson();
        person.setFirstName("Sys");
        person.setLastName("Admin");
        person.setName();
        
        UserAccount ua = system.getUserAccountDirectory().addUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
        ua.setEnabled(true);
        
        NeedHelp needHelp = system.addNeedHelp();
        needHelp.setHelp("Physical Theraphy");
        needHelp.setHelp("Psycho Thraphy");
        needHelp.setHelp("Yoga");
        needHelp.setHelp("Medicines");
        needHelp.setHelp("Transportation");
        needHelp.setHelp("Buy Food Items");
       
        
        Network network = system.addNetwork();
      
        network.setCountry("United States");
        network.setState("Massachusetts");
        network.setCity("Boston");
          
        Enterprise enterprise = network.getEnterpriseDirectory().addEnterprise("Boston", Enterprise.EnterpriseType.Community);
        person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("Community Admin");
        person.setName();
        UserAccount account = enterprise.getUserAccountDirectory().addUserAccount("community", "community", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Volunteer);
        Organization organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Transport);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Driver");
        person.setLastName("Transport");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("driver", "driver", person, new DriverRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
      
         enterprise = network.getEnterpriseDirectory().addEnterprise("BostonRelief", Enterprise.EnterpriseType.Relief);
         person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("Relief Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("relief", "relief", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Patients);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Controller);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Controller");
        person.setLastName("USA");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("controller", "controller", person, new ControllerRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
        
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Manager");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("manager", "manager", person, new ReliefManagerRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
              
         enterprise = network.getEnterpriseDirectory().addEnterprise("NGO", Enterprise.EnterpriseType.NGO);
         person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("NGO Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("ngo", "ngo", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Donor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Donor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("donor", "donor", person, new DonorRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
        
                  
         enterprise = network.getEnterpriseDirectory().addEnterprise("Hospital", Enterprise.EnterpriseType.Hospital);
         person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("hospital Admin");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("hospital", "hospital", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.Doctor);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("Doctor");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("doctor", "doctor", person, new DoctorRole());
        account.setNetwork(network);
        account.setEnabled(true);
        
                
         enterprise = network.getEnterpriseDirectory().addEnterprise("WHO", Enterprise.EnterpriseType.WHO);
         person = enterprise.getPersonDirectory().addPerson();
        person.setLastName("WHO Admin ");
        person.setName();
         account = enterprise.getUserAccountDirectory().addUserAccount("who", "who", person, new AdminRole());
        account.setEnabled(true);
        account.setNetwork(network);
        organization = enterprise.getOrganizationDirectory().addOrganization(Organization.Type.WHOStaff);
        person = organization.getPersonDirectory().addPerson();    
          
        person.setFirstName("WHOStaff");
        person.setLastName("Boston");
        person.setName();
        
        account = organization.getUserAccountDirectory().addUserAccount("who_staff", "who_staff", person, new WHOStaffRole());
        account.setNetwork(network);
        account.setEnabled(true);
      
    return system;
    }
}
