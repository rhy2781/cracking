package arraysAndStrings.java.isUnique;

import java.util.HashSet;
import java.util.Set;
import static java.lang.System.out;

public class Solution {
	public static void main(String [] args){

		String unique = "1234567890qwertyuiopasdfghjklzxcvbnm,./;'[]-=";
		String uniqueaz = "abcdefghijklmnopqrstuvwxyz";
		String notUnique = "qwertyuiopasdfghjklxzcvbnm,l";
		String notUnique1 = "aazcxvzcxv";
		String notUnique2 = "asdfcc";

		out.println("Boolean array approach");
		out.println(isUniqueArray(unique));
		out.println(isUniqueArray(notUnique));
		out.println(isUniqueArray(notUnique1));
		out.println(isUniqueArray(notUnique2));
		out.println();

		out.println("Bit Vector approach");
		out.println(isUniqueBitVector(uniqueaz));
		out.println(isUniqueBitVector(notUnique));
		out.println(isUniqueBitVector(notUnique1));
		out.println(isUniqueBitVector(notUnique2));
		out.println();

		out.println("Set Approach");
		out.println(isUniqueSet(unique));
		out.println(isUniqueSet(notUnique));
		out.println(isUniqueSet(notUnique1));
		out.println(isUniqueSet(notUnique2));
	}

	/**
	 * this solution requires the string to only have characters a - z
	 */
	public static boolean isUniqueBitVector(String s){
		int checker = 0;
		for(int i = 0; i < s.length();i ++){
			int val = s.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0){
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

	public static boolean isUniqueArray(String s) {
		if (s.length() > 128) return false;

		boolean[] chars = new boolean[128];
		for(int i = 0; i < s.length(); i ++) {
			if(chars[s.charAt(i)]) return false;
			chars[s.charAt(i)] = true;
		}
		return true;
	}

	public static boolean isUniqueSet(String s){
		Set<Character> hs = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			if (hs.contains(s.charAt(i))) return false;
			hs.add(s.charAt(i));
		}
		return true;
	}
}
