package interviewquestions;

import java.util.*;

public class SortStringDuplicateFirstThenOtherChars {
	public static void main(String a[]) {

		String str = "letter";//freedom bunny funny
		Set<Character> set = new HashSet<>();
		List<Character> list = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			if (set.contains(str.charAt(i))) {
				set.remove(str.charAt(i));
				list.add(str.charAt(i));
				list.add(str.charAt(i));
			} else
				set.add(str.charAt(i));
		}

		list.stream().sorted().forEach(System.out::print);
		set.stream().sorted().forEach(System.out::print);
		
	
			int x = 1, y = 1, z = 0; 
			if (x == y | x < ++y) { 
				z = x+y; 
			}
			else{
				z = 1;
			}
			System.out.println(z);
			System.out.println(8*8/2+2-3*2);
	}

}
