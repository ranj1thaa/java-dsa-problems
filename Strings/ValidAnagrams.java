//242. Valid Anagram
//Topics: Given two strings s and t, return true if t is an anagram of s, and false otherwise.

import java.util.Arrays;

public class ValidAnagrams {
  public static void printValidAnagram(String s, String t) {
    if (s.length() != t.length()) {
      System.out.println("NO");
      return;
    }
    char[] a = s.toCharArray();
    char[] b = t.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    boolean k = Arrays.equals(a, b);
    System.out.println(k);
  }

  public static void main(String[] args) {
    String s = "anagram";
    String t = "nagaram";
    printValidAnagram(s, t);
  }
}
