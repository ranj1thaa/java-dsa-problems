// Problem: Merge Two Sorted Arrays
// Concept: Two Pointer Technique, Array Traversal

// Description:
// Merge two sorted arrays into one sorted array.
// The first array (nums1) has enough space at the end to hold
// all elements of the second array (nums2).

// Example:
// Input:
// nums1 = [1, 2, 3, 0, 0, 0], m = 3
// nums2 = [2, 5, 6], n = 3

// Output:
// [1, 2, 2, 3, 5, 6]

// Explanation:
// Both arrays are already sorted.
// We compare elements from the end and place the larger
// element at the end of nums1.

// Approach:
// - Use three pointers:
//   i → last element of nums1's valid part (m-1)
//   j → last element of nums2 (n-1)
//   k → last position of nums1
// - Compare nums1[i] and nums2[j].
// - Place the larger element at nums1[k].
// - Move the pointers accordingly.
// - Continue until all elements of nums2 are placed.

// Time Complexity: O(m + n)
// Space Complexity: O(1)

public class MargeSortedArray {
  public static void mergeSorted(int nums1[], int nums2[], int m, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = nums1.length - 1;

    while (j >= 0) {
      if (i >= 0 && nums1[i] > nums2[j]) {
        nums1[k] = nums1[i];
        k--;
        i--;
      } else {
        nums1[k] = nums2[j];
        k--;
        j--;
      }
    }
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int[] nums2 = { 2, 5, 6 };
    int m = 3;
    int n = 3;
    mergeSorted(nums1, nums2, m, n);
    for (int i = 0; i < nums1.length; i++) {
      System.out.println(nums1[i]);
    }
  }
}
