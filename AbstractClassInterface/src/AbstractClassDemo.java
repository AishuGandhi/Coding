//super class
abstract class Employee {
	 Employee() {
		System.out.println("Hello I am from Abstract Class");
	}
	
	//Method Definition
	public abstract void project(String project);
	
	//Method Definition along with method declaration
	public void role(String role) {
		System.out.println("My Role is " + role);
	}
}
//Subclass
class ActualEmployee extends Employee {
	@Override
	public void project(String project) {
		System.out.println("My Project is " + project);
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		//Dynamic Method Dispatch --- runtime decide
		//Employee e = new ActualEmployee();
		ActualEmployee e = new ActualEmployee();
		e.project("Bandhan");
		e.role("Software Engineer");
	}

}
