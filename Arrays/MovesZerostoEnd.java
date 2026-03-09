// Problem: Move Zeros to the End of an Array
// Concept: Array Traversal, Two Pointer Technique, Swapping

// Description:
// Move all the zeros present in an array to the end while maintaining the relative order of the non-zero elements.

// Example:
// Input: [0, 1, 0, 3, 12]

// Output:
// [1, 3, 12, 0, 0]

// Explanation:
// All non-zero elements (1, 3, 12) are moved to the front
// while zeros are shifted to the end of the array.

// Approach:
// - Use a variable 'e' to track the position where the next non-zero element should go.
// - Traverse the array using a loop.
// - If the current element is not zero, swap it with the element at index 'e'.
// - Increment 'e' to move to the next position for a non-zero element.
// - Continue this process until the array is fully traversed.
// - After completion, all non-zero elements will be at the front
//   and zeros will automatically move to the end.

// Time Complexity: O(n)
// Space Complexity: O(1)

public class MovesZerostoEnd {

  public static void move(int n[]) {
    int e = 0;
    for (int i = 0; i < n.length; i++) {
      if (n[i] != 0) {
        int temp = n[i];
        n[i] = n[e];
        n[e] = temp;
        e++;

      }
    }
  }

  public static void main(String[] args) {
    int nums[] = { 0, 1, 0, 3, 12 };
    move(nums);
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }
}
