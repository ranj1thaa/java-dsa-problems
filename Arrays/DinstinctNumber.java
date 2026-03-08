// Problem: Contains Duplicate
// Concept: Array Traversal, Nested Loop Comparison

// Description:
// Given an integer array nums, return true if any value appears at least twice
// in the array, and return false if every element in the array is distinct.

// Example:
// Input:  [2, 4, 6, 8, 10]
// Output: false
// Explanation:
// All elements in the array are unique, so the function returns false.

// Input:  [1, 2, 3, 1]
// Output: true
// Explanation:
// The value 1 appears more than once in the array.

// Approach:
// - Traverse the array using two nested loops.
// - For each element n[i], compare it with all elements after it (n[j]).
// - If any pair of elements is equal, return true immediately.
// - If the loops finish without finding duplicates, return false.

// Time Complexity: O(n²)
// Space Complexity: O(1)
public class DinstinctNumber {
  public static boolean distinctNum(int n[]) {
    for (int i = 0; i < n.length; i++) {
      for (int j = i + 1; j < n.length; j++) {
        if (n[i] == n[j]) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int n[] = { 2, 4, 6, 8, 10 };
    System.out.println(distinctNum(n));
  }
}
