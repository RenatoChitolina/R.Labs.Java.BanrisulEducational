package operadores;

public class Exemplo {
    public static void main(String[] args) {
        // Operadores de atribuição
        int numero1 = 2;
        System.out.println(numero1);
        int numero2;
        numero2 = numero1;
        System.out.println(numero2);
        numero1 = 0;
        System.out.println(numero1);
        System.out.println(numero2);
        
        // Operadores aritméticos
        
        // Soma
        int soma = 5 + 5;
        System.out.println(soma);
        int soma2 = soma + 10;
        System.out.println(soma2);
        System.out.println(soma + soma2);
        // Função extra
        String primeiroNome = "Renato";
        String segundoNome = "Chitolina";
        String nome = primeiroNome + " " + segundoNome;
        System.out.println(nome);
        System.out.println("Renato" + " " + "Chitolina");
        
        // Subtração
        int sub = 10 - 5;
        System.out.println(sub);
        int sub2 = sub - 2;
        System.out.println(sub2);
        System.out.println(sub - sub2);
        
        // Multiplicação
        int mult = 3 * 3;
        System.out.println(mult);
        int mult2 = 3 * mult;
        System.out.println(mult2);
        
        // Divisão
        double div = 10.0 / 5;
        System.out.println(div);
        double div2 = 10.0 / 3;
        System.out.println(div2);
        // Módulo
        double mod = 10.0 % 3;
        System.out.println(mod);
        
        // Operadores de incremento / decremento
        int contador = 0;
        System.out.println(contador);
        // contador = contador + 1;
        int contador2 = ++contador;
        System.out.println(contador2);
        int contador3 = 10;
        System.out.println(--contador3);
        System.out.println(contador3--);
        System.out.println(contador3);
        
        // Operadores de atribuição e aritmética
        int numeroSoma = 1;
        // numeroSoma = numeroSoma + 100;
        numeroSoma += 100;
        System.out.println(numeroSoma);
        int numeroDivisao = 10;
        numeroDivisao /= 5;
        System.out.println(numeroDivisao);
        
        // Operadores de igualdade (ou diferença)
        // expressão = bloco que tem por finalidade retornar um resultado lógico
        boolean expr1 = 1 == 1;
        // boolean expr2 = -7 != -7;
        System.out.println(expr1);
        System.out.println(-7 != -7);
        
        // Operadores relacionais
        boolean expr3 = 9 <= 10; // true
        boolean expr4 = 1 >= 10; // false
        System.out.println(expr3);
        System.out.println(expr4);
        int numeroRel1 = 7;
        int numeroRel2 = 8;
        System.out.println(numeroRel1 < numeroRel2);
        
        // Operadores lógicos
        boolean expr5 = true;
        boolean expr6 = 5 <= 10; // true
        boolean expr7 = "AB" != "BA"; // true
        boolean resExpr = expr5 && expr6 && expr7; // E
        System.out.println(resExpr);
        boolean expr8 = false;
        boolean expr9 = 5 >= 10; // false
        boolean expr10 = "AB" != "BA"; // true
        boolean res2Expr = expr8 || expr9 || expr10; // OU
        System.out.println(res2Expr);
        int numSelecionado = 8;
        boolean res3Expr = numSelecionado == 0 || (numSelecionado <= 10 && numSelecionado > 0);
        System.out.println(res3Expr);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
