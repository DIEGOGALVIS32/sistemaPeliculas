
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    guia.metodo obj = new guia.metodo();
    // interfazRegistros obj = new interfazRegistros();

    public static String user = null, pass = null, direq = null, apelliq = null, nomq = null, barrq = null;
    String usuarios2[] = new String[1];
    String claves2[] = new String[1];
    String apellidos[] = new String[1];
    String nombres[] = new String[1];
    String direccion[] = new String[1];
    String barrio[] = new String[1];
    int cedula[] = new int[1];
    int celular[] = new int[1];
    public static String usuarios[] = {"antuan", "wilmer", "diego", "marcos", "myke", "messi", "james", "cristiano", "juan", "maicol"};
    String clave[] = {"antuan2", "123", "1234", "12345", "myke10", "messi20", "j20", "cris30", "juanpato", "maic100"};

    public static String apellidosq[] = {"RODRIGUEZ", "DOMINGUEZ", "GOMEZ", "GALVIS", "ROMERO", "GARCIA", "HERNANDEZ", "PEREZ", "VALENCIA", "SUAREZ"};
    public static String nombresq[] = {"ANTUAN", "WILMER", "DIEGO", "MARCOS", "MYKE", "MESSI", "JAMES", "CRISTIANO", "JUAN", "MAICOL"};
    public static String direccionq[] = {"CALLE X#XX-121", "CALLE X#XX-122", "CALLE X#XX-123", "CALLE X#XX-124", "CALLE X#XX-125", "CALLE X#XX-126", "CALLE X#XX-127", "CALLE X#XX-128", "CALLE X#XX-129", "CALLE X#XX-130"};
    public static String barrioq[] = {"XXXXX1", "XXXXX2", "XXXXX3", "XXXXX4", "XXXXX5", "XXXXX6", "XXXXX7", "XXXXX8", "XXXXX9", "XXXXX10"};
    public static String userLbl = null;

    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        contraseña.setEchoChar('◍');
        getContentPane().setBackground(Color.white);
        this.setTitle("Inicia Sesion u Registrate || GemeTech MusPeli");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrar = new javax.swing.JLabel();
        login1 = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();
        login2 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        iniciar = new javax.swing.JButton();
        contraseña = new javax.swing.JPasswordField();
        regPass = new javax.swing.JTextField();
        regUser = new javax.swing.JTextField();
        reg1 = new javax.swing.JLabel();
        reg2 = new javax.swing.JLabel();
        guarReg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        reg3 = new javax.swing.JLabel();
        reg4 = new javax.swing.JLabel();
        regNom = new javax.swing.JTextField();
        regApe = new javax.swing.JTextField();
        reg5 = new javax.swing.JLabel();
        reg6 = new javax.swing.JLabel();
        reg7 = new javax.swing.JLabel();
        reg8 = new javax.swing.JLabel();
        regCed = new javax.swing.JTextField();
        regDir = new javax.swing.JTextField();
        regBarrio = new javax.swing.JTextField();
        regCel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrar.png"))); // NOI18N
        mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarMouseClicked(evt);
            }
        });

        login1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/images.png"))); // NOI18N
        login1.setText("jLabel1");

        ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ocultar.png"))); // NOI18N
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });

        login2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/password (1).png"))); // NOI18N
        login2.setText("jLabel2");

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lgin (1).png"))); // NOI18N
        iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarMouseClicked(evt);
            }
        });
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });

        regPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPassActionPerformed(evt);
            }
        });

        regUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regUserActionPerformed(evt);
            }
        });

        reg1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        reg1.setText("USUARIO");

        reg2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        reg2.setText("CLAVE");

        guarReg.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        guarReg.setText("REGISTRARME");
        guarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guarRegActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("____________________________________________________________________________________________________________________________________________");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("¿No estas registrado? Registrate aqui");

        reg3.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        reg3.setText("NOMBRE");

        reg4.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        reg4.setText("APELLIDO");

        regNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regNomActionPerformed(evt);
            }
        });

        regApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regApeActionPerformed(evt);
            }
        });

        reg5.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        reg5.setText("CEDULA");

        reg6.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        reg6.setText("DIRECCION");

        reg7.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        reg7.setText("BARRIO");

        reg8.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        reg8.setText("CELULAR");

        regCed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regCedActionPerformed(evt);
            }
        });

        regDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regDirActionPerformed(evt);
            }
        });

        regBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBarrioActionPerformed(evt);
            }
        });

        regCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regCelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(login1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(login2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(mostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ocultar)
                .addGap(153, 153, 153))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(reg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(reg2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(reg3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(reg4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(regPass, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(regUser, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(regApe, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(regNom, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(reg7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(reg8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(reg5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(reg6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(guarReg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(regDir, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regCed, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regCel, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(login2)
                        .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrar)
                            .addComponent(ocultar))
                        .addGap(20, 20, 20)))
                .addComponent(iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reg5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reg6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(regUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reg1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(regPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reg2))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(reg3)
                                    .addComponent(regNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(regBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(reg7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reg4)
                            .addComponent(regApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reg8)
                            .addComponent(regCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(guarReg)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed

    }//GEN-LAST:event_usuarioActionPerformed
    public static ArrayList<String> users = new ArrayList<>();
    public static ArrayList<String> solousers = new ArrayList<>();
    public static boolean val = false;

    private void iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMouseClicked

        for (int i = 0; i < usuarios.length; i++) {
            if (usuario.getText().equals(usuarios[i]) && contraseña.getText().equals(clave[i])) {
                user = usuarios[i];
                pass = clave[i];
                nomq = nombresq[i];
                apelliq = apellidosq[i];
                direq = direccionq[i];
                barrq = barrioq[i];
            }
        }
        solousers.add(user);
        users.add(nomq);
        users.add(apelliq);
        users.add(direq);
        users.add(barrq);

        if ((user == null ? usuario.getText() == null : user.equals(usuario.getText())) && (pass == null ? contraseña.getText() == null : pass.equals(contraseña.getText()))) {
            if ("antuan".equals(user) || "wilmer".equals(user) || "diego".equals(user)) {
                JOptionPane.showMessageDialog(this, "Bienvenido " + user + " ingresastes como admin");
                inicial in = new inicial();
                in.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Bienvenido " + user + " ingresastes como usuario");
                inUserAl iu = new inUserAl();
                iu.setVisible(true);
                this.setVisible(false);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error el usuario o contraseña son incorrectos ");
        }
        val = true;
        userLbl = user;
    }//GEN-LAST:event_iniciarMouseClicked

    private void mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarMouseClicked

        mostrar.setVisible(false);
        ocultar.setVisible(true);
        contraseña.setEchoChar((char) 0);


    }//GEN-LAST:event_mostrarMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked

        mostrar.setVisible(true);
        ocultar.setVisible(false);
        contraseña.setEchoChar('◍');

    }//GEN-LAST:event_ocultarMouseClicked

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed

    }//GEN-LAST:event_iniciarActionPerformed

    private void regPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regPassActionPerformed

    private void regUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regUserActionPerformed

    private void guarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guarRegActionPerformed

        String usuario5 = regUser.getText();
        String clave5 = regPass.getText();

        usuarios2[0] = regUser.getText();
        claves2[0] = regPass.getText();
        apellidos[0] = regApe.getText();
        nombres[0] = regNom.getText();
        direccion[0] = regDir.getText();
        barrio[0] = regBarrio.getText();
        /* cedula[0]=Integer.parseInt(regCed.getText());
        celular[0]=Integer.parseInt(regCel.getText()); ERROR DE INTEGER CUANDO COMPILA*/

        for (int i = 0; i < usuarios2.length; i++) {

            if (regUser.getText().equals(usuarios2[i]) && regPass.getText().equals(claves2[i])) {
                user = usuarios2[i];
                pass = claves2[i];

            }

        }
        JOptionPane.showMessageDialog(rootPane, "Te has registrado con exito señor(a)" + " " + nombres[0] + " " + apellidos[0] + ", ahora inicia sesion", "Registro Exitoso", 1);
        regUser.setText("");
        regPass.setText("");
        regApe.setText("");
        regNom.setText("");
        regDir.setText("");
        regBarrio.setText("");
        regCed.setText("");
        regCel.setText("");

    }//GEN-LAST:event_guarRegActionPerformed

    private void regNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regNomActionPerformed

    private void regApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regApeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regApeActionPerformed

    private void regCedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regCedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regCedActionPerformed

    private void regDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regDirActionPerformed

    private void regBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regBarrioActionPerformed

    private void regCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regCelActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton guarReg;
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel login1;
    private javax.swing.JLabel login2;
    private javax.swing.JLabel mostrar;
    private javax.swing.JLabel ocultar;
    private javax.swing.JLabel reg1;
    private javax.swing.JLabel reg2;
    private javax.swing.JLabel reg3;
    private javax.swing.JLabel reg4;
    private javax.swing.JLabel reg5;
    private javax.swing.JLabel reg6;
    private javax.swing.JLabel reg7;
    private javax.swing.JLabel reg8;
    private javax.swing.JTextField regApe;
    private javax.swing.JTextField regBarrio;
    private javax.swing.JTextField regCed;
    private javax.swing.JTextField regCel;
    private javax.swing.JTextField regDir;
    private javax.swing.JTextField regNom;
    private javax.swing.JTextField regPass;
    private javax.swing.JTextField regUser;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables

    private static class metodo {

        public metodo() {
        }
    }
}
