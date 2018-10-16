// 30 - 03 - 2018
package test;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import static test.MainClass.loading;
import static test.MainClass.welcome;

public class Home extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Home() {
        initComponents();

        // 285630 <-- Hex-Code For Color 
        // 306844 <-- Hex-Code For Color
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/home_icon.png")));
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 7, 7));
        // width , hight
        //setSize(800, 450);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_MAIN_ = new javax.swing.JPanel();
        jLabel_close_ = new javax.swing.JLabel();
        jLabel_info_ = new javax.swing.JLabel();
        jLabel_Logo_ = new javax.swing.JLabel();
        jLabel_back_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel_MAIN_.setBackground(new java.awt.Color(40, 86, 48));
        jPanel_MAIN_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel_MAIN_MouseDragged(evt);
            }
        });
        jPanel_MAIN_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel_MAIN_MousePressed(evt);
            }
        });

        jLabel_close_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close_32.png"))); // NOI18N
        jLabel_close_.setToolTipText("Close");
        jLabel_close_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_close_MouseMoved(evt);
            }
        });
        jLabel_close_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_close_MouseClicked(evt);
            }
        });

        jLabel_info_.setFont(new java.awt.Font("Calibri", 1, 40)); // NOI18N
        jLabel_info_.setForeground(new java.awt.Color(255, 255, 51));
        jLabel_info_.setText("Welcome to ...");

        jLabel_Logo_.setForeground(new java.awt.Color(204, 204, 204));
        jLabel_Logo_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/diu_logo.png"))); // NOI18N
        jLabel_Logo_.setToolTipText("Just Logo!");
        jLabel_Logo_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_Logo_MouseMoved(evt);
            }
        });

        jLabel_back_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_back_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        jLabel_back_.setToolTipText("Back to Loding Page again......");
        jLabel_back_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel_back_MouseMoved(evt);
            }
        });
        jLabel_back_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_back_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MAIN_Layout = new javax.swing.GroupLayout(jPanel_MAIN_);
        jPanel_MAIN_.setLayout(jPanel_MAIN_Layout);
        jPanel_MAIN_Layout.setHorizontalGroup(
            jPanel_MAIN_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MAIN_Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_close_))
            .addGroup(jPanel_MAIN_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_back_)
                .addGap(208, 208, 208)
                .addGroup(jPanel_MAIN_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel_info_)
                    .addComponent(jLabel_Logo_))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanel_MAIN_Layout.setVerticalGroup(
            jPanel_MAIN_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MAIN_Layout.createSequentialGroup()
                .addGroup(jPanel_MAIN_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MAIN_Layout.createSequentialGroup()
                        .addComponent(jLabel_close_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_info_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Logo_)
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MAIN_Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_back_)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_MAIN_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_MAIN_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(807, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_close_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_close_MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_close_MouseClicked

    private void jPanel_MAIN_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_MAIN_MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel_MAIN_MousePressed

    private void jPanel_MAIN_MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_MAIN_MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        //System.out.println( x + " , " + y);
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel_MAIN_MouseDragged

    private void jLabel_back_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_back_MouseClicked
        welcome.setVisible(false);
        loading.setVisible(true);

    }//GEN-LAST:event_jLabel_back_MouseClicked

    private void jLabel_close_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_close_MouseMoved
        jLabel_close_.setCursor( new Cursor(Cursor.HAND_CURSOR) );
    }//GEN-LAST:event_jLabel_close_MouseMoved

    private void jLabel_back_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_back_MouseMoved
        jLabel_back_.setCursor( new Cursor(Cursor.HAND_CURSOR) );
    }//GEN-LAST:event_jLabel_back_MouseMoved

    private void jLabel_Logo_MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Logo_MouseMoved
        jLabel_Logo_.setForeground(Color.red);
    }//GEN-LAST:event_jLabel_Logo_MouseMoved
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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel_Logo_;
    private javax.swing.JLabel jLabel_back_;
    private javax.swing.JLabel jLabel_close_;
    private javax.swing.JLabel jLabel_info_;
    private javax.swing.JPanel jPanel_MAIN_;
    // End of variables declaration//GEN-END:variables
}
