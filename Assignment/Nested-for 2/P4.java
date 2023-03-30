// Write a program to print following output:
// 1A 2B 3C
// 1A 2B 3C
// 1A 2B 3C

class Problem4{
	public static void main(String [] args){
		int n=3;
		for(int i=1;i<=3;i++){
			char ch ='A';
			int num =1;
			for(int j=1;j<=3;j++){
				System.out.print(num++ + "" + ch++ + " ");
			}
			System.out.println();
		}
	}
}
