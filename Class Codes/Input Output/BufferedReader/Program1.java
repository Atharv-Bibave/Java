import java.io.*;
class Player{
	public static void main(String [] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Batsman name: ");
		String playerName1 = br.readLine();

		System.out.println("Enter Bowlers name: ");
		String playerName2 = br.readLine();

		System.out.println("Batsman name: "+ playerName1);
		System.out.println("Bowlers name: "+ playerName2);
	}
}
