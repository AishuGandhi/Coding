
public class SumOf2Arrays {

	public static void main(String[] args) {
		int a1[] = { 2, 3, 4, 5 };
		int a2[] = { 4, 5, 8, 9, 8 };
		int a3[] = new int[a1.length];

		for (int i = 0; i < a1.length; i++) {
			a3[i] = a1[i] + a2[i];
		}

		for (int i = 0; i < a2.length; i++) {
			a3[i] = a1[i] + a2[i];
		}

		// Check 2 arrays length is equal or not
		if (a1.length != a2.length) {
			System.out.println("2 arrays are not equal");
		}
		//a3 length == a[i] ---> sum
		//Advanced for loop -- by default run up to array length
		for (int sum : a3) {
			System.out.println(sum);
		}
	}

}
