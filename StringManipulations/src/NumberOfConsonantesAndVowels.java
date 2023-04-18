
public class NumberOfConsonantesAndVowels {

	public static void main(String[] args) {
		String s = "Hanumant";
		int i = 0, vowels = 0, consonants = 0;
		while (i != s.length()) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
					|| s.charAt(i) == 'E' || s.charAt(i) == 'U')
				vowels++;
			else
				consonants++;
			i++;
		}
		System.out.println("Number of consonants:"+consonants);
		System.out.println("Number of vowels:"+vowels);
	}

}
