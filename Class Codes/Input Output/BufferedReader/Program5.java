import java.io.*;
class IODemo{
	public static void main(String[] args)throws IOException{

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

		String str1 = br1.readLine();
		System.out.println("String1 = " + str1);
		br1.close();

		char ch = (char)isr.readLine();
		System.out.println("Char = "+ ch);
	}
}

