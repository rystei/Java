package Heranca;

public class Secretario extends Funcionario {
    public Secretario(String nome, String cpf, double salario){
        super(nome,cpf,salario);
    }

    public int getPonto(){
        return this.getPontoPessoa();
    }
}