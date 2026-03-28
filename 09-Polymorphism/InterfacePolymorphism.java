/**
 * Demonstration of Polymorphism using Interfaces.
 * A class implementing multiple interfaces can be restricted 
 * to act only as one of those interfaces based on its reference.
 */

interface MyCamera {
    void takeSnap();
    void recordVideo();
    default void record4KVideo() {
        System.out.println("Recording in 4K...");
    }
}

interface MyWifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MySmartPhone implements MyWifi, MyCamera {
    public void takeSnap() { System.out.println("Taking snap"); }
    public void recordVideo() { System.out.println("Recording video"); }
    
    public String[] getNetworks() {
        return new String[]{"Akram_5G", "Mohsin_Net"};
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
    public void sampleMeth() { System.out.println("Smartphone's specific method"); }
}

public class InterfacePolymorphism {
    public static void main(String[] args) {
        
        System.out.println("---> Polymorphism in Interfaces <---");
        
        // This is a smartphone, BUT we are using it strictly as a Camera!
        MyCamera cam1 = new MySmartPhone(); 
        
        cam1.record4KVideo();
        cam1.takeSnap();
        
        // cam1.getNetworks(); --> NOT ALLOWED (Not a Camera function)
        // cam1.sampleMeth();  --> NOT ALLOWED (Not a Camera function)
        
        System.out.println("\n---> Normal Object <---");
        // Using it as a full Smartphone
        MySmartPhone s = new MySmartPhone();
        s.sampleMeth();
        s.connectToNetwork(s.getNetworks()[0]);
    }
}
