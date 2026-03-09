// Problem: Check if an Array is Sorted
// Concept: Array Traversal, Comparison

// Description:
// Determine whether a given array is sorted in ascending order.
// An array is considered sorted if every element is greater than
// or equal to the element before it.

// Example:
// Input: [1, 2, 3, 4, 1]

// Output:
// false

// Explanation:
// While traversing the array, if any element is found smaller
// than the previous element, the array is not sorted.

// Approach:
// - Start traversing the array from index 1.
// - Compare the current element n[i] with the previous element n[i-1].
// - If n[i] < n[i-1], return false because the array is not sorted.
// - If the loop completes without finding such a case, return true.
// - Print the result.

// Time Complexity: O(n)
// Space Complexity: O(1)

public class ArraySorted {

  public static boolean checkSorted(int n[]) {
    for (int i = 1; i < n.length; i++) {
      if (n[i] < n[i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int n[] = { 1, 2, 3, 4, 1 };
    System.out.println(checkSorted(n));
  }
}
