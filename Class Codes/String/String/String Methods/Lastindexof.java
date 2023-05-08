/*
Description:
	Returns the last index value at which the String passed as an argument occurs in the String calling the lastIndexOf method.

Parameter:
	String to find the index of the last occurrence of in the String calling the lastIndexOf method.

Return Type:
	Integer
*/

class LastIndexOfDemo{
	public static void main(String [] args){
	       String str1 = "Atharv";
	       System.out.println(str1.lastIndexOf('h',0));
	       System.out.println(str1.lastIndexOf('a',1));
	       System.out.println(str1.lastIndexOf('h',2));
	}
}	
