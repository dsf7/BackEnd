package Aula2;

import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    @Test
    void Calculos(){
        Funcionario funcionario1 =
                new Efetivo(
                "Lucas",
                "Ferreira",
                "1234567891",
                        10000,
                        1,
                        5000);
        funcionario1.pagamentoSalario();
        Funcionario funcionario2 =
                new Contratado(
                        "Issao",
                        "Takeuchi",
                        "1234567892",
                        1000,
                        40);
        funcionario2.pagamentoSalario();
    }
}
