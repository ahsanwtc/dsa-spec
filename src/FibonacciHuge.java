import java.util.*;
public class FibonacciHuge {
  private static long getFibonacciHugeNaive(long n, long m) {
    if (n <= 1)
      return n;

    long previous = 0;
    long current  = 1;

    for (long i = 0; i < n - 1; ++i) {
      long tmp_previous = previous;
      previous = current;
      current = tmp_previous + current;
    }

    return current % m;
  }

  private static long getFibonacciHuge(long n, long m) {
    if (n <= 1)
      return n;

    long previous = 0;
    long current  = 1;

    for (long i = 0; i < n - 1; ++i) {
      long tmp_previous = previous % m;
      previous = current % m;
      current = tmp_previous + current % m;
    }

    return current % m;
  }

  private static long getPisanoPeriod(long m) {
    long first = 0;
    long second = 1;
    long next = 1;
    long pisano = 0;
    while (true) {
      next = (first + second) % m;
      first = second;
      second = next;
      pisano++;
      if (first == 0 && second == 1) {
        return pisano;
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    long m = scanner.nextLong();
    long pisanoPeriod = getPisanoPeriod(m);
    long remainder = n % pisanoPeriod;
    System.out.println(getFibonacciHuge(remainder, m));
  }
}
