package arraysAndStrings.java.URLify;

import static java.lang.System.out;
public class Solution {
	public static void main(String [] args){
		String s  = "Mr John Smith       ";
		out.println("[" + s + "]");
		out.println("[" + URLify(s, 13) + "]");
	}

	public static String URLify(String s, Integer t){
		char[] chars = s.toCharArray();

		int count = 0;
		for(int i = 0; i < t; i++){
			if(chars[i] == ' ') count ++;
		}

		int write = t + (2 * count) - 1;
		int read = t - 1;
		while(read >= 0){
			if(chars[read] == ' ') {
				chars[write] = '0';
				chars[write - 1] = '2';
				chars[write - 2] = '%';
				write -= 3;
			}
			else{
				chars[write] = chars[read];
				write -= 1;
			}
			read -= 1;
		}
		return new String(chars);
	}
}
