package exercicio02;

public abstract class Funcionario {
    // TODO: implemente o código desta classe
    private String nome;
    private double salarioMensal;

    public void salarioAnual(double salarioMensal){
        var v = this.salarioMensal * 13;
    }

}
