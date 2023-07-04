/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cancion;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Compositor;
import javax.swing.JOptionPane;

/**
 *
 * @author SOPORTETICS
 */
public class VentanaCrearCancion extends javax.swing.JInternalFrame {

    private ControladorCompositor controladorCompositor;

    /**
     * Creates new form VentanaCrearDisco
     */
    public VentanaCrearCancion(ControladorCompositor controladorCompositor) {
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
        txtNumComposicion = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoCancion = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtLetra = new javax.swing.JTextField();
        btnRegistrarDisco = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        btnCancelarSeleccion = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();

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

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel1.setText("Datos del Compositor");

        jLabel2.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel2.setText("Codigo");

        jLabel3.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel8.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel8.setText("Numero de composiciones");

        txtCodigo.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombre.setEnabled(false);

        txtApellido.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtApellido.setEnabled(false);

        txtNumComposicion.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNumComposicion.setEnabled(false);

        btnSalir.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel5.setText("Registrar Cancion");

        jLabel6.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel6.setText("Codigo");

        jLabel7.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel7.setText("Titulo");

        jLabel9.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel9.setText("Letra");

        txtCodigoCancion.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtCodigoCancion.setEnabled(false);

        txtTitulo.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtTitulo.setEnabled(false);

        txtLetra.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtLetra.setEnabled(false);

        btnRegistrarDisco.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnRegistrarDisco.setText("Registrar disco");
        btnRegistrarDisco.setEnabled(false);
        btnRegistrarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarDiscoActionPerformed(evt);
            }
        });

        btnSeleccionar.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setEnabled(false);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnCancelarSeleccion.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnCancelarSeleccion.setText("Cancelar seleccion");
        btnCancelarSeleccion.setEnabled(false);
        btnCancelarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarSeleccionActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel10.setText("Duracion");

        txtDuracion.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtDuracion.setEnabled(false);

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
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBuscar)
                                        .addGap(207, 207, 207)
                                        .addComponent(btnSalir))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                                    .addComponent(txtNombre)
                                                    .addComponent(txtApellido))
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnSeleccionar)
                                                    .addComponent(btnCancelarSeleccion)))
                                            .addComponent(txtNumComposicion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrarDisco)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtLetra)
                    .addComponent(txtTitulo)
                    .addComponent(txtDuracion)
                    .addComponent(txtCodigoCancion))
                .addGap(60, 60, 60))
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
                            .addComponent(txtNumComposicion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(btnSalir)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCodigoCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarSeleccion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtLetra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistrarDisco)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                txtNumComposicion.setText(String.valueOf(compositor.getNumeroDeComposiciones()));
                btnSeleccionar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(this, "El compositor con el codigo " + codigo + " no ha sido encontrado!");
                limpiarCamposCompositor();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha ingresado ningun codigo");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegistrarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarDiscoActionPerformed

        int codigo = Integer.parseInt(txtCodigo.getText());
        Compositor compositor = controladorCompositor.buscarCompositor(codigo);

        if (validarCamposCancion()) {
            String titulo = txtTitulo.getText();
            int codigoCancion = Integer.parseInt(txtCodigoCancion.getText());
            String letra = txtLetra.getText();
            double duracion = Double.parseDouble(txtDuracion.getText());
            controladorCompositor.agregarCancion(compositor, codigoCancion, titulo, letra, duracion);
            JOptionPane.showMessageDialog(this, "La cancion " + titulo + " a sido ingresada exitosamente :)");
            cerrarPantalla();
        } else {
            JOptionPane.showMessageDialog(this, "CAMPOS OBLIGATORIOS POR LLENAR");
        }


    }//GEN-LAST:event_btnRegistrarDiscoActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        if (!txtCodigo.getText().isEmpty()) {
            int codigoIngresado = Integer.parseInt(txtCodigo.getText());
            Compositor compositor = controladorCompositor.buscarCompositor(codigoIngresado);

            if (compositor != null) {
                if (compositor.getNombre().equals(txtNombre.getText()) && compositor.getApellido().equals(txtApellido.getText())) {
                    txtCodigo.setEnabled(false);
                    btnCancelarSeleccion.setEnabled(true);
                    btnSeleccionar.setEnabled(false);
                    enableCancion(true);
                    btnBuscar.setEnabled(false);

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
        enableCancion(false);
        btnBuscar.setEnabled(true);

    }//GEN-LAST:event_btnCancelarSeleccionActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrarPantalla();
    }//GEN-LAST:event_formInternalFrameClosing

    private boolean validarCamposCancion() {
        if (txtTitulo.getText().isEmpty()
                || txtCodigoCancion.getText().isEmpty()
                || txtLetra.getText().isEmpty()
                || txtDuracion.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    private void cerrarPantalla() {
        limpiarCamposCompositor();
        limpiarCamposCancion();
        enableCancion(false);
        txtCodigo.setEnabled(true);
        btnSeleccionar.setEnabled(false);
        btnCancelarSeleccion.setEnabled(false);
        btnBuscar.setEnabled(true);

    }

    private void limpiarCamposCompositor() {
        txtCodigo.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        txtNumComposicion.setText("");
    }

    private void limpiarCamposCancion() {
        txtCodigoCancion.setText("");
        txtTitulo.setText("");
        txtLetra.setText("");
        txtDuracion.setText("");
    }

    private void enableCancion(boolean val) {
        txtTitulo.setEnabled(val);
        txtCodigoCancion.setEnabled(val);
        txtLetra.setEnabled(val);
        txtDuracion.setEnabled(val);
        btnRegistrarDisco.setEnabled(val);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarSeleccion;
    private javax.swing.JButton btnRegistrarDisco;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
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
    private javax.swing.JTextField txtCodigoCancion;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtLetra;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumComposicion;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
