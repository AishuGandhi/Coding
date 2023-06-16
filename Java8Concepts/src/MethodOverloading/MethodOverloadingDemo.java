package MethodOverloading;

import java.math.BigInteger;

class Calculator {
	int a;
	int b;

	// Constructor Overloading
	// Default Constructor
	Calculator() {
		a = 0;
		b = 0;
	}

	// Parameterized Constructor
	Calculator(int c, int d) {
		a = c;
		b = d;
	}

	// method overloading --- Happens within same class
	// Only number of parameters or data type of parameter or both can be changed
	// with same method name
	void add() {
		System.out.println("Addition of a & b is " + a + b);
	}

	// Can perform addition of 2 numbers
	int add(int a, int b) {
		return a + b;
	}

	// Can perform addition of 3 numbers
	int add(int a, int b, int c) {
		return a + b + c;
	}

	// Can perform addition of 3 numbers but with decimal and integer combination
	void add(float a, int b, float c) {
		System.out.println(a + b + c);
	}

	// Can perform addition of 3 numbers
	float add(float a, int b, int c) {
		return a + b + c;
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int res = cal.add(10, 20);
		System.out.println(res);
		int result = cal.add(10, 20, 30);
		System.out.println(result);

		Calculator cal1 = new Calculator(50, 60);
		cal1.add();
		System.out.println(cal1.add(10, 20));
		System.out.println(cal1.add(10, 20, 30));
		cal1.add(10.8f, 20, 30.5f);
		BigInteger phoneNumber = new BigInteger("9881360394");
		System.out.println(phoneNumber);
	}
}
