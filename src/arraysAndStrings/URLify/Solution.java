package arraysAndStrings.URLify;

public class Solution {
	public static void main(String [] args){
		String s  = "Mr John Smith       ";
		iterateBackwardsApproach ia = new iterateBackwardsApproach();
		System.out.println("[" + s +"]");
		System.out.println("[" + ia.URLify(s, 13) + "]");
	}
}
