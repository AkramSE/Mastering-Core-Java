/**
 * Demonstration of Access Modifiers (Private) and Data Hiding.
 * Using Getters and Setters to access and modify private fields safely.
 */

class PrivateEmployee {
    private int id;
    private String name;

    // Getter and Setter for Name
    public String getName() { return name; }
    public void setName(String n) { name = n; }

    // Getter and Setter for ID
    public int getId() { return id; }
    public void setId(int i) { id = i; }
}

public class GettersAndSetters {
    public static void main(String[] args) {
        
        PrivateEmployee akram = new PrivateEmployee();
        
        // akram.id = 45; // Throws an error because id is private
        // akram.name = "Muhammad Akram"; // Throws an error because name is private
        
        // Correct way using Setters
        akram.setName("Muhammad Akram");
        akram.setId(234);
        
        // Correct way using Getters
        System.out.println("Employee Name: " + akram.getName());
        System.out.println("Employee ID: " + akram.getId());
    }
}
