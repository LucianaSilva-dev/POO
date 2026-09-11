package Lista1;

import java.util.Scanner;

public class Questao3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo N: ");
        int N = scanner.nextInt();

        System.out.println("Números primos entre 2 e " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    public static boolean ehPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

