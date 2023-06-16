
public class StringBufferStringBuilder {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer("Aishwarya");
		System.out.println(sb1.capacity());
		sb1.append(" Gandhi");
		System.out.println(sb1.chars().toString());

	}

}
