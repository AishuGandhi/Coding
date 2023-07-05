package collectiondemo;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		//Creating list of student class
		List<Student> studList = new ArrayList<>();
		
		Student s1 = new Student();
		s1.setRollNo(1);
		s1.setName("Nikita");
		
		Student s2 = new Student();
		s2.setRollNo(2);
		s2.setName("Mahesh");

		studList.add(s1);
		studList.add(s2);
		
		System.out.println(studList);
	}

}
