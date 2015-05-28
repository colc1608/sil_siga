/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sil.sga.interfaces;

import edu.sil.sga.dao.GradoDAO;
import edu.sil.sga.dao.NivelDAO;
import edu.sil.sga.entidades.Grado;
import edu.sil.sga.entidades.Nivel;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paul
 */
public class Admi_buscarGrado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Admi_buscarGrado
     */
    public List<Nivel> listaNivel;
    public List<Grado> listaGrado;

    public Admi_buscarGrado() {
         
        
        
        initComponents();
        CargarNivel();
        listarGrado();
        ActivaSeleccionar(false);
    }

    public void ActivaSeleccionar(boolean a) {
        btnEnviar.setEnabled(a);
    }

    void CargarNivel() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            listaNivel = new NivelDAO().ListarNivel();
            for (Nivel nivel : listaNivel) {
                model.addElement(nivel.getNombreLargo());
            }
            cboNivel.setModel(model);
        } catch (Exception e) {
            System.out.println("error - cargar - combo - nivel");
        }
    }

    void listarGrado() {
        try {
            GradoDAO dao = new GradoDAO();
            listaGrado = dao.ListarGrado();
            DefaultTableModel modelo1 = new DefaultTableModel();
            modelo1.addColumn("id");
            modelo1.addColumn("Nivel");
            modelo1.addColumn("Grado");
            modelo1.addColumn("Seccion");

            for (Grado grado : listaGrado) {
                modelo1.addRow(new String[]{
                    grado.getId() + "",
                    grado.getNivel().getNombreCorto() + "",
                    grado.getDescripcion() + "",
                    grado.getSeccion().getDescripcion() + ""
                });
            }
            tblGrado.setModel(modelo1);
        } catch (Exception e) {
            System.out.println("Error - cargar - grado - listar");
        }
    }

    void ActualizarBusqueda() {
        String desc = txtDescripcion.getText();
        try {
            listaGrado = new GradoDAO().buscarGrado(String.valueOf(cboNivel.getSelectedItem()), desc);
            DefaultTableModel modelo1 = new DefaultTableModel();
            modelo1.addColumn("id");
            modelo1.addColumn("Nivel");
            modelo1.addColumn("Grado");
            modelo1.addColumn("Seccion");

            for (Grado grado : listaGrado) {
                modelo1.addRow(new String[]{
                    grado.getId() + "",
                    grado.getNivel().getNombreCorto() + "",
                    grado.getDescripcion() + "",
                    grado.getSeccion().getDescripcion() + ""
                });
            }
            tblGrado.setModel(modelo1);

        } catch (Exception e) {
            System.out.println("Error - Actualizar cargar - grado - listar");
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrado = new javax.swing.JTable();
        txtDescripcion = new javax.swing.JTextField();
        cboNivel = new javax.swing.JComboBox();
        btnEnviar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar Grado");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda de Grado"));
        jPanel1.setToolTipText("");

        tblGrado.setModel(new javax.swing.table.DefaultTableModel(
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
        tblGrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGradoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGrado);

        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
        });

        cboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnEnviar.setText("Seleccionar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(btnEnviar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblGradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGradoMouseClicked
        ActivaSeleccionar(true);
    }//GEN-LAST:event_tblGradoMouseClicked

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        if (String.valueOf(txtDescripcion.getText()) == "" ) {
            listarGrado();
        } else {
            ActualizarBusqueda();
        }
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        int index = tblGrado.getSelectedRow();
        if (index != -1) {
            Grado objGrado = listaGrado.get(index);
            Admi_alumnoCRUD alucrud = new Admi_alumnoCRUD(objGrado);
            this.getParent().add(alucrud);
            alucrud.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox cboNivel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGrado;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
