package Lista2;
import java.util.Scanner;

public class MainContaCorrente {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Número da conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Titular: ");
            String titular = scanner.nextLine();

            ContaCorrente conta= new ContaCorrente(numero, titular);

            int opcao;
            do {
                System.out.println("\n===== MENU =====");
                System.out.println("1 - Sacar");
                System.out.println("2 - Depositar");
                System.out.println("3 - Consultar saldo");
                System.out.println("4 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Valor do saque: ");
                        float valorSaque = scanner.nextFloat();
                        if (conta.sacar(valorSaque)) {
                            System.out.println("Saque realizado com sucesso.");
                        } else {
                            System.out.println("Saque não realizado: valor inválido, acima de 10000 ou saldo insuficiente.");
                        }
                        break;

                    case 2:
                        System.out.print("Valor do depósito: ");
                        float valorDeposito = scanner.nextFloat();
                        if (conta.depositar(valorDeposito)) {
                            System.out.println("Depósito realizado com sucesso.");
                        } else {
                            System.out.println("Depósito não realizado: valor deve ser positivo e no máximo 10000.");
                        }
                        break;

                    case 3:
                        System.out.printf("Saldo atual: R$ %.2f%n", conta.consultarSaldo());
                        break;

                    case 4:
                        System.out.println("Encerrando o programa. Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 4);
    }
}
