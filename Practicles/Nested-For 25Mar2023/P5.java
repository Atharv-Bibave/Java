// write a program to print following output:
// 10 10 10 10
// 11 11 11
// 12 12
// 13

class Problem5{
	public static void main(String[] args){
		int n=4;
		int num=10;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=n-i+1;j++){
				System.out.print(num+ " ");
			}
			num++;
			System.out.println();
		}
	}
}
