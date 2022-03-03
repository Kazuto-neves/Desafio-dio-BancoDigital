package bancodigital.view;

import bancodigital.controller.modeloTableContaPoupanca;
import bancodigital.controller.operacaoConta;
import bancodigital.model.contaPoupanca;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JDcontaPoupanca extends javax.swing.JDialog {

    private modeloTableContaPoupanca mContaPoupanca;

    public JDcontaPoupanca(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mContaPoupanca = new modeloTableContaPoupanca(new ArrayList<contaPoupanca>());
        jTcontaPoupanca.setModel(mContaPoupanca);
    }

    public static int Confimar_Del() {
        return JOptionPane.showConfirmDialog(null, "Confirma a exclusao?", "Excluir", JOptionPane.YES_NO_OPTION);
    }

    public void liberar() {
        if (mContaPoupanca.getRowCount() == 0) {
            jBmexer.setEnabled(false);
            jBexcluir.setEnabled(false);
            jBconsultar.setEnabled(false);
        } else {
            jBmexer.setEnabled(true);
            jBexcluir.setEnabled(true);
            jBconsultar.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBexcluir = new javax.swing.JButton();
        jBmexer = new javax.swing.JButton();
        jBinserir = new javax.swing.JButton();
        jLcontaPoupanca = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTcontaPoupanca = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jBconsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
            }
        });

        jBmexer.setText("Mexer");
        jBmexer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmexerActionPerformed(evt);
            }
        });

        jBinserir.setText("Inserir");
        jBinserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinserirActionPerformed(evt);
            }
        });

        jLcontaPoupanca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLcontaPoupanca.setText("Conta Poupanca");

        jTcontaPoupanca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTcontaPoupanca);

        jSeparator1.setBackground(java.awt.Color.gray);
        jSeparator1.setForeground(java.awt.Color.red);

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
                .addGap(105, 105, 105)
                .addComponent(jBconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(jBmexer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLcontaPoupanca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLcontaPoupanca)
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

    private void jBinserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinserirActionPerformed
        contaPoupanca poupanca = new contaPoupanca();
        if (JDformConta.executar(null, operacaoConta.ocIncerir, poupanca, "poupanca")) {
            mContaPoupanca.incluirContaPoupanca(poupanca);
        }
        liberar();
    }//GEN-LAST:event_jBinserirActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        int indice = jTcontaPoupanca.getSelectedRow();
        if (indice >= 0) {
            contaPoupanca poupanca = mContaPoupanca.obterPoupanca(indice);
            JDformConta.executar(null, operacaoConta.ocConsultar, poupanca, "poupanca");
        }
    }//GEN-LAST:event_jBconsultarActionPerformed

    private void jBmexerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmexerActionPerformed
        int indice = jTcontaPoupanca.getSelectedRow();
        if (indice >= 0) {
            contaPoupanca poupanca = mContaPoupanca.obterPoupanca(indice);
            JDformConta.executar(null, operacaoConta.ocAlterar, poupanca, "poupanca");
        }
    }//GEN-LAST:event_jBmexerActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        int indice = jTcontaPoupanca.getSelectedRow();
        if (indice >= 0) {
            contaPoupanca poupanca = mContaPoupanca.obterPoupanca(indice);
            switch (Confimar_Del()) {
                case 0:
                    mContaPoupanca.excluirContaPoupanca(indice, poupanca);
                    liberar();
                    break;
                case 2:
                    break;
            }
            liberar();
        }
    }//GEN-LAST:event_jBexcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JDcontaPoupanca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDcontaPoupanca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDcontaPoupanca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDcontaPoupanca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDcontaPoupanca dialog = new JDcontaPoupanca(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLcontaPoupanca;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTcontaPoupanca;
    // End of variables declaration//GEN-END:variables
}
