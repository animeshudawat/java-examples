
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class testDummt {

	public static void main(String[] args) {
		 String [] strs = {"eat","tea","tan","ate","nat","bat"};
		 
		 Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		 
		 for(int i = 0; i < strs.length; i++) {
			 String orig = strs[i];
			 System.out.println("Original String is : " + strs[i]);
			 Arrays.sort(strs[i].toCharArray());
			 String temp = new String(strs[i]);
			 System.out.println("temp is : " + temp);
			 if(map.get(temp) != null) {
				 map.get(strs[i]).add(orig);
				 System.out.println("Added " + orig + " against the key " + strs[i]);
			 } else {
				 ArrayList<String> t = new ArrayList<String>();
				 t.add(strs[i]);
				 map.put(temp, t);
				 System.out.println("Created new value " + t.toString() + " against the key " + strs[i]);
			 }
		}
		 
		for(Entry e : map.entrySet()) {
		 System.out.println(e.getValue().toString());	
		}
	}
	
}
