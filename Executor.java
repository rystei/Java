package CalculoFibonacci;

public class Executor {


    public static void main(String[] args) {

        Recursao recursao = new Recursao();
        System.out.println("fibonacci:");
        System.out.println(recursao.fibonacci(5));

        Recursao recursao1 = new Recursao();
        System.out.println("fatorial:");
        System.out.println(recursao.fatorial(5));

        Recursao recursao2 = new Recursao();
        System.out.println("Contar Digitos:");
        System.out.println(recursao2.ContarDigitos(2025));

        Recursao recursao3 = new Recursao();
        System.out.println("Somar Digitos:");
        System.out.println(recursao3.SomarDeDigitos(69));
    }
}

// Gustavo Cardoso Telles
