package textmessage;

import javax.swing.ListModel;
public class composeReply extends javax.swing.JFrame {
    public composeReply() {
        initComponents();
  
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 130, 60));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Cicle Semi", 1, 35)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 780, 50));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 610, 140, 60));

        jTextPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Cicle Semi", 0, 30)); // NOI18N
        jTextPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextPane1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 990, 340));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/textmessage/compose.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {                                         
       jTextField1.setEnabled(true);
        jTextPane1.setEnabled(false); 
    }                                        

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
    }                                    

    private void jTextPane1MouseClicked(java.awt.event.MouseEvent evt) {                                        
        jTextField1.setEnabled(false);
        jTextPane1.setEnabled(true);
    }                                       

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.setVisible(false);// TODO add your handling code here:
        SMSDisplay.no4sent.setText(SMSDisplay.no3sent.getText()+"");
        SMSDisplay.message4sent.setText(SMSDisplay.message3sent.getText()+"");
        SMSDisplay.no3sent.setText(SMSDisplay.no2sent.getText()+"");
        SMSDisplay.message3sent.setText(SMSDisplay.message2sent.getText()+"");
        SMSDisplay.no2sent.setText(SMSDisplay.no1sent.getText()+"");
        SMSDisplay.message2sent.setText(SMSDisplay.message1sent.getText()+"");
        SMSDisplay.no1sent.setText(composeReply.jTextField1.getText()+"");
        SMSDisplay.message1sent.setText(composeReply.jTextPane1.getText()+"");
System.out.println(composeReply.jTextPane1.getText()+"");
        
    }                                    

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.setVisible(false);
        SMSDisplay.no4draft.setText(SMSDisplay.no3draft.getText()+"");
        SMSDisplay.message4draft.setText(SMSDisplay.message3draft.getText()+"");
        SMSDisplay.no3draft.setText(SMSDisplay.no2draft.getText()+"");
        SMSDisplay.message3draft.setText(SMSDisplay.message2draft.getText()+"");
        SMSDisplay.no2draft.setText(SMSDisplay.no1draft.getText()+"");
        SMSDisplay.message2draft.setText(SMSDisplay.message1draft.getText()+"");
        SMSDisplay.no1draft.setText(composeReply.jTextField1.getText()+"");
        SMSDisplay.message1draft.setText(composeReply.jTextPane1.getText()+"");        
    }                                    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(composeReply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(composeReply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(composeReply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(composeReply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new composeReply().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextPane jTextPane1;
}
