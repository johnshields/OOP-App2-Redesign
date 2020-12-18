/**
 * Class Theta
 * @author John Shields - G00348436
 * @version 1.0
 */
package ie.gmit.sw;
/**
 * all methods from Gamma, Zeta and Epsilon
 * Theta uses the interface Sigma to implement the methods of Beta, Gamma, Zeta and Epsilon
 * Theta can handle more complex situations
 */

public class Theta implements Sigma {
    public byte gamma(byte b) {
        return (byte) (Integer.reverse(b));
    }

    public int epsilon(int i) {
        return i & 0xFF000000;
    }

    public int zeta(int i) {
        return i & 0x000000FF;
    }

}
