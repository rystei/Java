package Heranca;

public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0;

    public ControleDeBonificacoes() {
    }

    public void registra(Funcionario funcionario) {
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return this.totalDeBonificacoes;
    }
}