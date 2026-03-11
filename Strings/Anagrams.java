// Problem: Check if Two Strings are Anagrams
// Concept: String, Sorting, Character Comparison

// Description:
// Two strings are called anagrams if they contain the same characters
// with the same frequency but possibly in a different order.

// Example:
// Input: s = "listen", t = "silent"
// Output: true

// Explanation:
// Both strings contain the same characters: l, i, s, t, e, n.

// Approach:
// - Convert both strings to character arrays.
// - Sort both arrays.
// - Compare the sorted arrays.
// - If they are equal, the strings are anagrams.

// Time Complexity: O(n log n)
// Space Complexity: O(n)

import java.util.Arrays;

public class Anagrams {
  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    char[] a = s.toCharArray();
    char[] b = t.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    return Arrays.equals(a, b);
  }

  public static void main(String[] args) {
    String s = "listen";
    String t = "silent";

    if (isAnagram(s, t)) {
      System.out.println("Anagram");
    } else {
      System.out.println("Not Anagram");
    }
  }
}