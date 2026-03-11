// Problem: Transpose of a Matrix
// Difficulty: Easy
// Concept: 2D Array, Matrix Transformation

// Description:
// The transpose of a matrix is obtained by converting rows into columns.
// Element at position (i, j) becomes (j, i).

// Example:
// Input Matrix:
// 2  3  7
// 5  6  7

// Transpose Matrix:
// 2  5
// 3  6
// 7  7

// Approach:
// - Create a new matrix with size [cols][rows].
// - Traverse the original matrix.
// - Assign transpose[j][i] = original[i][j].
// - Print the transpose matrix.

// Time Complexity: O(n * m)
// Space Complexity: O(n * m)

public class Transpose {

  public static void transposeMatrix(int n[][]) {

    int row = n.length;
    int col = n[0].length;

    int transpose[][] = new int[col][row];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        transpose[j][i] = n[i][j];
      }
    }

    printArray(transpose);
  }

  public static void printArray(int n[][]) {

    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        System.out.print(n[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    int n[][] = {
        { 2, 3, 7 },
        { 5, 6, 7 }
    };

    transposeMatrix(n);
  }
}