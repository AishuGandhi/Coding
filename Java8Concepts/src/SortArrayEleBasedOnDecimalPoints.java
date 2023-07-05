
public class SortArrayEleBasedOnDecimalPoints {
	public static void main(String a[]) {

		Double num[] = { 66.78, 788.3, 77.2, 1113.1 };
		String str[] = new String[num.length];
		int decimal[]  = new int[num.length];
		int i = 0;
		for (Double n : num) {
			str[i] = String.valueOf(n);
			i++;
		}
		for (String n : str) {
			System.out.println(n);
		}
		i = 0;
		for (String n : str) {
			int index = n.indexOf('.');
			String sub = n.substring(index,n.length()-1);
			decimal[i] = Integer.valueOf(sub);
			i++;
		}
		
	}

}
