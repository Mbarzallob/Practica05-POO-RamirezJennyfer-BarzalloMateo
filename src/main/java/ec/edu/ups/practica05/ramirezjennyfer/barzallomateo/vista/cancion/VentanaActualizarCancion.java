/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cancion;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cancion;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Compositor;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author SOPORTETICS
 */
public class VentanaActualizarCancion extends javax.swing.JInternalFrame {

    private ControladorCompositor controladorCompositor;

    /**
     * Creates new form VentanaActualizarDisco
     */
    public VentanaActualizarCancion(ControladorCompositor controladorCompositor) {
        initComponents();
        this.controladorCompositor = controladorCompositor;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNumComposiciones = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtLetra = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        btnCancelarSeleccion = new javax.swing.JButton();
        cbxCancion = new javax.swing.JComboBox<>();
        btnActualizarCancion = new javax.swing.JButton();
        txtDuracion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setText("Datos del cantante");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel8.setText("Numero de composiciones");

        txtNombre.setEnabled(false);

        txtApellido.setEnabled(false);

        txtNumComposiciones.setEnabled(false);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setText("Registrar disco");

        jLabel6.setText("Codigo");

        jLabel7.setText("Titulo");

        jLabel9.setText("Letra");

        txtTitulo.setEnabled(false);

        txtLetra.setEnabled(false);

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setEnabled(false);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnCancelarSeleccion.setText("Cancelar seleccion");
        btnCancelarSeleccion.setEnabled(false);
        btnCancelarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSeleccionActionPerformed(evt);
            }
        });

        cbxCancion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canciones" }));
        cbxCancion.setEnabled(false);
        cbxCancion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxCancionMouseClicked(evt);
            }
        });
        cbxCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCancionActionPerformed(evt);
            }
        });

        btnActualizarCancion.setText("Actualizar cancion");
        btnActualizarCancion.setEnabled(false);
        btnActualizarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCancionActionPerformed(evt);
            }
        });

        txtDuracion.setEnabled(false);

        jLabel10.setText("Duracion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscar)
                                    .addComponent(txtNumComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(txtNombre)
                                            .addComponent(txtApellido))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnSeleccionar)
                                                    .addComponent(btnCancelarSeleccion))
                                                .addGap(54, 54, 54)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel10)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(137, 137, 137)
                                                .addComponent(btnSalir)))))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(173, 173, 173))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLetra)
                            .addComponent(txtTitulo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnActualizarCancion)
                                    .addComponent(cbxCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDuracion))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeleccionar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtNumComposiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarCancion)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbxCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarSeleccion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cerrarPantalla();
        this.setVisible(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!txtCodigo.getText().isEmpty()) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            Compositor compositor = controladorCompositor.buscarCompositor(codigo);
            if (compositor != null) {
                txtApellido.setText(compositor.getApellido());
                txtNombre.setText(compositor.getNombre());
                txtNumComposiciones.setText(String.valueOf(compositor.getNumeroDeComposiciones()));
                btnSeleccionar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(this, "El cantante con el codigo " + codigo + " no ha sido encontrado!");
                limpiarCamposCompositor();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha ingresado ningun codigo");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        if (!txtCodigo.getText().isEmpty()) {
            int codigoIngresado = Integer.parseInt(txtCodigo.getText());
            Compositor compositor = controladorCompositor.buscarCompositor(codigoIngresado);

            if (compositor != null) {
                if (compositor.getNombre().equals(txtNombre.getText()) && compositor.getApellido().equals(txtApellido.getText())) {
                    txtCodigo.setEnabled(false);
                    btnCancelarSeleccion.setEnabled(true);
                    btnSeleccionar.setEnabled(false);
                    btnBuscar.setEnabled(false);
                    cbxCancion.setEnabled(true);
                    enableCancion(true);
                    cargarDatosCombo();

                } else {
                    JOptionPane.showMessageDialog(this, "El código ha sido cambiado");
                }
            } else {
                JOptionPane.showMessageDialog(this, "El código ha sido cambiado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "El código ha sido cambiado");
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnCancelarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarSeleccionActionPerformed
        txtCodigo.setEnabled(true);
        btnSeleccionar.setEnabled(true);
        btnCancelarSeleccion.setEnabled(false);
        btnBuscar.setEnabled(true);
        enableCancion(false);
    }//GEN-LAST:event_btnCancelarSeleccionActionPerformed

    private void cbxCancionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCancionMouseClicked

        cargarDatosCombo();

    }//GEN-LAST:event_cbxCancionMouseClicked

    private void btnActualizarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCancionActionPerformed
        if (validarCamposCancion()) {
            Compositor compositor = controladorCompositor.buscarCompositor(Integer.parseInt(txtCodigo.getText()));
            DefaultComboBoxModel<Cancion> modelo = (DefaultComboBoxModel) cbxCancion.getModel();
            Cancion cancion = (Cancion) modelo.getSelectedItem();
            int codigo = cancion.getCodigo();
            String titulo = txtTitulo.getText();
            String  letra = txtLetra.getText();
            double duracion = cancion.getTiempoEnMinutos();
            controladorCompositor.actualizarCancion(compositor, codigo, titulo, letra,duracion);
            JOptionPane.showMessageDialog(this, "La cancion con el codigo " + codigo + " ha sido registrado exitosamente!");
            enableCancion(false);
            txtCodigo.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnCancelarSeleccion.setEnabled(false);
            limpiarCamposCompositor();
            limpiarCamposCancion();
        } else {
            JOptionPane.showMessageDialog(this, "CAMPOS OBLIGATORIOS POR LLENAR");
        }

    }//GEN-LAST:event_btnActualizarCancionActionPerformed

    private void cbxCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCancionActionPerformed
        if (cbxCancion.getSelectedItem() != null) {
            Cancion cancion = (Cancion) cbxCancion.getSelectedItem();
            txtLetra.setText(cancion.getLetra());
            txtTitulo.setText(cancion.getTitulo());
            txtDuracion.setText(String.valueOf(cancion.getTiempoEnMinutos()));
        }
    }//GEN-LAST:event_cbxCancionActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrarPantalla();
    }//GEN-LAST:event_formInternalFrameClosing

    private void cerrarPantalla() {
        limpiarCamposCompositor();
        limpiarCamposCancion();
        txtCodigo.setEnabled(true);
        btnSeleccionar.setEnabled(false);
        btnCancelarSeleccion.setEnabled(false);
        btnBuscar.setEnabled(true);
        cbxCancion.setEnabled(false);
        cbxCancion.removeAllItems();
        enableCancion(false);

    }

    private void limpiarCamposCompositor() {
        txtCodigo.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        txtNumComposiciones.setText("");
    }

    private void limpiarCamposCancion() {
        txtTitulo.setText("");
        txtLetra.setText("");
        txtDuracion.setText("");
        cbxCancion.removeAllItems();
    }

    private void cargarDatosCombo() {
        DefaultComboBoxModel<Cancion> modelo = (DefaultComboBoxModel) cbxCancion.getModel();
        Compositor compositor = this.controladorCompositor.buscarCompositor(Integer.parseInt(txtCodigo.getText()));
        modelo.removeAllElements();
        List<Cancion> listaCanciones = compositor.listarCanciones();

        for (Cancion cancion : listaCanciones) {
            modelo.addElement(cancion);
        }
        Cancion cancion = (Cancion) modelo.getSelectedItem();
        txtTitulo.setText(cancion.getTitulo());
        txtLetra.setText(cancion.getLetra());
        txtDuracion.setText(String.valueOf(cancion.getTiempoEnMinutos()));
    }

    private void enableCancion(boolean val) {
        cbxCancion.setEnabled(val);
        txtTitulo.setEnabled(val);
        txtLetra.setEnabled(val);
        txtDuracion.setEnabled(val);
        btnActualizarCancion.setEnabled(val);
    }

    private boolean validarCamposCancion() {
        if (txtTitulo.getText().isEmpty() || txtLetra.getText().isEmpty() || txtDuracion.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCancion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarSeleccion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cbxCancion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtLetra;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumComposiciones;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
