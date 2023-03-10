package estruturaRepeticao;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        // Problema: Criar um contador Fibonacci
        // que responda at� dado n�mero
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um n�mero desejado: ");
        int numOjetivo = scan.nextInt();
        
        int num1 = 0; // Exce��o 1 e controle
        int num2 = 1; // Exce��o 2 e controle
        
        System.out.print(num1 + " " + num2 + " ");
        
        while (true) {
            // Pr�ximo = Atual + Anterior
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            
            if (num3 > numOjetivo) 
                break;
            
            System.out.print(num3 + " ");
        }
    }
}
