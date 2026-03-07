public class ArraySorted {

  public static boolean checkSorted(int n[]) {
    for (int i = 1; i < n.length; i++) {
      if (n[i] < n[i - 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int n[] = { 1, 2, 3, 4, 1 };
    System.out.println(checkSorted(n));
  }
}
