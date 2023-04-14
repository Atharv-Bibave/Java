import java.io.*;
class PlayerInfo{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter player name: ");
		String name = br.readLine();

		System.out.println("Enter jersy no: ");
		int jersyNo = Integer.parseInt(br.readLine());

		System.out.println("Enter Average: ");
		float avg = Float.parseFloat(br.readLine());

		System.out.println("Player name: "+ name);
		System.out.println("Jersy no: "+ jersyNo);
		System.out.println("Average: "+ avg);
	}
}

