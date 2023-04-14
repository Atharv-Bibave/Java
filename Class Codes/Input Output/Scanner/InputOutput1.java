import java.util.Scanner;

class InputOutput1{
	public static void main(String [] args){
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter your dream company name: ");
		String name = obj.next();

		System.out.println("Expected package: ");
		float salary= obj.nextFloat();

		System.out.println(name);
		System.out.println(salary+"LPA");
	}
}
