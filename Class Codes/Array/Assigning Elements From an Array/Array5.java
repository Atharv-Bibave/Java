import java.io.*;
class Array5{
	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array length: ");
		int length = Integer.parseInt(br.readLine());
		int arr[] = new int[length];

		System.out.println("Enter array element: ");
		for(int i=0;i<arr.length;i++){
			 arr[i]= Integer.parseInt(br.readLine());
		}

		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even++;
			}else{
				odd++;
			}
		}
		System.out.println("Even element count: "+even);
		System.out.println("Odd element count: "+odd);
	}
}


