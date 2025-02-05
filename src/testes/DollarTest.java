package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DollarTest {
	/*@Test
	public void testMultiplication() {
       Dollar five = new Dollar(5);
       five.times(2);
       assertEquals(10, five.amount);
    }
	
	@Test
	public void testMultiplication() {
	   Dollar five = new Dollar(5);
	   Dollar product = five.times(2);
	   assertEquals(10, product.amount);
	   product = five.times(3);
	   assertEquals(new Dollar(15), product);
	}*/
	
	@Test
	public void testMultiplication() {
	   Dollar five = new Dollar(5);
	   assertEquals(new Dollar(10), five.times(2));
	   assertEquals(new Dollar(15), five.times(3));
	}
	
	@Test
	public void testEquality() {
	   assertTrue(new Dollar(5).equals(new Dollar(5)));
	   assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
}