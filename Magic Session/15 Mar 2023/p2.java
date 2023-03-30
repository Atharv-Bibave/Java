/* Problem 2 : Write a program to calcuaate the factorial of given number.
	Input : 6
	Output : Factorial is 720
*/

class Fact{
	public static void main(String [] args){
		int fact;
		int i = 1;
		int j = 6;

		while(i>0 && i<j){ 
			fact = j*i;
			i--;

			System.out.println(fact);
		}
	}
}
