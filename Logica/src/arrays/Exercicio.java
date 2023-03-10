package arrays;

public class Exercicio {
    public static void main(String[] args) {
        // Problema: Ler a diagonal principal de uma matriz quadrada, e somar valores
                              
        int[][] matrizQ = { { 5, 8, 5, 2 }, { 6, 5, 6, 4 }, { 5, 6, 5, 8 }, { 3, 6, 4, 5 } };
        
        int soma = 0;
        int colunaAtual = 0;
        
        for (int linhaAtual = 0; linhaAtual < matrizQ.length; linhaAtual++) {
            soma = soma + matrizQ[linhaAtual][colunaAtual];
            colunaAtual++;
        }
        
        System.out.println(soma);
    }
}
