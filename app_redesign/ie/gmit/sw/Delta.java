package ie.gmit.sw;

/**
 * Class Delta (Singleton)
 *
 * Everything has been removed from Delta and have been spread out among to the appropriate classes.
 * Delta has now been turned into a Singleton class.
 * Delta uses the Static Block Initialization to create a Singleton instance at the time of class loading.
 * This Static Block provides exception handling for the Instance.
 *
 * @author John Shields - G00348436
 * @version 1.1
 */
public class Delta {
    /**
     * fields and methods
     * Field declarations for Greek Alphabet Instance
     * The Delta constructor is private to make sure there is only one instance of the class Delta.
     * The Static Try Catch creates a Singleton Instance of Greek Alphabet for the class Delta.
     */
    private static final Delta greekAlphaInstance;

    private Delta() {}

    static {
        try {
            greekAlphaInstance = new Delta();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance of Greek Alphabet");
        }
    }
    /**
     * Get Greek Alpha Instance method
     * This method creates a singleton Instance of the Greek Alphabet.
     *
     * @return Greek Alpha Instance
     */
    public static Delta getGreekAlphaInstance() {
        return greekAlphaInstance;
    }
}
