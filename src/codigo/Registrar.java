/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author felip
 */
public class Registrar extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Conexion conexi = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
    public DefaultTableModel dft;

    public Registrar() {
        initComponents();
        //   estiloTabla();
        mostrarTabla();
        seleccionarTabla();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cCarrera1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bRegistrar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        cContrasena1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cUsuario1 = new javax.swing.JTextField();
        cNombre1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cApellidos1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cNControl = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        comboRol = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistros = new javax.swing.JTable();
        bEliminar = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setAutoscrolls(true);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Regitrar usuarios");

        cCarrera1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCarrera1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tec.png"))); // NOI18N

        bRegistrar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        bRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        bRegistrar.setText("Registrar");
        bRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(0, 0, 0));
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Carrera");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre de usuario");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre");

        cUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUsuario1ActionPerformed(evt);
            }
        });

        cNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNombre1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Apellidos");

        cApellidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cApellidos1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Rol");

        cNControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNControlActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("N° Control");

        comboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "alumno" }));
        comboRol.setSelectedItem(null);

        tablaRegistros.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tablaRegistros.setForeground(new java.awt.Color(0, 0, 0));
        tablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaRegistros.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaRegistros.setGridColor(new java.awt.Color(204, 0, 0));
        tablaRegistros.setSelectionBackground(new java.awt.Color(255, 153, 0));
        tablaRegistros.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tablaRegistros);

        bEliminar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        bEliminar.setForeground(new java.awt.Color(0, 0, 0));
        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        bActualizar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        bActualizar.setForeground(new java.awt.Color(0, 0, 0));
        bActualizar.setText("Actualizar");
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(264, 264, 264))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(bActualizar)
                        .addGap(39, 39, 39)
                        .addComponent(bEliminar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(cUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel10)
                                                .addGap(119, 119, 119)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cNControl, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                                    .addComponent(cCarrera1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                                    .addComponent(comboRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(cApellidos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cContrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(109, 109, 109)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(282, 282, 282))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cContrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cApellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cCarrera1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cNControl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboRol, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bEliminar)
                            .addComponent(bRegistrar)
                            .addComponent(bActualizar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }//GEN-LAST:event_botonSalirActionPerformed
    public void mostrarTabla() {
        DefaultTableModel modelo = new DefaultTableModel();
        rs = Conexion.getTabla("select *from usuario");
        //se asignan los nombre de la columna
        modelo.setColumnIdentifiers(new Object[]
        {
            "usuario", "contraseña", "nombre", "apellidos", "carrera", "N. Control", "Puntuación", "rol"
        });

        try
        {
            while (rs.next())
            {
                modelo.addRow(new Object[]
                {
                    rs.getString("usuario"), rs.getString("contrasena"), rs.getString("nombre"), rs.getString("apellidos"), rs.getString("carrera"), rs.getString("numeroControl"), rs.getString("puntuacion"), rs.getString("rol")
                });

            }
            tablaRegistros.setModel(modelo);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        //seleccionarTabla();
    }

    private void seleccionarTabla() {
        tablaRegistros.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                limpiar();
                int row = tablaRegistros.rowAtPoint(e.getPoint());

                cUsuario1.setText(tablaRegistros.getValueAt(row, 0).toString());
                cContrasena1.setText(tablaRegistros.getValueAt(row, 1).toString());
                cNombre1.setText(tablaRegistros.getValueAt(row, 2).toString());
                cApellidos1.setText(tablaRegistros.getValueAt(row, 3).toString());
                cCarrera1.setText(tablaRegistros.getValueAt(row, 4).toString());
                cNControl.setText(tablaRegistros.getValueAt(row, 5).toString());
                comboRol.setSelectedItem(tablaRegistros.getValueAt(row, 7).toString());

            }
        });

    }

    private void limpiar() {
        cUsuario1.setText("");
        cContrasena1.setText("");
        cNombre1.setText("");
        cApellidos1.setText("");
        cCarrera1.setText("");
        cNControl.setText("");
        comboRol.setSelectedItem(null);

    }
    private void bRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarActionPerformed
        Connection conexion = null;
        int resultado = 0;
        try
        {
            conexion = conexi.getConnection();
            ps = conexion.prepareStatement("insert into usuario(usuario,contrasena,nombre,apellidos,carrera,numeroControl,rol)values(?,?,?,?,?,?,?)");
            ps.setString(1, cUsuario1.getText());
            ps.setString(2, cContrasena1.getText());
            ps.setString(3, cNombre1.getText());
            ps.setString(4, cApellidos1.getText());
            ps.setString(5, cCarrera1.getText());
            ps.setString(6, cNControl.getText());
            ps.setString(7, comboRol.getSelectedItem().toString());
            if (!"".equals(cUsuario1.getText()) && !"".equals(cContrasena1.getText()))
            {
                resultado = ps.executeUpdate(); //ejecutamos la inserccion
            }
            if ((resultado > 0))
            {
                JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
                cUsuario1.setText("");
                cContrasena1.setText("");
                cNombre1.setText("");
                cApellidos1.setText("");
                cCarrera1.setText("");
                cNControl.setText("");
                mostrarTabla();
            } else
            {
                JOptionPane.showMessageDialog(null, "Verifique que los datos sean correctos");

            }
            conexion.close();

        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Verifique que los datos sean correctos");
        }
        limpiar();
    }//GEN-LAST:event_bRegistrarActionPerformed

    private void cCarrera1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCarrera1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCarrera1ActionPerformed

    private void cUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cUsuario1ActionPerformed

    private void cNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNombre1ActionPerformed

    private void cApellidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cApellidos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cApellidos1ActionPerformed

    private void cNControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNControlActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        try
        {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("delete from usuario where usuario=?");
            ps.setString(1, cUsuario1.getText());
            int resultado = ps.executeUpdate();
            if (resultado > 0)
            {
                JOptionPane.showMessageDialog(null, "Eliminacion correcta");
                mostrarTabla();
            } else
            {
                JOptionPane.showMessageDialog(null, "No se realizo la eliminación de los datos");
            }
            conexion.close();
        } catch (Exception e)
        {
            System.err.println(e);
        }
        limpiar();
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
        try
        {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("update usuario set contrasena=?,nombre=?,apellidos=?,carrera=?,numeroControl=?,rol=? where usuario=?");
            ps.setString(1, cContrasena1.getText());
            ps.setString(2, cNombre1.getText());
            ps.setString(3, cApellidos1.getText());
            ps.setString(4, cCarrera1.getText());
            ps.setString(5, cNControl.getText());
            ps.setString(6, comboRol.getSelectedItem().toString());
            ps.setString(7, cUsuario1.getText());
            int resultado = ps.executeUpdate();
            if ((resultado > 0) && (!"".equals(cUsuario1.getText()) && !"".equals(cContrasena1.getText())))
            {
                JOptionPane.showMessageDialog(null, "Datos actualizados");
                limpiar();
            } else
            {
                JOptionPane.showMessageDialog(null, "No fue posible actualizar los datos");
            }
            conexion.close();
        } catch (Exception e)
        {
            System.err.println(e);
        }
        mostrarTabla();
        limpiar();
    }//GEN-LAST:event_bActualizarActionPerformed

    private void limpiarCajasLogin() {
        cCarrera1.setText("");
        cContrasena1.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bRegistrar;
    private javax.swing.JButton botonSalir;
    public javax.swing.JTextField cApellidos1;
    public javax.swing.JTextField cCarrera1;
    public javax.swing.JPasswordField cContrasena1;
    public javax.swing.JTextField cNControl;
    public javax.swing.JTextField cNombre1;
    public javax.swing.JTextField cUsuario1;
    public javax.swing.JComboBox<String> comboRol;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRegistros;
    // End of variables declaration//GEN-END:variables
}
