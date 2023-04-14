import java.io.*;
class Program4{
	public static void main(String [] args)throws IOException{
		BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("name: ");
		String name1 = br1.readLine();
		br1.close();
		
		System.out.println("Name2: ");
		String name2 = br2.readLine();

		System.out.println(name1);
		System.out.println(name2);
	}
}
