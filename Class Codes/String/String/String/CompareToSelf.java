import java.io.*;
class User1{
	static int myCompareTo(String str1, String str2){

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		int flag = 0;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i] != arr2[i]){
				System.out.println(arr1[i] - arr2[i]);
			}
			flag = 1;
		}
		if(flag == 1){
			if(arr1.length!=arr2.length){
				System.out.println(arr1.length - arr2.length);
			}
		}else{
			return 0;
		}

	}

		public static void main(String [] args)throws IOException{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter first string: ");
			String str1 = br.readLine();

			System.out.println("Enter string to compare: ");
			String str2 = br.readLine();

			//myCompareTo(str1, str2);
			int compare = myCompareTo(str1,str2);
			System.out.println(compare);

			
		}
}


