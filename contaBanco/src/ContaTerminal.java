import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando e capturando os dados do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        
        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        
        // Exibindo a mensagem formatada com os dados fornecidos
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
        
        // Fechando o scanner
        scanner.close();
    }
}
