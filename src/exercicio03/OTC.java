package exercicio03;

    public class OTC extends Produto{
        private double precoPromocional;

        public OTC(Integer codigoID, String nome, double preco, double descontoSite, double precoPromocional) {
            super(codigoID, nome, preco, descontoSite);
            this.precoPromocional = precoPromocional;
        }


        public double getPrecoPromocional() {
            return precoPromocional;
        }

        public void setPrecoPromocional(double precoPromocional) {
            this.precoPromocional = precoPromocional;
        }

        // TODO: implemente o código-fonte de OTC.java




    }

