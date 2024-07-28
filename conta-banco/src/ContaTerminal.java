import java.util.Scanner;

public class ContaTerminal {
    

    public static void main(String[] args) throws Exception {

        /* 
         * 
         */

        Scanner scan = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da conta: ");
        numeroConta = scan.nextInt();

        System.out.print("Por favor, digite o número da agencia: ");
        agencia = scan.next();

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scan.nextLine();

        scan.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        scan.close();
    }
}
