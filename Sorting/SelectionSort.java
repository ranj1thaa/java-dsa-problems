// Problem: Selection Sort
// Concept: Sorting Algorithm, Nested Loops, Minimum/Maximum Selection, Swapping

// Description:
// Sort the elements of an array using the Selection Sort algorithm.
// In each iteration, the algorithm selects the smallest (or largest)
// element from the unsorted portion of the array and places it
// in its correct position.

// Example:
// Input: [5, 4, 1, 3, 2]

// Output:
// 5
// 4
// 3
// 2
// 1

// Explanation:
// The algorithm repeatedly selects the largest element from the
// unsorted portion and swaps it with the first unsorted position.

// Approach:
// - Start from the first index of the array.
// - Assume the current index is the minimum (or maximum).
// - Traverse the remaining unsorted portion of the array.
// - If a larger element is found, update the index.
// - Swap the found element with the current index.
// - Repeat the process until the array is sorted.
// - Finally, print the sorted array.

// Time Complexity:
// Best Case: O(n²)
// Average Case: O(n²)
// Worst Case: O(n²)

// Space Complexity: O(1)

public class SelectionSort {

  public static void selectionSort(int n[]) {
    for (int i = 0; i < n.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < n.length; j++) {
        if (n[min] < n[j]) {
          min = j;
        }
      }

      int temp = n[min];
      n[min] = n[i];
      n[i] = temp;

    }
  }

  public static void printArr(int n[]) {
    for (int i = 0; i < n.length; i++) {
      System.out.println(n[i]);
    }
  }

  public static void main(String[] args) {
    int n[] = { 5, 4, 1, 3, 2 };
    selectionSort(n);
    printArr(n);
  }
}
