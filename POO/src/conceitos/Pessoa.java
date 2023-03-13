package conceitos;

public class Pessoa {
    static String especie = "Humano";
    
    String nome = "";
    boolean gostaDeBiscoito;

    boolean comer(Biscoito biscoito) {
        if (this.gostaDeBiscoito) {
            // come o biscoito
            return true;
        } else {
            // Não vai comer
            return false;
        }
    }
}
