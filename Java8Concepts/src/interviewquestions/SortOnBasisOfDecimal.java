package interviewquestions;

import java.util.*;

public class SortOnBasisOfDecimal {

	public static void main(String[] args) {
		Double num[] = { 89.6, 1111.1, 789.43, 1111.87 };

		List<String> numSort = new ArrayList<>();
		for (Double n : num) {
			numSort.add(n.toString());
		}
		numSort.stream().sorted().forEach(System.out::println);
	}
}
