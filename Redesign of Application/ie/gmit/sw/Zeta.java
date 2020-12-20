package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Class Zeta
 *
 *  The Add, Remove and Has methods for Zeta have been taken from Delta have been implemented into this class.
 *
 * @author John Shields - G00348436
 * @version 1.1
 */
public class Zeta {
    /**
     * fields and methods
     * Array List Collection of Zeta.
     * The add method updates Zeta.
     * The remove method updates Zeta.
     */
    private final Collection<Zeta> zetas = new ArrayList<>();

    /**
     * Zeta integer
     *
     * @return i & 0x000000FF
     */
    public int zeta(int i) {
        return i & 0x000000FF;
    }

    public void add(Zeta zeta) {
        zetas.add(zeta);
        System.out.println("add " + zeta);
    }

    public void remove(Zeta zeta) {
        zetas.remove(zeta);
        System.out.println("remove " + zeta);
    }

    /**
     * hasZeta method
     *
     * @return zetas.contains(zeta)
     */
    public boolean hasZeta(Zeta zeta) {
        System.out.println("has " + zeta);
        return zetas.contains(zeta);
    }
}