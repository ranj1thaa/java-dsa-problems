// Problem: Binary Search in a Sorted Array
// Concept: Divide and Conquer, Searching

// Description:
// Search for a given key in a sorted array using Binary Search. Instead of checking every element like Linear Search, Binary Search repeatedly divides the search space in half until the element is found or the search range becomes empty.

// Example:
// Array: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]
// Key: 20
// Output: 9  (index of the element)

// Approach:
// - Initialize two pointers: start = 0 and end = n-1.
// - Calculate the middle index using mid = (start + end) / 2.
// - If the middle element equals the key, return the index.
// - If the middle element is greater than the key, search the left half
//   by updating end = mid - 1.
// - If the middle element is smaller than the key, search the right half
//   by updating start = mid + 1.
// - Continue until start > end.
// - If the key is not found, return -1.

// Time Complexity: O(log n)
// Space Complexity: O(1)

public class BinarySearch {
  public static int binasrySearching(int n[], int key) {
    int start = 0;
    int end = n.length - 1;
    int midVal;

    while (start <= end) {
      midVal = (start + end) / 2;
      if (n[midVal] == key) {
        return midVal;
      } else if (n[midVal] > key) {
        end = midVal - 1;
      } else if (n[midVal] < key) {
        start = midVal + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int n[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };
    int key = 20;
    int res = binasrySearching(n, key);
    System.out.println((res == -1) ? "Not Found" : res);
  }
}
