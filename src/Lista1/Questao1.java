package Lista1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a nota 1: ");
        float nota1 = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Informe a nota 2: ");
        float nota2 = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Informe a nota 3: ");
        float nota3 = scanner.nextFloat();
        scanner.nextLine();

        float media = (nota1 + nota2 + (nota3 * 2)) / 4;

        System.out.printf("Aluno: %s\n", nome);
        System.out.printf("A média do aluno é: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
