package exercicio02;

public class TecnicoManutencao {
    private double salarioMensal;
    private double adicionalInsalubridade;
    private double bonusAnual;

    // TODO: implemente o código desta classe
    public void salarioAnual(double salarioMensal, double adicionalInsalubridade){
        var bonusInsalub = (this.adicionalInsalubridade * this.salarioMensal);
        var v = (this.salarioMensal * 13) + bonusAnual + bonusInsalub;
    }


}
