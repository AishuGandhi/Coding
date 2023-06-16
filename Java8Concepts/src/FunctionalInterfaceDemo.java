//Single Abstract Interface
/*
 *  using Functional interfaces, programmers can pass a function as a parameter instead of a reference object, 
 *  which reduces the amount of boilerplate code you have to write.Making Java Verbose(avoiding detailed code)
 */
@FunctionalInterface
interface A {
	void show(int a,int b);
}

/*
 * class B implements A { public void show() {
 * System.out.println("Inside show"); } }
 */

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		/*
		 * B b = new B(); b.show(); // Using anonymous class A a = new A() { public void
		 * show() { System.out.println("Inside show"); }
		 * 
		 * }; a.show();
		 */
		//-> Lambda Expression , Compiler will do above lines in background
		
		A a = (i,j) -> System.out.println(i+j);
		a.show(9,8);
	}
}
