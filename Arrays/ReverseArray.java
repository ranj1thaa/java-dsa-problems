// Problem: Reverse an Array
// Concept: Two-Pointer Technique, Array Traversal

// Description:
// Reverse the elements of an array in-place without using extra memory. The first element swaps with the last, the second with the second-last and this continues until the middle of the array is reached.

// Example:
// Input:  [10, 8, 6, 4, 2, 0]
// Output: [0, 2, 4, 6, 8, 10]

// Approach:
// - Initialize two pointers: start = 0 and end = n-1.
// - Swap the elements at start and end.
// - Move start forward (start++) and end backward (end--).
// - Continue swapping until start < end.
// - Finally print the reversed array.

// Time Complexity: O(n)
// Space Complexity: O(1)

public class ReverseArray {
  public static void revArray(int n[]) {
    int start = 0;
    int end = n.length - 1;

    while (start < end) {
      int temp = n[end];
      n[end] = n[start];
      n[start] = temp;

      start++;
      end--;
    }
  }

  public static void printArray(int n[]) {
    for (int i = 0; i < n.length; i++) {
      System.out.println(n[i]);
    }
  }

  public static void main(String[] args) {
    int n[] = { 10, 8, 6, 4, 2, 0 };
    revArray(n);
    printArray(n);
  }
}
