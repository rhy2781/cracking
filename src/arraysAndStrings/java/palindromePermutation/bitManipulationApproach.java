package arraysAndStrings.java.palindromePermutation;

public class bitManipulationApproach {
	public boolean palindromePermutation(String s) {
		int vector = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ('a' <= c && c <= 'z') {
				int shift = 1 << (c - 'a');
				vector ^= shift;
			}
		}
		return (vector & (vector - 1))== 0;
	}
}
