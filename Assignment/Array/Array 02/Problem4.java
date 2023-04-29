/*
Program 4
WAP to search a specific element from an array and return its index.
Input: 1 2 4 5 6
Enter element to search: 4
Output: element found at index: 2
*/
import java.io.*;
class Program4{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		arr[4]=6;

		System.out.println("Entre element to search: ");
		int element = Integer.parseInt(br.readLine());

		for(int i=0;i<arr.length;i++){
			if(arr[i]==element){
				System.out.println("Element found at index: "+i);
			}
		}
	}
}
