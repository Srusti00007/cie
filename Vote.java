import java.util.Scanner; 

public class Vote { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter age:");
        int age = scanner.nextInt(); 

        if (age < 18) {
            System.out.println("Ineligible to vote");
        } else {
            System.out.println("Eligible to vote"); 
            System.out.println("Eligible to vote"); 

        }

        scanner.close(); 
    }
}
