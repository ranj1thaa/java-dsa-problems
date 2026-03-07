
public class SecondLargest {
  public static void secLargest(int n[]) {
    int arr[] = new int[n.length];
    arr[0] = n[0];
    for (int i = 1; i < n.length; i++) {
      arr[i] = Math.max(n[i], arr[i - 1]);
    }

    System.out.println("Second largest: " + arr[n.length - 2]);
  }

  public static void main(String[] args) {
    int n[] = { 4, 2, 8, 6, 10 };
    secLargest(n);
  }
}