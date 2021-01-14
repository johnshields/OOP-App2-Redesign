package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Class Kappa (Iterator)
 *
 * Kappa has been created and it is inspired by the Iterator Pattern.
 * All the Iterator methods and fields for Beta, Epsilon, Zeta and Gamma have been taken from Delta and Alpha and have been implemented here.
 * Kappa provides a way to access the elements of Beta, Epsilon, Zeta and Gamma to hide them from the class Omicron (Client).
 *
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

    public void betaIterator() {
        Beta beta = new Beta();
        System.out.println("Iterate over " + beta);
        betas.iterator();
    }

    public void epsilonIterator() {
        Epsilon epsilon = new Epsilon();
        System.out.println("Iterate over " + epsilon);
        epsilons.iterator();
    }

    public void zetaIterator() {
        Zeta zeta = new Zeta();
        System.out.println("Iterate over " + zeta);
        zetas.iterator();
    }

    public void gammaIterator() {
        Gamma gamma = new Gamma();
        System.out.println("Iterate over " + gamma);
        gammas.iterator();
    }
}
