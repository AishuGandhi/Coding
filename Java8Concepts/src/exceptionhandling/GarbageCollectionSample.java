package exceptionhandling;
class PersonDemo{
	
	String name;
	int age;
	void acceptPersonData(String n,int age) {
		this.age = age;
		name = n;
	}
	void displayPersonData() {
		System.out.println("Name:"+name+"Age:"+age);
	}
}
public class GarbageCollectionSample {
	//finalize() method --- Cleaning Activities by Programmer i.e. 
	//Closing of Files or Free up the windows fonts used in program
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String args[]) {
		GarbageCollectionSample s1 = new GarbageCollectionSample();
		GarbageCollectionSample s2 = new GarbageCollectionSample();
		PersonDemo p = new PersonDemo();
		p.acceptPersonData("Nita", 90);
		p.displayPersonData();
		//p ---> Name and Age
		
		p = null;//Java Garbage Collection
		s1 = null;
		s2 = null;
		
		System.gc();
	}
}
