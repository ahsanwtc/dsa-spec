import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }

  private static long nthFibonacci(int n) {
    /* create an extra two indices to take care of base cases */
    long[] f = new long[n + 2];
    f[0] = 0;
    f[1] = 1;
    int i = 2;

    for (; i <= n; i++) {
      f[i] = f[i - 1] + f[i - 2];
    }
    return f[n];
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    long fibonacci = nthFibonacci(n);
    // System.out.print("Fibonacci: ");
    System.out.println(fibonacci);
  }

  public static void print(long[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println("");
  }
}
