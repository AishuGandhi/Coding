package collectiondemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		//Map is  interface and HashMap implements Map
		//Map<Key,Value> mapName = new HashMap<>();
		Map<String,String> phoneBook = new HashMap<>();
		phoneBook.put("Aishwarya", "9836819089");
		phoneBook.put("Pooja", "9886889089");
		phoneBook.put("Gita", "9226819089");
		phoneBook.put("Aishwarya", "8888290000");
		
		Map<String,String> dictionary = new HashMap<>();
		dictionary.put("a", "Apple");
		dictionary.put("ai", "Aiful");
		dictionary.put("b", "Batch");
		
		System.out.println("Dictionary:"+dictionary);
		
		dictionary.putAll(phoneBook);
		System.out.println("Dictionary after merge:"+dictionary);
		
		
		System.out.println(phoneBook.get("Aishwarya"));
		
		//String getValue = phoneBook.get("Gita");
		
		//Check map contains given value
		System.out.println(phoneBook.containsValue("9836819089"));
		
		//Replace value using key
		phoneBook.replace("Aishwarya", "Ashu");	
		System.out.println(phoneBook.get("Aishwarya"));
		
		Set<String> keySets = phoneBook.keySet();
		System.out.println(keySets);
		
		System.out.println(phoneBook.isEmpty());
		
		String name = "";
		System.out.println(name.isEmpty());

	}

}
