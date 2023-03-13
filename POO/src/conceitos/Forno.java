package conceitos;

public class Forno {
    /* Características */
    String tipo = ""; // metal ou barro
    boolean ligado = false;
    double temperatura = 0;
    
    /* Comportamentos */
    void ligar(double temperatura) {
        this.temperatura = temperatura;
        this.ligado = true;
    }
    
    void assar(Biscoito biscoito) {
        // [...]
        biscoito.pronto = true;
    }
}
