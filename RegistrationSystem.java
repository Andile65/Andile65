import java.util.Scanner;
import java.util.HashMap;

public class RegistrationSystem {
    private HashMap<String, User> users = new HashMap<>();
    
    public void registerUser() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        
        if (users.containsKey(username)) {
            System.out.println("Username already exists. Try a different one.");
            return;
        }

        System.out.println("Enter Password: ");
        String password = scanner.nextLine();

        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();

        User newUser = new User(username, password, firstName, lastName);
        users.put(username, newUser);

        System.out.println("Registration successful!");
    }

    public void loginUser() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        
        System.out.println("Enter Password: ");
        String password = scanner.nextLine();
        
        if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
            System.out.println("Login successful! Welcome, " + users.get(username).getFirstName() + "!");
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
