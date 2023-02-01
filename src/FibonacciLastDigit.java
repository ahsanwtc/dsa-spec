import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciLastDigit {
  private static int getFibonacciLastDigitNaive(int n) {
    if (n <= 1)
      return n;

    int previous = 0;
    int current  = 1;

    for (int i = 0; i < n - 1; ++i) {
      int tmp_previous = previous % 10;
      previous = current % 10;
      current = tmp_previous % 10 + current % 10;
    }

    return current % 10;
  }

  private static BigInteger getFibonacciLastDigit(int n) {
    if (n <= 1) return new BigInteger(String.valueOf(n));

    BigInteger previous = new BigInteger("0");
    BigInteger current = new BigInteger("1");

    for (int i = 0; i < n - 1; i++) {
      BigInteger tmp_previous = previous.mod(new BigInteger("10"));
      previous = current;
      current = tmp_previous.add(current);
    }
    return current.mod(new BigInteger("10"));
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int c = getFibonacciLastDigitNaive(n);
    System.out.println(c);
  }
}
