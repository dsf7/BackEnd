//package Aula3;
//
//import Aula2.Funcionario;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//public class MainTest {
//    Funcionario func1, func2;
//    Afiliado afi1, afi2, afi3;
//
//    @BeforeEach
//    public void doBefore(){
//        func1 = new Aula3.Funcionario("Pedro", "Camargo", 5);
//        func1.vender(2);
//
//        func2 = new Aula3.Funcionario("João", "Freitas");
//        func2.vender(2);
//
//        afi1 = new Afiliado("Daniel", "Fontoura", 5);
//        afi1.vender(4);
//
//        afi2 = new Afiliado("Paulo");
//        afi2.vender(1);
//
//        afi3 = new Afiliado("José");
//
//        func1.obterAfiliado(afi1);
//    }
//
//    @Test
//    public void mostrarVendedores(){
//        System.out.println(func1.mostrarCategoria);
//    }
//}
