import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VetorExemploTest {
    private VetorExemplo vetorExemplo;

    @BeforeEach
    public void setUp() {
        vetorExemplo = new VetorExemplo();
    }

    @Test
    public void testNumeroEncontrado() {
        assertTrue(vetorExemplo.pesquisar(5));
    }

    @Test
    public void testNumeroNaoEncontrado() {
        assertFalse(vetorExemplo.pesquisar(11));
    }

    @Test
    public void testMaiorNumero() {
        assertEquals(10, vetorExemplo.maiorNumero());
    }

    @Test
    public void testMenorNumero() {
        assertEquals(1, vetorExemplo.menorNumero());
    }

    @Test
    public void testCalcularMedia() {
        assertEquals(5.5, vetorExemplo.calcularMedia(), 0.01);
    }
}
