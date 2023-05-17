/* Problem :
 Write a class StringDemo

Static method : checkPalindromeString 

Invoke both method using strings from user.

*/

import java.io.*;
class Program1{

		static void palindrome(String str){
			
			int strLength = str.length();
			String reverse ="";

			for(int i=(strLength - 1); i>=0; i--){

				reverse = reverse + str.charAt(i);

			}

			if(str.toLowerCase().equals(reverse.toLowerCase())){
				
				System.out.println(str+"  "+ "String is palindrome");

			}else{

				System.out.println(str+ "String is not palindrome");

			}

		}
	public static void main(String [] args)throws IOException{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		 	System.out.println("Enter String to check palindrome: ");
			String str = br.readLine();
                        
			palindrome(str);
	}
}


