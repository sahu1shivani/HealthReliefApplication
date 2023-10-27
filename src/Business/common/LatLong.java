/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.common;

/**
 *
 * @author shreya baliga
 */
public class LatLong {
    private static int count = 0;
    public static String[] getLatLongForVolunteer(String networkName)
    {
        System.out.println("networkName"+networkName);
        String lat = "42.3600825";
        String longt= "-71.10325";
     if(networkName.equalsIgnoreCase("Boston"))
     {
      lat = "42.3600825"; 
      longt="-71.0588801";
      
     }
     else if(networkName.equalsIgnoreCase("Somerville"))
     {
       lat = "42.3837569";  
       longt="-71.10325";
     }
     else if(networkName.equalsIgnoreCase("Mumbai"))
     {
       lat = "19.0759837";  
       longt="72.8776559";
     }
     else if(networkName.equalsIgnoreCase("Hyderabad"))
     {
       lat = "17.3850440";  
       longt="78.4866710";
     }
      else if(networkName.equalsIgnoreCase("Memphis"))
     {
       lat = "35.1495343";  
       longt="-90.0489801";
     }
     else if(networkName.equalsIgnoreCase("Roxbury"))
     {
       lat = "40.8693272";  
       longt="-74.6634640";
     }
     else
     {
          lat = "42.3600825";
          longt= "-71.10325";
     }
     return new String[]{longt,lat};
    
    }
    
}
