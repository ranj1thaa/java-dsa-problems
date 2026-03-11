// Problem: Reverse a String
// Concept: String Traversal

// Description:
// Given a string, reverse it and print the reversed string.

// Example:
// Input:  "hello"
// Output: "olleh"

// Approach:
// - Traverse the string from the last character to the first.
// - Print each character in reverse order.

// Time Complexity: O(n)
// Space Complexity: O(1)
public class ReverseString {
  public static void main(String[] args) {
    String s = "Geeks";
    for (int i = s.length() - 1; i >= 0; i--) {
      System.out.print(s.charAt(i));
    }
    System.out.println();
  }
}
