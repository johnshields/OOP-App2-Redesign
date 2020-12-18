/**
 * Class Omicron - Client - Iterator
 * @author John Shields - G00348436
 * @version 1.0
 */

package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;

public class Omicron {
    private final Collection<Theta> greekAlpha = new ArrayList<>();
    Delta delta = new Delta();
    Theta theta = new Theta();

    public static void main(String[] args) {
        System.out.println("Iteration on all instances of Beta, Epsilon, Zeta and Gamma complete");
    }

    public void updateGreekAlpha(Theta thetas)
    {
        delta.add(thetas);
        delta.remove(thetas);

        delta.greekAlphaIterator();
        delta.hasTheta(thetas);
    }

    public void greekAlpha(Theta thetas)
    {

    }
}
