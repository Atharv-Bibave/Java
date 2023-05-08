import java.io.*;
class User{
	static int myStringLen(String str){
		char arr[] = str.toCharArray();
		int count = 0;

		for(int i=0;i<arr.length;i++){
			count++;
		}
		return count;
	}
	public static void main(String []args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter str1: ");
		String str1 = br.readLine();

		System.out.println("Enter str2: ");
		String str2 = br.readLine();

		if(myStringLen(str1) == myStringLen(str2)){
			System.out.println("Length Equal");
		}else{
			System.out.println("Length Not Equal");

		}
	}
}

