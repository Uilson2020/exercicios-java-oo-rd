package exercicio01;

import java.util.Set;
import java.util.TreeSet;

public class Fibonacci {
}

    /**
     * Retorna um array contendo uma sequencia de números inteiros de Fibonacci.
     *
     * A sequencia de Fibonacci é aquela em que o valor do próximo número é igual a soma dos dois números
     * anteriores, começando por 1 e 2.
     *
     * Ex.:
     * Uma sequência Fibonacci de tamanho 10:
     *
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
     *
     * @param tamanho Tamanho da sequencia de números de Fibonacci a ser retornada.
     * @return int[]
     */

    /**public int[] getSequenciaFibonacciDe(int tamanho) {
        // TODO: implemente o código deste método
        //private int[] vetAux = new int[50];
        private int k;

        public static int fibo(int n) {
            k = 1; // inicializa k
            return getSequenciaFibonacciDe(n);
        }

        private long recursao(int n) {
            if (n < 0) {
                return n[0];
            } else {
                if (k < 3) {
                    n[n] = k - 1;
                    k++;
                } else {
                    n[n] = n[n + 1] + n[n + 2];
                }
                return getSequenciaFibonacciDe(n - 1);
            }
        }

    }/*

