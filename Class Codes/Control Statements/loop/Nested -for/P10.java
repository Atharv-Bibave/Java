// Write a program to print following output:
// *_ _*
// *_ _*
// *_ _*
// *_ _*

class Pattern10{
	public static void main(String [] args){
		int n = 4;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				if(j==1 || j==4){
				System.out.print("* ");
				}else{
					System.out.print("_ ");
				}
			}System.out.println();
		}
	}
}
