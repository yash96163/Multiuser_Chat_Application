import java.io.BufferedInputStream;
import java.rmi.*;
import java.sql.Blob;
import java.util.Vector;
import javax.swing.text.StyledDocument;
public interface MiddleApp extends Remote
{
   public String chat(String Name,String Gender,String UserID,String Pass,String que,String ans,String email)throws RemoteException;
   public String signin(String UserID,String Pass)throws RemoteException;         
   public String forgetpass(String UserID)throws RemoteException;
   public int updatepass(String UserID,String que,String ans,String pass)throws RemoteException;
   public String pic(String id,String pic,byte b[])throws RemoteException;
   public String emailfetch(String id)throws RemoteException;
   public int mailupdatepass(String id,String pass)throws RemoteException;
   public void registeruser(ClientRemote cr,String id)throws RemoteException;
   public String getName(String id)throws RemoteException;
   public void logout(String id)throws RemoteException;
   public void sendMessage(String msg,String to,StyledDocument doc)throws RemoteException;
   public void sendGroupMessage(String id,StyledDocument doc)throws RemoteException;
   public String fetchpic(String id)throws RemoteException;
   public byte[] fetchpic1(String id)throws RemoteException;
}   

