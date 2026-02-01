package bancoDigital;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco DIO");

        Cliente lari = new Cliente("Lari");
        Conta cc = new ContaCorrente(lari);
        Conta poupanca = new ContaPoupanca(lari);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(500);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();

        System.out.println();
        banco.listarContas();
    }
}
