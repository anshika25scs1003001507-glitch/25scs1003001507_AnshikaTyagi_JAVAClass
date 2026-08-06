import java.util.Scanner;

public class A3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        
        System.out.print("Enter your email address: ");
        String email = sc.nextLine();
        
        System.out.println("\n----- User Details -----");
        System.out.println("Name  : " + fullName);
        System.out.println("Email : " + email);
        System.out.println("-------------------------");
        
        sc.close();
    }
}
