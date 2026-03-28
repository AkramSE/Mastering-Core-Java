/**
 * Demonstration of creating Custom Generic Classes in Java.
 * <T1, T2> means this class can accept any two data types 
 * defined by the user at the time of object creation.
 */

class MyGeneric<T1, T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public int getVal() { return val; }
    public void setVal(int val) { this.val = val; }

    public T1 getT1() { return t1; }
    public void setT1(T1 t1) { this.t1 = t1; }

    public T2 getT2() { return t2; }
    public void setT2(T2 t2) { this.t2 = t2; }
}

public class CustomGenericsDemo {
    public static void main(String[] args) {
        System.out.println("---> Custom Generic Class Demo <---");
        
        // Creating an object of our custom generic class.
        // We specify that T1 will be String, and T2 will be Integer.
        MyGeneric<String, Integer> g1 = new MyGeneric<>(23, "Hello Generics!", 45);
        
        // No typecasting needed!
        String str = g1.getT1();
        Integer num = g1.getT2();
        
        System.out.println("Value of val: " + g1.getVal());
        System.out.println("Value of T1: " + str);
        System.out.println("Value of T2: " + num);
    }
}
