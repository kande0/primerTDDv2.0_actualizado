import static org.junit.Assert.*;

import org.junit.Test;

public class TestsBasicos {

	@Test
	public void Una_nueva_calculadora_debe_iniciar_en_cero() {
		Calculadora calc = new Calculadora();
		assertEquals(0, calc.Valor());
	}
	
	@Test
	public void Sumar_2_mas_3_debe_dar_5() {
		Calculadora calc = new Calculadora();
		calc.Sumar(2,3);
		assertEquals(5, calc.Valor());
	}

}
