package Heranca;

public class ControleDePonto {

    private int TotalDePontos;
    public ControleDePonto(){

    }

    public double controle(Funcionario funcionario){
        return this.TotalDePontos += funcionario.getPonto();


        }
    public int getTotalDePontos(){
        return this.TotalDePontos;
    }
}
