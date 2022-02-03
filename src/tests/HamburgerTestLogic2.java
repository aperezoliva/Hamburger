/**
* Alexander Perez Oliva - aperezoliva
* CIS175
* Feb 2, 2022
*/
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Hamburger;

/**
 * @author krazy
 *
 */
public class HamburgerTestLogic2 {

	int numberOfBurgers = 5;
	double priceOfBurger = 1.30;
	Hamburger orderOne = new Hamburger(priceOfBurger, numberOfBurgers);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOrderString() {
		String orderList = "Hamburger price: $1.3, Number of burgers: 5";
		assertEquals(orderList, orderOne.printOrder());
	}
	
	@Test
	public void testFilledOrderNotNull() {
		assertNotNull(orderOne);
	}
	
	@Test
	public void orderLength() {
		String orderList = "Hamburger price: $1.3, Number of burgers: 5";
		int orderLength = orderList.length();
		assertTrue(orderLength == orderOne.printOrder().length());
	}
}
