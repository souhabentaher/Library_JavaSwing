
package Library_Management;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Souha
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnnewbook = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnnewstudent = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnibook = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnrbook = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnstatistics = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miexit = new javax.swing.JMenuItem();
        milogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Library Management System");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 530, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, -1, -1));

        btnnewbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        btnnewbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnnewbook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnewbookMouseClicked(evt);
            }
        });
        btnnewbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewbookActionPerformed(evt);
            }
        });
        getContentPane().add(btnnewbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 170, 110));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/New book.png"))); // NOI18N
        jLabel5.setText("New Book");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 127, -1));

        btnnewstudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnnewstudent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnnewstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnewstudentMouseClicked(evt);
            }
        });
        btnnewstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewstudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnnewstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 168, 127));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 51, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/member-add-on-300x300.png"))); // NOI18N
        jLabel7.setText("New Student");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 147, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Operation");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 100, -1));

        btnibook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download1234.jpg"))); // NOI18N
        btnibook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnibook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnibookMouseClicked(evt);
            }
        });
        btnibook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnibookActionPerformed(evt);
            }
        });
        getContentPane().add(btnibook, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 170, 110));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 51, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/issue.png"))); // NOI18N
        jLabel8.setText("Issue Book");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 157, -1));

        btnrbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return.jpg"))); // NOI18N
        btnrbook.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnrbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrbookActionPerformed(evt);
            }
        });
        getContentPane().add(btnrbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 170, 127));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 51, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return book png.png"))); // NOI18N
        jLabel10.setText("Return Book");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 147, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Action");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        btnstatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/statistics.jpg"))); // NOI18N
        btnstatistics.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnstatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatisticsActionPerformed(evt);
            }
        });
        getContentPane().add(btnstatistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 180, 130));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Statics.png"))); // NOI18N
        jLabel1.setText("Statistic ISSUE & RETURN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 277, 70));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Statistic");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/123456.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 720, -1));
        jLabel11.getAccessibleContext().setAccessibleName("");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Library_Book_532388_1366x768.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));
        jLabel12.getAccessibleContext().setAccessibleName("");

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        jMenu1.setText("File");

        miexit.setText("Exit");
        miexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miexitActionPerformed(evt);
            }
        });
        jMenu1.add(miexit);

        milogout.setText("Logout");
        milogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milogoutActionPerformed(evt);
            }
        });
        jMenu1.add(milogout);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1371, 754));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void milogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milogoutActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_milogoutActionPerformed

    private void miexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miexitActionPerformed

    private void btnnewbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewbookActionPerformed
        NewBook ob = new NewBook();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnnewbookActionPerformed

    private void btnnewstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewstudentActionPerformed
        Student ob = new Student();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnnewstudentActionPerformed

    private void btnrbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrbookActionPerformed
        Return ob = new Return();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnrbookActionPerformed

    private void btnibookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnibookActionPerformed
        Issue ob = new Issue();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnibookActionPerformed

    private void btnnewbookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnewbookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnewbookMouseClicked

    private void btnnewstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnewstudentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnewstudentMouseClicked

    private void btnibookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnibookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnibookMouseClicked

    private void btnstatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatisticsActionPerformed
        // TODO add your handling code here:
        Statistics ob = new Statistics();
        ob.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnstatisticsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnibook;
    private javax.swing.JButton btnnewbook;
    private javax.swing.JButton btnnewstudent;
    private javax.swing.JButton btnrbook;
    private javax.swing.JButton btnstatistics;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JMenuItem miexit;
    private javax.swing.JMenuItem milogout;
    // End of variables declaration//GEN-END:variables
}
