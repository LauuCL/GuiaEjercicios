/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import ejercicioguia2.Libro;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class FrmLibro extends javax.swing.JFrame {
    
     private static int max = 25;
     Libro libro [] = new Libro[max];
     int i = 0;

    /**
     * Creates new form FrmLibro
     */
    public FrmLibro() {
        initComponents();
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
        jLbCodigo = new javax.swing.JLabel();
        jLbNombre = new javax.swing.JLabel();
        jLbAutor = new javax.swing.JLabel();
        jLbDescripcion = new javax.swing.JLabel();
        jLbPrecio = new javax.swing.JLabel();
        jTfCodigo = new javax.swing.JTextField();
        jTfNombre = new javax.swing.JTextField();
        jTfAutor = new javax.swing.JTextField();
        jTfDescripcion = new javax.swing.JTextField();
        jTfPrecio = new javax.swing.JTextField();
        jBtnLimpiar1 = new javax.swing.JButton();
        jBtnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaRegistros = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("BIENVENIDOS A LOS REGISTROS DE LIBRO");

        jLbCodigo.setText("Código del libro: ");

        jLbNombre.setText("Nombre del libro:");

        jLbAutor.setText("Autor del libro: ");

        jLbDescripcion.setText("Descripción del libro:");

        jLbPrecio.setText("Precio del libro:");

        jBtnLimpiar1.setText("Limpiar");
        jBtnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiar1ActionPerformed(evt);
            }
        });

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jTaRegistros.setColumns(20);
        jTaRegistros.setRows(5);
        jScrollPane1.setViewportView(jTaRegistros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(193, 193, 193))
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnLimpiar1)
                    .addComponent(jLbPrecio)
                    .addComponent(jLbDescripcion)
                    .addComponent(jLbAutor)
                    .addComponent(jLbNombre)
                    .addComponent(jLbCodigo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jBtnGuardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbCodigo)
                            .addComponent(jTfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbNombre)
                            .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbAutor)
                            .addComponent(jTfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLbDescripcion)
                            .addComponent(jTfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbPrecio)
                            .addComponent(jTfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnLimpiar1)
                            .addComponent(jBtnGuardar)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiar1ActionPerformed
        limpiar();
    }//GEN-LAST:event_jBtnLimpiar1ActionPerformed

     private void limpiar(){
       this.jTfCodigo.setText("");
       this.jTfNombre.setText("");
       this.jTfAutor.setText("");
       this.jTfDescripcion.setText("");
       this.jTfPrecio.setText("");
       jTfCodigo.requestFocus();
    }
     
    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
     
       int id = Integer.parseInt(jTfCodigo.getText());
       String nombre = jTfNombre.getText();
       String autor = jTfAutor.getText();
       String descripcion = jTfDescripcion.getText();
       double precio = Double.parseDouble(jTfPrecio.getText());
       
       if(i<25){
           Libro lib = new Libro (id, nombre, autor, descripcion, precio);
           libro [i] = lib;
           i++;
           JOptionPane.showMessageDialog(this, "Registro guardado exitosamente",
                   "Guardar" ,JOptionPane.INFORMATION_MESSAGE);
           mostrarRegistros();
           limpiar();
       }else{
           JOptionPane.showMessageDialog(this, "No se pueden agregar más libros",
                   "Error" ,JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_jBtnGuardarActionPerformed

     private void mostrarRegistros(){
        String registros = " ";
        for(int cont=0; cont< i; cont++){
            registros+=libro[cont].toString();
        }
        jTaRegistros.setText(registros);
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
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnLimpiar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLbAutor;
    private javax.swing.JLabel jLbCodigo;
    private javax.swing.JLabel jLbDescripcion;
    private javax.swing.JLabel jLbNombre;
    private javax.swing.JLabel jLbPrecio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTaRegistros;
    private javax.swing.JTextField jTfAutor;
    private javax.swing.JTextField jTfCodigo;
    private javax.swing.JTextField jTfDescripcion;
    private javax.swing.JTextField jTfNombre;
    private javax.swing.JTextField jTfPrecio;
    // End of variables declaration//GEN-END:variables
}
