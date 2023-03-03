package IntroducaoOO;

public class Conta {
    public int numeroConta;
    public String nomeTitular;
    public Double saldo;
    public String tipoConta;

    public Conta() {
        System.out.println("Construtor vazio.");
    }

    public Conta(int numeroConta, String nomeTitular, Double saldo, String tipoConta) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        System.out.println("Construtor com parâmetros.");
    }

    public void exibeBanco() {
        System.out.println("Banco Nubank.");
    }

    public void sacar(Double valor) {
        //this.extrato();
        if(valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Quantia informado maior do que o saldo disponível. Insira um novo valor");
        }
        //this.extrato();
    }

    public void depositar(Double valor) {
        //this.saldo = this.saldo + valor;
        //this.extrato();
        this.saldo += valor;
        //this.extrato();
    }

    public void extrato() {
        System.out.println("Numero da conta: " + this.numeroConta);
        System.out.println("Nome do Titular: " + this.nomeTitular);
        System.out.println("Saldo: " + this.saldo + "R$");
        System.out.println("Tipo de conta:" + this.tipoConta);
    }

    public void transferir(Conta contaTransferencia, Double valor){
        if(valor <= this.saldo) {
            this.saldo -= valor;
            contaTransferencia.saldo += valor;
            //this.extrato();
            //contaTransferencia.extrato();
        }
    }
}