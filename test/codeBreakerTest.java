import static org.junit.Assert.*;

import org.junit.Test;


public class codeBreakerTest {
	int [] num;
	codeBreaker c;
	
	@Test
	public void all_rigth() {
		c = new codeBreaker();
		num = c.comprueba([2,7,3,4]);
		assertEquals("XXXX", num);
	}
	
	

}
