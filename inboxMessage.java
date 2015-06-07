package textmessage;

public class inboxMessage extends javax.swing.JFrame {
    public inboxMessage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 620, 160, 50));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 620, 120, 50));

        jTextField1.setFont(new java.awt.Font("Cicle Semi", 1, 35)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
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
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 640, 60));

        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Cicle Semi", 0, 30)); // NOI18N
        jTextPane1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextPane1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 990, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/textmessage/reply.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {                                         
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           

    private void jTextPane1MouseClicked(java.awt.event.MouseEvent evt) {                                        
    }                                       

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.setVisible(false);
        new composeReply().setVisible(true);
        composeReply.jTextField1.setText(jTextField1.getText());// TODO add your handling code here:
        composeReply.jTextField1.setEnabled(false);
    }                                    

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
    this.setVisible(false);
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
            java.util.logging.Logger.getLogger(inboxMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inboxMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inboxMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inboxMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inboxMessage().setVisible(true);
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
