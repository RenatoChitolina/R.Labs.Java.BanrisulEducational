package conceitos;

public class Exemplo {
    public static void main(String[] args) {
        Forno fornoCasa = new Forno();
        fornoCasa.tipo = "metal";
        System.out.println(fornoCasa.ligado + " em " + fornoCasa.temperatura  + " graus");
        fornoCasa.ligar(150);
        System.out.println(fornoCasa.ligado + " em " + fornoCasa.temperatura  + " graus");
        
        // Criar diferentes biscoitos a partir de sua fôrma
        Biscoito biscoitoDeNatal = new Biscoito(); // Instancia um novo objeto
        biscoitoDeNatal.forma = "Redondo";
        biscoitoDeNatal.ingredientes[0] = "Farinha de trigo";
        biscoitoDeNatal.ingredientes[1] = "Leite";
        biscoitoDeNatal.ingredientes[2] = "Açúcar";
        biscoitoDeNatal.ingredientes[3] = "Granulado colorido";
        System.out.println("Biscoito de natal pronto? " + biscoitoDeNatal.pronto);
        fornoCasa.assar(biscoitoDeNatal);
        System.out.println("Biscoito de natal pronto? " + biscoitoDeNatal.pronto);
        
        Biscoito amanteigado = new Biscoito(); // Instancia um novo objeto
        amanteigado.forma = "Quadrado";
        amanteigado.ingredientes[0] = "Farinha de trigo";
        amanteigado.ingredientes[1] = "Leite";
        amanteigado.ingredientes[2] = "Açúcar";
        amanteigado.ingredientes[3] = "Manteiga";
        System.out.println("Amanteigado pronto? " + amanteigado.pronto);
        fornoCasa.assar(amanteigado);
        System.out.println("Amanteigado pronto? " + amanteigado.pronto);
        
        Pessoa joao = new Pessoa(); // Instancia um novo objeto
        joao.nome = "João";
        joao.gostaDeBiscoito = true;
        boolean comeu = joao.comer(amanteigado);
        if (comeu == true) {
            System.out.println(joao.nome + " comeu o amanteigado");
        } else {
            System.out.println(joao.nome + " NÃO comeu o amanteigado");
        }
        
        Pessoa renato = new Pessoa(); // Instancia um novo objeto
        renato.nome = "Renato";
        renato.gostaDeBiscoito = false;
        boolean comeu2 = renato.comer(biscoitoDeNatal);
        if (comeu2 == true) {
            System.out.println(renato.nome + " comeu o amanteigado");
        } else {
            System.out.println(renato.nome + " NÃO comeu o amanteigado");
        }
    }
}
