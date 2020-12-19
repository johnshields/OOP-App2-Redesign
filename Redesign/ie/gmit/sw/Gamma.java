package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Class Gamma
 * @author John Shields - G00348436
 * @version 1.1
 */
public class Gamma {
	/**
	 * fields and methods
	 * Array List Collection of Gamma.
	 * The add method updates Gamma.
	 * The remove method updates Gamma.
	 */
	private final Collection<Gamma> gammas = new ArrayList<>();
	/**
	 * Gamma byte
	 * @return (byte) (Integer.reverse(b))
	 */
	public byte gamma(byte b) {
		return (byte) (Integer.reverse(b));
	}

	public void add(Gamma gamma) {
		System.out.println("add " + gamma);
		gammas.add(gamma);
	}

	public void remove(Gamma gamma) {
		System.out.println("remove " + gamma);
		gammas.remove(gamma);
	}

	/**
	 * hasGamma method
	 * @return gammas.contains(gamma)
	 */
	public boolean hasGamma(Gamma gamma) {
		System.out.println("\n" + "has " + gamma);
		return gammas.contains(gamma);
	}

}