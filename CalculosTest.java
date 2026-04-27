import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculosTest {

    @Test
    void testeSomarDoisMaisDois() {
        Calculos calc = new Calculos(0);
        assertEquals(4, calc.somar(2, 2));
    }

    @Test
    void testeSomarDezMaisCinco() {
        Calculos calc = new Calculos(0);
        assertEquals(15, calc.somar(10, 5));
    }

    @Test
    void testeSomarNegativo() {
        Calculos calc = new Calculos(0);
        assertEquals(0, calc.somar(-1, 1));
    }

    @Test
    void testeErrado() {
        Calculos calc = new Calculos(0);
        assertEquals(4, calc.somar(2,2));
    }
}