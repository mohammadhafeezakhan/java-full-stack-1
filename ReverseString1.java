import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = input.nextLine();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
        input.close();
    } // Ensure the closing bracket is correctly typed
}
