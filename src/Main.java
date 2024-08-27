public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("Alice");
        Cliente cliente2 = new Cliente("Bob");

        // Criando contas para os clientes
        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        // Realizando operações nas contas
        contaCorrente.depositar(500.0);
        contaPoupanca.depositar(300.0);

        contaCorrente.transferir(100.0, contaPoupanca);

        // Imprimindo extratos
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
