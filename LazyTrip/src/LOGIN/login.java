package LOGIN;
import com.formdev.flatlaf.FlatLightLaf;



/**
 *
 * @author DAM2
 */
public class login extends javax.swing.JPanel {
    public login() {
        FlatLightLaf.setup();
        initComponents();
       
       
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        TituloLogin = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        textoMail = new javax.swing.JTextField();
        titulo2 = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        campoPassword = new javax.swing.JPasswordField();
        botonSesion = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setBackground(new java.awt.Color(255, 255, 255));

        TituloLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloLogin.setForeground(new java.awt.Color(0, 0, 153));
        TituloLogin.setText("Tus viajes, siempre contigo");

        subtitulo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(153, 153, 153));
        subtitulo.setText("Accede a tus planes, itinerarios y fotografías.");

        textoMail.setText("maria@ejemplo.com");

        titulo2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        titulo2.setForeground(new java.awt.Color(153, 153, 153));
        titulo2.setText("CORREO ELECTRÓNICO");

        titulo3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        titulo3.setForeground(new java.awt.Color(153, 153, 153));
        titulo3.setText("CONTRASEÑA");

        campoPassword.setText("jPasswordField1");

        botonSesion.setBackground(new java.awt.Color(0, 0, 204));
        botonSesion.setForeground(new java.awt.Color(255, 255, 255));
        botonSesion.setText("Iniciar sesión -->");
        botonSesion.addActionListener(this::botonSesionActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(422, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(titulo2)
                        .addComponent(TituloLogin)
                        .addComponent(campoPassword)
                        .addComponent(textoMail)
                        .addComponent(botonSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(subtitulo)
                    .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(401, 401, 401))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(TituloLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(titulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoMail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TituloLogin;
    private javax.swing.JButton botonSesion;
    private javax.swing.JPasswordField campoPassword;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JTextField textoMail;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    // End of variables declaration//GEN-END:variables
}
