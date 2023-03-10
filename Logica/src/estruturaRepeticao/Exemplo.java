package estruturaRepeticao;

public class Exemplo {
    public static void main(String[] args) {
        // While
        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador++);
        }

        boolean condicao = true;
        while (condicao) {
            condicao = false;
        }

        int contadorW = 11;
        while (contadorW <= 10) {
            System.out.println(contadorW);
            contadorW++;
        }
        ;

        // Do-While
        int contadorDW = 11;
        do {
            System.out.println(contadorDW);
            contadorDW++;
        } while (contadorDW <= 10);

        // For
        /* Inicialização */ /* Condição */ /* Pós iteração */
        for (int contadorF = 1; contadorF <= 10; contadorF = contadorF + 1) {
            System.out.println(contadorF);
        }
    }
}
