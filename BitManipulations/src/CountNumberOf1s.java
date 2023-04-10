import java.util.Scanner;

public class CountNumberOf1s {

	public static int countNumberOfOnes(int n[]) {
		int count = 0;
		for (int i = n.length - 1; i >= 0; i--) {
			System.out.print(n[i]);
			if (n[i] == 1)
				count++;
		}
		return count;
	}

	public static int[] convertToBinary(int n) {
		int[] binary = new int[8];
		int j = 0;
		while (n > 0) {
			binary[j] = n % 2;
			n = n / 2;
			j++;
		}
		return binary;
	}
	public static long binaryToDecimal(int num) {
		int decimalNumber = 0, i = 0;
	    long remainder;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      num /= 10;
	      decimalNumber += remainder * Math.pow(2, i);
	      ++i;
	    }
	    
		return decimalNumber;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = sc.nextInt();
		System.out.println("Binary of " + n);
		System.out.println("Approach 1 is converting decimal to binary and count:");
		int[] binaryNum = convertToBinary(n);
		System.out.println("\nNumber of 1's in binary number:" + countNumberOfOnes(binaryNum));
		System.out.println("Approach 2 AND number of bits with 1");
		int cnt =0;
		while(n>0) {
		if((n & 1) == 1)
			cnt++;
		 n=n>>1;
		}
	
		System.out.println("\nNumber of 1's in binary number:" + cnt);
		System.out.println(Integer.parseInt("0101",2));
		System.out.println(binaryToDecimal(101));
	}

}
