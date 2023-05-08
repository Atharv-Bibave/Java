/*
Description:
	Compares the lexicographic value of a String to the String value passed as an argument. Returns 0 if the Strings are lexicographically equivalent. Returns a value greater than 0 if the argument String is lexicographically greater, returns a value less than 0 if the argument String is lexicographically lesser. Lexicographic equivalence is based on the order of strings in a lexicon or dictionary. For example, "ant" is lexicographically lesser than "bat" because ant occurs first in an alphabetically ordered lexicon.

Parameter:
	String string - String to lexicographically compare with the String calling the compareTo method.

Return Type:
	Integer
*/
class CompareToDemo{
	public static void main(String [] args){
		String str1 = "Atharv";
		String str2 = "atharv";

		System.out.println(str1.compareTo(str2));
	}
}

