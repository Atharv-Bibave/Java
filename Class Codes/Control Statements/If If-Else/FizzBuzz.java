/* Problem 7 : Given an integer value as input. 
		   Print fizz if it is divisible by 3.
		   Print buzz if it is divisible by 5.
		   Print fizz buzz if it is divisible by both.
	         If not then print not divisible by both.
*/

class Num{
	public static void main(String [] args){
		int x = 15;

		if(x%3==0 && x%5==0){
			System.out.println("Fizz Buzz");
		}else if(x%3==0){
			System.out.println("Fizz");
		}else if(x%5==0){
			System.out.println("Buzz");
		}
	}

}
