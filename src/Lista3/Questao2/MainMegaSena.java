package Lista3.Questao2;

import java.util.Scanner;

public class MainMegaSena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MegaSena jogo = new MegaSena();

        while (!jogo.estaCompleto()) {
            System.out.print("Informe um número de 1 a 60: ");
            int n = sc.nextInt();
            jogo.adicionar(n);
        }

        jogo.exibirOrdenado();

    }
}
