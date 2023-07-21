package JUnit.Ejemplo1.Test.test;

import JUnit.Ejemplo1.Entidad.DiscountCalculator;
import JUnit.Ejemplo1.Servicios.DiscountCalculatorServices;
import org.junit.Before;
import org.junit.BeforeClass;

public class DiscountCalculatorTest {
	// La hacemos static para que mantenga el valor
	static DiscountCalculatorServices DCS ;
	@BeforeClass
	public static void setUp(){
		DCS = new DiscountCalculatorServices();
	}

	@Before
	public void crear(){

		DiscountCalculator calculadora = DCS.crearCalculadora();
	}





}
