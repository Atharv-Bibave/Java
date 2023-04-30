/* Problem 2 : Take N as input.
  Print odd integer from 1 to N
  Input : 6
  Output : 1 3 5
 */

class Odd{
	public static void main(String [] args){
		int N = 6;
		for (int i = 1; i<=N; i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}
}

