import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        String numeroConta = scanner.next();

        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.next();

        scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldoConta = scanner.nextDouble();
        
        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é: ")
                .concat(numeroAgencia)
                .concat(", conta: ")
                .concat(numeroConta)
                .concat(" e seu saldo R$ ")
                .concat(String.valueOf(saldoConta))
                .concat(" já está disponível para saque.");

        System.out.println(mensagem);

        scanner.close();
    }
}
