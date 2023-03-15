package String;
import java.util.Scanner;
public class Assement_5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();
        scanner.close();
        
        if (s1.length() != s2.length()) {
            System.out.println("The strings are not rotations of each other.");
            return;
        }
//        
        for (int i = 0; i < s1.length(); i++) {
            String s1Rotated = s1.substring(i) + s1.substring(0, i);
            if (s1Rotated.equals(s2)) {
                System.out.println("The strings are rotations of each other.");
                return;
            }
        }
        
        System.out.println("The strings are not rotations of each other.");
    }
}
