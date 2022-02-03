/**
* Alexander Perez Oliva - aperezoliva
* CIS175
* Feb 2, 2022
*/
package model;

/**
 * @author krazy
 *
 */
public class Hamburger {
	private double hamburgerCost;
	private int numberOfHamburgers;
	
	public double getHamburgerCost() {
		return hamburgerCost;
	}
	public void setHamburgerCost(double hamburgerCost) {
		this.hamburgerCost = hamburgerCost;
	}
	public int getNumberOfHamburgers() {
		return numberOfHamburgers;
	}
	public void setNumberOfHamburgers(int numberOfHamburgers) {
		this.numberOfHamburgers = numberOfHamburgers;
	}
	
	public double caculateCost() {
		return hamburgerCost  * numberOfHamburgers;
	}
	
	public String printOrder() {
		return "Hamburger price: $" + hamburgerCost + ", Number of burgers: " + numberOfHamburgers;
	}

	public Hamburger() {
		this.hamburgerCost = 0;
		this.numberOfHamburgers = 0;
	}
	
	public Hamburger(double cost, int number) {
		this.hamburgerCost = cost;
		this.numberOfHamburgers = number;
	}
}
