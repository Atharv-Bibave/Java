/*
Program 6
WAP to take size of array from user and also take integer elements from user
find the maximum element from the array
input : Enter size : 5
Enter array elements: 1 2 5 0 4
output: max element = 5
*/
import java.io.*;
class Program6{
	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size: ");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter array element: ");
		int arr[] = new int[size];
		int max = arr[0];
		for(int i=0;i<arr.length;i++){
			arr[i]= Integer.parseInt(br.readLine());
			if(arr[i]>max){
				max = arr[i];
		}
		}
		System.out.println("Max element: "+max);
	}
}

