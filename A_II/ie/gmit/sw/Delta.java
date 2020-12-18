/**
 * Class Delta - Singleton
 * @author John Shields - G00348436
 * @version 1.0
 */
package ie.gmit.sw;
/**
 * all methods from Gamma, Zeta and Epsilon
 * Theta uses the interface Sigma to implement the methods of Beta, Gamma, Zeta and Epsilon
 * Theta can handle more complex situations
 */

import java.util.*;

public class Delta {
	private final Collection<Theta> greekAlpha = new ArrayList<>();
	private final Collection<Beta> betas = new ArrayList<>();

	public void add(Beta beta) {
		betas.add(beta);
	}

	// updating
	public void add(Theta thetas) {
		greekAlpha.add(thetas);

		System.out.println(thetas + "add beta, epsilon and zeta");
	}

	public void remove(Theta thetas) {
		greekAlpha.remove(thetas);

		System.out.println(thetas + "remove beta, epsilon and zeta");
	}

	// querying
	public Iterator<Beta> betaIterator(){
		return betas.iterator();
	}

	public void greekAlphaIterator() {

		System.out.println("iterate beta, epsilon and zeta");
		greekAlpha.iterator();
	}

	public boolean hasBeta(Beta beta) {
		return betas.contains(beta);
	}

	public boolean hasTheta(Theta theta) {

		System.out.println("iterate beta, epsilon and zeta");
		return greekAlpha.contains(theta);
	}
}