// Problem: Count Vowel Substrings of a String
// Concept: Substring Expansion, Bitmasking

// Description:
// A vowel substring is a substring that:
// 1. Contains only vowels (a, e, i, o, u)
// 2. Contains all five vowels at least once
// The task is to count how many such substrings exist in the given string.

// Example:
// Input:  "aeiouu"
// Output: 2
//
// Valid vowel substrings:
// "aeiou"
// "aeiouu"

// Approach:
// - Start generating substrings from each index.
// - Use a bitmask to track which vowels are present.
// - Assign a unique bit to each vowel:
//      a -> 1
//      e -> 2
//      i -> 4
//      o -> 8
//      u -> 16
// - If mask becomes 31 (1+2+4+8+16), all vowels are present.
// - Increase the count.
// - Stop extending substring if a consonant appears.

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class CountVowelSubstrings {
  public static void print(String s) {
    int count = 0;
    int length = s.length();
    for (int i = 0; i < length; i++) {
      int mask = 0;
      for (int j = i; j < length; j++) {
        char ch = s.charAt(j);
        if (ch == 'a') {
          mask |= 1;
        } else if (ch == 'e') {
          mask |= 2;
        } else if (ch == 'i') {
          mask |= 4;
        } else if (ch == 'o') {
          mask |= 8;
        } else if (ch == 'u') {
          mask |= 16;
        } else {
          break;
        }
        if (mask == 31) {
          count++;
        }
      }
    }
    System.out.println(count);
  }

  public static void main(String[] args) {
    String s = "aeiouu";
    print(s);
  }
}