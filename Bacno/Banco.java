package bancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta) {
        if (conta != null) {
            contas.add(conta);
        }
    }

    public void listarContas() {
        System.out.println("=== Contas do banco: " + nome + " ===");
        for (Conta conta : contas) {
            System.out.println(
                "Titular: " + conta.getCliente().getNome() +
                " | Ag: " + conta.getAgencia() +
                " | Nº: " + conta.getNumero() +
                String.format(" | Saldo: R$ ", conta.getSaldo())
            );
        }
    }
}
