import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da agência !");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o numero da conta !");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.println("Por favor, digite o saldo do cliente !");
        double saldo = Double.parseDouble(sc.nextLine());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %,.2f", nomeCliente, agencia, numero, saldo);

        sc.close();
    }
}