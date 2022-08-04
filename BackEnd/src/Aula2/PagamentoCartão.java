//package Aula2;
//
//import java.time.LocalDate;
//import java.util.Date;
//
//public abstract class PagamentoCartão {
//    private String numeroCartao;
//    private Date validade;
//    private String codigoSeguranca;
//    private Double valor;
//
//    public PagamentoCartão(String numeroCartao, Date validade, String codigoSeguranca, Double valor) {
//        this.numeroCartao = numeroCartao;
//        this.validade = validade;
//        this.codigoSeguranca = codigoSeguranca;
//        this.valor = valor;
//    }
//
//    public LocalDate dataAtual = LocalDate.now();
//
//    public static boolean verificarValidade(Date validade){
//        LocalDate d = LocalDate.now();
//       if this.validade.compareTo(LocalDate.now()) {
//
//        }
//    }
//
//    public abstract void processarPagamento();
//}
