package exercicio03;
    public class Produto{
        private Integer codigoID;
        private String nome;
        private double preco;
        private double descontoSite;

        public Produto(Integer codigoID, String nome, double preco, double descontoSite) {
            this.codigoID = codigoID;
            this.nome = nome;
            this.preco = preco;
            this.descontoSite = descontoSite;
        }

        public Integer getCodigoID() {
            return codigoID;
        }

        public void setCodigoID(Integer codigoID) {
            this.codigoID = codigoID;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public double getDescontoSite() {
            return descontoSite;
        }

        public void setDescontoSite(double descontoSite) {
            this.descontoSite = descontoSite;
        }

        // TODO: implemente o código-fonte de Produto.java
    }


