import java.util.Set;
import java.util.TreeMap;
 
public class IterateThroughTreeMap {
 
    public static void main(String a[]){
    TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("one", "first");
		tm.put("two", "second;");
		tm.put("three", "third");
		tm.put("four", "fourth");
		tm.put("five", "fifth");
		
		Set<String> keys = tm.keySet();
        for(String key: keys){
            System.out.println("Value of "+key+" is: "+tm.get(key));
        }
    }
}
