import java.rmi.*; 
import java.rmi.server.UnicastRemoteObject; 

public class CountRMIImpl extends UnicastRemoteObject  // see below
       implements CountRMI 
{ 
  private int count; 
// constructor
  public CountRMIImpl(String name) throws RemoteException 
  { 
    super(); 
    try 
    { 
      Naming.rebind(name, this);  // see note on Naming below
      count = 0; 
    } catch (Exception e) 
    { System.out.println("Exception: " + e.getMessage()); 
      e.printStackTrace(); 
    } 
  } 
  public int sum() throws RemoteException 
  { return count; 
  } 
  public  void sum(int val) throws RemoteException 
  { count = val; 
  } 
  public int increment() throws RemoteException 
  { count++; 
    return count; 
  } 
} 
