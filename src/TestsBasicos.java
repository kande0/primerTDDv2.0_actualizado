import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestsBasicos {
	
	private Calculadora calc;
	
	@Before
	public void setUp() throws Exception {
		calc = new Calculadora();
	}

	@Test
	public void Una_nueva_calculadora_debe_iniciar_en_cero_CarlosBlascoEspada() {
		assertEquals(0, calc.Valor());
	}
	
	@Test
	public void Sumar_2_mas_3_debe_dar_5_CarlosBlascoEspada() {
		calc.Sumar_CarlosBlascoEspada(2,3);
		assertEquals(5, calc.Valor());
	}
	
	@Test
	public void Sumar_4_mas_3_debe_dar_7_CarlosBlascoEspada() {
		calc.Sumar_CarlosBlascoEspada(4,3);
		assertEquals(7, calc.Valor());
	}
}