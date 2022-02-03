/**
* Alexander Perez Oliva - aperezoliva
* CIS175
* Feb 2, 2022
*/
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author krazy
 *
 */
public class TestRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Result result = 
				JUnitCore.runClasses(HamburgerTestLogic1.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());

	}

}
