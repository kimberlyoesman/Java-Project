package textmessage;

//something new hehe tanggal 8 Juni today

public class draft extends javax.swing.JFrame {
    public draft() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        inbox1 = new javax.swing.JLabel();
        inbox2 = new javax.swing.JLabel();
        inbox3 = new javax.swing.JLabel();
        inbox4 = new javax.swing.JLabel();
        no1 = new javax.swing.JLabel();
        message1 = new javax.swing.JLabel();
        no2 = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();
        no3 = new javax.swing.JLabel();
        message3 = new javax.swing.JLabel();
        no4 = new javax.swing.JLabel();
        message4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inbox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inbox1MouseClicked(evt);
            }
        });
        getContentPane().add(inbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 800, 150));
        getContentPane().add(inbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 800, 140));
        getContentPane().add(inbox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 800, 150));
        getContentPane().add(inbox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 800, 150));

        no1.setFont(new java.awt.Font("Cicle Semi", 1, 35)); // NOI18N
        no1.setForeground(new java.awt.Color(255, 255, 255));
        no1.setToolTipText("");
        getContentPane().add(no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 700, 40));

        message1.setFont(new java.awt.Font("Cicle Semi", 0, 30)); // NOI18N
        message1.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(message1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 780, 80));

        no2.setFont(new java.awt.Font("Cicle Semi", 1, 35)); // NOI18N
        no2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(no2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 720, 40));

        message2.setFont(new java.awt.Font("Cicle Semi", 0, 30)); // NOI18N
        message2.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(message2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 790, 80));

        no3.setFont(new java.awt.Font("Cicle Semi", 1, 35)); // NOI18N
        no3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(no3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 720, 40));

        message3.setFont(new java.awt.Font("Cicle Semi", 0, 30)); // NOI18N
        message3.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(message3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 780, 70));

        no4.setFont(new java.awt.Font("Cicle Semi", 1, 35)); // NOI18N
        no4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(no4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 680, 40));

        message4.setFont(new java.awt.Font("Cicle Semi", 0, 30)); // NOI18N
        message4.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(message4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 580, 780, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/textmessage/draft.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    } 

    private void inbox1MouseClicked(java.awt.event.MouseEvent evt) {                                    
        this.setVisible(false);
        new composeReply().setVisible(true);
        composeReply.jTextField1.setText(no1.getText());
        composeReply.jTextPane1.setText(message1.getText());
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
            java.util.logging.Logger.getLogger(draft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(draft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(draft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(draft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new draft().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel inbox1;
    private javax.swing.JLabel inbox2;
    private javax.swing.JLabel inbox3;
    private javax.swing.JLabel inbox4;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel message1;
    public static javax.swing.JLabel message2;
    public static javax.swing.JLabel message3;
    public static javax.swing.JLabel message4;
    public static javax.swing.JLabel no1;
    public static javax.swing.JLabel no2;
    public static javax.swing.JLabel no3;
    public static javax.swing.JLabel no4;
}
