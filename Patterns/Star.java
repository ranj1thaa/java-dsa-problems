// Problem: Right Triangle Star Pattern
// Concept: Nested Loops
// Description: Print right-angled triangle pattern where  number of stars increases in each row from 1 to n.

// Pattern:
// *
// **
// ***
// ****

// Approach:
// Use an outer loop to control rows
// Use an inner loop to print stars equal to the row number

// Time Complexity: O(n^2)
// Space Complexity: O(1)

public class Star {
  public static void starPattern() {
    int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    starPattern();
  }
}