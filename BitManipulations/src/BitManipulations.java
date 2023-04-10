import javax.swing.text.AbstractDocument.LeafElement;

public class BitManipulations {

	public void convertDecToBinary(int n) {

		int[] binary = new int[3];
		int j = 0;
		while (n > 0) {

			binary[j] = n % 2;
			n = n / 2;
			j++;
		}
		for (int i = j-1; i >=0; i--)
			System.out.print(binary[i]);
	}

	public static void main(String s[]) {
		int n = 5;
		int pos = 2;
		int bitmask = 1 << pos;
		int notBitMask = ~bitmask;
		BitManipulations m = new BitManipulations();
		System.out.print("Binary of " + n+":");
		m.convertDecToBinary(n);
		System.out.println();
		System.out.println("Performing update bit on " + pos);
		//Get the bit
		int newNum = 0;
		//If Bit 
		if ((bitmask & n) == 1) {
			System.out.println("Bit is 1");
			newNum = (bitmask | n);
			System.out.println("New Number:" + newNum);
			m.convertDecToBinary(newNum);
		}
		else {
			System.out.println("Bit is 0");
			newNum = (notBitMask & n);
			System.out.println("New Number:" + newNum);
			m.convertDecToBinary(newNum);
			
		}

	}
}
