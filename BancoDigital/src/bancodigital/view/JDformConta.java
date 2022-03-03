/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package bancodigital.view;

import bancodigital.controller.modeloTableContaCorrente;
import bancodigital.controller.modeloTableContaPoupanca;
import bancodigital.controller.operacaoConta;
import bancodigital.model.contaCorrente;
import bancodigital.model.contaPoupanca;
import javax.swing.JOptionPane;

/**
 *
 * @author kazuto
 */
public class JDformConta extends javax.swing.JDialog {

    private operacaoConta conta;
    private contaCorrente corrente;
    private contaPoupanca poupanca;
    private boolean confirmado;
    private modeloTableContaCorrente contaCorrente;
    private modeloTableContaPoupanca contaPoupanca;
    boolean Valido = false;
    private String tipo;

    public static boolean executar(java.awt.Frame parent, operacaoConta oConta, contaCorrente corrente, String tipo) {
        JDformConta jDformConta = new JDformConta(parent, oConta, corrente, tipo);
        jDformConta.setLocationRelativeTo(null);
        jDformConta.setVisible(true);
        return jDformConta.operacaoConfirmada();
    }

    public static boolean executar(java.awt.Frame parent, operacaoConta oConta, contaPoupanca poupanca, String tipo) {
        JDformConta jDformConta = new JDformConta(parent, oConta, poupanca, tipo);
        jDformConta.setLocationRelativeTo(null);
        jDformConta.setVisible(true);
        return jDformConta.operacaoConfirmada();
    }

    public JDformConta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public JDformConta(java.awt.Frame parent, operacaoConta oConta, contaCorrente corrente, String tipo) {
        super(parent, true);//Abre como modal
        confirmado = false;
        this.tipo = tipo;
        this.conta = oConta;
        this.corrente = corrente;
        initComponents();
        if (oConta == operacaoConta.ocAlterar
                || oConta == operacaoConta.ocConsultar) {
            jTFbanco.setText(corrente.getNomeBanco());
            jTFcliente.setText(corrente.getNomeCliente());
            jFTFagencia.setText(Integer.toString(corrente.getAgencia()));
            jFTFnumero.setText(Integer.toString(corrente.getNumero()));
            jFTFsaldo.setText(Double.toString(corrente.getSaldo()));
            Valido = true;
        }
        jBsair.setVisible(oConta != operacaoConta.ocConsultar);
        jTFbanco.setEnabled(oConta != operacaoConta.ocConsultar);
        jFTFagencia.setEnabled(oConta != operacaoConta.ocConsultar);
        jFTFnumero.setEnabled(oConta != operacaoConta.ocConsultar);
        jFTFsaldo.setEnabled(oConta != operacaoConta.ocConsultar);
        jTFcliente.setEnabled(oConta != operacaoConta.ocConsultar);
    }

    public JDformConta(java.awt.Frame parent, operacaoConta oConta, contaPoupanca poupanca, String tipo) {
        super(parent, true);//Abre como modal
        confirmado = false;
        this.tipo = tipo;
        this.conta = oConta;
        this.poupanca = poupanca;
        initComponents();
        if (oConta == operacaoConta.ocAlterar
                || oConta == operacaoConta.ocConsultar) {
            jTFbanco.setText(poupanca.getNomeBanco());
            jTFcliente.setText(poupanca.getNomeCliente());
            jFTFagencia.setText(Integer.toString(poupanca.getAgencia()));
            jFTFnumero.setText(Integer.toString(poupanca.getNumero()));
            jFTFsaldo.setText(Double.toString(poupanca.getSaldo()));
            Valido = true;
        } else if (oConta == operacaoConta.ocIncerir) {
            jFTFagencia.setText(Integer.toString(poupanca.getAgencia()));
            jFTFnumero.setText(Integer.toString(poupanca.getNumero()));
        }
        jBsair.setVisible(oConta != operacaoConta.ocConsultar);
        jTFbanco.setEnabled(oConta != operacaoConta.ocConsultar);
        jFTFagencia.setEnabled(oConta != operacaoConta.ocConsultar);
        jFTFnumero.setEnabled(oConta != operacaoConta.ocConsultar);
        jFTFsaldo.setEnabled(oConta != operacaoConta.ocConsultar && oConta != operacaoConta.ocIncerir);
    }

    public boolean operacaoConfirmada() {
        return confirmado;
    }

    public void SaidaCerta(String tipo) {
        if (conta != operacaoConta.ocConsultar) {
            if (tipo.equals("corrente")) {
                corrente.setNomeBanco(jTFbanco.getText());
                corrente.setNomeCliente(jTFcliente.getText());
                corrente.setAgencia(Integer.parseInt(jFTFagencia.getText()));
                corrente.setNumero(Integer.parseInt(jFTFnumero.getText()));
                corrente.setSaldo(Double.parseDouble((jFTFsaldo.getText().isEmpty())?"0":jFTFsaldo.getText()));
                confirmado = true;
                dispose();
            } else {
                poupanca.setNomeBanco(jTFbanco.getText());
                poupanca.setNomeCliente(jTFcliente.getText());
                poupanca.setAgencia(Integer.parseInt(jFTFagencia.getText()));
                poupanca.setNumero(Integer.parseInt(jFTFnumero.getText()));
                poupanca.setSaldo(Double.parseDouble((jFTFsaldo.getText().isEmpty())?"0":jFTFsaldo.getText()));
                confirmado = true;
                dispose();
            }
        }
    }

    public void validador(String tipo) {
        if (jTFbanco.getText().isEmpty() || jTFcliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Nem todos os campos foram prenchidos.",
                    "Alerta",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            SaidaCerta(tipo);
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
        jLtitulo = new javax.swing.JLabel();
        jLbanco = new javax.swing.JLabel();
        jLcliente = new javax.swing.JLabel();
        jLagencia = new javax.swing.JLabel();
        jLnumero = new javax.swing.JLabel();
        jLsaldo = new javax.swing.JLabel();
        jTFbanco = new javax.swing.JTextField();
        jTFcliente = new javax.swing.JTextField();
        jFTFagencia = new javax.swing.JFormattedTextField();
        jFTFnumero = new javax.swing.JFormattedTextField();
        jFTFsaldo = new javax.swing.JFormattedTextField();
        jBenviar = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLtitulo.setText("Formulario de Contas");

        jLbanco.setText("Nome do Banco: ");

        jLcliente.setText("Nome do Cliente: ");

        jLagencia.setText("Agencia: ");

        jLnumero.setText("Numero: ");

        jLsaldo.setText("Saldo: ");

        jFTFagencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jFTFnumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jFTFsaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##0.00"))));
        jFTFsaldo.setText("0");

        jBenviar.setText("Enviar");
        jBenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBenviarActionPerformed(evt);
            }
        });

        jBsair.setText("Sair");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jLtitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBenviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLbanco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLagencia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLnumero, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLsaldo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFTFnumero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFTFsaldo)
                            .addComponent(jTFbanco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFcliente)
                            .addComponent(jFTFagencia)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 102, Short.MAX_VALUE)
                                .addComponent(jBsair, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLtitulo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbanco)
                    .addComponent(jTFbanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLcliente)
                    .addComponent(jTFcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLagencia)
                    .addComponent(jFTFagencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnumero)
                    .addComponent(jFTFnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLsaldo)
                    .addComponent(jFTFsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBenviar)
                    .addComponent(jBsair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBenviarActionPerformed
        if(conta == operacaoConta.ocConsultar){
            dispose();
        }else{
          validador(tipo);
        }
    }//GEN-LAST:event_jBenviarActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        dispose();
    }//GEN-LAST:event_jBsairActionPerformed

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
            java.util.logging.Logger.getLogger(JDformConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDformConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDformConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDformConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDformConta dialog = new JDformConta(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBenviar;
    private javax.swing.JButton jBsair;
    private javax.swing.JFormattedTextField jFTFagencia;
    private javax.swing.JFormattedTextField jFTFnumero;
    private javax.swing.JFormattedTextField jFTFsaldo;
    private javax.swing.JLabel jLagencia;
    private javax.swing.JLabel jLbanco;
    private javax.swing.JLabel jLcliente;
    private javax.swing.JLabel jLnumero;
    private javax.swing.JLabel jLsaldo;
    private javax.swing.JLabel jLtitulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFbanco;
    private javax.swing.JTextField jTFcliente;
    // End of variables declaration//GEN-END:variables
}
