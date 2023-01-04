import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Scanner
        Scanner scanner = new Scanner(System.in, "ISO-8859-1").useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente:");
        // Permitir que o scanner reconheça uma linha
        scanner.nextLine();
        String cliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo do cliente:");
        float saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
