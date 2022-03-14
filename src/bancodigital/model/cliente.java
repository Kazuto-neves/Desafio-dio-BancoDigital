
package bancodigital.model;

public class cliente extends banco{
    private String nomeCliente;

    public cliente() {}

    public cliente(String nomeCliente, String NomeBanco) {
        super(NomeBanco);
        this.nomeCliente = nomeCliente;
    }

    public String getNomeCliente() {return nomeCliente;}

    public void setNomeCliente(String nomeCliente) {this.nomeCliente = nomeCliente;}
}
