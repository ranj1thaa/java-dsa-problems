// Problem: Count Vowels in a String
// Concept: String Traversal, Character Comparison

// Description:
// Count the number of vowels present in a given string.
// Vowels are the characters: a, e, i, o, u.

// Example:
// Input: hello
// Output:
// Count of vowels: 2

// Explanation:
// The vowels in "hello" are 'e' and 'o', so the total count is 2.

// Approach:
// - Take a string input from the user.
// - Initialize a counter variable to 0.
// - Traverse each character of the string using a loop.
// - Check if the character is a vowel (a, e, i, o, u).
// - If it is a vowel, increment the counter.
// - After traversing the entire string, print the total count.

// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.Scanner;

public class CountVowels {
  public static void countVowel(String str) {
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        count++;
      }
    }
    System.out.println("Count of vowels: " + count);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    countVowel(str);
  }
}
