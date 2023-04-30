/* Take N as an input. Print all factors.
 Input = 6
 Output = 1 2 3 6
 */

class Factorial{
	public static void main(String [] args){
		int n = 6;

		for(int i = 1; i<=n; i++){
			if (n%i==0){
				System.out.println(i);
			}
		}
	}
}
