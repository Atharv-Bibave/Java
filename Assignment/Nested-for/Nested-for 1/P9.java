// Write a program to print following output:
// C B A
// C B A
// C B A

class P9{
	public static void main(String [] args){
		int n =3;
		for(int i=1; i<=n; i++){
			char ch = 'C';
			for(int j =1; j<=n; j++){
				System.out.print(ch-- + " ");
			}System.out.println();
		}
	}
}
