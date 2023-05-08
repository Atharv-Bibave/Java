/*
Problem 1:
Write a program to print the numbers divisible by 5 from 1 to 50 & the number is even also print the
count of even numbers.
Input: Enter a lower limit: 1
Enter upper limit: 50
Output: 10, 20, 30, 40, 50
Count = 5
*/

import java.io.*;
class Program1{
	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a lower limit: ");
		int lower = Integer.parseInt(br.readLine());

		System.out.println("Enter a higher limit: ");
		int higher = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i=lower;i<=higher;i++){
			if(i%5==0 && i%2==0){
				System.out.print(i+ " ");
				count++;
			}
		} 
		 System.out.println();
		System.out.println("count: " + count);
	}
}



	
