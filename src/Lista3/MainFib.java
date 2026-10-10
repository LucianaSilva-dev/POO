package Lista3;

import java.util.Scanner;

public class MainFib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci serie = new Fibonacci();

        int n;
        do {
            System.out.print("Informe quantos termos deseja (n >= 1): ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("Valor inválido.");
            }
        } while (n < 1);

        int[] resultado = serie.gerarFib(n);
        serie.exibir(resultado);

    }
}
