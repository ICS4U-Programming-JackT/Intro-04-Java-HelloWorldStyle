/**
* Print hello world in java.
* @author  Jack Turcotte
* @version 1.0
* @since   2025-09-05
*/

// Defines the class
public final class HelloWorldStyle {

    /**
     * This is a private constructor used to
     * satisfy the style checker.
     * @exception IllegalStateException Utility Class
     * @see IllegalStateException
     */
    private HelloWorldStyle() {
        throw new IllegalStateException("Utility Class");
    }

    /**
     * Main method.
     *
     * @param args Unused.
     */

    public static void main(final String[] args) {
        // Prints two text lines
        System.out.println("Hello, world!");
        System.out.println("This is hello world with style!");
    }
}
