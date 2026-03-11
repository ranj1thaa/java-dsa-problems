// Problem: Find the Sum of All Elements in a 2D Array
// Concept: 2D Array Traversal, Nested Loops

// Description:
// Given a 2D array (matrix), calculate the sum of all
// elements present in the matrix.

// Example:
// Input Matrix:
// 1  2  3
// 4  5  6
// 7  8  9
//
// Output:
// Sum = 45

// Approach:
// - Traverse the matrix using nested loops.
// - Add each element to a variable called sum.
// - Print the final sum after traversal.

// Time Complexity: O(n * m)
// Space Complexity: O(1)

public class ArraySum {
  public static void printSum(int n[][]) {
    int sum = 0;
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        sum += n[i][j];
      }
    }
    System.out.println(sum);
  }

  public static void main(String[] args) {
    int n[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    printSum(n);
  }
}
