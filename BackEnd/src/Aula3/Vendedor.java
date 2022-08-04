//package Aula3;
//
//public abstract class Vendedor {
//    protected String nome;
//    protected String sobrenome;
//    protected Integer pontuacao;
//    protected Integer vendas;
//
//    public Vendedor(String nome, String sobrenome, Integer pontuacao, Integer vendas) {
//        this.nome = nome;
//        this.sobrenome = sobrenome;
//        this.pontuacao = pontuacao;
//        this.vendas = vendas;
//    }
//
//    @Override
//    public String toString() {
//        return "Vendedor{" +
//                "nome='" + nome + '\'' +
//                ", sobrenome='" + sobrenome + '\'' +
//                ", pontuacao=" + pontuacao +
//                ", vendas=" + vendas +
//                '}';
//    }
//
//    public abstract void vender(int quantidadeVendas) {
//        this.vendas += quantidadeVendas;
//        System.out.println(this.nome + " " + this.sobrenome + " realizou " + quantidadeVendas + " vendas.");
//    }
//    public abstract int calcularPontuacao();
//    public abstract String mostrarCategoria() {
//        int pontosVendedor = calcularPontuacao();
//        return this.nome + " " + this.sobrenome + " tem um total de " + pontosVendedor + " pontos e é um vendedor "
//                + getNomeCategoria(pontosVendedor);
//    }
//
//    private String getNomeCategoria(int pontuacao){
//        if(pontuacao < 20) {
//            return "novato.";
//        }else if(pontuacao < 31){
//            return "aprendiz.";
//        } else if (pontuacao < 41) {
//            return "bom.";
//        } else {
//            return "mestre.";
//        }
//    }
//
//
//}
