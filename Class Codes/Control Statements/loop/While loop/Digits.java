/* Problem 6 : Given an integer n
		Print all the digit.
		Input : 6531
		Output : 1
			   3
			   5
			   6

*/


 class Digit{
	 public static void main(String [] args){
		 int n = 6531;
		 while(n!=0){
			 System.out.println(n%10);
			 n= n/10;
		 }
	 }
 }
