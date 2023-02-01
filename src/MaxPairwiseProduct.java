import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
  static long getMaxPairwiseProduct(long[] numbers) {
    long max_product = 0;
    int n = numbers.length;

    for (int first = 0; first < n; ++first) {
      for (int second = first + 1; second < n; ++second) {
        max_product = Math.max(max_product,
                numbers[first] * numbers[second]);
      }
    }

    return max_product;
  }

  static long getMaxPairwiseProductFast(long[] numbers) {
    int n = numbers.length;
    int maxIndex1 = -1;
    int maxIndex2 = -1;

    for (int i = 0; i < n; i++) {
      if (maxIndex1 == -1 || numbers[i] > numbers[maxIndex1]) {
        maxIndex1 = i;
      }
    }

    for (int i = 0; i < n; i++) {
      if (i != maxIndex1 && (maxIndex2 == -1 || numbers[i] > numbers[maxIndex2])) {
        maxIndex2 = i;
      }
    }

    // System.out.println("getMaxPairwiseProductFast indexs " + maxIndex1 + " " + maxIndex2);

    return numbers[maxIndex1] * numbers[maxIndex2];

//    for (int first = 0; first < n; ++first) {
//      for (int second = first + 1; second < n; ++second) {
//        max_product = Math.max(max_product,
//                numbers[first] * numbers[second]);
//      }
//    }
//
//    return max_product;
  }

  public static void main(String[] args) {
//    Random r = new Random();
//    while (true) {
//      int length = r.nextInt(5) + 2;
//      long[] numbers = new long[length];
//      for (int i = 0; i < length; i++) {
//        numbers[i] = r.nextLong(100);
//      }
//
//      System.out.println("n: " + length);
//      for (int i = 0; i < length; i++) {
//        System.out.printf("%d ", numbers[i]);
//      }
//      System.out.println("");
//      long maxProduct = getMaxPairwiseProduct(numbers);
//      long maxProductFast = getMaxPairwiseProductFast(numbers);
//
//      System.out.printf("maxProduct: %d, maxProductFast: %d\n", maxProduct, maxProductFast);
//      if (maxProductFast != maxProduct) {
//        break;
//      }
//    }


    FastScanner scanner = new FastScanner(System.in);
    int n = scanner.nextInt();
    long[] numbers = new long[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }
    System.out.println(getMaxPairwiseProductFast(numbers));

  }

  static class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    FastScanner(InputStream stream) {
      try {
        br = new BufferedReader(new
                InputStreamReader(stream));
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    String next() {
      while (st == null || !st.hasMoreTokens()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }
  }
}
