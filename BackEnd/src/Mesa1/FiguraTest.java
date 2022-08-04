package Mesa1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiguraTest {

    Circulo c1;
    Quadrado q1;

    @BeforeEach
    void criarObjetos(){
        c1 = new Circulo(5.5);
        q1 = new Quadrado(3);
    }

    @Test
    void testando(){
        assertEquals(12, q1.calcularPerimetro());
        assertEquals(34.55751918948772, c1.calcularPerimetro());
    }



}
