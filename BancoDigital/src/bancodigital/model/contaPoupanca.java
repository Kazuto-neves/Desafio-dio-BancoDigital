package bancodigital.model;

public class contaPoupanca extends conta{
    private double saldo;

    public contaPoupanca() {}

    public contaPoupanca(double saldo, String nomeCliente, String NomeBanco) {
        super(nomeCliente, NomeBanco);
        this.saldo = saldo;
    }

    public double getSaldo() {return saldo;}
    
    public void setSaldo(double saldo) {this.saldo = saldo;}
}
