package ico.fes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 52551
 */
public class AritmeticaTest {
    Aritmetica instance;
    
    public AritmeticaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        //Bitacora
    }
    
    @AfterClass
    public static void tearDownClass() {
        //Bitacora
        
    }
    
    @Before
    public void setUp() {
        //Configuracion de la prueba
        instance = new Aritmetica(3, 4);
    }
    
    @After
    public void tearDown() {
        //Liberar objetos de prueba(recuperacion de memoria)
        instance = null;
    }

    @Test
    public void testSumar() {
        System.out.println("sumar");
        int expResult = 7;
        int result = instance.sumar();
        assertEquals(expResult, result);
    }

    @Test
    public void testRestar() {
        System.out.println("restar");
        int expResult = -1;
        int result = instance.restar();
        assertEquals(expResult, result);
    }
    
    @Test
    public void probarMultiplicar() {
        System.out.println("Multiplicar");
        int esperado = 12;
        int resultado = instance.multiplicar();
        assertEquals(esperado, resultado);
    }
}
