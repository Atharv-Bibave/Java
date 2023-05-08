/*
Description: 
	Returns the result of comparing the String calling this method to the object passed as an argument. Returns true if the Object value passed as an argument represents a String equivalent to the String calling the method, otherwise returns false.

Parameter:
	Object An Object against which the String calling the method is compared.

Return Type:
	boolean
*/
class EqualsDemo{
	public static void main(String [] args){

		String str1 = "Atharv";
		String str2 = new String("Atharv");

		System.out.println(str1.equals(str2));
	}
}
