// Write a program to print following output:
// 14 15 16 17
// 15 16 17 18
// 16 17 18 19 
// 17 18 19 20

class Problem3{
	public static void main(String [] args){
		int n=4;
		int k=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(14+k +" ");
				k++;
			}
			k=k-3;
			System.out.println();
		}
	}
}
