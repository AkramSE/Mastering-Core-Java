/**
 * This class is to demonstrate what Javadoc is and how it is used in the Java industry.
 * This is an <i>italic</i> word.<p>This is a new paragraph.</p>
 * * @author Akram (Software Engineering Student)
 * @version 0.1
 * @since 2026
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */
public class JavaDocsDemo {

    /**
     * This method is used to return the division of two numbers.
     * Hello, this is the most beautiful method of this class!
     * * @param a First parameter - Integer (Dividend)
     * @param b Second parameter - Integer (Divisor)
     * @return Integer division of a and b
     * @throws ArithmeticException if divided by 0
     * @deprecated This method is deprecated, please use the '/' operator directly.
     */
    @Deprecated
    public int division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * @param args These are arguments supplied to the command line.
     */
    public static void main(String[] args) {
        System.out.println("I am the main method");
    }
}
