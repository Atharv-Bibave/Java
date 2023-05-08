/*
Description:
	Compares the lexicographic value of a String to the String value passed as an argument and ignores differences in case. Returns 0 if the Strings are lexicographically equivalent. Returns a value greater than 0 if the argument String is lexicographically greater, returns a value less than 0 if the argument String is lexicographically lesser.

Parameter:
	String string - String to lexicographically compare with the String calling the compareToIgnoreCase method.

Return Type:
	Integer.
*/
class CompareToIgnoreCaseDemo{
	public static void main(String [] args){
		String str1 = "ATHARV";
		String str2 = "atharv";

		System.out.println(str1.compareToIgnoreCase(str2));
	}
}

