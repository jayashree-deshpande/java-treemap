import java.util.TreeMap;

public class HashTreeCopy {
	public static void main(String[] args)
	{
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("one", "first");
		tm.put("two", "second;");
		tm.put("three", "third");
		tm.put("four", "fourth");
		tm.put("five", "fifth");
		
		System.out.println(tm);
		TreeMap<String, String> subMap = new TreeMap<String, String>();
        	subMap.put("s1", "S1 VALUE");
        	subMap.put("s2", "S2 VALUE");
        	tm.putAll(subMap);
        	System.out.println(tm);
	}
}
