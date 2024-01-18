package arraysAndStrings.oneAway;

public class Solution {
	public static void main(String[] args){
		twoPointerApproach ta = new twoPointerApproach();
		System.out.println(ta.oneAway("pale", "ple"));
		System.out.println(ta.oneAway("pales", "pale"));
		System.out.println(ta.oneAway("pale", "bale"));
		System.out.println(ta.oneAway("pale", "bake"));
	}
}
