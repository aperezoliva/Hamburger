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
public class HamburgerTestLogic1 {
	int numberOfBurgers = 1;
	double priceOfBurger = 2.30;
	Hamburger orderOne = new Hamburger(priceOfBurger, numberOfBurgers);
	Hamburger emptyOrder = new Hamburger();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPrice() {
		double hamburgerPrice = 1 *  2.30;
		assertEquals(hamburgerPrice, orderOne);
	}
	
	@Test
	public void testNotNullEmptyOrder() {
		assertNotNull(emptyOrder);
	}

}
