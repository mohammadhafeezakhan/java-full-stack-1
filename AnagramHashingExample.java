import java.util.HashSet;
import java.util.Scanner;

public class AnagramHashingExample {
    public static void main(String[] args) {
        String sentence = "a quick brown fox jumps over a lazy dog";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String input = scanner.nextLine().toLowerCase();

        HashSet<Character> inputLetters = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                inputLetters.add(c);
            }
        }

        System.out.println("Matching letters from sentence:");
    
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            for (Character inputChar : inputLetters) {
                if (ch == inputChar) {
                    System.out.print(ch + " ");
                    break; 
                }
            }
        }

        scanner.close();
    }
}