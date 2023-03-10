package aleatorios;

import java.util.Random;

public class Exemplo {
    public static void main(String[] args) {
        double aleatorio1 = Math.random() * 10;
        double aleatorio1Arredondado = Math.round(aleatorio1);
        System.out.println(aleatorio1Arredondado);
        
        Random sorteador = new Random();
        int aleatorio2 = sorteador.nextInt(1000);
        // boolean aleatorioBool = sorteador.nextBoolean();
        System.out.println(aleatorio2);
    }
}
