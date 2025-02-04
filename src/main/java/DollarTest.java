import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTest {
	/*public void test() {
		fail("Not yet implemented");
	}*/
	@Test
	public void testMultiplication() {
       Dollar five = new Dollar(5);
       five.times(2);
       assertEquals(10, five.amount);
    }
}
