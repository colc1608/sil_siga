/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.sga.dao.CursoPorGradoDAO;
import edu.sil.sga.entidades.Curso;
import edu.sil.sga.entidades.CursoPorGrado;
import edu.sil.sga.entidades.Grado;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo Lopez
 */
public class Admi_CursoPorGrado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Admi_CursoPorGrado
     */
    Grado grado;
    Curso curso;
    ArrayList<CursoPorGrado> listaDeCursosPorGrado = new ArrayList<CursoPorGrado>();
    //ArrayList<CursoPorGrado> listaDeCursosPorGrado;

    public Admi_CursoPorGrado() {
        initComponents();
    }

    void cargarDatosGrado(Grado objGrado) {
        this.grado = objGrado;
        txtGrado.setText(" ' " + objGrado.getnumeroGrado() + " - " + objGrado.getSeccion().getDescripcion() + " ' de " + objGrado.getNivel().getNombreCorto());
        //txtSeccion.setText(objGrado.getSeccion().getDescripcion());
        //txtNivel.setText(objGrado.getNivel().getNombreCorto());
    }

    void cargarDatosCurso(Curso objCurso) {
        this.curso = objCurso;
        txtCurso.setText(objCurso.getNombreLargo());
        //txtSeccion.setText(objGrado.getSeccion().getDescripcion());
        //txtNivel.setText(objGrado.getNivel().getNombreCorto());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCursoPorGrado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnBuscarCurso = new javax.swing.JButton();
        btnBuscarGrado = new javax.swing.JButton();
        txtCurso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGrado = new javax.swing.JTextField();
        btnEliminarCurso = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnAgregarCurso = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Asignar cursos por grado");

        tblCursoPorGrado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCursoPorGrado);

        btnBuscarCurso.setText("buscar");
        btnBuscarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCursoActionPerformed(evt);
            }
        });

        btnBuscarGrado.setText("buscar");
        btnBuscarGrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarGradoActionPerformed(evt);
            }
        });

        txtCurso.setEditable(false);

        jLabel3.setText("Curso:");

        jLabel2.setText("Grado:");

        txtGrado.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(txtGrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarGrado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarCurso, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarGrado))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCurso))
                .addGap(21, 21, 21))
        );

        btnEliminarCurso.setText("-");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");

        btnAgregarCurso.setText("+");
        btnAgregarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarCurso)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnNuevo)
                        .addGap(41, 41, 41)
                        .addComponent(btnGuardar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCurso)
                    .addComponent(btnEliminarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarGradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarGradoActionPerformed
        // TODO add your handling code here:
        List<Grado> lstGrado = new ArrayList<>();
        Admi_buscarGrado form = new Admi_buscarGrado(null, true, lstGrado);
        form.setVisible(true);
        if (lstGrado.isEmpty()) {
            //Ventana se cerro sin seleccionar
        } else {
            Grado objGradoElegido = lstGrado.get(0);
            cargarDatosGrado(objGradoElegido);
            System.out.println("lo que llego es: " + objGradoElegido.getId());
        }
    }//GEN-LAST:event_btnBuscarGradoActionPerformed

    private void btnBuscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCursoActionPerformed

        List<Curso> lstCurso = new ArrayList<>();
        Admi_buscarCurso form = new Admi_buscarCurso(null, true, lstCurso);
        form.setVisible(true);
        if (lstCurso.isEmpty()) {
            //Ventana se cerro sin seleccionar
        } else {
            Curso objCursoElegido = lstCurso.get(0);
            cargarDatosCurso(objCursoElegido);
            System.out.println("lo que llego es: " + objCursoElegido.getId());
        }
    }//GEN-LAST:event_btnBuscarCursoActionPerformed

    private void btnAgregarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCursoActionPerformed

        CursoPorGrado objCursoPorGrado = new CursoPorGrado();

        objCursoPorGrado.setCurso(curso);
        objCursoPorGrado.setGrado(grado);
        listaDeCursosPorGrado.add(objCursoPorGrado);

        DefaultTableModel modelo1 = new DefaultTableModel();

        modelo1.addColumn("Grado");
        modelo1.addColumn("Nombre Curso");

        for (CursoPorGrado objcursoPorGrado : listaDeCursosPorGrado) {
            modelo1.addRow(new String[]{
                objcursoPorGrado.getGrado().getnumeroGrado() + "",
                objcursoPorGrado.getCurso().getNombreLargo() + ""
            });
        }
        tblCursoPorGrado.setModel(modelo1);
    }//GEN-LAST:event_btnAgregarCursoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        CursoPorGradoDAO dao = new CursoPorGradoDAO();

        if (dao.RegistrarCursoPorGrado(listaDeCursosPorGrado)) {
            JOptionPane.showMessageDialog(this, "Se registro correctamente a la Clase :) ");

        } else {
            JOptionPane.showMessageDialog(this, "No lo pudimos registrar por problemas internos :( ");
        }


    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCurso;
    private javax.swing.JButton btnBuscarCurso;
    private javax.swing.JButton btnBuscarGrado;
    private javax.swing.JButton btnEliminarCurso;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCursoPorGrado;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtGrado;
    // End of variables declaration//GEN-END:variables
}