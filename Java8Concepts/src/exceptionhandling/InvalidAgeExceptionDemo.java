package exceptionhandling;
//This is custom exception
class InvalidAgeException extends Exception {
	//Custom Exception Class Constructor
	public InvalidAgeException(String msg) {
		//Calling Exception Class of Java Constructor
		super(msg);
	}
}

class Person {
	//instance variables --- memory is allocated for each object
	String name;
	int age;
    static int cnt;//Class Variable memory will be allocated only once
	//throws always will come with Method
	void acceptAge(int age) throws InvalidAgeException {
		InvalidAgeException exception = new InvalidAgeException("Age Cannot be negative");
		if (age <= 0) {
			//throw exception;
			//Throwing an exception
			throw new InvalidAgeException("Age Cannot be negative");
			//Throwing an exception using anonymous(which do not have any object name) object name
		}
	}
	void displayPerson() {
		//Local Variable to displayPerson method()
		int a = 10;
	}
}

public class InvalidAgeExceptionDemo {

	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.acceptAge(-9);
		} catch (InvalidAgeException e) {
		
			System.out.println(e.getMessage());
		}
	}

}
