// Write a product to print product of 1 to 10.

class Product{
	public static void main(String [] args){
		int n = 1;
		int mult = 1;
		for(int i = 10; i>=n; i--){
			mult = mult * i;
		}System.out.println(mult);
	}
}
