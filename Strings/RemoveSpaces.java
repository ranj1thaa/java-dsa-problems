// Problem: Remove Spaces from a String
// Concept: String Traversal

// Description:
// Given a string that may contain spaces, remove all the spaces
// and return a new string containing only the characters.

// Example:
// Input:  "geeks  for geeks"
// Output: "geeksforgeeks"

// Approach:
// - Traverse the string character by character.
// - Check if the current character is NOT a space (' ').
// - If it is not a space, append it to a new string.
// - Continue until the entire string is processed.
// - Print the final string without spaces.

// Time Complexity: O(n)
// Space Complexity: O(n)

public class RemoveSpaces {
  public static void main(String[] args) {
    String s = "geeks  for geeks";

    String word = "";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != ' ') {
        word += s.charAt(i);
      }
    }
    System.out.println(word);
  }
}
