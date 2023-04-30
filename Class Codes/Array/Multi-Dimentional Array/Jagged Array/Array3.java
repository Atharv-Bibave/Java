import java.io.*;
class JaggedArray3{
	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[][] = new int[3][];
	        arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[1];
		System.out.println("Enter element: ");

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]= Integer.parseInt(br.readLine());
			}
		}
		for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                               System.out.print(arr[i][j]+" ");
                        }
               		System.out.println();
	       	}
	}
}




