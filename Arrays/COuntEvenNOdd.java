// Problem: Count Even and Odd Numbers in an Array
// Concept: Array Traversal, Conditional Statements

// Description:
// Count the total number of even and odd elements present in an array.
// A number is considered even if it is divisible by 2, otherwise it is odd.

// Example:
// Input: [1, 2, 3, 4, 5]

// Output:
// Total Odd: 3
// Total Even: 2

// Explanation:
// 1, 3, 5 are odd numbers → count = 3
// 2, 4 are even numbers → count = 2

// Approach:
// - Initialize two counters: eCount for even numbers and oCount for odd numbers.
// - Traverse the array using a loop.
// - Check each element using the modulus operator (%).
// - If n[i] % 2 == 0, increment the even counter.
// - Otherwise, increment the odd counter.
// - After the loop finishes, print both counts.

// Time Complexity: O(n)
// Space Complexity: O(1)

public class COuntEvenNOdd {

  public static void countEvenOdd(int n[]) {
    int eCount = 0;
    int oCount = 0;
    ;
    for (int i = 0; i < n.length; i++) {
      if (n[i] % 2 == 0) {
        eCount++;
      } else {
        oCount++;
      }
    }
    System.out.println("First odd: " + oCount);
    System.out.println("First Even: " + eCount);

  }

  public static void main(String[] args) {
    int n[] = { 1, 2, 3, 4, 5 };
    countEvenOdd(n);
  }
}
