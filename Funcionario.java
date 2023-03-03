package Heranca;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private int ponto;


    public double getBonificacao() {
        return this.salario*0.10;
    }
    public int getPonto(){
        return ponto;
    }
    public int getPontoPessoa(){
        return  ponto + 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
}