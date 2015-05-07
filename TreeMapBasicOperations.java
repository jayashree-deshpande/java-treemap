import java.util.TreeMap;

public class TreeMapBasicOperations {
	public static void main(String[] args)
	{
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("one", "first");
		tm.put("two", "second;");
		tm.put("three", "third");
		tm.put("four", "fourth");
		tm.put("five", "fifth");
		
		System.out.println("Value of second: "+tm.get("second"));
    System.out.println("Is TreeMap empty? "+tm.isEmpty());
    tm.remove("third");
    System.out.println(tm);
    System.out.println("Size of the TreeMap: "+tm.size());
	}
}
