/*
Description:
	Returns the concatenation of the String passed as an argument and the String calling this method.

parameter: 
	String string - A value of type String to append to the end of the String calling the method.

Reeturn Type:
	String
*/

class ConcatDemo{
	public static void main(String [] args){

		String str1 = "Core2";
		String str2 = "Web";

		String str3 = str1.concat(str2);

		System.out.println(str3);
	}
}
