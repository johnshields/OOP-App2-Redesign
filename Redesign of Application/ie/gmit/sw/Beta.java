package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Class Beta
 *
 * The fields and the Add, Remove and Has methods for Beta have been taken from Delta and have been implemented into this class.
 *
 * @author John Shields - G00348436
 * @version 1.1
 */
public class Beta {
    /**
     * fields and methods
     * Array List Collection of Beta.
     * The add method updates Beta's state.
     * The remove method updates Beta's state.
     */
    private final Collection<Beta> betas = new ArrayList<>();

    /**
     * Beta byte
     *
     * @return (byte) (i ^ 0xFFFFFFFF)
     */
    public byte beta(byte b) {
        int i = b;
        return (byte) (i ^ 0xFFFFFFFF);
    }

    public void add(Beta beta) {
        System.out.println("add " + beta);
        betas.add(beta);
    }

    public void remove(Beta beta) {
        System.out.println("\n" + "remove " + beta);
        betas.remove(beta);
    }

    /**
     * hasBeta method
     *
     * @return betas.contains(beta)
     */
    public boolean hasBeta(Beta beta) {
        System.out.println("\n" + "has " + beta);
        return betas.contains(beta);
    }
}