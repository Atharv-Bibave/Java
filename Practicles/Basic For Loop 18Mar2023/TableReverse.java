// Write a program to print table of 12 in reverse order.

class TableReverse{
	public static void main(String[] args){
		int n = 1;
		int mult = 1;
		for(int i =10; i>=n; i--){
			mult = 12 * i;
			System.out.println(mult);
		}
	}
}
