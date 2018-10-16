// 30 - 03 - 2018 
package test;

import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;

public class Splash extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Splash() {
        initComponents();

        // ######################################
        setLocationRelativeTo(this);
        // 0C4DA2 <-- Hex-Code For Color
        //getContentPane().setBackground( Color.green ); 
        //getContentPane().setBackground( new Color( 0,151,167) );

        // width , hight
        setSize(650, 350);

        // for rounding shape
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));

        // for taskbar icone 
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../img/sand_clock.png")));

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel_ = new javax.swing.JPanel();
        loading = new javax.swing.JLabel();
        updateNumberes = new javax.swing.JLabel();
        updateProgressBar = new javax.swing.JProgressBar();
        jLabel_dots = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel_.setBackground(new java.awt.Color(12, 77, 162));
        mainPanel_.setForeground(new java.awt.Color(204, 204, 255));
        mainPanel_.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mainPanel_MouseDragged(evt);
            }
        });
        mainPanel_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainPanel_MousePressed(evt);
            }
        });

        loading.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        loading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loading.setText("Loading");

        updateNumberes.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        updateNumberes.setForeground(new java.awt.Color(0, 255, 102));
        updateNumberes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateNumberes.setText("0%");

        updateProgressBar.setBackground(new java.awt.Color(255, 255, 255));
        updateProgressBar.setForeground(new java.awt.Color(102, 102, 102));
        updateProgressBar.setBorderPainted(false);
        updateProgressBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel_dots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dot.gif"))); // NOI18N

        javax.swing.GroupLayout mainPanel_Layout = new javax.swing.GroupLayout(mainPanel_);
        mainPanel_.setLayout(mainPanel_Layout);
        mainPanel_Layout.setHorizontalGroup(
            mainPanel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel_Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_dots)
                .addGap(185, 185, 185))
            .addGroup(mainPanel_Layout.createSequentialGroup()
                .addGroup(mainPanel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel_Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(updateProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel_Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(updateNumberes)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        mainPanel_Layout.setVerticalGroup(
            mainPanel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel_Layout.createSequentialGroup()
                .addGroup(mainPanel_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel_Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(loading))
                    .addGroup(mainPanel_Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel_dots)))
                .addGap(60, 60, 60)
                .addComponent(updateNumberes)
                .addGap(18, 18, 18)
                .addComponent(updateProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainPanel_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanel_MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_mainPanel_MousePressed

    private void mainPanel_MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanel_MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        //System.out.println( x + " , " + y);
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_mainPanel_MouseDragged

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
                new Splash().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_dots;
    private javax.swing.JLabel loading;
    private javax.swing.JPanel mainPanel_;
    public javax.swing.JLabel updateNumberes;
    public javax.swing.JProgressBar updateProgressBar;
    // End of variables declaration//GEN-END:variables
}
