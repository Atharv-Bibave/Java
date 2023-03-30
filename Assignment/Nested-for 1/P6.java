// Write a program to print following output:
// 9 8 7
// 9 8 7
// 9 8 7

class P6{
	public static void main(String [] args){
		int n =3;
		for(int i=1; i<=n; i++){
			int num = 9;
			for(int j =1; j<=n; j++){
				System.out.print(num-- +" ");
			}System.out.println();
		}
	}
}
