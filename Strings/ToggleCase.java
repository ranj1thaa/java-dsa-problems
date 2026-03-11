// Program: Toggle Case of Characters in a String
// Convert uppercase → lowercase
// Convert lowercase → uppercase

public class ToggleCase {
  public static void printToggle(String s) {
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lower = "abcdefghijklmnopqrstuvwxyz";
    String res = "";
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (upper.indexOf(ch) != -1) {
        res += lower.charAt(upper.indexOf(ch));
      } else {
        res += upper.charAt(lower.indexOf(ch));
      }
    }
    System.out.println(res);
  }

  public static void main(String[] args) {
    String s = "geeksForgEeks";
    printToggle(s);
  }
}
