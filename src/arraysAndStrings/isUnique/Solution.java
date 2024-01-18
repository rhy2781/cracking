package arraysAndStrings.isUnique;

public class Solution {
	public static void main(String [] args){
		setApproach sa = new setApproach();
		booleanArrayApproach ba = new booleanArrayApproach();
		bitVectorApproach bv = new bitVectorApproach();

		String unique = "1234567890qwertyuiopasdfghjklzxcvbnm,./;'[]-=";
		String notUnique = "qwertyuiopasdfghjklxzcvbnm,l";
		String notUnique1 = "aazcxvzcxv";
		String notUnique2 = "asdfcc";

		System.out.println(sa.isUnique(unique));
		System.out.println(sa.isUnique(notUnique));
		System.out.println(sa.isUnique(notUnique1));
		System.out.println(sa.isUnique(notUnique2));
		System.out.println("-------------");
		System.out.println(ba.isUnique(unique));
		System.out.println(ba.isUnique(notUnique));
		System.out.println(ba.isUnique(notUnique1));
		System.out.println(ba.isUnique(notUnique2));

		System.out.println("-------------");
		String a_z_unique = "abcdefghijklmnopqrstuvwxyz";
		String a_z_not_unique = "aabcds";
		String a_z_not_unique1 = "abcdd";
		String a_z_not_unique2 = "abccd";
		System.out.println(bv.isUnique(a_z_unique));
		System.out.println(bv.isUnique(a_z_not_unique));
		System.out.println(bv.isUnique(a_z_not_unique1));
		System.out.println(bv.isUnique(a_z_not_unique2));
	}
}
