/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblioteca;

import com.UBAM.Controllers.ComboController;
import com.UBAM.Controllers.LibroController;
import com.UBAM.Models.Editorial;
import com.UBAM.Models.Genero;
import com.UBAM.Models.Idioma;
import com.UBAM.Models.Libro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jasse
 */
public class Modificar extends javax.swing.JFrame {

    /**
     * Creates new form Modificar
     */
    public Modificar() {
        initComponents();
        cargarLibros();
        cargarEditoriales();
        cargarGeneros();
        cargarIdiomas();
    }

    private void cargarLibros() {
        ComboController comboController = new ComboController();
        ArrayList<Libro> lista = comboController.obtenerLibros();
        
        jc_idLibro.addItem(new Libro(0, "--SELECCIONE--"));
        
        for(int i = 0; i<lista.size(); i++){
            jc_idLibro.addItem(new Libro(lista.get(i).getLibro_Id(), lista.get(i).getLibro_Nombre()));
        }
    }
    
    private void cargarEditoriales() {
        ComboController comboController = new ComboController();
        ArrayList<Editorial> lista = comboController.obtenerEditoriales();
        
        jc_editorial.addItem(new Editorial(0, "--SELECCIONE--"));
        
        for(int i = 0; i<lista.size(); i++){
            jc_editorial.addItem(new Editorial(lista.get(i).getEditorial_Id(), lista.get(i).getEditorial_Nombre()));
        }
    }
    
    private void cargarGeneros() {
        ComboController comboController = new ComboController();
        ArrayList<Genero> lista = comboController.obtenerGeneros();
        
        jc_genero.addItem(new Genero(0, "--SELECCIONE--"));
        
        for(int i = 0; i<lista.size(); i++){
            jc_genero.addItem(new Genero(lista.get(i).getGeneroId(), lista.get(i).getGeneroNombre()));
        }
    }
    
    private void cargarIdiomas() {
        ComboController comboController = new ComboController();
        ArrayList<Idioma> lista = comboController.obtenerIdiomas();
        
        jc_idioma.addItem(new Idioma(0, "--SELECCIONE--"));
        
        for(int i = 0; i<lista.size(); i++){
            jc_idioma.addItem(new Idioma(lista.get(i).getIdioma_Id(), lista.get(i).getIdioma_Nombre()));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jc_idLibro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jc_genero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jc_idioma = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jt_costo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jt_nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jc_editorial = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("ID Libro:");

        jLabel3.setText("Género: ");

        jLabel4.setText("Idioma:");

        jLabel5.setText("Costo:");

        jt_costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jt_costoKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre del Libro: ");

        jLabel6.setText("Editorial: ");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar))
                    .addComponent(jc_editorial, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jt_costo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jc_idioma, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jc_genero, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jc_idLibro, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jt_nombre))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_idLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jc_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jc_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalir)
                        .addComponent(btnLimpiar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt_costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_costoKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_jt_costoKeyTyped

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //String opcion = (String) jc_editorial.getSelectedItem();
        /*int id = jc_editorial.getItemAt(jc_editorial.getSelectedIndex()).getEditorial_Id();
        int id2 = jc_genero.getItemAt(jc_genero.getSelectedIndex()).getGeneroId();
        JOptionPane.showMessageDialog(null, "ID --> " + id2);*/

        int idLibro = jc_idLibro.getItemAt(jc_idLibro.getSelectedIndex()).getLibro_Id();
        String nombreLibro = jt_nombre.getText();
        int idEditorial = jc_editorial.getItemAt(jc_editorial.getSelectedIndex()).getEditorial_Id();
        int idGenero = jc_genero.getItemAt(jc_genero.getSelectedIndex()).getGeneroId();
        int idIdioma = jc_idioma.getItemAt(jc_idioma.getSelectedIndex()).getIdioma_Id();
        String costo_string = jt_costo.getText().trim();
        double costo = Double.parseDouble(costo_string);

        if (nombreLibro.isEmpty() || costo_string.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;

        }else if (jc_idLibro.getSelectedIndex() == 0 || jc_editorial.getSelectedIndex() == 0 || jc_genero.getSelectedIndex() == 0 || jc_idioma.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione opciones válidas en los combos.");
            return;

        }else{
            LibroController libroController = new LibroController();
            libroController.modificarLibro(idLibro, idGenero, idEditorial, idIdioma, nombreLibro, costo);
            limpiarCampos();
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        Menu menuForm = new Menu();
        menuForm.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void limpiarCampos() {
        jc_idLibro.setSelectedIndex(0);
        jt_nombre.setText("");
        jc_editorial.setSelectedIndex(0); // Puedes ajustar el índice según tus necesidades
        jc_genero.setSelectedIndex(0);
        jc_idioma.setSelectedIndex(0);
        jt_costo.setText("");
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<Editorial> jc_editorial;
    private javax.swing.JComboBox<Genero> jc_genero;
    private javax.swing.JComboBox<Libro> jc_idLibro;
    private javax.swing.JComboBox<Idioma> jc_idioma;
    private javax.swing.JTextField jt_costo;
    private javax.swing.JTextField jt_nombre;
    // End of variables declaration//GEN-END:variables
}
