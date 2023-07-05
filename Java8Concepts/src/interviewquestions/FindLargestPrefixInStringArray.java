package interviewquestions;

import java.util.Arrays;

public class FindLargestPrefixInStringArray {

	public static void main(String[] args) {
		String words[] = { "flower", "fly", "flow" };
        String prefix = Arrays.stream(words).reduce((s1,s2)->{
        	int i = 0;
        	while(i < s1.length() && i<s2.length() && s1.charAt(i) == s2.charAt(i)) {
        		i++;
        	}
        	return s1.substring(0,i);
        }).orElse("");
        System.out.println("Largest Prefix of given array:"+prefix);
	}

}
