// Problem: Print All Pairs in an Array
// Concept: Nested Loops, Array Traversal

// Description:
// Print all possible unique pairs of elements present in an array. A pair consists of two elements where the second element comes after the first element in the array.

// Example:
// Input: [2, 4, 6, 8, 10]

// Output:
// (2,4) (2,6) (2,8) (2,10)
// (4,6) (4,8) (4,10)
// (6,8) (6,10)
// (8,10)

// Total Pairs: 10

// Approach:
// - Use an outer loop to select the first element of the pair.
// - Use an inner loop starting from i+1 to select the second element.
// - Print the pair (n[i], n[j]).
// - Increment a counter to track the total number of pairs.
// - Continue until all combinations are printed.

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class ArrayPairs {

  public static void pairsInArray(int n[]) {
    int totalPairs = 0;
    for (int i = 0; i < n.length; i++) {
      for (int j = i + 1; j < n.length; j++) {
        System.out.print("(" + n[i] + "," + n[j] + ")");
        totalPairs += 1;
      }
      System.out.println();
    }
    System.out.println("Total Pairs: " + totalPairs);
  }

  public static void main(String[] args) {
    int n[] = { 2, 4, 6, 8, 10 };
    pairsInArray(n);
  }
}
