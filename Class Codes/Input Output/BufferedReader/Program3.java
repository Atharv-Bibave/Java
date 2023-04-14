import java.io.*;
class Building{
	public static void main(String [] args)throws IOException{
	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Building name: ");
		String buildingName = br.readLine();

		System.out.println("Enter your wing: ");
		char ch = (char)br.read();
		br.skip(1);

		System.out.println("Enter your flat number: ");
		int flatNo = Integer.parseInt(br.readLine());

		System.out.println("Enter your Building name is: " +buildingName);
		System.out.println("Your wing: "+ ch);
		System.out.println("Your Flat Number: "+flatNo);
	}
}




