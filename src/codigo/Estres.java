/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package codigo;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis David
 */
public class Estres extends javax.swing.JPanel {

    /**
     * Creates new form Estres
     */
    public Registrar registrar = new Registrar();
    public Puntuacion puntu = new Puntuacion();
    String nombre;

    public Estres() {
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

        panelEstres = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEstres.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Esta es la ventana de estres");

        jButton2.setBackground(new java.awt.Color(255, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Estres");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Depresion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Ansiedad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setText("Realizar Test");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEstresLayout = new javax.swing.GroupLayout(panelEstres);
        panelEstres.setLayout(panelEstresLayout);
        panelEstresLayout.setHorizontalGroup(
            panelEstresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstresLayout.createSequentialGroup()
                .addGroup(panelEstresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstresLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(3, 3, 3)
                        .addComponent(jButton3)
                        .addGap(4, 4, 4)
                        .addComponent(jButton1))
                    .addGroup(panelEstresLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(panelEstresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(241, 241, 241))
        );
        panelEstresLayout.setVerticalGroup(
            panelEstresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstresLayout.createSequentialGroup()
                .addGroup(panelEstresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(95, 95, 95)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addComponent(jButton5)
                .addContainerGap())
        );

        add(panelEstres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 540));
    }// </editor-fold>//GEN-END:initComponents
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Depresion d1 = new Depresion();
        d1.setSize(690, 540);
        d1.setLocation(0, 0);

        panelEstres.removeAll();
        panelEstres.add(d1, BorderLayout.CENTER);
        panelEstres.revalidate();
        panelEstres.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ansiedad a1 = new Ansiedad();
        a1.setSize(690, 540);
        a1.setLocation(0, 0);

        panelEstres.removeAll();
        panelEstres.add(a1, BorderLayout.CENTER);
        panelEstres.revalidate();
        panelEstres.repaint();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        TestB test = new TestB();
        JOptionPane.showMessageDialog(null, "Realiza el test cuidadosamente: " + getNombre());
        test.setCuenta(getNombre());
        test.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelEstres;
    // End of variables declaration//GEN-END:variables
}