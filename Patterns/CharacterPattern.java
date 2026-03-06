// Problem: Character Pattern (Alphabet Triangle)

// Concept: Nested Loops, ASCII Character Increment

// Description:
// Print a triangle pattern where characters start from 'A' and increase sequentially across rows.

// Pattern (n = 4):
// A
// B C
// D E F
// G H I J

// Approach:
// - Use an outer loop to control rows from 1 to n.
// - Initialize a character variable 'ch' with 'A'.
// - Inner loop runs from 1 to current row number (i).
// - Print the current character and increment it using ch++.
// - Move to the next line after each row.

// Time Complexity: O(n²)
// Space Complexity: O(1)

public class CharacterPattern {
  public static void character() {
    int n = 4;
    char ch = 'A';
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(ch + " ");
        ch += 1;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    character();
  }
}
