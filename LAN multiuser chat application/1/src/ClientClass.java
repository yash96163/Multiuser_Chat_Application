import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.*;

public class ClientClass extends UnicastRemoteObject implements ClientRemote {
    
    JList l;
    String id;
    public Vector allids=new Vector(1,1);
    String ip;
    JTextPane gpchat;
    public ClientClass(JList l,String id,String ip,JTextPane gpchat)throws RemoteException
    {
        super();
        this.ip=ip;
        this.l=l;
        this.id=id;
        this.gpchat=gpchat;
    }
    @Override
    public void refreshList(Vector v1,Vector v2) throws RemoteException {
    
        l.setListData(v1);
        allids=v2;
    }
    Vector area=new Vector(1, 1);
    Vector fids=new Vector(1,1);
    @Override
    public void addTextandid(JTextPane t, String fid) throws RemoteException 
    {
        area.addElement(t);
        fids.addElement(fid);
    }

    @Override
    public void setMessage(StyledDocument doc, String name) throws RemoteException 
    {
        updateTextPane(gpchat, doc, name);
    }

    @Override
    public void printMessage(String fid, StyledDocument doc, String fname) throws RemoteException 
    {
        int index=fids.indexOf(fid);
        if(index!=-1)
        {
            JTextPane t=(JTextPane)area.elementAt(index);
            updateTextPane(t,doc,fname);
        }
        else
        {
            ichatwindow ic=new ichatwindow(ip, id, fid, this);
            JTextPane t=ic.jTextPane1;
            updateTextPane(t,doc,fname);
            ic.setVisible(true);
            
        }
    }
    private static final String ELEM = AbstractDocument.ElementNameAttribute;
    private static final String ICON = StyleConstants.IconElementName;
    public void updateTextPane(JTextPane t,StyledDocument doc,String fname)
    {
        try{
        StyledDocument d=t.getStyledDocument();
        d.insertString(t.getCaretPosition(), fname+": ", null);
        t.setCaretPosition(t.getDocument().getLength());
        ElementIterator iterator = new ElementIterator(doc);
        Element element;
        while ((element = (Element) iterator.next()) != null) {
            AttributeSet as = element.getAttributes();
            int index;
            if((index=as.toString().indexOf("(content)"))!=-1)
            {
                String temp=as.toString().substring(index+"(content)".length()).trim();
                String arr[]=temp.split(",");
                int start=Integer.parseInt(arr[0]);
                int end=Integer.parseInt(arr[1]);
                String data=doc.getText(start, end-start);
                if(!data.equals("")&&!data.equals("\n"))
                {
                    d.insertString(t.getCaretPosition(), data, as);
                    t.setCaretPosition(t.getDocument().getLength());
                    //continue;
                }
            }
            else if (as.containsAttribute(ELEM, ICON)){
                ImageIcon icon=(ImageIcon)StyleConstants.getIcon(as);
                t.insertIcon(icon);
                t.setCaretPosition(t.getDocument().getLength());
            }
            
        }
        d.insertString(t.getCaretPosition(), "\n", null);
        t.setCaretPosition(t.getDocument().getLength());
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
            
}
