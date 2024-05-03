import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o numero da conta");
        int numberAccount = scanner.nextInt();

        System.out.println("Escreva a agencia da conta, por exemplo (067-8)");
        String agency = scanner.next();

        System.out.println("Escreva o seu nome");
        String userName = scanner.next();

        System.out.println("Escreva o saldo da conta");
        double balance = scanner.nextDouble();

        System.out.println("Olá " + userName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency
                + ", conta " + numberAccount + " e seu saldo " + balance + " já está disponível para saque");
    }
}
