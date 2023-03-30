/* Problem 5 : Take an integer n as input.
		   Print multiples of 4 till n.
		Input : 4
		output : 4 8 12 16 20
*/

class Mul{
	public static void main(String [] args){
		int i = 4;
		int n = 22;

		while(i<=22){
			if(i%4==0){
				System.out.println(i);
			} i= i+4;
		}
	}
}
