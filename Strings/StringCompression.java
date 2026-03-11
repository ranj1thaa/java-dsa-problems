// Problem: String Compression
// Concept: String Traversal, Counting Consecutive Characters

// Description:
// Compress a string by replacing consecutive repeating characters
// with the character followed by its count.
// If a character appears only once, it remains unchanged.

// Example:
// Input: "aaabbbccdde"

// Output:
// a3b3c2d2e

// Explanation:
// 'a' appears 3 times → a3
// 'b' appears 3 times → b3
// 'c' appears 2 times → c2
// 'd' appears 2 times → d2
// 'e' appears 1 time → e

// Approach:
// - Traverse the string character by character.
// - Count how many times the current character repeats consecutively.
// - Append the character to a new string.
// - If the count is greater than 1, append the count as well.
// - Continue until the entire string is processed.
// - Print the compressed string.

// Time Complexity: O(n)
// Space Complexity: O(n)

public class StringCompression {
  public static void stringComress(String str) {
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {
      Integer count = 1;
      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
        count++;
        i++;
      }
      newStr += str.charAt(i);
      if (count > 1) {
        newStr += count.toString();
      }
    }
    System.out.println(newStr);
  }

  public static void main(String[] args) {
    String str = "aaabbbccdde";
    stringComress(str);
  }
}
