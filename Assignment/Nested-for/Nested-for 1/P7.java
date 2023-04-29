// Write a program to print following output:
// D D D D
// D D D D
// D D D D
// D D D D

class P7{
	public static void main(String [] args){
		int n = 4;
		char ch = 'D';
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(ch+ " ");
			}System.out.println();
		}
	}
}
