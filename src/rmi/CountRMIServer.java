import java.rmi.*; 
import java.rmi.server.*; 
public class CountRMIServer 
{ 
 public static void main(String args[]) 
 { 
   // Create and install the security manager 
   System.setSecurityManager(new RMISecurityManager()); // see note on Security
   try 
   { 
     // Create CountRMIImpl 
     CountRMIImpl myCount = new CountRMIImpl("myCountRMI"); 
     //CountRMIImpl myCount = new CountRMIImpl("rmi://localhost:2180/myCountRMI"); 
     System.out.println("CountRMI Server ready."); 
   } catch (Exception e) 
   { System.out.println("Exception: " + e.getMessage()); 
     e.printStackTrace(); 
   } 
 } 
} 
