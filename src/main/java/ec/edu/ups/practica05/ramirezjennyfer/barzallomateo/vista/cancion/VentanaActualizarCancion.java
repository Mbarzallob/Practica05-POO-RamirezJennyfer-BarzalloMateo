/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cancion;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.disco.*;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Disco;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author SOPORTETICS
 */
public class VentanaActualizarCancion extends javax.swing.JInternalFrame {

    private ControladorCantante controladorCantante;

    /**
     * Creates new form VentanaActualizarDisco
     */
    public VentanaActualizarCancion(ControladorCantante controladorCantante) {
        initComponents();
        this.controladorCantante = controladorCantante;
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
        jLabel10 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombreArtistico = new javax.swing.JTextField();
        txtGeneroMusical = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreDisco = new javax.swing.JTextField();
        txtAnioLanzamiento = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        btnCancelarSeleccion = new javax.swing.JButton();
        cbxDisco = new javax.swing.JComboBox<>();
        btnActualizarDisco = new javax.swing.JButton();

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

        jLabel8.setText("Nombre artistico");

        jLabel10.setText("Genero musical");

        txtNombre.setEnabled(false);

        txtApellido.setEnabled(false);

        txtNombreArtistico.setEnabled(false);

        txtGeneroMusical.setEnabled(false);

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

        jLabel7.setText("Nombre");

        jLabel9.setText("Año de lanzamiento");

        txtNombreDisco.setEnabled(false);

        txtAnioLanzamiento.setEnabled(false);

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

        cbxDisco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Discos" }));
        cbxDisco.setEnabled(false);
        cbxDisco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxDiscoMouseClicked(evt);
            }
        });
        cbxDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDiscoActionPerformed(evt);
            }
        });

        btnActualizarDisco.setText("Actualizar disco");
        btnActualizarDisco.setEnabled(false);
        btnActualizarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDiscoActionPerformed(evt);
            }
        });

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
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscar)
                                    .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                            .addComponent(txtNombre)
                                            .addComponent(txtApellido)
                                            .addComponent(txtGeneroMusical))
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
                                                    .addComponent(jLabel9)))
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
                            .addComponent(txtAnioLanzamiento)
                            .addComponent(txtNombreDisco)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnActualizarDisco))
                                .addGap(0, 0, Short.MAX_VALUE)))
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
                            .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbxDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombreDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarSeleccion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtAnioLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarDisco)
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
            Cantante cantante = controladorCantante.buscarCantante(codigo);
            if (cantante != null) {
                txtApellido.setText(cantante.getApellido());
                txtGeneroMusical.setText(cantante.getGeneroMusical());
                txtNombre.setText(cantante.getNombre());
                txtNombreArtistico.setText(cantante.getNombreArtistico());
                btnSeleccionar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(this, "El cantante con el codigo " + codigo + " no ha sido encontrado!");
                limpiarCamposCantante();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se ha ingresado ningun codigo");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        if (!txtCodigo.getText().isEmpty()) {
            int codigoIngresado = Integer.parseInt(txtCodigo.getText());
            Cantante cantante = controladorCantante.buscarCantante(codigoIngresado);

            if (cantante != null) {
                if (cantante.getNombre().equals(txtNombre.getText()) && cantante.getApellido().equals(txtApellido.getText())) {
                    txtCodigo.setEnabled(false);
                    btnCancelarSeleccion.setEnabled(true);
                    btnSeleccionar.setEnabled(false);
                    btnBuscar.setEnabled(false);
                    cbxDisco.setEnabled(true);
                    enableDisco(true);
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
        enableDisco(false);
    }//GEN-LAST:event_btnCancelarSeleccionActionPerformed

    private void cbxDiscoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxDiscoMouseClicked

        cargarDatosCombo();

    }//GEN-LAST:event_cbxDiscoMouseClicked

    private void btnActualizarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDiscoActionPerformed
        if (validarCamposDisco()) {
            Cantante cantante = controladorCantante.buscarCantante(Integer.parseInt(txtCodigo.getText()));
            DefaultComboBoxModel<Disco> modelo = (DefaultComboBoxModel) cbxDisco.getModel();
            Disco disco = (Disco) modelo.getSelectedItem();
            int codigo = disco.getCodigo();
            String nombreDisco = txtNombreDisco.getText();
            int anioLanza = Integer.parseInt(txtAnioLanzamiento.getText());
            controladorCantante.actualizarDisco(cantante, codigo, nombreDisco, anioLanza);
            JOptionPane.showMessageDialog(this, "El disco con el codigo " + codigo + " ha sido registrado exitosamente!");
            enableDisco(false);
            txtCodigo.setEnabled(true);
            btnBuscar.setEnabled(true);
            btnCancelarSeleccion.setEnabled(false);
            limpiarCamposCantante();
            limpiarCamposDisco();
        } else {
            JOptionPane.showMessageDialog(this, "CAMPOS OBLIGATORIOS POR LLENAR");
        }

    }//GEN-LAST:event_btnActualizarDiscoActionPerformed

    private void cbxDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDiscoActionPerformed
         if (cbxDisco.getSelectedItem() != null) {
            Disco disco = (Disco) cbxDisco.getSelectedItem();
            txtAnioLanzamiento.setText(String.valueOf(disco.getAnioDeLanzamiento()));
            txtNombreDisco.setText(disco.getNombre());
        }
    }//GEN-LAST:event_cbxDiscoActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        cerrarPantalla();
    }//GEN-LAST:event_formInternalFrameClosing

    private void cerrarPantalla() {
        limpiarCamposCantante();
        limpiarCamposDisco();
        txtCodigo.setEnabled(true);
        btnSeleccionar.setEnabled(false);
        btnCancelarSeleccion.setEnabled(false);
        btnBuscar.setEnabled(true);
        cbxDisco.setEnabled(false);
        cbxDisco.removeAllItems();
        enableDisco(false);

    }

    private void limpiarCamposCantante() {
        txtCodigo.setText("");
        txtApellido.setText("");
        txtGeneroMusical.setText("");
        txtNombre.setText("");
        txtNombreArtistico.setText("");
    }

    private void limpiarCamposDisco() {
        txtNombreDisco.setText("");
        txtAnioLanzamiento.setText("");
        cbxDisco.removeAllItems();
    }

    private void cargarDatosCombo() {
        DefaultComboBoxModel<Disco> modelo = (DefaultComboBoxModel) cbxDisco.getModel();
        Cantante cantante = this.controladorCantante.buscarCantante(Integer.parseInt(txtCodigo.getText()));
        modelo.removeAllElements();
        List<Disco> listaDiscos = cantante.listarDiscos();

        for (Disco disco : listaDiscos) {
            modelo.addElement(disco);
        }
        Disco disco = (Disco) modelo.getSelectedItem();
        txtNombreDisco.setText(disco.getNombre());
        txtAnioLanzamiento.setText(String.valueOf(disco.getAnioDeLanzamiento()));
    }

    private void enableDisco(boolean val) {
        cbxDisco.setEnabled(val);
        txtNombreDisco.setEnabled(val);
        txtAnioLanzamiento.setEnabled(val);
        btnActualizarDisco.setEnabled(val);
    }

    private boolean validarCamposDisco() {
        if (txtNombre.getText().isEmpty() || txtAnioLanzamiento.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDisco;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarSeleccion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cbxDisco;
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
    private javax.swing.JTextField txtAnioLanzamiento;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtGeneroMusical;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNombreDisco;
    // End of variables declaration//GEN-END:variables
}
