import java.io.*;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.text.StyledDocument;

public class ServerApp extends UnicastRemoteObject implements MiddleApp {

    public ServerApp() throws RemoteException {
        super();//chat(String Name, int Gender, int UserID, String Pass, String que, String ans);     
    }

    @Override
    public String chat(String Name, String Gender, String UserID, String Pass, String que, String ans, String email) throws RemoteException {
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "System", "123");

            java.sql.Statement st = con.createStatement();
            //st.execute("create table register (Name varchar(100),Gender varchar(10),UserID varchar(100),Pass varchar(100),que varchar(300),ans varchar(200),email varchar(100))");

            st.executeUpdate("insert into register values('" + Name + "','" + Gender + "','" + UserID + "','" + Pass + "','" + que + "','" + ans + "','" + email + "')");

            st.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return "registered";
    }

    public static void main(String a[]) {
        try {
            ServerApp sr = new ServerApp();
            Naming.rebind("signup", sr);
            System.out.println("server registered");

        } catch (Exception e) {
        }
    }

    @Override
    public String signin(String UserID, String Pass) throws RemoteException {
        String pass = "", name = "";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "123");
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from register where UserID='" + UserID + "' and Pass='" + Pass + "'");
            if (rs.next()) {
                name = rs.getString(1);
            }
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return name;
    }

    @Override
    public String forgetpass(String UserID) {
        String ques = "";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "System", "123");

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from register where UserID='" + UserID + "'");
            if (rs.next()) {
                ques = rs.getString(5);

                //JOptionPane.showMessageDialog(new signup_in(),"valid user");
            }
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return ques;

    }

    @Override
    public int updatepass(String UserID, String que, String ans, String pass) throws RemoteException {
        int rs1 = 0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "System", "123");

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from register where UserID='" + UserID + "' and que='" + que + "' and ans='" + ans + "'");
            if (rs.next()) {
                System.out.print("yes");
                rs1 = st.executeUpdate("update register set Pass='" + pass + "' where UserID='" + UserID + "'");

            } else {
                System.out.println("Wrong Answer.........try again!!!");
            }
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return rs1;

    }
    String filename;

    @Override
    public String pic(String id, String pic, byte b[]) throws RemoteException {

        try {
            try {
                File f = new File(System.getProperty("user.dir") + File.separator + id);
                f.mkdirs();
                filename = pic.substring(pic.lastIndexOf("\\") + 1);
                BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(f.getPath() + File.separator + filename));
                bout.write(b);
                bout.close();
            } catch (Exception e) {
            }
            /*Class.forName("oracle.jdbc.driver.OracleDriver");
         Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","System","123");
         java.sql.Statement st=con.createStatement();
         st.executeUpdate("insert into pics values('"+id+"','"+filename+"')");
         System.out.print("upload");
         st.close();
         con.close();      */
        } catch (Exception e) {
            System.out.println(e);
        }
        return "upload";

    }

    @Override
    public String emailfetch(String id) throws RemoteException {
        String email = "";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "System", "123");

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from register where UserID='" + id + "'");
            if (rs.next()) {
                email = rs.getString(7);

            }
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return email;

    }

    @Override
    public int mailupdatepass(String id, String pass) throws RemoteException {
        int rs1 = 0;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "System", "123");

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from register where UserID='" + id + "'");
            if (rs.next()) {

                rs1 = st.executeUpdate("update register set Pass='" + pass + "' where UserID='" + id + "'");

            } else {
                System.out.println("Wrong Answer.........try again!!!");
            }
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return rs1;

    }
    Vector v1 = new Vector(1, 1);
    Vector v2 = new Vector(1, 1);
    Vector v3 = new Vector(1, 1);

    @Override
    public void registeruser(ClientRemote cr, String id) throws RemoteException {
        v1.addElement(cr);
        v2.addElement(id);
        v3.addElement(getName(id));
        for (int i = 0; i < v1.size(); i++) {
            ClientRemote cr1 = (ClientRemote) v1.elementAt(i);
            cr1.refreshList(v3, v2);
        }
    }

    public String getName(String id) {
        String name = "";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE", "System", "123");

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from register where UserID='" + id + "'");
            if (rs.next()) {
                name = rs.getString(1);

            }
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return name;

    }

    @Override
    public void logout(String id) throws RemoteException {
        int index = v2.indexOf(id);
        v1.remove(index);
        v2.remove(id);
        v3.remove(index);
        for (int i = 0; i < v1.size(); i++) {
            ClientRemote cr1 = (ClientRemote) v1.elementAt(i);
            cr1.refreshList(v3, v2);
        }
    }

    @Override
    public void sendMessage(String to, String from, StyledDocument doc) throws RemoteException {
        int index = v2.indexOf(to);
        ClientRemote cr1 = (ClientRemote) v1.elementAt(index);
        cr1.printMessage(from, doc, v3.elementAt(v2.indexOf(from)).toString());
    }

    @Override
    public void sendGroupMessage(String id, StyledDocument doc) throws RemoteException {
        for (int i = 0; i < v1.size(); i++) {
            ClientRemote cr1 = (ClientRemote) v1.elementAt(i);
            cr1.setMessage(doc, v3.elementAt(v2.indexOf(id)).toString());
        }
    }

    @Override
    public String fetchpic(String id) throws RemoteException {
        String pic = null;
        File f = new File(System.getProperty("user.dir") + File.separator + id);
        String str[] = f.list();
        pic = str[0];
//        byte[] byte_image;
//        BufferedInputStream is=null; 
//        try 
//        {
//            
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","System","123");
//
//            java.sql.Statement st=con.createStatement();
//            ResultSet rs= st.executeQuery("select * from pics where UserID='"+id+"'");
//            if(rs.next())
//            {
//            byte_image=rs.getBytes(2);
//            pic= byte_image.toString(); 
//            //is=new BufferedInputStream(blob.getBinaryStream());
//            System.out.print("pic");
//            
//            
//            }
//            st.close();
//            con.close();
//        } catch (Exception e)
//        {
//          System.out.print(e);  
//        }
        return pic;
    }

    @Override
    public byte[] fetchpic1(String id) throws RemoteException {
        byte b[] = null;
        try {
            String pic = null;
            File f = new File(System.getProperty("user.dir") + File.separator + id);
            File str[] = f.listFiles();
            pic = str[0].getPath();
            BufferedInputStream bin = new BufferedInputStream(new FileInputStream(pic));
            int totalBytes = bin.available();
            b = new byte[totalBytes];
            int bytes = 0, bytesRead = 0;
            while (bytesRead < totalBytes) {
                bytes = bin.read(b, bytesRead, totalBytes);
                bytesRead += bytes;
            }
            bin.close();
        } catch (Exception e) {
        }
        return b;
    }

}
