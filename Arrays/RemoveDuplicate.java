// Problem: Remove Duplicates from a Sorted Array
// Concept: Two Pointer Technique, Array Traversal

// Description:
// Remove duplicate elements from a sorted array and keep only unique elements. The array is modified in-place such that the first part of the array contains only the unique elements.

// Example:
// Input: [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]

// Output:
// Unique count: 5
// Modified Array (first 5 elements): [0, 1, 2, 3, 4]

// Explanation:
// Since the array is sorted, duplicate elements appear next to each other.
// We compare each element with the last unique element found.
// If it is different, we move it forward in the array.

// Approach:
// - Use two pointers: i and j.
// - Pointer i keeps track of the last unique element.
// - Start j from index 1 and traverse the array.
// - If nums[j] is different from nums[i], increment i and copy nums[j] to nums[i].
// - Continue until the end of the array.
// - The number of unique elements will be i + 1.
// - Print the count of unique elements.

// Time Complexity: O(n)

public class RemoveDuplicate {
  public static void removeDup(int nums[]) {
    int i = 0;

    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
      }
    }
    System.out.println(i + 1);
  }

  public static void main(String[] args) {
    int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    removeDup(nums);
  }
}
