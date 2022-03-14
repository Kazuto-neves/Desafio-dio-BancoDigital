/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package bancodigital.view;

import bancodigital.controller.modeloTableContaCorrente;
import bancodigital.controller.operacaoConta;
import bancodigital.model.contaCorrente;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kazuto
 */
public class JDcontaCorrente extends javax.swing.JDialog {

    private modeloTableContaCorrente mContaCorrente;

    /**
     * Creates new form JDcontaCorrente
     */
    public JDcontaCorrente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mContaCorrente = new modeloTableContaCorrente(new ArrayList<contaCorrente>());
        jTcontaCorrente.setModel(mContaCorrente);
    }

    public static int Confimar_Del() {
        return JOptionPane.showConfirmDialog(null, "Confirma a exclusao?", "Excluir", JOptionPane.YES_NO_OPTION);
    }

    public void liberar() {
        if (mContaCorrente.getRowCount() == 0) {
            jBmexer.setEnabled(false);
            jBexcluir.setEnabled(false);
            jBconsultar.setEnabled(false);
        } else {
            jBmexer.setEnabled(true);
            jBexcluir.setEnabled(true);
            jBconsultar.setEnabled(true);
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

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTcontaCorrente = new javax.swing.JTable();
        jLcontaCorrente = new javax.swing.JLabel();
        jBinserir = new javax.swing.JButton();
        jBmexer = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBconsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jSeparator1.setBackground(java.awt.Color.gray);
        jSeparator1.setForeground(java.awt.Color.red);

        jTcontaCorrente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTcontaCorrente);

        jLcontaCorrente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLcontaCorrente.setText("Conta Corrente");

        jBinserir.setText("Inserir");
        jBinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinserirActionPerformed(evt);
            }
        });

        jBmexer.setText("Mexer");
        jBmexer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmexerActionPerformed(evt);
            }
        });

        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });

        jBconsultar.setText("Consultar");
        jBconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBinserir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jBconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(jBmexer, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jSeparator1)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLcontaCorrente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLcontaCorrente)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBinserir)
                        .addComponent(jBconsultar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBexcluir)
                        .addComponent(jBmexer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        int indice = jTcontaCorrente.getSelectedRow();
        if (indice >= 0) {
            contaCorrente corrente = mContaCorrente.obterCorrente(indice);
            switch (Confimar_Del()) {
                case 0:
                    mContaCorrente.excluirContaCorrente(indice, corrente);
                    liberar();
                    break;
                case 2:
                    break;
            }
            liberar();
        }
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBmexerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmexerActionPerformed
        int indice = jTcontaCorrente.getSelectedRow();
        if (indice >= 0) {
            contaCorrente corrente = mContaCorrente.obterCorrente(indice);
            JDformConta.executar(null, operacaoConta.ocAlterar, corrente, "corrente");
        }
    }//GEN-LAST:event_jBmexerActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        int indice = jTcontaCorrente.getSelectedRow();
        if (indice >= 0) {
            contaCorrente corrente = mContaCorrente.obterCorrente(indice);
            JDformConta.executar(null, operacaoConta.ocConsultar, corrente, "corrente");
        }
    }//GEN-LAST:event_jBconsultarActionPerformed

    private void jBinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinserirActionPerformed
        contaCorrente corrente = new contaCorrente();
        if (JDformConta.executar(null, operacaoConta.ocIncerir, corrente, "corrente")) {
            mContaCorrente.incluirContaCorrente(corrente);
        }
        liberar();
    }//GEN-LAST:event_jBinserirActionPerformed

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
            java.util.logging.Logger.getLogger(JDcontaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDcontaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDcontaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDcontaCorrente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDcontaCorrente dialog = new JDcontaCorrente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBinserir;
    private javax.swing.JButton jBmexer;
    private javax.swing.JLabel jLcontaCorrente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTcontaCorrente;
    // End of variables declaration//GEN-END:variables
}