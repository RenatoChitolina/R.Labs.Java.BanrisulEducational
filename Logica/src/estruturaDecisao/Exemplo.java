package estruturaDecisao;

public class Exemplo {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 10;
        if (numero1 < numero2) {
            System.out.println("Numero 1 � definitivamente maior que n�mero 2");
            /*if (numero1 == numero2) {
                System.out.println("Numero 1 � definitivamente igual ao n�mero 2");
            } else {
                System.out.println("Numero 1 � definitivamente menor que n�mero 2");
            }*/
        } else if (numero1 == numero2) {
            System.out.println("Numero 1 � definitivamente igual ao n�mero 2");
        } else {
            System.out.println("Numero 1 � definitivamente menor que n�mero 2");
        }
        System.out.println("Pr�xima etapa");
        
        String fruta = "Abacate";
        switch (fruta) {
            case "Melancia":
                System.out.println("A fruta � uma melancia");
                break;
            case "Banana":
                System.out.println("A fruta � uma banana");
                break;
            case "Ma��":
                System.out.println("A fruta � uma ma��");
                break;
            case "Uva":
                System.out.println("A fruta � uma uva");
                break;
            default: 
                System.out.println("A fruta � um(a) " + fruta);
        }
    }  
}
