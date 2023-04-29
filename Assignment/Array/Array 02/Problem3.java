/*
Program 3
Write a Java program to find the sum of even and odd numbers in an array.
Display the sum value.
Input: 11 12 13 14 15
Output
Odd numbers sum = 39
Even numbers sum = 26

*/

class Program3{
	public static void main(String [] args){

		int arr[] = new int[5];
		arr[0]=11;
		arr[1]=12;
		arr[2]=13;
		arr[3]=14;
		arr[4]=15;

		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even = even+arr[i];
			}else{
				odd = odd+arr[i];
			}
		}
		System.out.println("odd number sum: "+ odd);
		System.out.println("even number sum: "+ even);
	}
}
