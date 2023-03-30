// Write a program to print following output:
// 9
// 9 8
// 9 8 7
// 9 8 7 6

class Problem6{
	public static void main(String [] args){
		int n= 4;
		for(int i=1;i<=4;i++){
			int num=9;
			for(int j=1;j<=i;j++){
				System.out.print(num+ " ");
				num--;
			}
			System.out.println();
		}
	}
}
