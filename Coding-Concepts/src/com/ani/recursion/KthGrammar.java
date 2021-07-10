// URL: https://leetcode.com/problems/k-th-symbol-in-grammar/

package com.ani.recursion;

public class KthGrammar {
  public static int kthGrammar(int N, int K) {
    int mid = (int) Math.pow(2, N) / 2;
    if ((N == 1 && K == 1) || mid == 0)
      return 0;
    if (K <= mid)
      return kthGrammar(N - 1, K);
    else
      return kthGrammar(N - 1, K - mid) == 0 ? 1 : 0;
  }
  
  public static void main(String a[]) {
    System.out.println(kthGrammar(5,7));
  }
}
