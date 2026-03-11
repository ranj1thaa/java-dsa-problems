// Problem: Find the Shortest Path from a Sequence of Directions
// Concept: String Traversal, Coordinate System, Math (Distance Formula)

// Description:
// Given a string representing directions (N, S, E, W), determine the
// shortest distance from the starting point (0,0) to the final position
// after following all the directions.

// Example:
// Input: "WNEENESENNN"

// Output:
// Shortest Distance: 5.0 (approx)

// Explanation:
// Each character represents movement:
// N → move up (y + 1)
// S → move down (y - 1)
// E → move right (x + 1)
// W → move left (x - 1)
// After calculating the final (x,y) position, we compute the
// shortest distance from origin using the distance formula.

// Approach:
// - Start at coordinate (0,0).
// - Traverse the direction string.
// - Update x and y coordinates based on each direction.
// - After processing all characters, compute:
//   distance = sqrt(x² + y²).
// - Print the shortest distance.

// Time Complexity: O(n)
// Space Complexity: O(1)
public class ShortestPath {
  public static void shortPath(String str) {
    int x = 0;
    int y = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'W') {
        x--;
      } else if (str.charAt(i) == 'N') {
        y++;
      } else if (str.charAt(i) == 'E') {
        x++;
      } else {
        y--;
      }
    }

    int x2 = x * x;
    int y2 = y * y;
    System.out.println(Math.sqrt(x2 + y2));
  }

  public static void main(String[] args) {
    String str = "WNEENESENNN";
    shortPath(str);
  }
}
