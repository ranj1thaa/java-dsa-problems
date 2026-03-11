// Problem: Find the Sum of Elements in the Second Row of a 2D Array
// Concept: 2D Array Traversal, Row Access

// Description:
// Given a 2D array (matrix), calculate the sum of all
// elements present in the second row.

// Example:
// Input Matrix:
// 1  2  3
// 4  5  6
// 7  8  9
//
// Second Row → 4 5 6
//
// Output:
// Sum of second row = 15

// Approach:
// - Access the second row using index 1 (since indexing starts from 0).
// - Traverse all columns of that row.
// - Add each element to a sum variable.
// - Print the final sum.

// Time Complexity: O(m)
// Space Complexity: O(1)

public class ArraySumSecRow {
  public static void printSum(int n[][]) {
    int sum = 0;
    for (int j = 0; j < n[0].length; j++) {
      sum += n[1][j];
    }
    System.out.println(sum);

  }

  public static void main(String[] args) {
    int n[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    printSum(n);
  }
}
