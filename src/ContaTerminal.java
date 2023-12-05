import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Informe o número da conta: ");
        int numeroDaConta = read.nextInt();
        read.nextLine();
        System.out.println("Informe a agência: ");
        String agencia = read.nextLine();
        System.out.println("Informe o nome do cliente: ");
        String nomeCliente = read.nextLine();
        System.out.println("Informe o saldo: ");
        double saldo = read.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroDaConta, saldo);
    }
}