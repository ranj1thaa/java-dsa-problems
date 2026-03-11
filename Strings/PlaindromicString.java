// Problem: Check if a String is Palindromic
// Concept: String Traversal, Two-Pointer Technique

// Description:
// A palindromic string is a string that reads the same
// forward and backward.

// Example:
// Input: "racecar"
// Output: true

// Explanation:
// The string "racecar" remains the same when reversed,
// so it is a palindrome.

// Approach:
// - Traverse the string from the beginning to the middle.
// - Compare the character at position i with the character
//   at position (length - 1 - i).
// - If any pair of characters does not match, return false.
// - If all characters match, return true.

// Time Complexity: O(n)
// Space Complexity: O(1)

public class PlaindromicString {
  public static boolean palindromString(String str) {
    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String madam = "racecar";
    System.out.println(palindromString(madam));

    ;
  }
}
