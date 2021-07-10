package dummy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'carParkingRoof' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY cars
     *  2. INTEGER k
     */

    public static long carParkingRoof(List<Long> cars, int k) {
    // Write your code here
      if (cars.size() == 0 || k < 0) {
        return 0;
    }

    Collections.sort(cars);
    long minDist = Long.MAX_VALUE;

    for (int i = 0; i <= cars.size() - k; i++) {
        minDist = Math.min(minDist, cars.get(i + k - 1) - cars.get(i));
    }

    return minDist + 1;
      
    }

}

public class PirateTalk {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("C:\\Users\\udawaa\\Documents\\Temp\\DPA\\input003.txt")));

        int carsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> cars = new ArrayList<>();

        for (int i = 0; i < carsCount; i++) {
            long carsItem = Long.parseLong(bufferedReader.readLine().trim());
            cars.add(carsItem);
        }

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        long result = Result.carParkingRoof(cars, k);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}