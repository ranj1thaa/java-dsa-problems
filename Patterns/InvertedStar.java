// Problem: Inverted Star Triangle Pattern
// Concept: Nested Loops, Pattern Printing

// Description:
// Print an inverted right-angled triangle using stars. The number of stars decreases in each row from n to 1.

// Pattern (n = 4):
// ****
// ***
// **
// *

// Approach:
// - Outer loop starts from n and decreases to 1 to control rows.
// - Inner loop prints stars equal to the current row number.
// - After printing stars for a row, move to the next line.

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class InvertedStar {
  public static void invertedStarPattern() {
    int n = 4;
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    invertedStarPattern();
  }
}