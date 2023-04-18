
public class StringSpecialCharOperations {

	public String removeSpecialCharsFromString(String str) {
		if (str == null || str.isEmpty()) {
			System.out.println("String is empty/null");
			return null;
		}
		System.out.println("Replacing Special Chars from String");
		return str.replaceAll("[^a-zA-Z0-9]", " ");
	}

	public String removeNumbersFromString(String str) {
		if (str == null || str.isEmpty()) {
			System.out.println("String is empty/null");
			return null;
		}
		System.out.println("Replacing Numbers from String");
		int i = 0;
		String strWithoutNum = "";

		while (i != str.length()) {
			if (!Character.isDigit(str.charAt(i)))
				strWithoutNum += str.charAt(i);
			i++;
		}
		return strWithoutNum;
	}

	public String revereStringWithoutSpecialChars(String str) {
		String reverseString = "";
		if (str == null || str.isEmpty()) {
			System.out.println("String is empty/null");
			return null;
		}
		System.out.println("Reversing String Without Special Chars");
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		int i = str.length() - 1;
		System.out.println("Length of String:" + str.length());
		while (i >= 0) {
			reverseString = reverseString + str.charAt(i);
			i--;
		}
		return reverseString;
	}

	public static void main(String[] args) {
		StringSpecialCharOperations op = new StringSpecialCharOperations();
		System.out.println(op.removeSpecialCharsFromString("This#string%contains^special*characters&."));
		System.out.println(op.revereStringWithoutSpecialChars("This#string%contains^special*characters&."));
		System.out.println(op.removeNumbersFromString("This#string%contains^77special*characters&.90"));

	}

}
