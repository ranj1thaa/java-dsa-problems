// Problem: Convert First Letter of Each Word to Uppercase
// Concept: String Traversal, Character Manipulation, StringBuilder

// Description:
// Convert the first letter of every word in a sentence to uppercase.
// Words are assumed to be separated by spaces.

// Example:
// Input: "hi, i am ranjitha"

// Output:
// "Hi, I Am Ranjitha"

// Explanation:
// The first character of the string and every character that
// follows a space is converted to uppercase.

// Approach:
// - Use a StringBuilder to build the new string.
// - Convert the first character of the string to uppercase.
// - Traverse the string starting from index 1.
// - If a space is found, append the space and convert the next character to uppercase.
// - Otherwise, append the character as it is.
// - Print the final modified string.

// Time Complexity: O(n)
// Space Complexity: O(n)

public class FirstLetterUppercase {
  public static void firstLetterUpperCase(String str) {
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for (int i = 1; i < str.length(); i++) {
      if (str.charAt(i) == ' ' && i < str.length() - 1) {
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      } else {
        sb.append(str.charAt(i));
      }
    }
    System.out.println(sb.toString());
  }

  public static void main(String[] args) {
    String str = "hi, i am Ranjitha";
    firstLetterUpperCase(str);
  }
}
