package dummy;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;


public class StringStream {
  public static void main(String ar[]) {
    int[] a = {1,2,3,3,4,4,4,5,6};
    
    IntStream i1 = Arrays.stream(a);
    
    
    Predicate<Integer> countgt2 = i -> {
      IntStream i2 = Arrays.stream(a);
      return i2.filter(n -> n == i).count() == 1;
    };
    
    i1.filter(num -> countgt2.test(num)).forEach(n -> System.out.println(n));
   
  }
  
}
