import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao nosso sistema Java para conta de banco.\n");

        System.out.println("Por favor, digite o número da conta:\n");
        int numeroConta = sc.nextInt();

        sc.nextLine();

        System.out.println("Agora, o código da agência:\n");
        String agencia = sc.nextLine();

        System.out.println("Agora, o nome do cliente:\n");
        String nomeCliente = sc.nextLine();

        System.out.println("E por fim, o saldo deste cliente:\n");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é \n" +
                            agencia + ", conta " + numeroConta + " e  seu saldo " + saldo + " já está disponível para saque\".");
    }
}