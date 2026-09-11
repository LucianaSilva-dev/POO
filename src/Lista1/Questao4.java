package Lista1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite cinco números entre 1 e 30:");


        System.out.print("Número 1: ");
        int numero1 = input.nextInt();

        System.out.print("Número 2: ");
        int numero2 = input.nextInt();

        System.out.print("Número 3: ");
        int numero3 = input.nextInt();

        System.out.print("Número 4: ");
        int numero4 = input.nextInt();

        System.out.print("Número 5: ");
        int numero5 = input.nextInt();


        System.out.println("\nGráfico de barras:");
        exibirBarra(numero1);
        exibirBarra(numero2);
        exibirBarra(numero3);
        exibirBarra(numero4);
        exibirBarra(numero5);


    }

    public static void exibirBarra(int numero) {
        for (int j = 1; j <= numero; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
