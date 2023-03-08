package estruturaDecisao;

public class Exemplo {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 10;
        if (numero1 < numero2) {
            System.out.println("Numero 1 é definitivamente maior que número 2");
            /*if (numero1 == numero2) {
                System.out.println("Numero 1 é definitivamente igual ao número 2");
            } else {
                System.out.println("Numero 1 é definitivamente menor que número 2");
            }*/
        } else if (numero1 == numero2) {
            System.out.println("Numero 1 é definitivamente igual ao número 2");
        } else {
            System.out.println("Numero 1 é definitivamente menor que número 2");
        }
        System.out.println("Próxima etapa");
        
        String fruta = "Abacate";
        switch (fruta) {
            case "Melancia":
                System.out.println("A fruta é uma melancia");
                break;
            case "Banana":
                System.out.println("A fruta é uma banana");
                break;
            case "Maçã":
                System.out.println("A fruta é uma maçã");
                break;
            case "Uva":
                System.out.println("A fruta é uma uva");
                break;
            default: 
                System.out.println("A fruta é um(a) " + fruta);
        }
    }  
}
