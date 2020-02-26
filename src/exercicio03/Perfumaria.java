package exercicio03;
    public class Perfumaria extends Produto{
        private double precoLMPM;
        private double precoPromocional;

        public Perfumaria(Integer codigoID, String nome, double preco, double descontoSite) {
            super(codigoID, nome, preco, descontoSite);
        }

        public Perfumaria(Integer codigoID, String nome, double preco, double descontoSite, double precoLMPM, double precoPromocional) {
            super(codigoID, nome, preco, descontoSite);
            this.precoLMPM = precoLMPM;
            this.precoPromocional = precoPromocional;
        }

        public double getPrecoLMPM() {
            return precoLMPM;
        }

        public void setPrecoLMPM(double precoLMPM) {
            this.precoLMPM = precoLMPM;
        }

        public double getPrecoPromocional() {
            return precoPromocional;
        }

        public void setPrecoPromocional(double precoPromocional) {
            this.precoPromocional = precoPromocional;
        }

        // TODO: implemente o código-fonte de Perfumaria.java
    }


