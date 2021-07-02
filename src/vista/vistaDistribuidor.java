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
import javax.swing.table.DefaultTableModel;
import modelo.Distribuidor;

/**
 *
 * @author MegaJoc
 */
public class vistaDistribuidor extends javax.swing.JFrame {

    ArrayList<Distribuidor> listaDistribuidor = new ArrayList<>();
    
    public vistaDistribuidor() {
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
        rutTXT = new javax.swing.JTextField();
        finalizarBTN = new javax.swing.JButton();
        agregarBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        distribuidorasTBL = new javax.swing.JTable();
        editarBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        anhoAperturaTXT = new javax.swing.JTextField();
        nombreTXT = new javax.swing.JTextField();
        direccionTXT = new javax.swing.JTextField();
        telefonoTXT = new javax.swing.JTextField();
        eliminarBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        idDistribuidoraTXT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setText("Menú de distribuidoras");

        jLabel2.setText("RUT");

        finalizarBTN.setText("Finalizar");

        agregarBTN.setText("Agregar");
        agregarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBTNActionPerformed(evt);
            }
        });

        distribuidorasTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id de distribuidora", "Rut", "Nombre", "Dirección", "Teléfono", "Año de apertura"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(distribuidorasTBL);

        editarBTN.setText("Editar");
        editarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBTNActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Dirección");

        jLabel5.setText("Teléfono");

        jLabel6.setText("Año de apertura");

        eliminarBTN.setText("Eliminar");
        eliminarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBTNActionPerformed(evt);
            }
        });

        jLabel7.setText("Id de distribuidora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(idDistribuidoraTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rutTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(direccionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefonoTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(anhoAperturaTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(agregarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(eliminarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(editarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(finalizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(idDistribuidoraTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rutTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(direccionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(telefonoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(anhoAperturaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(finalizarBTN))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBTNActionPerformed
        limpiarTabla();
        int id_dist;
        id_dist = Integer.parseInt(idDistribuidoraTXT.getText());
        Distribuidor d = new Distribuidor();
        d.borrarDistribuidor(id_dist);
        mostrarTabla();
    }//GEN-LAST:event_eliminarBTNActionPerformed

    private void agregarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBTNActionPerformed
        if (confirmaTextField()) {
            
            
            
            String rut = rutTXT.getText().toUpperCase();
            String nom_empresa = nombreTXT.getText().toUpperCase();
            String direccion = direccionTXT.getText().toUpperCase();
            int telefono = Integer.parseInt(telefonoTXT.getText());
            int anho_apertura = Integer.parseInt(anhoAperturaTXT.getText());

           
            
            
            
            
            Distribuidor d = new Distribuidor(rut, nom_empresa, direccion, telefono, anho_apertura);
            d.agregarDistribuidor(rut, nom_empresa, direccion, telefono, anho_apertura);

            limpiar();
            mostrarTabla();

            JOptionPane.showMessageDialog(new JFrame(), "Distribuidor agregado Satisfactoriamente");

        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Complete todos los campos por favor");

        }
    }//GEN-LAST:event_agregarBTNActionPerformed

    private void editarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBTNActionPerformed
        if (confirmaTextField()){
            int id_dist;
            int telefono;
            int anho_apertura;
            id_dist = Integer.parseInt(idDistribuidoraTXT.getText());
            String rut = rutTXT.getText().toUpperCase();
            String nom_empresa = nombreTXT.getText().toUpperCase();
            String direccion = direccionTXT.getText().toUpperCase();
            telefono = Integer.parseInt(telefonoTXT.getText());
            anho_apertura = Integer.parseInt(anhoAperturaTXT.getText());

            Distribuidor d = new Distribuidor(id_dist, rut, nom_empresa, direccion, telefono, anho_apertura);
            d.actualizarDistribuidor(id_dist, rut, nom_empresa, direccion, telefono, anho_apertura);
            limpiar();
            mostrarTabla();
            JOptionPane.showMessageDialog(new JFrame(), "Distribuidor editado satisfactoriamente");

        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Complete todos los campos por favor");

        }
    }//GEN-LAST:event_editarBTNActionPerformed

    public void mostrarTabla() {
        limpiarTabla();
        MySQLManager manager = new MySQLManager("localhost", "3306", "bibliotecafastdevelopment", "root", "");
        manager.executeQueryConsultaLLenaTablaDistribuidores(listaDistribuidor);
        String matriz[][] = new String[listaDistribuidor.size()][6];

        for (int i = 0; i < listaDistribuidor.size(); i++) {

            String iddist = Integer.toString(listaDistribuidor.get(i).getId_dist());
            String telefonoDist = Integer.toString(listaDistribuidor.get(i).getTelefono());
            String anhoAperturaDist = Integer.toString(listaDistribuidor.get(i).getAnho_apertura());

            matriz[i][0] = iddist;
            matriz[i][1] = listaDistribuidor.get(i).getRut();
            matriz[i][2] = listaDistribuidor.get(i).getNom_empresa();
            matriz[i][3] = listaDistribuidor.get(i).getDireccion();
            matriz[i][4] = telefonoDist;
            matriz[i][5] = anhoAperturaDist;

        }
        distribuidorasTBL.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Id de distribuidora", "Rut", "Nombre", "Dirección", "Teléfono", "Año de apertura"
                }
        ));

    }

    public void limpiarTabla() {
        for (int i = 0; i < listaDistribuidor.size(); i++) {
            listaDistribuidor.remove(i);
        }
               
    }
    
    private boolean confirmaTextField() {
        boolean rut = false;
        boolean nom_empresa = false;
        boolean direccion = false;
        boolean telefono = false;
        boolean anho_apertura = false;
        int contver = 0;

        rut = rutTXT.getText().isEmpty();
        nom_empresa = nombreTXT.getText().isEmpty();
        direccion = direccionTXT.getText().isEmpty();
        telefono = telefonoTXT.getText().isEmpty();
        anho_apertura = anhoAperturaTXT.getText().isEmpty();

        boolean[] arraytxt = new boolean[]{rut, nom_empresa, direccion, telefono, anho_apertura};
        for (boolean elemento : arraytxt) {
            if (elemento == true) {

            } else {
                contver++;

            }

        }
        return contver == 5;

    }
    
    private void limpiar() {
        rutTXT.setText("");
        nombreTXT.setText("");
        direccionTXT.setText("");
        telefonoTXT.setText("");
        anhoAperturaTXT.setText("");
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
            java.util.logging.Logger.getLogger(vistaDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaDistribuidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBTN;
    private javax.swing.JTextField anhoAperturaTXT;
    private javax.swing.JTextField direccionTXT;
    private javax.swing.JTable distribuidorasTBL;
    private javax.swing.JButton editarBTN;
    private javax.swing.JButton eliminarBTN;
    private javax.swing.JButton finalizarBTN;
    private javax.swing.JTextField idDistribuidoraTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreTXT;
    private javax.swing.JTextField rutTXT;
    private javax.swing.JTextField telefonoTXT;
    // End of variables declaration//GEN-END:variables
}
