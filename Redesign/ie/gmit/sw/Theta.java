package ie.gmit.sw;

import java.util.LinkedList;

/**
 * Class Theta
 * @author John Shields - G00348436
 * @version 1.1
 */
public class Theta{
    /**
     * fields and methods
     * The Update Greek Alpha method calls the Add, Remove and Has methods from the Classes Beta, Epsilon, Zeta and Gamma and updates the states of Beta, Epsilon, Zeta and Gamma in a uniform way.
     */
    public void updateGreekAlpha(){
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

    // get a singleton instance
    public void getInstances(){
        Delta betaInstance = Delta.getInstance();
        System.out.println("\n" + "Beta Instance: " + System.identityHashCode(betaInstance));
        System.out.println((betaInstance.getLetterList()));
        LinkedList<String> betaLetters = betaInstance.getLetters(4);
        System.out.println("Beta: " + betaLetters);
        System.out.println((betaInstance.getLetterList()));
    }
}
