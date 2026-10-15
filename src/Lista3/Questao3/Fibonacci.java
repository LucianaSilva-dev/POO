package Lista3.Questao3;

import java.util.Arrays;

public class Fibonacci {

    public int[] gerarFib(int numero) {
        int[] fib = new int[numero];

        if (numero >= 1) {
            fib[0] = 0;
        }
        if (numero >= 2) {
            fib[1] = 1;
        }
        for (int i = 2; i < numero; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public void exibir(int[] fib) {
        System.out.println(Arrays.toString(fib));
    }
}
