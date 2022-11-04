
package SocietyMaintenace;

import javax.swing.JOptionPane;

/**
 *
 * @author Divya Shah
 */
public class MenuForm extends javax.swing.JFrame {

    /**
     * Creates new form MenuForm
     */
    public MenuForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Headinglabel = new javax.swing.JLabel();
        For_Singoutpanel = new javax.swing.JPanel();
        SignOutbutton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Masterbutton = new javax.swing.JButton();
        Printbutton = new javax.swing.JButton();
        MemberDetailsbutton = new javax.swing.JButton();
        Billbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1077, 600));
        setMaximumSize(new java.awt.Dimension(1077, 600));
        setUndecorated(true);

        Headinglabel.setBackground(new java.awt.Color(255, 255, 255));
        Headinglabel.setFont(new java.awt.Font("Georgia", 3, 48)); // NOI18N
        Headinglabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Headinglabel.setText("Welcome to Society Maintenance Bill !!");

        For_Singoutpanel.setBackground(new java.awt.Color(102, 102, 102));

        SignOutbutton.setBackground(new java.awt.Color(0, 0, 0));
        SignOutbutton.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        SignOutbutton.setForeground(new java.awt.Color(255, 255, 255));
        SignOutbutton.setText("Sign Out");
        SignOutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout For_SingoutpanelLayout = new javax.swing.GroupLayout(For_Singoutpanel);
        For_Singoutpanel.setLayout(For_SingoutpanelLayout);
        For_SingoutpanelLayout.setHorizontalGroup(
            For_SingoutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, For_SingoutpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SignOutbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        For_SingoutpanelLayout.setVerticalGroup(
            For_SingoutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignOutbutton)
        );

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Masterbutton.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        Masterbutton.setText("Master");
        Masterbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasterbuttonActionPerformed(evt);
            }
        });
        jPanel4.add(Masterbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 319, 163));

        Printbutton.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        Printbutton.setText("Maintenance Form");
        Printbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintbuttonActionPerformed(evt);
            }
        });
        jPanel4.add(Printbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 0, 342, 163));

        MemberDetailsbutton.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        MemberDetailsbutton.setText("Member Details");
        MemberDetailsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberDetailsbuttonActionPerformed(evt);
            }
        });
        jPanel4.add(MemberDetailsbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 0, 333, 163));

        Billbutton.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        Billbutton.setText("Bill");
        Billbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillbuttonActionPerformed(evt);
            }
        });
        jPanel4.add(Billbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 219, 319, 163));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Headinglabel, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
            .addComponent(For_Singoutpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(For_Singoutpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Headinglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignOutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutbuttonActionPerformed
        // TODO add your handling code here:
        int response =JOptionPane.showConfirmDialog(this, "Do you want to SignOut ?","Confirmation PopUp",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        //To display respone result
        switch (response) {
            case JOptionPane.YES_OPTION:
                dispose();
                LoginForm lf = new LoginForm();
                lf.setVisible(true);
                break;
            case JOptionPane.NO_OPTION:
                break;
            case JOptionPane.CLOSED_OPTION:
                break;
            default:
                break;
        }
    }//GEN-LAST:event_SignOutbuttonActionPerformed

    private void MemberDetailsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberDetailsbuttonActionPerformed
        // TODO add your handling code here:
        MemberDetails me = new MemberDetails();
        me.setVisible(true);
        dispose();
    }//GEN-LAST:event_MemberDetailsbuttonActionPerformed

    private void MasterbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasterbuttonActionPerformed
        // TODO add your handling code here:
//        MasterForm mf = new MasterForm();
//        mf.setVisible(true);
               dispose();
    }//GEN-LAST:event_MasterbuttonActionPerformed

    private void PrintbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintbuttonActionPerformed
        // TODO add your handling code here:
        MaintenaceForm pf = new MaintenaceForm();
        pf.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_PrintbuttonActionPerformed

    private void BillbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillbuttonActionPerformed
        // TODO add your handling code here:
        BillForm bf = new BillForm();
        bf.setVisible(true);
        dispose();
    }//GEN-LAST:event_BillbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Billbutton;
    private javax.swing.JPanel For_Singoutpanel;
    private javax.swing.JLabel Headinglabel;
    private javax.swing.JButton Masterbutton;
    private javax.swing.JButton MemberDetailsbutton;
    private javax.swing.JButton Printbutton;
    private javax.swing.JButton SignOutbutton;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
