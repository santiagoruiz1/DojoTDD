import static org.junit.Assert.*;

import org.junit.Test;


public class calculadoraTest {

	calculadora c;
	int r;
	
	@Test
	public void add_1_1() {
		c = new calculadora(); //Arrange
		r = c.add(1,1); //Act
		assertEquals(2, r); //Assert
	}
	
	@Test
	public void add_2_2(){
		c = new calculadora();
		r = c.add(2,2);
		assertEquals(4, r);
	}

}
