package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Class Epsilon
 * @author John Shields - G00348436
 * @version 1.1
 */
public class Epsilon {
	/**
	 * fields and methods
	 * Array List Collection of Epsilon.
	 * The add method updates Epsilon.
	 * The remove method updates Epsilon.
	 */
	private final Collection<Epsilon> epsilons = new ArrayList<>();
	/**
	 * Epsilon integer
	 * @return i & 0xFF000000
	 */
	public int epsilon(int i) {
		return i & 0xFF000000;
	}

	public void add(Epsilon epsilon) {
		System.out.println("add " + epsilon);
		epsilons.add(epsilon);
	}

	public void remove(Epsilon epsilon) {
		System.out.println("remove " + epsilon);
		epsilons.remove(epsilon);
	}

	/**
	 * hasEpsilon method
	 * @return betas.contains(beta);
	 */
	public boolean hasEpsilon(Epsilon epsilon) {
		System.out.println("has " + epsilon);
		return epsilons.contains(epsilon);
	}

}
