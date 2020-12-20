package ie.gmit.sw;

/**
 * Class Omicron (Client)
 *
 * The Omicron Class has been created to work as a Client.
 *
 * @author John Shields - G00348436
 * @version 1.1
 */
public class Omicron {
    /**
     * fields and methods
     * The Main method calls the class Kappa to execute the Iterator methods in the classes Beta, Epsilon, Zeta and Gamma to iterate over all instances of Beta, Epsilon, Zeta and Gamma.
     * The Main method calls the class Theta to execute the Update Greek Alpha method. The Update Greek Alpha method calls the Add, Remove and Has methods from the classes Beta, Epsilon, Zeta and Gamma and updates the states of Beta, Epsilon, Zeta and Gamma in a uniform way.
     * The Main method calls the class Theta to execute the Get Instance method  to create a singleton Instance of the Greek Alphabet from the class Delta.
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

        System.out.println("\n" + "Get a singleton instance of Greek Alphabet from Delta...");
        theta.getInstance();
    }

}
