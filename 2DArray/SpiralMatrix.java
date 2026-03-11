// Problem: Print a Matrix in Spiral Order
// Concept: 2D Array Traversal, Boundary Control

// Description:
// Print all elements of a 2D matrix in spiral order.
// Spiral order means starting from the top-left corner,
// moving right → down → left → up repeatedly until all
// elements of the matrix are printed.

// Example:
// Input:
// 1   2   3   4
// 5   6   7   8
// 9  10  11  12
// 13 14  15  16

// Output:
// 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

// Explanation:
// First traverse the top row, then the right column,
// then the bottom row (in reverse), then the left column.
// After completing one layer, shrink the boundaries
// and repeat the process for the inner matrix.

// Approach:
// - Define four boundaries: startRow, endRow, startCol, endCol.
// - Print the top row from startCol → endCol.
// - Print the right column from startRow+1 → endRow.
// - Print the bottom row from endCol-1 → startCol.
// - Print the left column from endRow-1 → startRow+1.
// - After completing one layer, move the boundaries inward.
// - Continue until all elements are printed.

// Time Complexity: O(n × m)
// Space Complexity: O(1)

public class SpiralMatrix {

  public static void printSpiralMatrix(int n[][]) {
    int startRow = 0;
    int endRow = n.length - 1;
    int startCol = 0;
    int endCol = n[0].length - 1;

    while (startRow <= endRow && startCol <= endCol) {
      for (int j = startCol; j <= endCol; j++) {
        System.out.print(n[startRow][j] + " ");
      }
      for (int i = startRow + 1; i <= endRow; i++) {
        System.out.print(n[i][endCol] + " ");
      }
      for (int j = endCol - 1; j >= startCol; j--) {
        System.out.print(n[endRow][j] + " ");
      }
      for (int i = endRow - 1; i >= startRow + 1; i--) {
        System.out.print(n[i][startCol] + " ");
      }

      startCol++;
      endCol--;
      startRow++;
      endRow--;
    }
  }

  public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    printSpiralMatrix(matrix);
  }
}