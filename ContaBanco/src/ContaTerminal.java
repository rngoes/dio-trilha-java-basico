import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta bancária!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da conta!");
        Double saldo = scanner.nextDouble();
        //Double saldo = 0.0;

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
