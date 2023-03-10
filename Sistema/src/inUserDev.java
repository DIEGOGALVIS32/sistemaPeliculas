
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author juand
 */
public class inUserDev extends javax.swing.JFrame {

    @SuppressWarnings("static-access")
    public static ArrayList<String> peliculas = new ArrayList<>();
    public static ArrayList<String> fechasPe = new ArrayList<>();
    DefaultListModel listModel = new DefaultListModel();

    public inUserDev() {
        initComponents();
        this.setResizable(false);
        this.setTitle("Centro de devoluciones || GemeTech MusPeli");
        buttonPago.setVisible(false);
        buttonPagoT.setVisible(false);
        this.getContentPane().setBackground(Color.white);
        this.setLocationRelativeTo(null);
        peliculas = prinPelis.peliPres;
        fechasPe = prinPelis.fechaPres;
        System.out.println("PRUEBA 1" + peliculas);
        System.out.println("PRUEBA 1 " + fechasPe);
        if (peliculas.isEmpty() && fechasPe.isEmpty()) {///VALIDAR ARRAYLIST EN GENERAL
            //////MUESTRAS LAS PELICULAS EN LA LISTA
            listModel.add(0, "NADA");
            JOptionPane.showMessageDialog(this, "No tienes prestamos.");
        } else {
            int veces = peliculas.size();
            for (int i = 0; i < veces; i++) {
                listModel.add(i, peliculas.get(i) + " Fecha Limite: " + fechasPe.get(i));
            }
        }
        lista.setModel(listModel);

        if (listModel.get(0) == "NADA") {
            devButton1.setVisible(false);
            devButton.setVisible(false);
        } else {
            devButton1.setVisible(true);
            devButton.setVisible(true);
        }
        System.out.println(peliculas);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        devButton = new javax.swing.JButton();
        buttonPago = new javax.swing.JButton();
        buttonPagoT = new javax.swing.JButton();
        volver = new java.awt.Label();
        devButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setText("??Cual deseas devolver?");

        lista.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lista);

        devButton.setText("DEVOLVER");
        devButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devButtonActionPerformed(evt);
            }
        });

        buttonPago.setText("PAGAR");
        buttonPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPagoActionPerformed(evt);
            }
        });

        buttonPagoT.setText("PAGAR TODO");
        buttonPagoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPagoTActionPerformed(evt);
            }
        });

        volver.setBackground(new java.awt.Color(255, 255, 255));
        volver.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        volver.setText("Volver");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });

        devButton1.setText("DEVOLVER TODO");
        devButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(devButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonPago, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(devButton)
                        .addGap(63, 63, 63)
                        .addComponent(buttonPagoT)
                        .addGap(130, 130, 130))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(devButton)
                            .addComponent(buttonPago)
                            .addComponent(buttonPagoT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(devButton1)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        int multTotal, multDif;
    int multDia = 10000;
    private void devButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devButtonActionPerformed
        LocalDate todaysDate = LocalDate.now();
        String dia1 = fechasPe.get(0);
        int diaLimite = Integer.parseInt(dia1);
        int diaActual = 26 /*todaysDate.getDayOfMonth()*//* MODIFICADOR DE DIA ACTUAL PARA PRUEBAS*/;
        int seleccion = lista.getSelectedIndex();
        System.out.println(seleccion);
        if (!lista.isSelectionEmpty() == true && diaActual <= diaLimite) {
            JOptionPane.showMessageDialog(rootPane, "Has devuelto la pelicula " + lista.getSelectedValue() + " a tiempo");
            listModel.remove(seleccion);
            peliculas.remove(seleccion);
            fechasPe.remove(seleccion);
            System.out.println("PRUEBA 2" + peliculas);
            System.out.println("PRUEBA 2" + fechasPe);

        } else if (lista.isSelectionEmpty() == false && diaActual > diaLimite) {
            multDif = diaActual - diaLimite;
            multTotal = multDif * multDia;
            System.out.println(multTotal);
            int confirm = JOptionPane.showConfirmDialog(rootPane, "Para devolver la Pelicula " + lista.getSelectedValue() + " debes pagar " + multDif + " dias de multa por un valor de: " + multTotal + "\n ??Deseas Pagar?");
            if (confirm == JOptionPane.YES_OPTION) {
                buttonPago.setVisible(true);
                buttonPagoT.setVisible(true);
                devButton.setVisible(false);
                devButton1.setVisible(false);
            } else {
                System.out.println("Ok no pagues");
            }
        }
    }//GEN-LAST:event_devButtonActionPerformed

    private void buttonPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPagoActionPerformed
        if (lista.isSelectionEmpty() == true) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un item a pagar");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Has pagado " + multTotal + " de multa, y has devuelto la pelicula: " + lista.getSelectedValue());
            int seleccion = lista.getSelectedIndex();
            listModel.remove(seleccion);
            peliculas.remove(seleccion);
            fechasPe.remove(seleccion);
        }
    }//GEN-LAST:event_buttonPagoActionPerformed

    private void buttonPagoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPagoTActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Has pagado " + multTotal * listModel.getSize() + " de multa, y has devuelto la pelicula: " + listModel);
        listModel.removeAllElements();
        peliculas.removeAll(fechasPe);
        prinPelis.peliPres.clear();
        prinPelis.fechaPres.clear();
        prinMusi.musiPres.clear();
        prinMusi.fechaPreM.clear();
    }//GEN-LAST:event_buttonPagoTActionPerformed

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        inUserAl iu = new inUserAl();
        iu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverMouseClicked

    private void devButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devButton1ActionPerformed
        LocalDate todaysDate = LocalDate.now();
        String dia1 = fechasPe.get(0);
        int diaLimite = Integer.parseInt(dia1);
        int diaActual = 30 /*todaysDate.getDayOfMonth()*//* MODIFICADOR DE DIA ACTUAL PARA PRUEBAS*/;
        if (diaActual > diaLimite) {
            multDif = diaActual - diaLimite;
            multTotal = multDif * multDia;
            JOptionPane.showMessageDialog(this, "Tienes multas ve y pagalas");
            buttonPago.setVisible(true);
            buttonPagoT.setVisible(true);
            devButton.setVisible(false);
            devButton1.setVisible(false);
        } else {
            listModel.removeAllElements();
            peliculas.removeAll(fechasPe);
            prinPelis.peliPres.clear();
            prinPelis.fechaPres.clear();
            prinMusi.musiPres.clear();
            prinMusi.fechaPreM.clear();
        }
    }//GEN-LAST:event_devButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(inUserDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inUserDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inUserDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inUserDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inUserDev().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPago;
    private javax.swing.JButton buttonPagoT;
    private javax.swing.JButton devButton;
    private javax.swing.JButton devButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lista;
    private java.awt.Label volver;
    // End of variables declaration//GEN-END:variables

}
