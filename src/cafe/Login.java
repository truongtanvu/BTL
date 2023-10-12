
package cafe;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

 
public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tendangnhapField = new javax.swing.JTextField();
        matkhauField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnHuyBo = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rambo Cafe");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 440, 40));

        tendangnhapField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(tendangnhapField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 260, 30));

        matkhauField.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jPanel1.add(matkhauField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 260, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Tên đăng nhập");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Mật khẩu");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invisible.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visible.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, 30));

        btnHuyBo.setBackground(new java.awt.Color(255, 102, 102));
        btnHuyBo.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnHuyBo.setForeground(new java.awt.Color(255, 255, 255));
        btnHuyBo.setText("Hủy Bỏ");
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuyBo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 100, 40));

        btnDangNhap.setBackground(new java.awt.Color(0, 255, 0));
        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnHuyBoActionPerformed
    int xx, xy;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i=0; i<=1;i +=0.1){
            String s = i+"";
            float f = Float.valueOf(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        matkhauField.setEchoChar((char)0);
        jLabel4.setVisible(false);
        jLabel5.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        matkhauField.setEchoChar('*');
        jLabel4.setVisible(true);
        jLabel5.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        if(trongThongTin()){
            String tendangnhap = tendangnhapField.getText();
            String matkhau = String.valueOf(matkhauField.getPassword());
            if(tendangnhap.equals("admin") && matkhau.equals("admin123")){
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);
                dashboard.pack();
                this.dispose();
            }else{
               JOptionPane.showMessageDialog(null, "Sai mật khẩu hoặc tên đăng nhập, vui lòng thử lại","Cảnh báo",2); 
            }
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    
    public boolean trongThongTin(){
        if(tendangnhapField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Bạn chưa điền tên đăng nhập","Cảnh báo",2);
            return false;
        }if(String.valueOf(matkhauField.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Bạn chưa điền mật khẩu","Cảnh báo",2);
            return false;
        }
        return true;
    }
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField matkhauField;
    private javax.swing.JTextField tendangnhapField;
    // End of variables declaration//GEN-END:variables
}
