package dummy;

import java.util.Properties;
import java.util.stream.IntStream;

public class PirateTalk2 {
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
     Properties p = System.getProperties();
        p.setProperty("pirate","scurvy");
        String s = p.getProperty("argProp") + " ";
        s += p.getProperty("pirate");
        System.out.println(s);
        
        IntStream.range(0, 0)
  }
  
}
