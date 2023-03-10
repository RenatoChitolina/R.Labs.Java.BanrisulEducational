package arrays;

public class Exemplo {
    public static void main(String[] args) {
        // Array de 1 dimensão (Vetor)
        // Índices       0   1   2   3   4   5   6   7
        int[] vetor = { 14, 17, 26, 50, 69, 67, 86, 98 };
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.println(vetor[indice]);
        }

        // Array de 2 dimensões (Matriz)
        // Índices          0-0 0-1 0-2     1-0  1-1 1-2     2-0 2-1 2-2    2-3     3-0 3-1 3-2
        int[][] matriz = { { 67, 60, 79 }, { 78, 801, 45 }, { 73, 36, 78, 99999 }, { 45, 67, 88 } };
        for (int linha = 0; linha < matriz.length; linha++) {
            // Estou iterando sobre linhas
            System.out.println("---------- linha " + linha + " ------------------------ ");
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                // Estou iterando sobre as colunas da linha
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        /*
         * Também é possível acessar uma "linha" inteira da matriz (tabela), salvando essa "linha" em um vetor (array de uma dimensão), permitindo
         * acesso facilitado às "colunas" dessa linha em separado. Ex.:
         */
        int[][] tabela = {
            { 3, 5, 54 }, // Essa é a linha 1
            { 78, 7, 8 }, // Essa é a linha 2
            { 9, 12, 56 } // Essa é a linha 3
        };
        int[] linha1 = tabela[0]; // Vai armazenar na variável um vetor (array de 1 dimensão) = { 3, 5, 54 }
        int[] linha2 = tabela[1]; // Vai armazenar na variável um vetor (array de 1 dimensão) = { 78, 7, 8 }
        int coluna1DaLinha2 = linha2[0]; // Coluna 1 = Índice 0 -> 78
        int coluna3DaLinha1 = linha1[2]; // Coluna 3 = Índice 2 -> 54
        
        // Array 3D
        // Índices             0-0-0  0-0-1  0-1-0  0-1-1      1-0-0  1-0-1  1-1-0  1-1-1   ...
        int[][][] array3D = { { { 10, 68 },   { 67, 78 } },   { { 57, 67 },   { 78, 99 } }, { { 55, 89 }, { 07, 67 } } };
        for (int indiceA = 0; indiceA < array3D.length; indiceA++) {
            for (int indiceA2 = 0; indiceA2 < array3D[indiceA].length; indiceA2++) {
                for (int indiceA3 = 0; indiceA3 < array3D[indiceA][indiceA2].length; indiceA3++) {
                    System.out.println(indiceA + "-" + indiceA2 + "-" + indiceA3 + ": " + array3D[indiceA][indiceA2][indiceA3]);
                }
            }
        }
    }
}
