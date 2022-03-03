package bancodigital.controller;

import bancodigital.model.contaPoupanca;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class modeloTableContaPoupanca extends AbstractTableModel{
    private static final int Col_Banco = 0;
    private static final int Col_nome = 1;
    private static final int Col_agencia = 2;
    private static final int Col_numero = 3;
    private static final int Col_saldo = 4;
    


    private String[] colunas = new String[]{"Banco","Nome","Agencia","Numero","Saldo"};
    private ArrayList<contaPoupanca> poupancas;
    
    public modeloTableContaPoupanca(ArrayList<contaPoupanca>poupancas){
        this.poupancas = new ArrayList<contaPoupanca>(poupancas);
    }

    @Override
        public int getColumnCount(){
        return colunas.length;
    }

    @Override
        public int getRowCount(){
        return poupancas.size();
    }

    @Override
        public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }

    @Override
        public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }

    @Override
        public Object getValueAt(int row, int col){
        contaPoupanca poupanca = this.poupancas.get(row);
        switch(col){
            case Col_Banco:
                return poupanca.getNomeBanco();
            case Col_nome:
                return poupanca.getNomeCliente();
            case Col_agencia:
                return poupanca.getAgencia();
            case Col_numero:
                return poupanca.getNumero();
            case Col_saldo:
                return poupanca.getSaldo();
        }
        return "";
    }

    @Override
        public void setValueAt(Object aValue, int row, int column){
        contaPoupanca poupanca = this.poupancas.get(row);
            switch(column){
                case Col_Banco:
                    poupanca.setNomeBanco(aValue.toString());
                    break;
                case Col_nome:
                    poupanca.setNomeCliente(aValue.toString());
                    break;
                case Col_agencia:
                    poupanca.setAgencia(Integer.parseInt(aValue.toString()));
                    break;
                case Col_numero:
                    poupanca.setNumero(Integer.parseInt(aValue.toString()));
                    break;
                case Col_saldo:
                    poupanca.setSaldo(Double.parseDouble(aValue.toString()));
                    break;
            }
        }

    public contaPoupanca obterPoupanca(int indice){return poupancas.get(indice);}

    public void incluirContaPoupanca(contaPoupanca poupanca){
        poupancas.add(poupanca);
        int ultimo = getRowCount()-1;
        fireTableRowsInserted(ultimo, ultimo);
    }

    public void atualizarContaPoupanca(int indice, contaPoupanca poupanca){
        poupancas.set(indice, poupanca);
        fireTableRowsUpdated(indice, indice);
    }

    public void excluirContaPoupanca(int indice,contaPoupanca poupanca){
        poupancas.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }
}
