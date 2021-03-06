/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.sga.dao.AlumnoDAO;
import edu.sil.siga.bean.Alumno;
import edu.sil.siga.bean.Grado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.SpinnerModel;

/**
 *
 * @author Cesar Lopez
 */
public class Admi_alumnoCRUD extends javax.swing.JInternalFrame {

    /**
     * Creates new form Admi_alumnoCRUD
     */
    Alumno objAlumnoSeleccionado;
    public List<Alumno> listAlumno;

    public Admi_alumnoCRUD() {
        initComponents();
        ActivaCajas(false);
        ListarALumno();
        activaBotones(true, false, false, false);
        setLocation(200, 40);
        //setSize(500, 800);

    }

    void ActivaCajas(boolean a) {
        txtNombre.setEnabled(a);
        txtApePa.setEnabled(a);
        txtApeMa.setEnabled(a);
        txtDni.setEnabled(a);
        txtTelefono.setEnabled(a);
        txtMovil.setEnabled(a);
        spnFechaNacimiento.setEnabled(a);
        txtEmail.setEnabled(a);
    }

    void activaBotones(boolean a, boolean b, boolean c, boolean d) {
        btnNuevo.setEnabled(a);
        btnGuardar.setEnabled(b);
        btnActualizar.setEnabled(c);
        btnEliminar.setEnabled(d);
    }

    void LimpiarCajas() {
        txtNombre.setText("");
        txtApePa.setText("");
        txtApeMa.setText("");
        txtDni.setText("");
        txtTelefono.setText("");
        txtMovil.setText("");
        txtEmail.setText("");
        txtNombre.requestFocus();
    }

    void ListarALumno() {
        try {
            AlumnoDAO dao = new AlumnoDAO();
            listAlumno = dao.ListadoAlumno();
            DefaultTableModel modelo1 = new DefaultTableModel();

            modelo1.addColumn("Nombre");
            modelo1.addColumn("Apellido Paterno");
            modelo1.addColumn("Apellido Materno");
            modelo1.addColumn("DNI");

            for (Alumno obAlumno : listAlumno) {
                modelo1.addRow(new String[]{
                    obAlumno.getNombre() + "",
                    obAlumno.getApellidopaterno() + "",
                    obAlumno.getApellidomaterno() + "",
                    obAlumno.getDni() + "",});
            }
            tblAlumno.setModel(modelo1);
        } catch (Exception e) {
            System.out.println("ERROR - INTERFAZ - ALUMNO - LISTAR");
        }
    }

    void ActualizarBusqueda() {
        try {
            listAlumno = new AlumnoDAO().BuscarAlumno(String.valueOf(cboBusqueda.getSelectedItem()), txtbusquedaNom.getText());
            DefaultTableModel modelo1 = (DefaultTableModel) tblAlumno.getModel();
            while (modelo1.getRowCount() > 0) {
                modelo1.removeRow(0);
            }
            for (Alumno obalumno : listAlumno) {
                modelo1.addRow(new String[]{
                    obalumno.getNombre() + "",
                    obalumno.getApellidopaterno() + "",
                    obalumno.getApellidomaterno() + "",
                    obalumno.getDni() + "",});
            }
            tblAlumno.setModel(modelo1);
        } catch (Exception e) {
            System.out.println("ERROR - INTERFAZ - ALUMNO - ACTUALIZAR BUSQUEDA");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtDni = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApeMa = new javax.swing.JTextField();
        txtApePa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMovil = new javax.swing.JTextField();
        spnFechaNacimiento = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumno = new javax.swing.JTable();
        txtbusquedaNom = new javax.swing.JTextField();
        cboBusqueda = new javax.swing.JComboBox();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestionar Alumno - IEP San Ignacio de Loyola");
        setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Gestionar Alumno");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel3.setText("* Apellido Paterno: ");

        txtApeMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApeMaKeyTyped(evt);
            }
        });

        txtApePa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApePaKeyTyped(evt);
            }
        });

        jLabel2.setText("* Nombres: ");

        jLabel4.setText("* Apellido Materno: ");

        jLabel5.setText("* DNI:");

        jLabel7.setText("Fecha Nacimiento");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel6.setText("Telefono :");

        jLabel11.setText("Email");

        jLabel12.setText("Movil: ");

        txtMovil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMovilKeyTyped(evt);
            }
        });

        spnFechaNacimiento.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApePa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApeMa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMovil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApePa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApeMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(spnFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Alumnos"));

        tblAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlumno);

        txtbusquedaNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusquedaNomKeyReleased(evt);
            }
        });

        cboBusqueda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "DNI" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtbusquedaNom, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbusquedaNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnNuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnGuardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnActualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnEliminar.png"))); // NOI18N
        btnEliminar.setText("Elminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(10, 10, 10)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbusquedaNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaNomKeyReleased
        // TODO add your handling code here:
        if (String.valueOf(cboBusqueda.getSelectedIndex()) == "") {
            ListarALumno();
        } else {
            ActualizarBusqueda();
        }
    }//GEN-LAST:event_txtbusquedaNomKeyReleased

    private void tblAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnoMouseClicked
        // TODO add your handling code here:
        int fila = tblAlumno.getSelectedRow();
        if (fila != -1) {
            objAlumnoSeleccionado = listAlumno.get(fila);

            txtNombre.setText(objAlumnoSeleccionado.getNombre());
            txtApePa.setText(objAlumnoSeleccionado.getApellidopaterno());
            txtApeMa.setText(objAlumnoSeleccionado.getApellidomaterno());
            txtDni.setText(objAlumnoSeleccionado.getDni());
            txtTelefono.setText(objAlumnoSeleccionado.getTelefono());
            txtMovil.setText(objAlumnoSeleccionado.getMovil());
            txtEmail.setText(objAlumnoSeleccionado.getEmail());
            
            btnNuevo.setText("Nuevo");
            activaBotones(true, false, true, true);
            ActivaCajas(true);
        }
    }//GEN-LAST:event_tblAlumnoMouseClicked

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (txtDni.getText().length() == 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (txtTelefono.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtMovilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMovilKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }

        if (txtMovil.getText().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMovilKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApePaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApePaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApePaKeyTyped

    private void txtApeMaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeMaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApeMaKeyTyped

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        LimpiarCajas();
        if (btnNuevo.getText().equals("Nuevo")) {
            LimpiarCajas();
            activaBotones(true, true, false, false);
            btnNuevo.setText("Cancelar");
            ActivaCajas(true);
        } else {
            activaBotones(true, false, false, false);
            btnNuevo.setText("Nuevo");
            ActivaCajas(false);
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        if (txtNombre.getText().equalsIgnoreCase("") || txtApePa.getText().equalsIgnoreCase("") || txtApeMa.getText().equalsIgnoreCase("")
            || txtDni.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "No borre los campos requeridos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Alumno obAlumno = new Alumno();
                AlumnoDAO dao = new AlumnoDAO();

                obAlumno.setId(objAlumnoSeleccionado.getId());
                obAlumno.setNombre(txtNombre.getText());
                obAlumno.setApellidopaterno(txtApePa.getText());
                obAlumno.setApellidomaterno(txtApeMa.getText());
                obAlumno.setDni(txtDni.getText());
                obAlumno.setTelefono(txtTelefono.getText());
                obAlumno.setMovil(txtMovil.getText());
                obAlumno.setEmail(txtEmail.getText());
                obAlumno.setFechaNacimiento((Date) spnFechaNacimiento.getValue());

                if (dao.EliminarAlumno(obAlumno)) {
                    JOptionPane.showMessageDialog(this, "Se elimino Correctamente el Alumno");
                    ListarALumno();
                    LimpiarCajas();
                    activaBotones(true, false, false, false);
                    ActivaCajas(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Verifique los campos e intentelo nuevamente ", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Problemas internos en la aplicacion ", "ERROR", JOptionPane.ERROR_MESSAGE);
                System.out.println("ERROR --> INTERFAZ --> ALUMNO --> Eliminar  "+e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:

        if (txtNombre.getText().equalsIgnoreCase("")
            || txtApePa.getText().equalsIgnoreCase("")
            || txtApeMa.getText().equalsIgnoreCase("")
            || txtDni.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "debe ingresar todos los campos requeridos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Alumno obAlumno = new Alumno();
                AlumnoDAO dao = new AlumnoDAO();

                obAlumno.setId(objAlumnoSeleccionado.getId());
                obAlumno.setNombre(txtNombre.getText());
                obAlumno.setApellidopaterno(txtApePa.getText());
                obAlumno.setApellidomaterno(txtApeMa.getText());
                obAlumno.setDni(txtDni.getText());
                obAlumno.setTelefono(txtTelefono.getText());
                obAlumno.setMovil(txtMovil.getText());
                obAlumno.setEmail(txtEmail.getText());
                obAlumno.setFechaNacimiento((Date) spnFechaNacimiento.getValue());

                if (dao.ActualizarAlumno(obAlumno)) {
                    JOptionPane.showMessageDialog(this, "Se Actualizo Correctamente los Datos");
                    ListarALumno();
                    LimpiarCajas();
                    activaBotones(true, false, false, false);
                    ActivaCajas(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Verifique los campos e intentelo nuevamente ", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Problemas internos en la aplicacion ", "ERROR", JOptionPane.ERROR_MESSAGE);
                System.out.println("ERROR --> INTERFAZ --> ALUMNO --> ACTUALIZAR "+e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:

        String nombre = txtNombre.getText();
        String apellidoPa = txtApePa.getText();
        String apellidoMa = txtApeMa.getText();
        String dni = txtDni.getText();
        String telefono = txtTelefono.getText();
        String movil = txtMovil.getText();
        String email = txtEmail.getText();

        if (txtNombre.getText().equalsIgnoreCase("") || txtApePa.getText().equalsIgnoreCase("")
            || txtApeMa.getText().equalsIgnoreCase("") || txtDni.getText().equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(null, "Debe ingresar los campos requerido con (*) ", "ERROR", JOptionPane.ERROR_MESSAGE);

        } else {

            try {
                Alumno alumno = new Alumno();
                AlumnoDAO dao = new AlumnoDAO();

                alumno.setNombre(txtNombre.getText());
                alumno.setApellidopaterno(txtApePa.getText());
                alumno.setApellidomaterno(txtApeMa.getText());
                alumno.setDni(txtDni.getText());
                alumno.setTelefono(txtTelefono.getText());
                alumno.setMovil(txtMovil.getText());
                alumno.setEmail(txtEmail.getText());
                alumno.setFechaNacimiento((Date) spnFechaNacimiento.getValue());

                if (dao.RegistrarAlumno(alumno)) {
                    JOptionPane.showMessageDialog(this, "Se registro correctamente al alumno :) ");
                    ListarALumno();
                    btnNuevo.setText("Nuevo");
                    LimpiarCajas();
                    ActivaCajas(false);
                    Admi_apoderadoCRUD admi = new Admi_apoderadoCRUD();
                    this.getParent().add(admi);
                    admi.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Verifique los campos e intentelo nuevamente ", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Problemas internos en la aplicacion ", "ERROR", JOptionPane.ERROR_MESSAGE);
                System.out.println("ERROR --> INTERFAZ --> ALUMNO --> Registrar  "+e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cboBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnFechaNacimiento;
    private javax.swing.JTable tblAlumno;
    private javax.swing.JTextField txtApeMa;
    private javax.swing.JTextField txtApePa;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMovil;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtbusquedaNom;
    // End of variables declaration//GEN-END:variables
}
