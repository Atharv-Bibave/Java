// Write a program to print following output:
// C2W
// C2W C2W
// C2W C2W C2W
// C2W C2W C2W C2W

class Problem1{
	public static void main(String [] args){
		int row=4;
		for(int i=1;i<=row;i++){
		for(int j=1;j<=i;j++){
			System.out.print("C2W ");
		}
		System.out.println();
		}
	}
}
