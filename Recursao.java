package CalculoFibonacci;



public class Recursao {
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n-1);
        }
    }

    public int ContarDigitos(int numero){
        if (numero < 10) {
            return 1;
        } else {
            return 1 + ContarDigitos(numero / 10);
        }
    }
    public  int SomarDeDigitos(int numero) {
        if (numero < 10) {
            return numero;
        } else {
            return (numero % 10) + SomarDeDigitos(numero / 10);
        }
    }
}


// Gustavo Cardoso Telles

