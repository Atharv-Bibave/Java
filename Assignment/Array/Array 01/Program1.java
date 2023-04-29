/*WAP to take size of array from user and also take integer elements from user Print sum
of odd elements only
input : Enter size : 5
Enter array elements : 1 2 3 4 5
output : 9
1 + 3 + 5
*/

import java.io.*;
class Program1{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		int add=0;

		for(int i=0;i<arr.length;i++){
			arr[i] = Integer .parseInt(br.readLine());
			if(arr[i]%2==1){
				add = add + arr[i];
			}
		}
		System.out.println("output: "+add);
	}
}
