// Write a program to print following output:
// 3C 3C 3C 3C
// 3C 3C 3C
// 3C C3
// 3C

class Problem4{
	public static void main(String [] args){
		int n=4;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=n-i+1;j++){
				System.out.print("3C ");
			}System.out.println();
		}
	}
}
