package arrays;

public class Exemplo {
    public static void main(String[] args) {
        // Array de uma dimensão (Vetor)
        int[] vetor = { 14, 17, 26, 50, 69, 67, 86, 98 };
        // System.out.println(vetor[0]);
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.println(vetor[indice]);
        }
        
        // Array de duas dimensões (Matriz)
        //                  0-0  0-1 0-2    1-0  1-1  1-2    2-0 2-1  2-2  2-3       3-0 3-1 3-2 
        int[][] matriz = { { 67, 60, 79 }, { 78, 801, 45 }, { 73, 36, 78, 99999 }, { 45, 67, 88 } };
        // System.out.println(matriz[0][0]);
        // System.out.println(matriz.length);
        for (int linha = 0; linha < matriz.length; linha++) {
            // Estou iterando sobre linhas
            System.out.println("---------- linha " + linha + " ------------------------ ");
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                // Estou iterando sobre as colunas da linha
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
        
        // Array 3D
        //                    0-0-0   0-0-1   0-1-0    0-1-1         1-0-0   1-0-1   1-1-0  1-1-1         
        int[][][] array3D = { { { 10,    68 }, { 67,     78   } }, { { 57,     67 }, { 78,    99 } }, { { 55, 89 }, { 07, 67 } } };
        // System.out.println(array3D[0][1][1]);
        for (int indiceA = 0; indiceA < array3D.length; indiceA++) {
            for (int indiceA2 = 0; indiceA2 < array3D[indiceA].length; indiceA2++) {
                for (int indiceA3 = 0; indiceA3 < array3D[indiceA][indiceA2].length; indiceA3++) {
                    System.out.println(indiceA + "-" + indiceA2 + "-" + indiceA3 + ": " + array3D[indiceA][indiceA2][indiceA3]);
                }
            }
        }
    }
}
