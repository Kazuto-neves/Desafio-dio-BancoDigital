package bancodigital.model;

public class contaCorrente extends conta{
    private double saldo;

    public contaCorrente() {}

    public contaCorrente(double saldo, String nomeCliente, String NomeBanco) {
        super(nomeCliente, NomeBanco);
        this.saldo = saldo;
    }

    public double getSaldo() {return saldo;}

    public void setSaldo(double saldo) {this.saldo = saldo;}
    
    
}
