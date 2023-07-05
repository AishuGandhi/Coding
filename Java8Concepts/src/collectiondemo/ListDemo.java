package collectiondemo;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		// Reference
		// Student s;

		// Creating and Initializing ArrayList of type integer
		// ArrayList implements List and List extends Collection interface
		List<Integer> num = new ArrayList<>();
		num.add(10);// 0th index
		num.add(20);// 1st index
		num.add(30);// 2nd index

		for (Integer n : num) {
			System.out.println(n);
		}

		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}

		//To remove element from list
		num.remove(1);

		System.out.println("After removing an element from list");
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
		
		//Check whether that element is present in the list
		System.out.println(num.contains(50));
		
		//Replacing 30 with 80 because 30 is at 1st Position in list
		num.set(1, 80);
		num.add(10);
		num.add(90);
		num.add(45);

		System.out.println("After adding an element in existing list");
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}
		
		Set<Integer> set = new HashSet<>();
		
		set.add(20);
		set.addAll(num);
		
		System.out.println(set);
		
		//Collection which is passed to removeAll those elements will get removed
		set.removeAll(num);
		
		//Only basic set elements will be there
		System.out.println(set);

	}
}
