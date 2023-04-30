import java.io.*;
class Array3{
	public static void main(String [] args)throws IOException{
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 5 integer values: ");
		int arr[] = new int[5];

		for(int i=0;i<arr.length;i++){
			arr[i]= Integer.parseInt(br.readLine());
			sum = sum+arr[i];
		}
		System.out.println("Sum of entered integer values: "+sum);
	}
}



