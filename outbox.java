package textmessage;
public class outbox extends javax.swing.JFrame {
    public outbox() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        no1 = new javax.swing.JLabel();
        message1 = new javax.swing.JLabel();
        no2 = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();
        no3 = new javax.swing.JLabel();
        message3 = new javax.swing.JLabel();
        no4 = new javax.swing.JLabel();
        message4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        no1.setFont(new java.awt.Font("Cicle Semi", 1, 35)); // NOI18N
        no1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 650, 40));

        message1.setFont(new java.awt.Font("Cicle Semi", 0, 30)); // NOI18N
        message1.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(message1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 780, 70));

        no2.setFont(new java.awt.Font("Cicle Semi", 1, 35)); // NOI18N
        no2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(no2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 620, 40));

        message2.setFont(new java.awt.Font("Cicle Semi", 0, 30)); // NOI18N
        message2.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(message2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 780, 80));

        no3.setFont(new java.awt.Font("Cicle Semi", 1, 35)); // NOI18N
        no3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(no3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 700, 50));

        message3.setFont(new java.awt.Font("Cicle Semi", 0, 30)); // NOI18N
        message3.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(message3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 780, 70));

        no4.setFont(new java.awt.Font("Cicle Semi", 1, 35)); // NOI18N
        no4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(no4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 590, 40));

        message4.setFont(new java.awt.Font("Cicle Semi", 0, 30)); // NOI18N
        message4.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(message4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 780, 70));

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, 70));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 190, 70));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 660, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/textmessage/sent.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.setVisible(false);
        new composeReply().setVisible(true);
    }                                    

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        this.setVisible(false);
        new draft().setVisible(true);
    }                                    

    public static void process()
        {
            if(no1.getText() == "")
        {
        no1.setText(composeReply.jTextField1.getText()+"");
        message1.setText(composeReply.jTextPane1.getText()+"");
        }
        else if(no2.getText() == "")
        {
        no2.setText(no1.getText()+"");
            message2.setText(message1.getText()+"");
            no1.setText(composeReply.jTextField1.getText()+"");
            message1.setText(composeReply.jTextPane1.getText()+"");
        }
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
            java.util.logging.Logger.getLogger(outbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(outbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(outbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(outbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new outbox().setVisible(true);
                
                
            }
        });
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel message1;
    public static javax.swing.JLabel message2;
    public static javax.swing.JLabel message3;
    public static javax.swing.JLabel message4;
    public static javax.swing.JLabel no1;
    public static javax.swing.JLabel no2;
    public static javax.swing.JLabel no3;
    public static javax.swing.JLabel no4;
}
