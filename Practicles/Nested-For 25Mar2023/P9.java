// Write a program to print following output:
// 1 
// 8 27
// 64 125 216

class Problem9{
	public static void main(String [] args){
		int row =3;
		int num=1;
		for(int i=1;i<=3;i++){
			int mult=0;
			for(int j=1;j<=i;j++){
				mult = num*num*num;
				System.out.print(mult+ " ");
				num++;
			} 
			System.out.println();
		}
	}
}
