import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        // Task 1: Working with String Methods
        System.out.println("=== Task 1: String Methods ===");
        String original = " Welcome to the Java String Lab! ";

        // length()
        System.out.println("Length: " + original.length());

        // charAt()
        System.out.println("Character at index 7: " + original.charAt(7));

        // substring()
        System.out.println("Substring (\"Java\"): " + original.substring(18, 22));

        // toUpperCase and toLowerCase
        System.out.println("Uppercase: " + original.toUpperCase());
        System.out.println("Lowercase: " + original.toLowerCase());

        // indexOf()
        System.out.println("Index of 'Java': " + original.indexOf("Java"));

        // contains()
        System.out.println("Contains 'Lab': " + original.contains("Lab"));

        // replace()
        System.out.println("Replace 'Java' with 'Java Programming': " + original.replace("Java", "Java Programming"));

        // split()
        String[] words = original.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }

        // trim()
        System.out.println("Trimmed: '" + original.trim() + "'");

        // equals() and equalsIgnoreCase()
        String compareStr = "java string lab!";
        System.out.println("Equals: " + original.trim().equals(compareStr));
        System.out.println("Equals Ignore Case: " + original.trim().equalsIgnoreCase(compareStr));

        // Task 2: Loop Challenges
        System.out.println("\n=== Task 2: Loop Challenges ===");

        // For loop: Count vowels
        int vowels = 0;
        String lowerOriginal = original.toLowerCase();
        for (int i = 0; i < lowerOriginal.length(); i++) {
            char ch = lowerOriginal.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            }
        }
        System.out.println("Number of vowels: " + vowels);

        // While loop: Palindrome check
        String word = "racecar";
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is '" + word + "' a palindrome? " + isPalindrome);

        // Do-while loop: Input validation
        Scanner scanner = new Scanner(System.in);
        String sentence;
        do {
            System.out.print("Enter a sentence that contains the word 'Java': ");
            sentence = scanner.nextLine();
        } while (!sentence.contains("Java"));
        System.out.println("Thank you!");

        // Task 3: StringBuilder
        System.out.println("\n=== Task 3: StringBuilder ===");
        StringBuilder sb = new StringBuilder("StringBuilder Lab");

        // append()
        sb.append(" - Learning Java");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + sb);

        // delete()
        int start = sb.indexOf("Learning");
        int end = start + "Learning".length();
        sb.delete(start, end);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("Reversed: " + sb);

        // Task 4: StringBuffer
        System.out.println("\n=== Task 4: StringBuffer ===");
        StringBuffer sbf = new StringBuffer("Multithreading Lab");

        // append()
        sbf.append(" - Learning Java");
        System.out.println("After append: " + sbf);

        // insert()
        sbf.insert(sbf.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + sbf);

        // delete()
        start = sbf.indexOf("Learning");
        end = start + "Learning".length();
        sbf.delete(start, end);
        System.out.println("After delete: " + sbf);

        // reverse()
        sbf.reverse();
        System.out.println("Reversed: " + sbf);
    }
}
