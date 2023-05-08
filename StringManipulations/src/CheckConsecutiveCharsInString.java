
public class CheckConsecutiveCharsInString {

	public static void main(String[] args) {
		String S = "bcdebeaec";
		int i = 0;
		String newStr = "";
		while (i < S.length() && (i + 1) != S.length()) {
			System.out.println(S.charAt(i) + " " + S.charAt(i + 1));

			if (S.charAt(i) == S.charAt(i + 1)) {
				newStr = newStr + S.charAt(i);
				i = i + 2;

			} else {
				newStr = newStr + S.charAt(i);
				i++;
			}
		}
		if (newStr.isEmpty())
			System.out.println(S);
		else
			System.out.println(newStr+S.charAt(i));
	}

}
