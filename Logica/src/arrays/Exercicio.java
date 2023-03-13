package arrays;

public class Exercicio {
    public static void main(String[] args) {

        // Problema 1: Ler a diagonal principal de uma matriz quadrada, e somar valores

        int[][] matrizQ = { { 5, 8, 5, 2 }, { 6, 5, 6, 4 }, { 5, 6, 5, 8 }, { 3, 6, 4, 5 } };

        int soma = 0;
        int colunaAtual = 0;

        for (int linhaAtual = 0; linhaAtual < matrizQ.length; linhaAtual++) {
            soma = soma + matrizQ[linhaAtual][colunaAtual];
            colunaAtual++;
        }

        System.out.println(soma);

        // Problema 2: Criar dois arrays de uma dimensão (vetores) de 50 posições com números aleatórios
        // ordená-los individualmente, combiná-los em uma única estrutura, e após, ordená-la novamente

        // Criar o 1º array (50 posições) com aleatórios
        int[] array1 = new int[50];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.round(Math.random() * 100);
        }

        // Ordená-lo
        for (int i = 0; i < array1.length; i++) {
            for (int i2 = i; i2 < array1.length; i2++) {
                if (array1[i] > array1[i2]) {
                    int aux = array1[i];
                    array1[i] = array1[i2];
                    array1[i2] = aux;
                }
            }
        }

        // Criar o 2º array (50 posições) com aleatórios
        int[] array2 = new int[50];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) Math.round(Math.random() * 100);
        }

        // Ordená-lo
        for (int i = 0; i < array2.length; i++) {
            for (int i2 = i; i2 < array2.length; i2++) {
                if (array2[i] > array2[i2]) {
                    int aux = array2[i];
                    array2[i] = array2[i2];
                    array2[i2] = aux;
                }
            }
        }

        // Criar um 3º array (100 posições) combinando os valores dos dois anteriores
        int[] array3 = new int[100];

        // // Percorrer array1 atribuindo seus valores ao novo array (pos 0 à 49)
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        // // Percorrer array2 atribuindo seus valores também ao novo array (pos 50 à 99)
        for (int i = 0; i < array2.length; i++) {
            array3[50 + i] = array2[i];
        }

        // Ordená-lo
        for (int i = 0; i < array3.length; i++) {
            for (int i2 = i; i2 < array3.length; i2++) {
                if (array3[i] > array3[i2]) {
                    int aux = array3[i];
                    array3[i] = array3[i2];
                    array3[i2] = aux;
                }
            }
        }

        // Resultado final
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
