
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.rmi.Naming;
import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.text.*;
import java.net.URL;
import javax.sound.sampled.*;




public class ichatwindow extends javax.swing.JFrame {
       static String ip,id,fid; 
       ClientRemote cr;
       public ichatwindow(String ip,String id,String fid,ClientRemote cr) {
        initComponents();
        this.ip=ip;
        this.id=id;
        this.fid=fid;
        this.cr=cr;
        try{
            cr.addTextandid(jTextPane1, fid);
        }catch(Exception e)
        {}
        this.setSize(500,550);
        doOperation();
        playTone();
        this.setTitle("UserId: "+fid);
        this.setLocation(850, 200);
       }
       

    
       public void doOperation()
       {
            jPanel5.hide();  
            for(int i=1;i<=100;i++)
            {
                jComboBox2.addItem(i);
            }

            String font[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
            for(int g=0;g<font.length;g++)
            {
            jComboBox1.addItem(font[g]);
            }
            jTextPane2.setFont(new Font(s1,Font.PLAIN,15));
            jComboBox2.setSelectedItem(15);
            
       }
       Clip clip;
    public void playTone()
    {
        try {
         // Open an audio input stream.
         URL url = this.getClass().getClassLoader().getResource("ringtone.wav");
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
         // Get a sound clip resource.
         clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
         
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s2.png"))); // NOI18N
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });

        jToggleButton2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jToggleButton2.setText("B");
        jToggleButton2.setOpaque(true);
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });

        jToggleButton3.setFont(new java.awt.Font("Verdana", 3, 11)); // NOI18N
        jToggleButton3.setText("I");
        jToggleButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton3MouseClicked(evt);
            }
        });

        jToggleButton4.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jToggleButton4.setText("U");
        jToggleButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jToggleButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButton2)
                        .addComponent(jToggleButton3)
                        .addComponent(jToggleButton4)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 370, 470, 40);

        jPanel4.setLayout(null);

        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(390, 30, 70, 30);

        jCheckBox1.setForeground(new java.awt.Color(0, 51, 204));
        jCheckBox1.setText("Message send on press Enter");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox1);
        jCheckBox1.setBounds(10, 70, 280, 20);

        jTextPane2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextPane2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPane2KeyTyped(evt);
            }
        });
        jScrollPane6.setViewportView(jTextPane2);

        jPanel4.add(jScrollPane6);
        jScrollPane6.setBounds(10, 10, 370, 60);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 420, 470, 90);

        jPanel5.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1 copy.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel4);
        jLabel4.setBounds(0, 0, 30, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3 copy.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel5);
        jLabel5.setBounds(70, 0, 30, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4 copy.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel6);
        jLabel6.setBounds(110, 0, 40, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2 copy.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel7);
        jLabel7.setBounds(33, 0, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6 copy.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel1);
        jLabel1.setBounds(140, 0, 30, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5 copy.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel2);
        jLabel2.setBounds(180, 0, 40, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7 copy.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel3);
        jLabel3.setBounds(210, 0, 40, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/9 copy.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel8);
        jLabel8.setBounds(0, 40, 40, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/10 copy.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel9);
        jLabel9.setBounds(38, 39, 40, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/11 copy.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel10);
        jLabel10.setBounds(80, 40, 40, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/12 copy.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel11);
        jLabel11.setBounds(120, 40, 30, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/14 copy.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel13);
        jLabel13.setBounds(150, 40, 40, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18 copy.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel14);
        jLabel14.setBounds(200, 40, 40, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(230, 270, 240, 90);

        jTextPane1.setEditable(false);
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 470, 350);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chatwin.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 500, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
      
      
    }//GEN-LAST:event_jComboBox2ActionPerformed
Icon icon;
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        icon= jLabel4.getIcon();
        jTextPane2.insertIcon(icon);
        jPanel5.setVisible(false);
        jTextPane2.requestFocus();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
            
        icon= jLabel7.getIcon();
        jTextPane2.insertIcon(icon);
        jPanel5.setVisible(false);
        jTextPane2.requestFocus();
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        jPanel5.setVisible(false);
    }//GEN-LAST:event_formMouseClicked

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        if(jToggleButton2.isSelected())
        {
        try{     
        int index=0;
        String wtext=jTextPane2.getText();
        String text=jTextPane2.getSelectedText();
        index=wtext.indexOf(text);
        MutableAttributeSet attrs=jTextPane2.getInputAttributes();
        StyleConstants.setBold(attrs, true);
        StyleConstants.setBold(attrs, rootPaneCheckingEnabled);
        StyledDocument doc=jTextPane2.getStyledDocument();
        doc.setCharacterAttributes(index, text.length(), attrs, false);
        }catch(Exception e)
        {}
        jTextPane2.requestFocus();
        }
        else
        {
        try{
        int index=0;
        String wtext=jTextPane2.getText();
        String text=jTextPane2.getSelectedText();
        index=wtext.indexOf(text);
        MutableAttributeSet attrs=jTextPane2.getInputAttributes();
        StyleConstants.setBold(attrs, false);
        StyledDocument doc=jTextPane2.getStyledDocument();
        doc.setCharacterAttributes(index, text.length(), attrs, false);
        jToggleButton2.setBackground(Color.blue);
        }catch(Exception e)
        {}    
        jTextPane2.requestFocus();
        }
                
        
    }//GEN-LAST:event_jToggleButton2MouseClicked
    
    private void jTextPane2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane2KeyTyped
        if(jToggleButton2.isSelected())
        {
            MutableAttributeSet attrs=jTextPane2.getInputAttributes();
            StyleConstants.setBold(attrs, true);
            StyledDocument doc=jTextPane2.getStyledDocument();
            doc.setCharacterAttributes(jTextPane2.getCaretPosition(), jTextPane2.getText().length()+1, attrs, false);
        }
        else
        {
            MutableAttributeSet attrs=jTextPane2.getInputAttributes();
            StyleConstants.setBold(attrs, false);
            StyledDocument doc=jTextPane2.getStyledDocument();
            doc.setCharacterAttributes(jTextPane2.getCaretPosition(), jTextPane2.getText().length()+1, attrs, false);
        }
        
        if(jToggleButton3.isSelected())
        {
            MutableAttributeSet attrs=jTextPane2.getInputAttributes();
            StyleConstants.setItalic(attrs, true);
            StyledDocument doc=jTextPane2.getStyledDocument();
            doc.setCharacterAttributes(jTextPane2.getCaretPosition(), jTextPane2.getText().length()+1, attrs, false);
        }
        else
        {
            MutableAttributeSet attrs=jTextPane2.getInputAttributes();
            StyleConstants.setItalic(attrs, false);
            StyledDocument doc=jTextPane2.getStyledDocument();
            doc.setCharacterAttributes(jTextPane2.getCaretPosition(), jTextPane2.getText().length()+1, attrs, false);
        }
        
        if(jToggleButton4.isSelected())
        {
            MutableAttributeSet attrs=jTextPane2.getInputAttributes();
            StyleConstants.setUnderline(attrs, true);
            StyledDocument doc=jTextPane2.getStyledDocument();
            doc.setCharacterAttributes(jTextPane2.getCaretPosition(), jTextPane2.getText().length()+1, attrs, false);
        }
        else
        {
            MutableAttributeSet attrs=jTextPane2.getInputAttributes();
            StyleConstants.setUnderline(attrs, false);
            StyledDocument doc=jTextPane2.getStyledDocument();
            doc.setCharacterAttributes(jTextPane2.getCaretPosition(), jTextPane2.getText().length()+1, attrs, false);
        }
        
    }//GEN-LAST:event_jTextPane2KeyTyped

    private void jToggleButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton3MouseClicked
        if(jToggleButton3.isSelected())
        {
        try{
        int index=0;
        String wtext=jTextPane2.getText();
        String text=jTextPane2.getSelectedText();
        index=wtext.indexOf(text);
        MutableAttributeSet attrs=jTextPane2.getInputAttributes();
        StyleConstants.setItalic(attrs, true);
        StyleConstants.setItalic(attrs, rootPaneCheckingEnabled);
        StyledDocument doc=jTextPane2.getStyledDocument();
        doc.setCharacterAttributes(index, text.length(), attrs, false);
        }catch(Exception e)
        {}
        jTextPane2.requestFocus();
        }
        else
        {
        try{
        int index=0;
        String wtext=jTextPane2.getText();
        String text=jTextPane2.getSelectedText();
        index=wtext.indexOf(text);
        MutableAttributeSet attrs=jTextPane2.getInputAttributes();
        StyleConstants.setItalic(attrs, false);
        StyledDocument doc=jTextPane2.getStyledDocument();
        doc.setCharacterAttributes(index, text.length(), attrs, false);
        }catch(Exception e)
        {} 
        jTextPane2.requestFocus();
        }
                
        
    }//GEN-LAST:event_jToggleButton3MouseClicked

    private void jToggleButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton4MouseClicked
        
        if(jToggleButton4.isSelected())
        {
        try{
        int index=0;
        String wtext=jTextPane2.getText();
        String text=jTextPane2.getSelectedText();
        index=wtext.indexOf(text);
        MutableAttributeSet attrs=jTextPane2.getInputAttributes();
        StyleConstants.setUnderline(attrs, true);
        StyleConstants.setUnderline(attrs, rootPaneCheckingEnabled);
        StyledDocument doc=jTextPane2.getStyledDocument();
        doc.setCharacterAttributes(index, text.length(), attrs, false);
        }catch(Exception e)
        {}
        jTextPane2.requestFocus();
        }
        else
        {
        try{
        int index=0;
        String wtext=jTextPane2.getText();
        String text=jTextPane2.getSelectedText();
        index=wtext.indexOf(text);
        MutableAttributeSet attrs=jTextPane2.getInputAttributes();
        StyleConstants.setUnderline(attrs, false);
        StyledDocument doc=jTextPane2.getStyledDocument();
        doc.setCharacterAttributes(index, text.length(), attrs, false);
        }catch(Exception e)
        {}    
        jTextPane2.requestFocus();
        }
    }//GEN-LAST:event_jToggleButton4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
      
        icon= jLabel5.getIcon();
        jTextPane2.insertIcon(icon);
        jPanel5.setVisible(false);
        jTextPane2.requestFocus();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        icon= jLabel6.getIcon();
        jTextPane2.insertIcon(icon);
        jPanel5.setVisible(false);
        jTextPane2.requestFocus();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        icon= jLabel1.getIcon();
        jTextPane2.insertIcon(icon);
        jPanel5.setVisible(false);
        jTextPane2.requestFocus();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        icon= jLabel2.getIcon();
        jTextPane2.insertIcon(icon);
        jPanel5.setVisible(false);
        jTextPane2.requestFocus();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        icon= jLabel3.getIcon();
        jTextPane2.insertIcon(icon);
        jPanel5.setVisible(false);
        jTextPane2.requestFocus();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       icon= jLabel8.getIcon();
        jTextPane2.insertIcon(icon);
        jPanel5.setVisible(false);
        jTextPane2.requestFocus();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        icon= jLabel9.getIcon();
        jTextPane2.insertIcon(icon);
        jPanel5.setVisible(false);
        jTextPane2.requestFocus();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        icon= jLabel10.getIcon();
        jTextPane2.insertIcon(icon);
        jPanel5.setVisible(false);
        jTextPane2.requestFocus();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       icon= jLabel11.getIcon();
        jTextPane2.insertIcon(icon);
        jPanel5.setVisible(false);
        jTextPane2.requestFocus();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        icon= jLabel3.getIcon();
        jTextPane2.insertIcon(icon);
        jPanel5.setVisible(false);
        jTextPane2.requestFocus();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        icon= jLabel14.getIcon();
        jTextPane2.insertIcon(icon);
        jPanel5.setVisible(false);
        jTextPane2.requestFocus();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        
        if(jToggleButton1.isSelected())
          {
              jPanel5.setVisible(true);
          }
        else
            {
                jPanel5.setVisible(false);
            }
    }//GEN-LAST:event_jToggleButton1MouseClicked
String s1,s2;
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        String tt=jTextPane2.getSelectedText();
        
        
         s1=jComboBox1.getSelectedItem().toString();
        jTextPane2.setFont(new Font(s1,Font.PLAIN ,s3));
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged
int s3;
    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        s2=jComboBox2.getSelectedItem().toString();
         s3= Integer.parseInt(s2);
        jTextPane2.setFont(new Font(s2,Font.PLAIN,s3));
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private static final String ELEM=AbstractDocument.ElementNameAttribute;
    private static final String ICON=StyleConstants.IconElementName;
   // private static final String COMP=StyleConstants.ComponentElementName;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         
       try{
          MiddleApp app=(MiddleApp) Naming.lookup("rmi://"+ip+"/signup");
          app.sendMessage(fid, id, jTextPane2.getStyledDocument());
          updateTextPane(jTextPane1, jTextPane2.getStyledDocument());
          jTextPane2.setText("");
          jTextPane2.requestFocus();
        }catch(Exception e)
        {}
    }//GEN-LAST:event_jButton2ActionPerformed

    public void updateTextPane(JTextPane t,StyledDocument doc)
    {
        try{
        StyledDocument d=t.getStyledDocument();
        d.insertString(t.getCaretPosition(), "Me: ", null);
        ElementIterator iterator = new ElementIterator(doc);
        Element element;
        while ((element = iterator.next()) != null) {
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
                    continue;
                }
            }
            else if (as.containsAttribute(ELEM, ICON)){
                ImageIcon icon=(ImageIcon)StyleConstants.getIcon(as);
                t.insertIcon(icon);
            }
            
        }
        d.insertString(t.getCaretPosition(), "\n", null);
        }catch(Exception e)
        {
            System.out.println(e);
        }
 }       
    private void jTextPane2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane2KeyPressed
        if(jCheckBox1.isSelected())
        {
        int code=evt.getKeyCode();
        if(code==evt.VK_ENTER)
        {
            updateTextPane(jTextPane1, jTextPane1.getStyledDocument());
            jTextPane2.requestFocus();
        }
        }
        else
        {
            jTextPane2.requestFocus();
        }
    }//GEN-LAST:event_jTextPane2KeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        jTextPane2.requestFocus();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Chatwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chatwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chatwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chatwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
               // new ichatwindow(ip,id).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}