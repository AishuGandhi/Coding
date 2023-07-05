
public class WrapperClassDemo {

	public static void main(String[] args) {
		//float/double/int/long/char -- primitive data type
		//Integer/Long/Double/Float/String/Character/Boolean --- Wrapper Classes
		
		//Primitive to Wrapper Class
		int a = 9;
		Integer i = new Integer(a);
		System.out.println(i);
		
		double d = 10.89;
		Double d1 = new Double(d);
		System.out.println(d1);
		
		char c = 'a';
		Character c1 = new Character(c);
		
		//Wrapper Class to primitive
		Integer b = new Integer(90);
		a = b.intValue();
		System.out.println(a);
		
		Double d2 = new Double(56.89);
		double d3 = d2.doubleValue();
		System.out.println(d3);
		
		
		String s = Integer.toString(b);
		System.out.println(s);
		
		
		String s1 = Double.toString(56.89);
		System.out.println(s);
	}

}
