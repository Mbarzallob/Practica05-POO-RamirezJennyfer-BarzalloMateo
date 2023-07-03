/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.vista.compositor;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador.ControladorCompositor;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cancion;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Compositor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SOPORTETICS
 */
public class VentanaListarCompositor extends javax.swing.JInternalFrame {

    private ControladorCompositor controladorCompositor;

    /**
     * Creates new form VentanaListarCompositor
     */
    public VentanaListarCompositor(ControladorCompositor controladorCompositor) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompositor = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCantante = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCancion = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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

        tblCompositor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "Numero de composiciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCompositor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCompositorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCompositor);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tblCantante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "Nombre artistico", "Genero Musical", "# de sencillos", "# de conciertos", "# de giras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCantante);

        tblCancion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Letra", "Duracion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblCancion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(524, 524, 524))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap())
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

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salir();
        this.setVisible(false);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarTabla();
    }//GEN-LAST:event_formInternalFrameActivated

    private void tblCompositorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCompositorMouseClicked
        cargarTablasExtras();
    }//GEN-LAST:event_tblCompositorMouseClicked

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        salir();
    }//GEN-LAST:event_formInternalFrameClosing

    private void cargarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) tblCompositor.getModel();
        modelo.setNumRows(0);
        List<Compositor> listaCompositors = controladorCompositor.listar();
        for (Compositor compositor : listaCompositors) {
            String codigo = String.valueOf(compositor.getCodigo());
            String nombre = compositor.getNombre();
            String edad = String.valueOf(compositor.getEdad());
            String nacionalidad = compositor.getNacionalidad();
            String apellido = compositor.getApellido();
            String salario = String.valueOf(compositor.getSalario());
            String numComposiciones = String.valueOf(compositor.getNumeroDeComposiciones());
            Object[] rowData = {codigo, nombre, apellido, edad, nacionalidad, salario, numComposiciones};
            modelo.addRow(rowData);
        }
        tblCompositor.setModel(modelo);
    }

    private void cargarTablasExtras() {
        int fila = tblCompositor.getSelectedRow();
        int codigo = Integer.parseInt(tblCompositor.getValueAt(fila, 0).toString());
        Compositor compositor = controladorCompositor.buscarCompositor(codigo);
        DefaultTableModel modelo = (DefaultTableModel) tblCantante.getModel();
        modelo.setNumRows(0);
        List<Cantante> listaCantante = controladorCompositor.listarCantantes(compositor);
        if (!listaCantante.isEmpty()) {
            for (Cantante cantante : listaCantante) {
                String codigoC = String.valueOf(cantante.getCodigo());
                String nombre = cantante.getNombre();
                String apellido = cantante.getApellido();
                String edad = String.valueOf(cantante.getEdad());
                String nacionalidad = cantante.getNacionalidad();
                String salario = String.valueOf(cantante.calcularSalario());
                String nombreArtistico = cantante.getNombreArtistico();
                String generoMusical = cantante.getGeneroMusical();
                String numSencillos = String.valueOf(cantante.getNumeroDeSencillos());
                String numConciertos = String.valueOf(cantante.getNumeroDeConciertos());
                String numGiras = String.valueOf(cantante.getNumeroDeGiras());
                Object[] rowData = {codigoC, nombre, apellido, edad, nacionalidad, salario, nombreArtistico, generoMusical, numSencillos, numConciertos, numGiras};
                modelo.addRow(rowData);
            }
            tblCantante.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(this, "El compositor " + compositor.getNombre() + " " + compositor.getApellido() + " no tiene cantantes registrados");
        }
        DefaultTableModel modeloCancion = (DefaultTableModel) tblCantante.getModel();
        modeloCancion.setNumRows(0);
        List<Cancion> listaCancion = controladorCompositor.listarCanciones(compositor);
        if (!listaCancion.isEmpty()) {
            for (Cancion cancion : listaCancion) {
                String codigoCancion = String.valueOf(cancion.getCodigo());
                String titulo = cancion.getTitulo();
                String letra = cancion.getLetra();
                String tiempo = String.valueOf(cancion.getTiempoEnMinutos());

                Object[] rowData = {codigoCancion, titulo, letra, tiempo};
                modeloCancion.addRow(rowData);
            }
            tblCancion.setModel(modeloCancion);
        } else {
            JOptionPane.showMessageDialog(this, "El compositor " + compositor.getNombre() + " " + compositor.getApellido() + " no tiene canciones registradas");
        }
    }

    private void salir() {
        DefaultTableModel modelo = (DefaultTableModel) tblCantante.getModel();
        modelo.setNumRows(0);
        tblCantante.setModel(modelo);
        DefaultTableModel modeloCancion = (DefaultTableModel) tblCancion.getModel();
        modelo.setNumRows(0);
        tblCancion.setModel(modeloCancion);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCancion;
    private javax.swing.JTable tblCantante;
    private javax.swing.JTable tblCompositor;
    // End of variables declaration//GEN-END:variables
}
