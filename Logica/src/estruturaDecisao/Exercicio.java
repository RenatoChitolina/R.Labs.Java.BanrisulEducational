package estruturaDecisao;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        // Problema: Criar um sistema em que possam ser aplicados
        // descontos progressivos em produtos
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o nome do produto");
        String nomeProduto = scan.nextLine();
        System.out.println("Informe o preço do produto");
        double precoUnitario = scan.nextDouble();
        System.out.println("Informe a quantidade");
        int quantidadeProduto = scan.nextInt();
        
        double valorTotal = precoUnitario * quantidadeProduto;
        
        double resultado;
        if (quantidadeProduto <= 10) { // Regra 1 
            resultado = valorTotal;
        } else if (quantidadeProduto <= 20) { // Regra 2
            resultado = valorTotal * 0.9;
        } else if (quantidadeProduto <= 50) { // Regra 3
            resultado = valorTotal * 0.8;
        } else { // Regra 4
            resultado = valorTotal * 0.75;
        }
                
        System.out.println("Produto: " + nomeProduto + " - R$: " + resultado);
    }
}
