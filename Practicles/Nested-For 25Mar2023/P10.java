// Write a program to print following output:
// 1 2 3 4
// 4 5 6
// 6 7
// 7

class Problem10{
	public static void main(String [] args){
		int n=4;
		int num=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=n-i+1;j++){
			
			System.out.print(num+" ");	
			num++;
			}
			num--;
			System.out.println();
			
		}
	}
}
