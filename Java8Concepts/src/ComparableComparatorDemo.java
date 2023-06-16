import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Student{
	int age;
	String name;
	
	Student(String name , int age){
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString()
	{
		return "Name:"+this.name+
				" Age:"+this.age;
	}
}
public class ComparableComparatorDemo implements Comparable<Integer> {

	public static void main(String[] args) {
		Comparator<Integer> compare = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 10 > o2 % 10)
					return 1;// will swap numbers while comparing
				return -1;
			}

		};
		
		Comparator<String> compareStrings = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() > o2.length())
					return 1;// will swap numbers while comparing
				return -1;
			}

		};
		
		Comparator<Student> compareStuds = new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				if (s1.age > s2.age)
					return 1;// will swap numbers while comparing
				return -1;
			}

		};
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(11);
		nums.add(67);
		nums.add(42);
		nums.add(33);
		nums.add(15);
		System.out.println("Actual Number List:"+nums);
		Collections.sort(nums,compare);
		System.out.println("After sorting list");
		System.out.println(nums);
		
		List<String> names = new ArrayList<>();
		names.add("Aishwarya");
		names.add("Hanumant");
		names.add("Tina");
		names.add("Pooja");
		System.out.println("Actual name List:"+names);
		Collections.sort(names,compareStrings);
		System.out.println("After sorting list");
		System.out.println(names);
		
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Aishwarya",24));
		studentList.add(new Student("Hanumant",29));
		studentList.add(new Student("Tina",25));
		studentList.add(new Student("Pooja",14));
		System.out.println("Actual student List:"+studentList.toString());
		Collections.sort(studentList,Comparator.comparing(Student::getName).thenComparing(Student::getAge));
		studentList.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getAge)).
		collect(Collectors.toList()).forEach(System.out::println);

		// Sorting number based on last digit
	}

	@Override
	public int compareTo(Integer o) {
		this.compareTo(o);
		return 0;
	}

}
