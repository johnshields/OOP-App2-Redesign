package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Class Alpha
 *
 * The Add, Remove, Has and Iterator methods have been removed and have been spread out among to the appropriate classes.
 *
 * @author John Shields - G00348436
 * @version 1.1
 */
public class Alpha {
    /**
     * fields and methods
     * status from the Enum class Status.
     * Array List Collection of Beta.
     * The Alpha method connects the Alpha class with the Status enum.
     * The add method updates Beta using a switch statement to add Beta to the Status.
     */
    private final Status status;
    private final Collection<Beta> betas = new ArrayList<>();

    public Alpha(Status status) {
        this.status = status;
    }

    // switch statement
    public void add(Beta beta) {
        switch (status) {
            // case statements
            // values must be of same type of expression
            case Slight, Medium, Low -> betas.add(beta);
            case High, Extreme -> {
                Beta betas = new Beta();
                beta.add(betas);
            }
        }
    }

    /**
     * Get Status
     *
     * @return status
     */
    public Status getStatus() {
        return status;
    }

}