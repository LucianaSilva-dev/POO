package Lista3.Questao2;

import java.util.Arrays;

public class MegaSena {
    private int[] numeros = new int[6];
    private int contador;

    private boolean jaExiste(int n) {
        for (int i = 0; i < contador; i++) {
            if (numeros[i] == n) {
                return true;
            }
        }
        return false;
    }

    public boolean adicionar(int n) {
        if (n < 1 || n > 60) {
            System.out.println("Número fora da faixa (1 a 60).");
            return false;
        }
        if (jaExiste(n)) {
            System.out.println("Número já informado.");
            return false;
        }
        numeros[contador] = n;
        contador++;
        return true;
    }

    public boolean estaCompleto() {
        return contador == numeros.length;
    }

    public void exibirOrdenado() {
        Arrays.sort(numeros);
        System.out.println("Números ordenados: " + Arrays.toString(numeros));
    }
}