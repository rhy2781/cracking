package arraysAndStrings.stringCompression;

public class pointerApproach {
	public String stringCompression(String s){
		StringBuilder sb = new StringBuilder();
		int read = 0;
		int count = 1;
		while(read < s.length() - 1){
			while(s.charAt(read) == s.charAt(read + 1) && read < s.length() - 2){
				read += 1;
				count += 1;
			}
			sb.append(s.charAt(read));
			sb.append(count);
			count = 1;
			read += 1;
		}
		String res = sb.toString();
		return res.length() < s.length() ? res : s;
	}
}
