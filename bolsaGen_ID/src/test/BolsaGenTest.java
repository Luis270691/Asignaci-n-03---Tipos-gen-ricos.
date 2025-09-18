package test;




import implementaciones.BolsaGen;
import implementaciones.BolsaGenNum;
import excepciones.BolsaException;
import org.junit.Test;
import static org.junit.Assert.*;


/* Clase de pruebas para BolsaGen y BolsaGenNum  */
public class BolsaGenTest {

    // ----------- PRUEBAS PARA BolsaGen<String> -----------

    @Test(expected = BolsaException.class)
    public void testConstructorNegativo() {
        new BolsaGen<String>(-5);
    }

    @Test
    public void testAgregarYExtraer() {
        BolsaGen<String> bolsa = new BolsaGen<>(3);
        bolsa.agrega("A");
        bolsa.agrega("B");

        assertEquals(2, bolsa.getNumObjetos());
        assertEquals("B", bolsa.saca());  
        assertEquals("A", bolsa.saca());
        assertTrue(bolsa.estaVacia());
    }

    @Test(expected = BolsaException.class)
    public void testBolsaVaciaSaca() {
        BolsaGen<String> bolsa = new BolsaGen<>(2);
        bolsa.saca();
    }

    @Test(expected = BolsaException.class)
    public void testBolsaLlenaAgrega() {
        BolsaGen<String> bolsa = new BolsaGen<>(1);
        bolsa.agrega("A");
        bolsa.agrega("B");
    }

    // ----------- PRUEBAS PARA BolsaGenNum<Integer> -----------

    @Test
    public void testSuma() {
        BolsaGenNum<Integer> bolsa = new BolsaGenNum<>(5);
        bolsa.agrega(10);
        bolsa.agrega(20);
        bolsa.agrega(30);

        assertEquals(60.0, bolsa.suma(), 0.0001);
    }

    @Test
    public void testPromedio() {
        BolsaGenNum<Integer> bolsa = new BolsaGenNum<>(3);
        bolsa.agrega(4);
        bolsa.agrega(6);
        bolsa.agrega(10);

        assertEquals(20.0/3, bolsa.p
