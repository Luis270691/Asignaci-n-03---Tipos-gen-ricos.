
package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis Fernando
 */
public class BolsaGenTestTest {
    
    public BolsaGenTestTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   
    @Test
    public void testTestConstructorNegativo() {
        System.out.println("testConstructorNegativo");
        BolsaGenTest instance = new BolsaGenTest();
        instance.testConstructorNegativo();
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testTestAgregarYExtraer() {
        System.out.println("testAgregarYExtraer");
        BolsaGenTest instance = new BolsaGenTest();
        instance.testAgregarYExtraer();
        fail("The test case is a prototype.");
    }

  
    @Test
    public void testTestBolsaVaciaSaca() {
        System.out.println("testBolsaVaciaSaca");
        BolsaGenTest instance = new BolsaGenTest();
        instance.testBolsaVaciaSaca();
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testTestBolsaLlenaAgrega() {
        System.out.println("testBolsaLlenaAgrega");
        BolsaGenTest instance = new BolsaGenTest();
        instance.testBolsaLlenaAgrega();
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testTestSuma() {
        System.out.println("testSuma");
        BolsaGenTest instance = new BolsaGenTest();
        instance.testSuma();
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testTestPromedio() {
        System.out.println("testPromedio");
        BolsaGenTest instance = new BolsaGenTest();
        instance.testPromedio();
        fail("The test case is a prototype.");
    }
    
}
