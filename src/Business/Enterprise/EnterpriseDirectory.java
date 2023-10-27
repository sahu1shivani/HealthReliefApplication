/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author anuja
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList<Enterprise>();
    }
    
    
    public Enterprise addEnterprise(String name, Enterprise.EnterpriseType type)
    {
      Enterprise enterprise = null;
      if(type ==Enterprise.EnterpriseType.Relief)
      {
       enterprise = new ReliefEnterprise(name);
       enterpriseList.add(enterprise);     
      }
      else if (type == Enterprise.EnterpriseType.WHO){
            enterprise = new WHOEnterprise(name);
            enterpriseList.add(enterprise);
        }
       else if (type == Enterprise.EnterpriseType.NGO){
            enterprise = new NGOEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else  if(type ==Enterprise.EnterpriseType.Community)
        {
         enterprise = new CommunityEnterprise(name);
         enterpriseList.add(enterprise);     
        }
      else  if(type ==Enterprise.EnterpriseType.Hospital)
        {
         enterprise = new HospitalEnterprise(name);
         enterpriseList.add(enterprise);     
        }

      return enterprise;
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public void deleteEnterprise(Enterprise enterprise)
    {
        enterpriseList.remove(enterprise);
    }
}