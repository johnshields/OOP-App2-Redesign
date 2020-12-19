package ie.gmit.sw;

/**
 * Class Omicron - Client
 * @author John Shields - G00348436
 * @version 1.1
 */
public class Omicron {
    /**
     * fields and methods
     * The Main method calls the Class Kappa to execute the Iterator methods in the Classes Beta, Epsilon, Zeta and Gamma to iterate over all instances of Beta, Epsilon, Zeta and Gamma.
     * The Main method calls the Class Theta to execute the Update Greek Alpha method. The Update Greek Alpha method calls the Add, Remove and Has methods from the Classes Beta, Epsilon, Zeta and Gamma and updates the states of Beta, Epsilon, Zeta and Gamma in a uniform way.
     */
    public static void main(String[] args) {
        Kappa kappaIterator = new Kappa();
        System.out.println("iterate over instances of Beta, Epsilon, Zeta, Gamma...");
        kappaIterator.betaIterator();
        kappaIterator.epsilonIterator();
        kappaIterator.zetaIterator();
        kappaIterator.gammaIterator();

        System.out.println("\n" + "Update Beta, Epsilon, Zeta and Gamma...");
        Theta theta = new Theta();
        theta.updateGreekAlpha();

        // get a singleton instance
        System.out.println("\n" + "Get a singleton instance...");
        theta.getInstances();
    }

}
