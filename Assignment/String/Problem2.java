/*
Problem :
Write a class StringDemo

Non static method : 
checkAnagramStrings 

Anagram Strings : 

2 Strings are anagram if they contain same characters and same number of times.
Eg. shashi & ashish
Invoke both methods using strings from user.
*/

import java.util.Arrays;
import java.io.*;
class Program2{

	void anagram(String str1 , String str2){
		
		int length1 = str1.length();
		int length2 = str2.length();

		if(length1 == length2){
			char [] ch1 = str1.toLowerCase().toCharArray();
			char [] ch2 = str2.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if(Arrays.equals(ch1,ch2)){
				System.out.println("The string is anagram");
			}else{
				System.out.println("The string is not anagram");
			}
		}else{
			System.out.println("The string is not anagram");
		}

	}
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 1st String to check anagram or not: ");
		String str1 = br.readLine();
		System.out.println("Enter 2nd String to check anagram or not: ");
                String str2 = br.readLine();


		Program2 obj = new Program2();
		obj.anagram(str1,str2);
	}
}

