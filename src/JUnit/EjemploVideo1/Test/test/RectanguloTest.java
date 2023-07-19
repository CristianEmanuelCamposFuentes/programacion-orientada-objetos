package JUnit.EjemploVideo1.Test.test;

import JUnit.EjemploVideo1.Entidades.Rectangulo;
import JUnit.EjemploVideo1.Servicios.RectanguloServicios;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RectanguloTest {
	public RectanguloTest(){
	}

	RectanguloServicios RS;

	@BeforeClass
	public static void setUpClass(){
	}

	@AfterClass
	public static void tearDownClass(){
	}

	@Before
	public void setUp(){
		RS = new RectanguloServicios();
	}

	@After
	public void tearDown(){
	}

	@Test
	public void deberiaInicializarConColor(){
		// Este metodo dice que no debe ser null para devolver true
		assertNotNull(new Rectangulo(10,10).getColor());
	}

	@Test
	public void deberiaCalcularArea(){
		assertEquals(100, RS.calcularArea(new Rectangulo(10,10)), 0);
		assertEquals(20, RS.calcularArea(new Rectangulo(4,5)), 0);
		assertEquals(1, RS.calcularArea(new Rectangulo(1,1)), 0);
	}

	@Test
	public void deberiaCalcularPerimetro(){
		assertEquals(40, RS.calcularPerimetro(new Rectangulo(10,10)),0);
		assertEquals(100, RS.calcularPerimetro(new Rectangulo(20,30)),0);
		assertEquals(30, RS.calcularPerimetro(new Rectangulo(5,10)),0);
	}
}
