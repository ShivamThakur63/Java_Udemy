package Concepts.Array;
/**
 * This is a quick note on how to use the split function in Java.
 * 
 * The split function in Java is used to split a string into an array of substrings
 * based on a specified delimiter (which can be a regular expression).
 */

 public class SplitFunctionExamples {
    public static void main(String[] args) {
        // Example 1: Basic split by comma
        String str1 = "apple,banana,cherry";
        String[] fruits = str1.split(",");
        System.out.println("Example 1: Basic split by comma");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // Example 2: Split by whitespace using regex
        String str2 = "This is a test";
        String[] words = str2.split("\\s+");
        System.out.println("\nExample 2: Split by whitespace using regex");
        for (String word : words) {
            System.out.println(word);
        }
        
        // Example 3: Split by a specific character (space)
        String str3 = "one two three";
        String[] numbers = str3.split(" ");
        System.out.println("\nExample 3: Split by a specific character (space)");
        for (String number : numbers) {
            System.out.println(number);
        }
        
        // Example 4: Split by multiple delimiters (comma or semicolon)
        String str4 = "cat,dog;bird";
        String[] animals = str4.split("[,;]");
        System.out.println("\nExample 4: Split by multiple delimiters (comma or semicolon)");
        for (String animal : animals) {
            System.out.println(animal);
        }
        
        // Example 5: Limit the number of splits
        String str5 = "red,green,blue,yellow";
        String[] colors = str5.split(",", 2); // Split into a maximum of 2 parts
        System.out.println("\nExample 5: Limit the number of splits");
        for (String color : colors) {
            System.out.println(color);
        }
        
        // Example 6: Splitting and removing empty strings
        String str6 = "a,,b,c,,";
        String[] letters = str6.split(",", -1); // Negative limit keeps trailing empty strings
        System.out.println("\nExample 6: Splitting and removing empty strings");
        for (String letter : letters) {
            System.out.println(letter);
        }
    }
}

/**
 * Key points about the split function:
 * 
 * 1. Basic Usage:
 *    - `split(String regex)`: Splits the string based on the given regular expression.
 * 
 * 2. Split by Whitespace:
 *    - Use `\\s+` to split by one or more whitespace characters.
 * 
 * 3. Split by Specific Character:
 *    - Pass the character as a string, e.g., `split(" ")` to split by space.
 * 
 * 4. Split by Multiple Delimiters:
 *    - Use a character class in regex, e.g., `split("[,;]")` to split by comma or semicolon.
 * 
 * 5. Limiting the Number of Splits:
 *    - `split(String regex, int limit)`: Limits the number of splits, resulting in a maximum number of substrings.
 * 
 * 6. Handling Empty Strings:
 *    - By default, trailing empty strings are removed. To keep them, use a negative limit.
 */

