public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println("Titular: " + getCliente().getNome());
        System.out.println("Saldo: " + getSaldo());
    }
}
