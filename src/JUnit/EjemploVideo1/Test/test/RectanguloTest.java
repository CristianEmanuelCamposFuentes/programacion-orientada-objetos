package JUnit.EjemploVideo1.Test.test;

import JUnit.EjemploVideo1.Entidades.Rectangulo;
import org.junit.*;

import static org.junit.Assert.assertNotNull;

public class RectanguloTest {
	public RectanguloTest(){
	}

	@BeforeClass
	public static void setUpClass(){
	}

	@AfterClass
	public static void tearDownClass(){
	}

	@Before
	public void setUp(){
	}

	@After
	public void tearDown(){
	}

	@Test
	public void deberiaInicializarConColor(){
		// Este metodo dice que no debe ser null para devolver true
		assertNotNull(new Rectangulo(10,10).getColor());
	}
}
