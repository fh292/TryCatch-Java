//Import Scanner Class:
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Create Scanner for Input:
        Scanner scanner = new Scanner(System.in);

        //Define Valid Credentials:
        String validUsername = "fh292";
        String validPassword = "fatma123";

        // Implement Attempt Counting
        for (int attempt = 1; attempt <= 5; attempt++) {
            try {
                System.out.println("Attempt #" + attempt);
                System.out.print("Enter your username: ");
                String username = scanner.nextLine();
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();

                if (!username.equals(validUsername) || !password.equals(validPassword)) {
                    System.out.println("Incorrect username and/or password.");
                    System.out.println("\n");
                } else {
                    System.out.println("You are logged in");
                    break;                }

                //Throw an Error After Maximum Attempts:
                if (attempt == 5) {
                    throw new Exception("Maximum attempts exceeded");
                }

            } catch (Exception e) {
                System.out.println("Maximum attempts exceeded");
            }
        }
//
//        //Introduce a Loop for Multiple Attempts:
//        while (true) {
//            //Implement Try-Catch for Input and Validation:
//            try {
//                System.out.print("Enter your username: ");
//                String username = scanner.nextLine();
//                System.out.print("Enter your password: ");
//                String password = scanner.nextLine();
//                if (!username.equals(validUsername) || !password.equals(validPassword)) {
//                    throw new Exception("Invalid credentials");
//                } else {
//                    System.out.println("You are logged in");
//                    break;
//                }
//            } catch (Exception e) {
//                System.out.println("Incorrect username and/or password.");
//            }
//        }

        //Close the Scanner:
        scanner.close();
    }
}