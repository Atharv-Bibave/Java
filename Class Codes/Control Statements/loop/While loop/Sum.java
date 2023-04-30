/* Problem 7 : Given an integer n.
		Print sum of the digits.
		Assume n>=0
		Input : 6513
		Output : 15
*/ 

class Sum{
	public static void main(String [] args){
		int n  = 6531;
		int sum = 0;
		int rem;
		while(n!=0){
			rem = n%10;
			sum = sum + rem;
			n= n/10;
		} System.out.println(sum);
	}
}
