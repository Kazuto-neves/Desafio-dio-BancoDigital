package bancodigital.controller;

import bancodigital.model.contaCorrente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class modeloTableContaCorrente extends AbstractTableModel{
    private static final int Col_Banco = 0;
    private static final int Col_nome = 1;
    private static final int Col_agencia = 2;
    private static final int Col_numero = 3;
    private static final int Col_saldo = 4;
    


    private String[] colunas = new String[]{"Banco","Nome","Agencia","Numero","Saldo"};
    private ArrayList<contaCorrente> correntes;
    
    public modeloTableContaCorrente(ArrayList<contaCorrente>correntes){
        this.correntes = new ArrayList<contaCorrente>(correntes);
    }

    @Override
        public int getColumnCount(){
        return colunas.length;
    }

    @Override
        public int getRowCount(){
        return correntes.size();
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
        contaCorrente corrente = this.correntes.get(row);
        switch(col){
            case Col_Banco:
                return corrente.getNomeBanco();
            case Col_nome:
                return corrente.getNomeCliente();
            case Col_agencia:
                return corrente.getAgencia();
            case Col_numero:
                return corrente.getNumero();
            case Col_saldo:
                return corrente.getSaldo();
        }
        return "";
    }

    @Override
        public void setValueAt(Object aValue, int row, int column){
        contaCorrente corrente = this.correntes.get(row);
            switch(column){
                case Col_Banco:
                    corrente.setNomeBanco(aValue.toString());
                    break;
                case Col_nome:
                    corrente.setNomeCliente(aValue.toString());
                    break;
                case Col_agencia:
                    corrente.setAgencia(Integer.parseInt(aValue.toString()));
                    break;
                case Col_numero:
                    corrente.setNumero(Integer.parseInt(aValue.toString()));
                    break;
                case Col_saldo:
                    corrente.setSaldo(Double.parseDouble(aValue.toString()));
                    break;
            }
        }

    public contaCorrente obterCorrente(int indice){return correntes.get(indice);}

    public void incluirContaCorrente(contaCorrente corrente){
        correntes.add(corrente);
        int ultimo = getRowCount()-1;
        fireTableRowsInserted(ultimo, ultimo);
    }

    public void atualizarContaCorrente(int indice, contaCorrente corrente){
        correntes.set(indice, corrente);
        fireTableRowsUpdated(indice, indice);
    }

    public void excluirContaCorrente(int indice,contaCorrente corrente){
        correntes.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }
}
