/* Problem 7 : Take an integer n as an input.
  	Print whether n is perfect number or not.
  	Input : 4
  	Output : Not a perfect square.
 */

class Perfect{
	public static void main(String [] args){
		int n = 4;
		int sum = 0;
		for(int i = 1; i<n; i++){
		
			if(n%i==0){
				sum = sum+i;
			}
		}if(sum==n){
			System.out.println("is perfect square number");
		}else{
			System.out.println("is not perfect square");
		}
	}

}
