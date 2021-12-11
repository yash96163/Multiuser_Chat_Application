
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.StyledDocument;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public interface ClientRemote extends Remote{
   
    public void refreshList(Vector v1,Vector v2)throws RemoteException;
    public void addTextandid(JTextPane t,String fid)throws RemoteException;
    public void setMessage(StyledDocument doc,String name)throws RemoteException;
    public void printMessage(String fid,StyledDocument doc,String fname)throws RemoteException;
}
