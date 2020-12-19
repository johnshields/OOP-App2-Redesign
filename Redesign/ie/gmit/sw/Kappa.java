package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Class Kappa - Iterator
 * @author John Shields - G00348436
 * @version 1.1
 */
public class Kappa {
    /**
     * fields and methods
     * Array List Collection of Beta, Epsilon, Zetas and Gammas.
     * These Iterator methods iterate over all instances of Beta, Epsilon, Zeta, Gamma.
     */
    private final Collection<Beta> betas = new ArrayList<>();
    private final Collection<Epsilon> epsilons = new ArrayList<>();
    private final Collection<Zeta> zetas = new ArrayList<>();
    private final Collection<Gamma> gammas = new ArrayList<>();

    public void betaIterator(){
        Beta beta = new Beta();
        System.out.println("Iterate over " + beta);
        betas.iterator();
    }

    public void epsilonIterator(){
        Epsilon epsilon = new Epsilon();
        System.out.println("Iterate over " + epsilon);
        epsilons.iterator();
    }

    public void zetaIterator(){
        Zeta zeta = new Zeta();
        System.out.println("Iterate over " + zeta);
        zetas.iterator();
    }

    public void gammaIterator(){
        Gamma gamma = new Gamma();
        System.out.println("Iterate over " + gamma);
        gammas.iterator();
    }
}
