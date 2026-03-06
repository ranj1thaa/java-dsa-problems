// Problem: 0-1 Triangle Pattern
// Concept: Nested Loops, Pattern Logic

// Description:
// Print a triangle pattern consisting of 0s and 1s.  value depends on  sum of row and column indices.
// If (i + j) is even → print 1
// If (i + j) is odd → print 0

// Pattern:
// 1
// 0 1
// 1 0 1
// 0 1 0 1

// Approach:
// - Use an outer loop to iterate through rows
// - Use an inner loop to print elements in each row
// - Check if (row + column) is even or odd
// - Print 1 for even and 0 for odd

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class Triangle01 {
  public static void triangle01pattern() {
    int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1" + " ");
        } else {
          System.out.print("0" + " ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    triangle01pattern();
  }
}
