import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistrationSystem system = new RegistrationSystem();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Welcome! Choose an option: ");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            
            switch (choice) {
                case 1:
                    system.registerUser();
                    break;
                case 2:
                    system.loginUser();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
