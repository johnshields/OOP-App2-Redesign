package ie.gmit.sw;

/**
 * Class Theta
 *
 * The Theta Class has been created so the Omicron (Client) Class can access the Add, Remove and Has methods from the Classes Beta, Epsilon, Zeta and Gamma.
 * With Theta, Omicron can now create a Singleton Instance of the Greek Alphabet from the class Delta.
 *
 * @author John Shields - G00348436
 * @version 1.1
 */
public class Theta {
    /**
     * fields and methods
     * The Classes Beta, Epsilon, Zeta and Gamma are called
     * The Update Greek Alpha method calls the Add, Remove and Has methods from the Classes Beta, Epsilon, Zeta and Gamma and updates the states of Beta, Epsilon, Zeta and Gamma in a uniform way.
     * The Get Instance method creates a singleton Instance of the Greek Alphabet from Delta.
     */
    public void updateGreekAlpha() {
        Beta beta = new Beta();
        Epsilon epsilon = new Epsilon();
        Zeta zeta = new Zeta();
        Gamma gamma = new Gamma();

        beta.add(beta);
        epsilon.add(epsilon);
        zeta.add(zeta);
        gamma.add(gamma);

        beta.remove(beta);
        epsilon.remove(epsilon);
        zeta.remove(zeta);
        gamma.remove(gamma);

        beta.hasBeta(beta);
        zeta.hasZeta(zeta);
        epsilon.hasEpsilon(epsilon);
    }

    public void getInstance() {
        Delta greekAlphaInstance = Delta.getGreekAlphaInstance();
        System.out.println("Instance ID: " + System.identityHashCode(greekAlphaInstance));
    }
}
