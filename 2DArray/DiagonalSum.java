// Problem: Find the Sum of Diagonals in a Matrix
// Concept: 2D Array Traversal, Diagonal Elements

// Description:
// Calculate the sum of the primary diagonal and secondary diagonal
// elements in a square matrix.

// Example:
// Input:
// 1   2   3   4
// 5   6   7   8
// 9  10  11  12
// 13 14  15  16

// Output:
// Diagonal Sum: 68

// Explanation:
// Primary Diagonal → 1 + 6 + 11 + 16 = 34
// Secondary Diagonal → 4 + 7 + 10 + 13 = 34
// Total Sum = 34 + 34 = 68

// Approach:
// - Traverse the matrix using nested loops.
// - If row index equals column index (i == j), it is a primary diagonal element.
// - If (i + j == n-1), it is a secondary diagonal element.
// - Add both elements to the sum.
// - Print the final sum.

// Time Complexity: O(n²)
// Space Complexity: O(1)
public class DiagonalSum {
  public static void printDiagnalSUm(int n[][]) {
    int sum = 0;
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        if (i == j) {
          sum += n[i][j];
        } else if (i + j == n.length - 1) {
          sum += n[i][j];
        }
      }
    }
  }

  public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    printDiagnalSUm(matrix);
  }
}

// for(int i=0;i<n.legth;i++){
// sum+=n[i][i];
// if(i!=n.length-1){
// sum+=n[i][n.length-i-1]
// }
// }
