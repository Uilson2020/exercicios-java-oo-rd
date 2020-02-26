package exercicio02;

public class Gerente {
    private double salarioMensal;
    private double bonusAnualVariavel;
    // TODO: implemente o código desta classe
    public void salarioAnual(double salarioMensal, double bonusAnualVariavel){
        var bonus = (this.bonusAnualVariavel* this.salarioMensal);
        var v = (this.salarioMensal * 13) + bonusAnualVariavel ;
    }
}
