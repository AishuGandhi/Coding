package interviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStream {

	public static void main(String args[] ) {
		
		List<List<String>> names = Arrays.asList(Arrays.asList("Nikita,Prachi"),Arrays.asList("Aishwarya,Hanu"),
				Arrays.asList("Sanjana,Vishal"));
		
		//Flattening the list
		List<String> nameFlatten = names.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		
		//Sorting using Comparator
		//nameFlatten.stream().sorted((s1,s2) -> s1.compareTo(s2)).forEach(System.out::println);
		nameFlatten.stream().sorted((s1,s2) -> s1.compareTo(s2)).forEach(System.out::println);
		
		//Collections.sort(nameFlatten);
	}
}
