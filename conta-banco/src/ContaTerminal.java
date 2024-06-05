import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita e lê o número da conta
            System.out.println("Por favor, digite o número da conta:");
            int numero = scanner.nextInt();

            // Consumir a nova linha
            scanner.nextLine(); 

            // Solicita e lê a agência
            System.out.println("Por favor, digite o número da agência:");
            String agencia = scanner.nextLine();

            // Solicita e lê o nome do cliente
            System.out.println("Por favor, digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();

            // Solicita e lê o saldo
            System.out.println("Por favor, digite o saldo:");
            String saldoInput = scanner.nextLine();
            double saldo = Double.parseDouble(saldoInput.replace(",", "."));

            // Exibe a mensagem final com os dados coletados
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        } catch (NumberFormatException e) {
            System.out.println("Erro: O valor inserido para o saldo é inválido. Por favor, tente novamente.");
        } catch (Exception e) {
            System.out.println("Erro: Ocorreu um problema inesperado. Por favor, tente novamente.");
        } finally {
            // Fecha o scanner
            scanner.close();
        }
    }
}
