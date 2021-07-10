package dummy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class carParkingRoof {
  
  public static long getMinRoof(List<Integer> cars, int k, long size) {
    
    if(cars.size() <= 0 || k <= 0 || size < k)
      return Long.MAX_VALUE;
    
    Collections.sort(cars);

    long min = Long.MAX_VALUE;
  
  
    min = Math.min(min, getMinRoof(cars, k, size-1));
  
    return Math.min(min, cars.get((int) (size - 1)) - cars.get((int) (size - k)) + 1);
  }
  
  public static void main(String[] args) {
    
    List<Integer> cars = new ArrayList<Integer>(List.of(1, 12, 3, 15, 11, 10));
    int k = 4;
    
    System.out.println("Minimum roofing required is : " + getMinRoof(cars, k, cars.size()));
    
  }
  
}
