package exceptionhandling;

class Student{
	String name;
	void acceptName(String s) throws NullPointerException{
		//name = s;
		throw new NullPointerException();
	}
}
public class ExceptionHandlingExample {

	public static void main(String[] args) {

		Student stud = new Student();
		stud.acceptName(null);
		try {
			
			// code that may raise exception
			int data = 100 / 50;
		
			// NullPointerException
//			String s = null;
//			System.out.println(s.length());

			
//			int arr[] = new int[4];
//			arr[5] = 9;

			// Rectangle r = new Rectangle();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			// rest code of the program
			System.out.println("rest of the code...");
		}
		// NullPointerException
		// String s=null;
		// System.out.println(s.length());
		//
		// String s1="abc";
		// int i=Integer.parseInt(s1);//NumberFormatException
		//
		// int a[]=new int[5];
		// a[10]=50; //ArrayIndexOutOfBoundsException
		// }
	}

}
