// Problem: Find the Largest String in an Array
// Concept: String Comparison, Array Traversal, compareTo()

// Description:
// Find the lexicographically largest string from an array of strings.
// Lexicographical order means dictionary order (like words in a dictionary).

// Example:
// Input: ["apple", "banana", "grapes"]

// Output:
// Largest String: grapes

// Explanation:
// Using compareTo(), strings are compared alphabetically.
// "grapes" comes after "banana" and "apple" in dictionary order,
// so it is the largest string.

// Approach:
// - Assume the first string is the largest.
// - Traverse the array starting from index 1.
// - Compare the current string with the current largest using compareTo().
// - If the current string is larger, update the largest variable.
// - Continue until the end of the array.
// - Print the largest string.

// Time Complexity: O(n)
// Space Complexity: O(1)

public class LargestString {
  public static void largestStr(String str[]) {
    String largest = str[0];
    for (int i = 1; i < str.length; i++) {
      if (largest.compareTo(str[i]) < 0) {
        largest = str[i];
      }
    }
    System.out.println("Largest String: " + largest);
  }

  public static void main(String[] args) {
    String str[] = { "apple", "banana", "grapes" };
    largestStr(str);
  }
}
