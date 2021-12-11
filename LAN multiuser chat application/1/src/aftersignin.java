import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.rmi.Naming;
import java.sql.Blob;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageInputStreamImpl;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pragya
 */
public class aftersignin extends javax.swing.JFrame {
     static String ip,id,name;
    
    int x,x1;
     public static BufferedImage resizeImage(BufferedImage originalImage, int type){
	BufferedImage resizedImage = new BufferedImage(70, 80, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, 70, 80, null);
	g.dispose();
 
	return resizedImage;
    }
    private static BufferedImage resizeImageWithHint(BufferedImage originalImage, int type){
        BufferedImage resizedImage = new BufferedImage(70, 80, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, 70, 80, null);
	g.dispose();	
	g.setComposite(AlphaComposite.Src);
 
	g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	g.setRenderingHint(RenderingHints.KEY_RENDERING,
	RenderingHints.VALUE_RENDER_QUALITY);
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	RenderingHints.VALUE_ANTIALIAS_ON);
 
        return resizedImage;
    }
    public aftersignin(String ip,String id,String name) {
        initComponents();
        this.setSize(275,733);
        this.setLocation(1088,0);
        this.setTitle("ChatRooms");
        this.ip=ip;
        this.id=id;
        this.name=name;
        jLabel3.setText(name);
        
        try
        {
            MiddleApp app=(MiddleApp)Naming.lookup("rmi://"+ip+"/signup");
            String n=app.fetchpic(id);
            byte b[]=app.fetchpic1(id);
            BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream(System.getProperty("user.home") +File.separator+n));
            bout.write(b);
            bout.close();
//            BufferedInputStream bin=new BufferedInputStream(new FileInputStream(n));
//            int totalBytes=bin.available();
//            byte b[]=new byte[totalBytes];
//            int bytes=0,bytesRead=0;
//            while(bytesRead<totalBytes)
//            {
//                bytes=bin.read(b, bytesRead, totalBytes);
//                bytesRead+=bytes;
//            }
//            bin.close(); 
//           // String im=n.toString();
//           
//        
//         try{
// 
//		BufferedImage originalImage = ImageIO.read(bin);
//                int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
// 
//		BufferedImage resizeImageJpg = resizeImage(originalImage, type);
//		ImageIO.write(resizeImageJpg, "jpg", new File(n));
// 
//		BufferedImage resizeImagePng = resizeImage(originalImage, type);
//		ImageIO.write(resizeImagePng, "png", new File(n)); 
//
//		BufferedImage resizeImageHintJpg = resizeImageWithHint(originalImage, type);
//		ImageIO.write(resizeImageHintJpg, "jpg", new File(n)); 
// 
//		BufferedImage resizeImageHintPng = resizeImageWithHint(originalImage, type);
//		ImageIO.write(resizeImageHintPng, "png", new File(n)); 
// 
//	}catch(IOException e){
//		System.out.println(e.getMessage());
//	}
       
     //String s=s.valueOf(bytesRead);
      // File f=new File(s);
        picname=System.getProperty("user.home") +File.separator+n;    
        ImageIcon icon=new ImageIcon(System.getProperty("user.home") +File.separator+n);
        jLabel7.setIcon(icon);
        
        }
        catch(Exception e)
                {
                }
                
    }
String picname;
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Java Chat Room");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(40, 260, 160, 25);

        jRadioButton2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText(".net Chat Room");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(40, 410, 160, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/.nett.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 450, 116, 121);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maintitle.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 20, 270, 80);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Submit.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(80, 610, 90, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java.png"))); // NOI18N
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 290, 94, 110);

        jPanel1.setLayout(null);

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 20, 70, 80);

        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 50, 130, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 120, 240, 120);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bblue.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 270, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String c1="Java Chat Room"; 
        String c2=".net Chat Room"; 
        if(jRadioButton1.isSelected())
          {
          new Chatwindow(ip,id,name,c1,picname).setVisible(true);
        
          this.dispose();
          }
          if(jRadioButton2.isSelected())
          {
          new Chatwindow(ip,id,name,c2,picname).setVisible(true);
          this.dispose();
          }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(aftersignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aftersignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aftersignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aftersignin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new aftersignin("localhost",id,name).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
