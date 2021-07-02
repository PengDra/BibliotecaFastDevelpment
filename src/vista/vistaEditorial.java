/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.MySQLManager;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Editorial;

/**
 *
 * @author MegaJoc
 */
public class vistaEditorial extends javax.swing.JFrame {

    ArrayList<Editorial> listaEditoriales = new ArrayList<>();

    /**
     * Creates new form vistaEditorial
     */
    public vistaEditorial() {
        initComponents();
        mostrarTabla();
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
        jLabel2 = new javax.swing.JLabel();
        nomEditorialTXT = new javax.swing.JTextField();
        finalizarEditorialBTN = new javax.swing.JButton();
        agregarEditorialBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        editorialTBL = new javax.swing.JTable();
        editarEditorialBTN = new javax.swing.JButton();
        eliminarEditorialBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idEditorialTXT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menú de editoriales");

        jLabel2.setText("Nombre de editorial");

        nomEditorialTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomEditorialTXTKeyTyped(evt);
            }
        });

        finalizarEditorialBTN.setText("Finalizar");
        finalizarEditorialBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarEditorialBTNActionPerformed(evt);
            }
        });

        agregarEditorialBTN.setText("Agregar");
        agregarEditorialBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarEditorialBTNActionPerformed(evt);
            }
        });

        editorialTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Id editorial", "Nombre editorial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(editorialTBL);

        editarEditorialBTN.setText("Editar");
        editarEditorialBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEditorialBTNActionPerformed(evt);
            }
        });

        eliminarEditorialBTN.setText("Eliminar");
        eliminarEditorialBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEditorialBTNActionPerformed(evt);
            }
        });

        jLabel3.setText("Id de editorial");

        idEditorialTXT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idEditorialTXTKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomEditorialTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idEditorialTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(eliminarEditorialBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(finalizarEditorialBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(editarEditorialBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(agregarEditorialBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(idEditorialTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nomEditorialTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(agregarEditorialBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editarEditorialBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eliminarEditorialBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(finalizarEditorialBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarEditorialBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEditorialBTNActionPerformed
        // TODO add your handling code here:\
       
        limpiarTabla();
        int id_edit;
        id_edit = Integer.parseInt(idEditorialTXT.getText());
        Editorial d = new Editorial();
        d.borrarEditorial(id_edit);
        mostrarTabla();


    }//GEN-LAST:event_eliminarEditorialBTNActionPerformed

    private void editarEditorialBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEditorialBTNActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
        int id_editorial;
        id_editorial =Integer.parseInt(idEditorialTXT.getText());
        String nombre = nomEditorialTXT.getText().toUpperCase();
        
        Editorial e = new Editorial();
               
        e.actualizarEditorial(id_editorial,nombre);
        mostrarTabla();
    }//GEN-LAST:event_editarEditorialBTNActionPerformed

    private void agregarEditorialBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarEditorialBTNActionPerformed
        // TODO add your handling code here:
        if (confirmaTextField()) {

            String nombre = nomEditorialTXT.getText().toUpperCase();
            

            Editorial e = new Editorial(nombre);
            e.agregarEditorial(nombre);

            mostrarTabla();

            JOptionPane.showMessageDialog(new JFrame(), "Autor agregado Satisfactoriamente");

        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Complete todos los campos porfavor");

        }

    }//GEN-LAST:event_agregarEditorialBTNActionPerformed

    private void finalizarEditorialBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarEditorialBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalizarEditorialBTNActionPerformed

    private void idEditorialTXTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idEditorialTXTKeyTyped
       char c = evt.getKeyChar();
       
        if(c<'0' || c>'9' ) evt.consume();
    }//GEN-LAST:event_idEditorialTXTKeyTyped

    private void nomEditorialTXTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomEditorialTXTKeyTyped
        char c = evt.getKeyChar();
       if((c< 'a' || c>'z') && (c< 'A' || c>'Z')&& (c>' ')&&(c<'á'||c>'ú')&&(c<'Á'||c>'Ú')) evt.consume();
    }//GEN-LAST:event_nomEditorialTXTKeyTyped
    
    
    
    
    public void mostrarTabla() {
        limpiarTabla();
        MySQLManager manager = new MySQLManager("localhost", "3306", "bibliotecafastdevelopment", "root", "");
        manager.executeQueryConsultaLLenaTablaEditoriales(listaEditoriales);
        String matriz[][] = new String[listaEditoriales.size()][1];

        for (int i = 0; i < listaEditoriales.size(); i++) {

            String idaut = Integer.toString(listaEditoriales.get(i).getId_editorial());
            String nombre =listaEditoriales.get(i).getNom_editorial();

            matriz[i][0] = idaut;
            matriz[i][1] = nombre;
            listaEditoriales.get(i).toString();

        }
        editorialTBL.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Id Editorial", "Nombre Editorial"
                }
        ));

    }

    public void limpiarTabla() {
        for (int i = 0; i < listaEditoriales.size(); i++) {
            listaEditoriales.remove(i);
        }

    }

    private boolean confirmaTextField() {
        boolean id = false;
        boolean nom_edit = false;
     
        int contver = 0;

        
        nom_edit =nomEditorialTXT.getText().isEmpty();
        

        boolean[] arraytxt = new boolean[]{ nom_edit};
        for (boolean elemento : arraytxt) {
            if (elemento == true) {

            } else {
                contver++;

            }

        }
        return contver == 1;

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
            java.util.logging.Logger.getLogger(vistaEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaEditorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarEditorialBTN;
    private javax.swing.JButton editarEditorialBTN;
    private javax.swing.JTable editorialTBL;
    private javax.swing.JButton eliminarEditorialBTN;
    private javax.swing.JButton finalizarEditorialBTN;
    private javax.swing.JTextField idEditorialTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomEditorialTXT;
    // End of variables declaration//GEN-END:variables
}
