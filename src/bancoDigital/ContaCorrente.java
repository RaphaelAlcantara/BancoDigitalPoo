package bancoDigital;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void printExtrato() {
        System.out.println("====== Extrato Corrente ======");
        infoComum();
    }
}
