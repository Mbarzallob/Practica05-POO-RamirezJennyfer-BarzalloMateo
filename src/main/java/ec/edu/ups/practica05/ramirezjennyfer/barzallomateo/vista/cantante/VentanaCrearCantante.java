/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.cantante;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import javax.swing.JOptionPane;

/**
 *
 * @author SOPORTETICS
 */
public class VentanaCrearCantante extends javax.swing.JInternalFrame {

    private ControladorCantante controladorCantante;

    /**
     * Creates new form VentanaCrearCantante
     */
    public VentanaCrearCantante(ControladorCantante controladorCantante) {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtNombreArtistico = new javax.swing.JTextField();
        txtGeneroMusical = new javax.swing.JTextField();
        txtNumSencillos = new javax.swing.JTextField();
        txtNumConciertos = new javax.swing.JTextField();
        txtNumGiras = new javax.swing.JTextField();
        btnRegistrarCantante = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Stay Dreaming", 1, 36)); // NOI18N
        jLabel1.setText("Registrar datos de un cantante");

        jLabel2.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel2.setText("Codigo: ");

        jLabel3.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel5.setText("Edad:");

        jLabel6.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel6.setText("Nacionalidad:");

        jLabel7.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel7.setText("Salario:");

        jLabel8.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel8.setText("Nombre artistico:");

        jLabel9.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel9.setText("Numero de sencillos:");

        jLabel10.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel10.setText("Genero musical:");

        jLabel11.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel11.setText("Numero de conciertos:");

        jLabel12.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        jLabel12.setText("Numero de giras:");

        txtCodigo.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtCodigo.setToolTipText("Ingrese el codigo del Cantante EJM (0101)");

        txtNombre.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombre.setToolTipText("Ingrese el nombre del Cantante EJM (Pepe)");

        txtApellido.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtApellido.setToolTipText("Ingrese el apellido del Cantante EJM (Perez)");

        txtEdad.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtEdad.setToolTipText("Ingrese la edad del Cantante EJM (18)");

        txtNacionalidad.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNacionalidad.setToolTipText("Ingrese la nacionalidad del Cantante EJM (Ecuatoriano)");

        txtSalario.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtSalario.setToolTipText("Ingrese el salario del Cantante EJM (200)");

        txtNombreArtistico.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNombreArtistico.setToolTipText("Ingrese el nombre artistico del Cantante EJM (Pepito)");

        txtGeneroMusical.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtGeneroMusical.setToolTipText("Ingrese el genero musical del Cantante EJM (Rock)");

        txtNumSencillos.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNumSencillos.setToolTipText("Ingrese el numero de sencillos del Cantante EJM (2)");

        txtNumConciertos.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNumConciertos.setToolTipText("Ingrese el numero de conciertos del Cantante EJM (2)");

        txtNumGiras.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        txtNumGiras.setToolTipText("Ingrese el numero de giras del Cantante EJM (2)");

        btnRegistrarCantante.setBackground(new java.awt.Color(204, 255, 204));
        btnRegistrarCantante.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnRegistrarCantante.setText("Registrar");
        btnRegistrarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCantanteActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 204, 204));
        btnSalir.setFont(new java.awt.Font("Cookies and Cheese Bold", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtEdad)
                            .addComponent(txtNacionalidad)
                            .addComponent(txtSalario)
                            .addComponent(txtNombreArtistico)
                            .addComponent(txtGeneroMusical)
                            .addComponent(txtNumSencillos)
                            .addComponent(txtNumConciertos)
                            .addComponent(txtNumGiras)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnRegistrarCantante)
                        .addGap(28, 28, 28)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeneroMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumConciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumGiras, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarCantante)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCantanteActionPerformed
        if (camposObligatorios()) {
            int codigo = Integer.parseInt(txtCodigo.getText());
            Cantante cantanteValidacion = controladorCantante.buscarCantante(codigo);
            if (cantanteValidacion == null) {
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                int edad = Integer.parseInt(txtEdad.getText());
                String nacionalidad = txtNacionalidad.getText();
                double salario = Double.parseDouble(txtSalario.getText());
                String nombreArtistico = txtNombreArtistico.getText();
                String generoMusical = txtGeneroMusical.getText();
                int numeroSencillos = Integer.parseInt(txtNumSencillos.getText());
                int numeroConciertos = Integer.parseInt(txtNumConciertos.getText());
                int numeroGiras = Integer.parseInt(txtNumGiras.getText());
                Cantante cantante = new Cantante(nombreArtistico, generoMusical, numeroSencillos, numeroConciertos, numeroGiras, codigo, nombre, apellido, edad, nacionalidad, salario);
                cantante.calcularSalario();
                controladorCantante.agregarCantante(cantante);
                JOptionPane.showMessageDialog(this, "Registro del cantante: " + cantante.getNombreArtistico());
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "EL CANTANTE CON EL CODIGO " + codigo + " YA EXISTE");
            }
        } else {
            JOptionPane.showMessageDialog(this, "CAMPOS OBLIGATORIOS POR LLENAR ");
        }
    }//GEN-LAST:event_btnRegistrarCantanteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        this.limpiarCampos();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        limpiarCampos();
    }//GEN-LAST:event_formInternalFrameClosing

    private boolean camposObligatorios() {
        if (txtCodigo.getText().isEmpty()
                || txtApellido.getText().isEmpty()
                || txtNombre.getText().isEmpty()
                || txtEdad.getText().isEmpty()
                || txtSalario.getText().isEmpty()
                || txtNacionalidad.getText().isEmpty()
                || txtNombreArtistico.getText().isEmpty()
                || txtGeneroMusical.getText().isEmpty()
                || txtNumSencillos.getText().isEmpty()
                || txtNumConciertos.getText().isEmpty()
                || txtNumGiras.getText().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    private void limpiarCampos() {
        txtCodigo.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtGeneroMusical.setText("");
        txtNacionalidad.setText("");
        txtNombre.setText("");
        txtNombreArtistico.setText("");
        txtNumConciertos.setText("");
        txtNumGiras.setText("");
        txtNumSencillos.setText("");
        txtSalario.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarCantante;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGeneroMusical;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNumConciertos;
    private javax.swing.JTextField txtNumGiras;
    private javax.swing.JTextField txtNumSencillos;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
