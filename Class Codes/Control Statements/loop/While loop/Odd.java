/* Problem 4 : Take an integer n as input.
		   Print odd integers from 1 to n using loop.
		   Input : 10
		   Output : 1 3 5 7 9 
*/

class Odd{
	public static void main(String [] args){
		int n = 10;
		int i = 1;
		while(i<=n){
			if(i%2!=0){
				System.out.println(i);
			} i++;
		}
	}
}
