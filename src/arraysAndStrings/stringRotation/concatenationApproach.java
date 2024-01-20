package arraysAndStrings.stringRotation;

public class concatenationApproach {
	public boolean stringRotation(String s, String t){
		if(s.length() == t.length() && s.length() > 0){
			String s1 = s + s;
			return isSubstring(t, s1);
		}
		return false;
	}
	public boolean isSubstring(String subString, String original){
		return original.contains(subString);
	}
}
