package Lista1;

import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro:");
        int numero = scanner.nextInt();

        System.out.printf("\nnúmero: %d\n", numero);

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("número múltiplo de 3 e 5");
        } else if (numero % 3 == 0) {
            System.out.println("número múltiplo de 3");
        } else if (numero % 5 == 0) {
            System.out.println("número múltiplo de 5");
        } else {
            System.out.println("não é múltiplo nem de 3 nem de 5");
        }
    }
}
