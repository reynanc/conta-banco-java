import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");

        System.out.println("Usuário: ");
        int numero = scanner.nextInt();

        double saldo = 237.48;
        String cliente = "Mario Andrade";
        String agencia = "067-8";
        

        System.out.println("Olá"  + cliente + ",obrigado por criar uma conta em nosso banco, sua agência é" + agencia + "conta" + numero + "e seu saldo é" + saldo + 
        "já está disponível para saque.");

        }

}
