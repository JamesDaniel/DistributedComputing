public interface CountRMI extends java.rmi.Remote  // see below
{ 
    int sum() throws java.rmi.RemoteException; 
    void sum(int _val) throws java.rmi.RemoteException; 
    public int increment() throws java.rmi.RemoteException; 
} 
