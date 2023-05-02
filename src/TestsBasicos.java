import static org.junit.Assert.*;

import org.junit.Test;

public class TestsBasicos {

	@Test
	public void Una_nueva_calculadora_debe_iniciar_en_cero() {
		Calculadora calc = new Calculadora();
		assertEquals(0, calc.Valor());
	}

}
