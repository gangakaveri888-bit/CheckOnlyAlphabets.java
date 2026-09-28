import java.util.Scanner;
public class CheckOnlyAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean onlyAlphabets = true;
       for (int i = 0; i < str.length(); i++) {
           if (!Character.isLetter(str.charAt(i))) {
                onlyAlphabets = false;
                break;
            }
        }
        if (onlyAlphabets) {
            System.out.println("String contains only alphabets.");
        } else {
            System.out.println("String contains other characters.");
        }
        sc.close();
    }
}
OUTPUT:
Enter a string: KAVERI8
String contains other characters.
