//package Aula3;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//
//public class Funcionario extends Vendedor{
//
//    private LocalDate dataInicio;
//    private ArrayList<Vendedor> afiliados = new ArrayList<>();
//
//    public Funcionario(String nome, String sobrenome, Integer pontuacao, Integer vendas, LocalDate dataInicio, Integer numeroAfiliados) {
//        super(nome, sobrenome, pontuacao, vendas);
//        this.dataInicio = dataInicio;
//        this.numeroAfiliados = numeroAfiliados;
//    }
//
//    public void obterAfiliado(Vendedor afiliado) {
//        this.afiliados.add(afiliado);
//        System.out.println(afiliado.nome + " agora é afiliado de " + super.nome + "  " + super.sobrenome);
//    }
//
//    public
//
//    @Override
//    public void vender() {
//        this.vendas = vendas+1;
//        System.out.println("O funcionário " + nome + "  " + sobrenome +
//                " realizou mais uma venda! Desde " + dataInicio + " realizou "
//                vendas + " vendas.");
//    }
//
//    @Override
//    public int calcularPontuacao() {
//        return
//                (this.afiliados.size()*10)+ (this.anosAntiguidade*5);
//        int pontuacao = 0;
//        LocalDate hoje = LocalDate.now();
//        int anosEmpresa = hoje.getYear() - dataInicio.getYear();
//        pontuacao += numeroAfiliados * 10;
//        pontuacao += vendas * 5;
//        pontuacao += anosEmpresa * 5;
//        return pontuacao;
//    }
//
//    @Override
//    public String mostrarCategoria() {
//        calcularPontuacao()
//        if pontuacao < 20 {
//            System.out.println("O funcionário " + nome + "  " + sobrenome + " é um vendedor novato. " +
//                            "Sua pontuação atual é de " + pontuacao);
//                    );
//        }
//        if pontuacao > 20 && < 31 {
//            System.out.println("O funcionário " + nome + "  " + sobrenome + " é um vendedor aprendiz.");
//        }
//        if pontuacao > 30 && < 41 {
//            System.out.println("O funcionário " + nome + "  " + sobrenome + " é um bom vendedor.");
//        }
//        else
//        }
//
//    }
//}
