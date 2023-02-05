package fundamentals;
import java.util.*;

public class sumofnnatural_rec {
  public static void main(String[] args) {
    int n = 4;
    printer(n);
  }

  public static void printer(int n) {
    if (n == 0) return;

    //System.out.print(n + " ");
    printer(n - 1);
    System.out.print(n + " ");
  }
}