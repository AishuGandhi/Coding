import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Stream operations are divided into intermediate and terminal operations
public class StreamDemos {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(60);
		al.add(80);

		// To print or perform operation in loop
		al.stream().forEach(System.out::println);

		// To map element to corresponding result
		// Collectors are used to combine the result of processing on the elements of a
		// stream.
		// Collectors can be used to return a list or a string.
		Stream s = al.stream().map(i -> i * i * 4);
		s.forEach(System.out::println);

		// filter to eliminate elements based upon some conditions
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		// get count of empty string
		int count = (int) strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty string count:" + count);
		strings.stream().filter(string -> string.startsWith("ab")).collect(Collectors.toList())
				.forEach(System.out::println);

		// parallelStream is the alternative of stream for parallel processing
		strings.parallelStream().filter(string -> string.isEmpty()).count();

		// limit -- reduce the size of stream
		List numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics intSummaryStatistics = new IntSummaryStatistics();
		Iterator<Integer> iterator = numbers.listIterator();
		while (iterator.hasNext()) {
			// Add the integers to the IntSummaryStatistics object
			intSummaryStatistics.accept(iterator.next());
		}
		System.out.println("Highest number in List : " + intSummaryStatistics.getMax());
		System.out.println("Lowest number in List : " + intSummaryStatistics.getMin());
		System.out.println("Sum of all numbers : " + intSummaryStatistics.getSum());
		System.out.println("Average of all numbers : " + intSummaryStatistics.getAverage());

		int str = IntStream.generate(() -> (int) (Math.random() * 10)).sum();
		System.out.println(str);

		List<Double> listOfDouble = Arrays.asList(10.5, 8.9, 4.6, 2.0);

		DoubleSummaryStatistics doubleSummaryStatistics = listOfDouble.stream()
				.collect(Collectors.summarizingDouble(p -> p.doubleValue()));
		System.out.println("Average of all double numbers:"+doubleSummaryStatistics.getAverage());
	}

}
