import java.util.*;
class Operation{
	void add(int a, int b){
		int ans = a+b;
		System.out.println("Addition = " +ans);
	}
	void sub(int a, int b){
		int ans = a-b;
		System.out.println("Subtraction = " +ans);
	}
	void mult(int a, int b){
		int ans = a*b;
		System.out.println("Multiplication = " +ans);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value");
		int a = sc.nextInt();
		int b = sc.nextInt();

		Operation obj= new Operation();
		obj.add(a,b);
		obj.sub(a,b);
		obj.mult(a,b);
	}
}
