import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testCalculadora() {
		
		int x = 10;
		int y = 20;
		Calculadora cal = new Calculadora(x,y); 
		
		assertEquals(x+y,cal.somar());
		
		assertEquals(x-y,cal.subtrair());
		
		//assertEquals(x/y,cal.dividir());
		
		//assertEquals(x*y,cal.multiplicar());
		
		

	}
	
}
