package Heranca;

public class Executor {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("Thiago", "001", 1500.0);
        //System.out.println(funcionario.getBonificacao());

//        Gerente gerente = new Gerente("Thiago", "0001", 3000.0);
//        gerente.setSalario(5000.0);
//        System.out.println(gerente.getBonificacao());

//        Gerente gerente = new Gerente("Thiago", "0001", 5000.0);
//        Funcionario funcionario = gerente;
//        System.out.println(funcionario.getBonificacao());

        ControleDeBonificacoes cdb = new ControleDeBonificacoes();

        Gerente funcionario1 = new Gerente("Thiago", "0001", 5000.0);
        cdb.registra(funcionario1);

        Funcionario funcionario2 = new Funcionario("Gabriel Furlan", "0002", 5000.0);
        cdb.registra(funcionario2);

        System.out.println(cdb.getTotalDeBonificacoes());



        ControleDePonto cdp = new ControleDePonto();

        Secretario funcionario3 = new Secretario( "Gustavo", "003", 4000.0);
        cdp.controle(funcionario3);
        Secretario funcionario4 = new Secretario( "Júlia", "004", 5000.0);
        cdp.controle(funcionario4);
        System.out.println(cdp.getTotalDePontos());

    }
}