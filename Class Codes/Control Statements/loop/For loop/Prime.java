/*Problem 6 : Take N as an input.
	Print whether it is prime or not.
	Input: 5
	Output : Prime number.
*/

class Prime{
	public static void main(String [] args){
		int n = 5;
		int count = 0;

		for(int i = 1; i<=n; i++){
			if(n%i==0){
				count++;
			}
		} if(count == 2){
			System.out.println("is prime number");
		}else{
			System.out.println("is not prime number");
		}
	}
}

