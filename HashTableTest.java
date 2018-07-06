import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

class solution{
	public Map <Integer, Character> map1 = new HashMap<>();
	public Map <Integer, Character> map2 = new HashMap<>();
	
	public boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		map1.put(0, t.charAt(0));
		map2.put(0, t.charAt(0));
		for(int i =1; i < s.length(); i++) {
			map1.put(i, t.charAt(i));
			map2.put(i, t.charAt(i));
			if((map1.get(i) != map1.get(i-1)) && (map2.get(i) == map2.get(i-1))) {
				return false;
			}
			else if((map1.get(i) == map1.get(i-1)) && (map2.get(i) != map2.get(i-1))) {
				return false;
			}
		}
		return true;
	}
}

class testClass{
	public int number = 4;	
	public void printNum() {
		System.out.println("hello world");
	}
}
public class hashTableTest<K , V> {
	Map<K , V> hm;
	hashTableTest(){
		hm = new HashMap<>();
		
	}
	public void insert(K key, V value) {
		hm.put(key, value);
	}
	public Object getByKey(K key) {
		return hm.get(key);
	}
	public boolean compare(Object v) {
			
		return false;
		
	}
	public static void main(String[] args) {
		Hashtable<String, testClass> ht = new Hashtable<>();
		testClass tst = new testClass();
		ht.put("key1", tst );
		testClass getter = ht.get("key1");
		System.out.println(tst);
		System.out.println(ht.contains(tst));
		
		Map<String, Integer> javmap = new HashMap<>();
		
		@SuppressWarnings("rawtypes")
		hashTableTest<Comparable, Comparable> tester = new hashTableTest();
		tester.insert(1, 5);
		System.out.println(tester.getByKey(1));
		tester.insert("String", "AnotherString");
		System.out.println(tester.getByKey("String"));
		Map hms = new HashMap<>();
		solution sol = new solution();
		System.out.println(sol.isIsomorphic("bgg", "agd"));
	}
}
