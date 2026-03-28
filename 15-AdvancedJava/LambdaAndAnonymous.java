/**
 * Demonstration of Anonymous Classes and Lambda Expressions.
 * Lambda expressions provide a clear and concise way to represent one method interface.
 */

@FunctionalInterface
interface DemoAno {
    void meth1(int a);
}

// 1. Traditional Way (Creating a separate class)
class HarryFunc implements DemoAno {
    @Override
    public void meth1(int a) {
        System.out.println("Traditional Class: Method 1 called with value " + a);
    }
}

public class LambdaAndAnonymous {
    public static void main(String[] args) {
        
        System.out.println("---> 1. Traditional Class Implementation <---");
        DemoAno obj1 = new HarryFunc();
        obj1.meth1(5);

        System.out.println("\n---> 2. Anonymous Class <---");
        // Creating a class on the fly without giving it a name
        DemoAno obj2 = new DemoAno() {
            @Override
            public void meth1(int a) {
                System.out.println("Anonymous Class: Method 1 called with value " + a);
            }
        };
        obj2.meth1(10);

        System.out.println("\n---> 3. Lambda Expression <---");
        // The most modern, concise way (Requires Functional Interface)
        DemoAno obj3 = (a) -> {
            System.out.println("Lambda Expression: Method 1 called with value " + a);
        };
        obj3.meth1(15);
    }
                               }
