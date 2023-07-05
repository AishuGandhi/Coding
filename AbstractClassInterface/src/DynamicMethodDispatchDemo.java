
interface Shape {

	/*//Not allowed in interface
	Shape(){
		
	}*/
	void area();

}
interface qpr{
	void pqrMethod();
}
interface xyz extends Shape,qpr{
	void xyzMethod() ;
}
class Sample{
	
}
class ABC extends Sample implements xyz{

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xyzMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pqrMethod() {
		// TODO Auto-generated method stub
		
	}
	
}
class Triangle implements Shape {

	int b, h;

	Triangle(int base, int height) {
		b = base;
		h = height;
	}

	public void area() {
		System.out.println("Area of triangle:" + (b * h) / 2);
	}
}

class Rectangle implements Shape {

	int b, l;

	Rectangle(int b, int l) {
		this.b = b;// Assign Current Object Breadth to Whatever passed to Method Parameter
		this.l = l;
	}


	public void area() {
		System.out.println("Area of rectangle:" + (b * l));
	}
}

class Square implements Shape {

	int b;

	Square(int b) {
		this.b = b;// Assign Current Object Breadth to Whatever passed to Method Parameter

	}


	public void area() {
		System.out.println("Area of square:" + (b * b));
	}
}

public class DynamicMethodDispatchDemo {

	public static void main(String[] args) {
		// Dynamic Method Dispatch --- Which method to call is decided at runtime...
		Shape s = new Triangle(4, 5);
		s.area();
		s = new Rectangle(6, 5);
		s.area();
		s = new Square(6);
		s.area();
	}

}
