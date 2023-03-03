package Heranca;

public class Gerente extends Funcionario{
    private int senha;
    private int numeroFuncionariosGerenciados;

    @Override
    public double getBonificacao(){
        return this.getSalario()*0.10 + 1000;
    }

    public Gerente(String nome, String cpf, double salario, int senha, int numeroFuncionariosGerenciados) {
        super(nome, cpf, salario);
        this.senha = senha;
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroFuncionariosGerenciados() {
        return numeroFuncionariosGerenciados;
    }

    public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }

    public boolean autentica(int senha) {
        return true;
    }



}