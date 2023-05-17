/*
method:
	public boolean equalsIgnoreCase(String anotherString);

description: compares a String to this String ignoring case.

parameter:String(str2)

return type: boolean
*/

class EqualsIgnoreCaseDemo{
	public static void main(String [] args){
		String str1 = "Core2Web";
		String str2 = "core2Web";
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
