
import java.awt.Dimension;
import java.awt.Toolkit;


public class AdminPanel extends javax.swing.JFrame {

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
        initComponents();
          Toolkit toolkit = getToolkit();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Examination = new javax.swing.JLabel();
        Results = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        Registration = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Examination.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Examination.setForeground(new java.awt.Color(255, 255, 255));
        Examination.setText("2. Examination ");
        Examination.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExaminationMouseClicked(evt);
            }
        });
        getContentPane().add(Examination, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 190, 50));

        Results.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Results.setForeground(new java.awt.Color(255, 255, 255));
        Results.setText("3. Results");
        Results.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultsMouseClicked(evt);
            }
        });
        getContentPane().add(Results, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 190, 50));

        Exit.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("4. Exit");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 190, 50));

        Registration.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Registration.setForeground(new java.awt.Color(255, 255, 255));
        Registration.setText("1. Student ");
        Registration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrationMouseClicked(evt);
            }
        });
        getContentPane().add(Registration, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 190, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java4.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        this.setVisible(false);
        Student_Login obj = new Student_Login();
        obj.setVisible(true);
    }//GEN-LAST:event_ExitMouseClicked

    private void RegistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrationMouseClicked
        this.setVisible(false);
        Registration obj = new Registration();
       obj.setVisible(true);
       
    }//GEN-LAST:event_RegistrationMouseClicked

    private void ResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultsMouseClicked
        this.setVisible(false);
        ResultAdmin obj = new ResultAdmin();
       obj.setVisible(true);
    }//GEN-LAST:event_ResultsMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void ExaminationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExaminationMouseClicked
        // TODO add your handling code here:
        Examination obj= new Examination();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExaminationMouseClicked

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Examination;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Registration;
    private javax.swing.JLabel Results;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
