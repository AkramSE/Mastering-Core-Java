/**
 * Demonstration of Advanced Interface concepts:
 * 1. Multiple inheritance (a class implementing multiple interfaces).
 * 2. Default methods in interfaces.
 * 3. Inheritance within interfaces.
 */

interface MyCamera {
    void takeSnap();
    void recordVideo();
    
    // Private method: can only be used within this interface
    private void greet() {
        System.out.println("Good Morning from Camera!");
    }
    
    // Default method: has a body, doesn't force implementation in classes
    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting...");
    }
}

// MySmartPhone inherits MyCellPhone and implements two interfaces
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {
    
    public void takeSnap() {
        System.out.println("Taking snap");
    }
    
    public void recordVideo() {
        System.out.println("Recording standard video");
    }
    
    public String[] getNetworks() {
        System.out.println("Getting List of Networks...");
        String[] networkList = {"Akram_5G", "Saddar_Net", "Mohsin_Wifi"};
        return networkList;
    }
    
    public void connectToNetwork(String network) {
        System.out.println("Connected securely to " + network);
    }
}

public class AdvancedInterfaces {
    public static void main(String[] args) {

        System.out.println("---> Multiple Inheritance & Default Methods <---");
        
        MySmartPhone ms = new MySmartPhone();
        
        // Calling default method
        ms.record4KVideo(); 
        
        // ms.greet(); // ERROR: private method cannot be accessed here
        
        // Implementing interface methods
        String[] networks = ms.getNetworks();
        for (String item : networks) {
            System.out.println("-> " + item);
        }
        ms.connectToNetwork(networks[0]);
        
        // Calling inherited class method
        ms.callNumber(123456789);
    }
}
