
import java.util.*;
import java.util.stream.*;

public class StreamAPI {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 7, 8, 78);
		/*
		 * int sum = 0; for (int i = 0; i < list.size(); i++) { if (list.get(i) % 2 ==
		 * 0) { sum += list.get(i); } }
		 */
		/*
		 * for (int n : list) { System.out.println(n); }
		 */

		// Consumer<Integer> numList = n -> System.out.println(n);
		// list.forEach(numList);
		// list.forEach(System.out::println);
		// System.out.println(list);
		// System.out.println("Sum of even numbers in a list:"+ sum);
		/*
		 * Stream is an interface since 1.8 Gives / Returns Object of Stream E.g. Stream
		 * of Integers,Strings etc Beauty is does't affect the actual list Can't reuse
		 * the stream like water Can be used only once
		 * 
		 * Benefits : provides lots of methods to work with
		 */

		Stream<Integer> numStream = list.stream();
		// numStream.forEach(System.out::println);

		numStream.filter(n -> n % 2 == 0).map(n -> n * 2).collect(Collectors.toList()).forEach(System.out::println);
		String a = "Aishwarya";
		// a.eq

		Stream.of("A", "B", "C", "A", "C", "B", "D", "E", "A", "F").distinct().sorted().skip(2)
				.forEach(System.out::println);

		String colors[] = { "RED", "BLUE", "ROYALBLUE", "YELLOW", "GREEN", "PURPLE" };
		System.out.println(Arrays.stream(colors).allMatch(s -> s.equals("BLUE")));
		System.out.println(Arrays.stream(colors).anyMatch(s -> s.equals("GREEN")));
		System.out.println(Arrays.stream(colors).noneMatch(s -> s.equals("GREEN")));
		System.out.println(Arrays.stream(colors).findAny());
		System.out.println(Arrays.stream(colors).findFirst());
		// Added all string lengths
		System.out.println(Arrays.stream(colors).mapToInt(v -> v.length()).sum());

		System.out.println(Arrays.stream(colors).mapToInt(v -> v.length()).average());

		// Need to understand
		System.out.println(Arrays.stream(colors).max((s1, s2) -> s1.compareTo(s2)));
		System.out.println(Arrays.stream(colors).min((s1, s2) -> s1.compareTo(s2)));

		List<String> ls = new ArrayList();
		ls.add("Aish");
		ls.add("Hanu");
		ls.add("Tanu");
		ls.add("Ashu");
		ls.add("Sanjana");
		ls.add("Pooja");
		
		System.out.println(ls.stream().reduce((s1,s2)->s1+""+s2));//Instead of min,max,average,sum reduction can be done in 1 method using reduction
		
		
	}

}
