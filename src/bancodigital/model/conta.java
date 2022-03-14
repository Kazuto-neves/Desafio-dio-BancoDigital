package bancodigital.model;

public class conta extends cliente {

    private int agencia;
    private int numero;

    public conta() {}

    public conta(String nomeCliente, String NomeBanco) {super(nomeCliente, NomeBanco);}

    public int getAgencia() {return agencia;}

    public int getNumero() {return numero;}

    public void setAgencia(int agencia) {this.agencia = agencia;}

    public void setNumero(int numero) {this.numero = numero;}

}
