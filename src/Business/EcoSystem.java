/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.common.NeedHelp;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.role.Role;
import Business.role.SystemAdminRole;
import java.util.ArrayList;
/**
 *
 * @author shreya baliga
 */
public class EcoSystem extends Organization{
 
   private ArrayList<Network> nwList;
   private static EcoSystem ecoSystem;
   private ArrayList<NeedHelp> needhelpList;
    
   public EcoSystem()
   {
       super(null);
       nwList = new ArrayList<>();
       needhelpList = new ArrayList<>();
      
   }
   
   public static EcoSystem getInstance()
   {
    if(ecoSystem == null)
    {
      ecoSystem = new EcoSystem();
    }
    return ecoSystem;
   }

    public ArrayList<Network> getNetworkList() {
        return nwList;
    }
   
    public Network addNetwork()
    {
        Network network = new Network();
        nwList.add(network);
        return network;
    }
    
    public boolean checkIfUsernameIsUnique(String username)
    {
      if (!getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
        return false;
      }
      return true;
    }
   
    public void deleteNetwork(Network network)
    {
        nwList.remove(network);
    }
   
   @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
   
    public NeedHelp addNeedHelp()
    {
        NeedHelp needHelp = new NeedHelp();
        needhelpList.add(needHelp);
        return needHelp;
    }
    
    public void deleteHelp(NeedHelp needHelp)
    {
        needhelpList.remove(needHelp);
    }

    public ArrayList<NeedHelp> getHelpList() {
        return needhelpList;
    }
    
}
