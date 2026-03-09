// Problem: Insertion Sort
// Concept: Sorting Algorithm, Array Traversal, Element Shifting

// Description:
// Sort the elements of an array in ascending order using the Insertion Sort algorithm.
// Insertion Sort works similar to how we sort playing cards in our hand.
// It takes one element at a time and inserts it into its correct position
// in the already sorted part of the array.

// Example:
// Input: [5, 4, 1, 3, 2]

// Output:
// 1
// 2
// 3
// 4
// 5

// Explanation:
// The algorithm assumes the first element is already sorted.
// Then it picks the next element and inserts it into the correct
// position in the sorted portion by shifting larger elements to the right.

// Approach:
// - Start from index 1 since the first element is considered sorted.
// - Store the current element in a variable (curr).
// - Compare it with the elements before it.
// - Shift elements that are greater than curr one position to the right.
// - Insert curr into its correct position.
// - Repeat the process until the entire array is sorted.

// Time Complexity:
// Best Case: O(n)   (when the array is already sorted)
// Average Case: O(n²)
// Worst Case: O(n²)

// Space Complexity: O(1)

public class InsertionSort {

  public static void insertionSort(int n[]) {
    for (int i = 1; i < n.length - 1; i++) {
      int curr = i;
      int prev = i - 1;
      while (prev >= 0 && n[prev] > n[curr]) {
        n[prev + 1] = n[prev];
        prev--;
      }

      n[prev + 1] = n[curr];

    }
  }

  public static void printArr(int n[]) {
    for (int i = 0; i < n.length; i++) {
      System.out.println(n[i]);
    }
  }

  public static void main(String[] args) {
    int n[] = { 5, 4, 1, 3, 2 };
    insertionSort(n);
    printArr(n);
  }
}