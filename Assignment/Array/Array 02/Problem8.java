/*Program 8
WAP to find the uncommon elements between two arrays.
Input :
Enter first array : 1 2 3 5
Enter Second array: 2 1 9 8
Output: Uncommon elements :
3
5
9
8
*/

import java.io.*;
class Program8{ 
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr1[]= new int[4];
		int arr2[]= new int[4];

		System.out.println("Enter first array: ");
		for(int i=0;i<arr1.length;i++){
			arr1[i]= Integer.parseInt(br.readLine());
		}
		System.out.println("Enter second array: ");
		for(int j=0;j<arr2.length;j++){
                        arr2[j]= Integer.parseInt(br.readLine());
                }
		System.out.println("Common element: ");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<4;j++){
				if(arr1[i]!=arr2[j]){
					System.out.println(arr1[i]+ " ");
					break;
				}
			}
		}
	}
}

