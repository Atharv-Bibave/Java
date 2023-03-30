// Write a program to print following output:
// * - - *
// * - - *
// * - - *
// * - - *

class Pattern11{
	public static void main(String [] args){
		int n = 4;

		for(int i=1; i<=n; i++){
		for(int j=1; j<=n; j++){
			if(j%n==1 || j%n==0){
				System.out.print("* ");
			}else{
				System.out.print("_ ");
			}
		}System.out.println();
		}
	}
}


