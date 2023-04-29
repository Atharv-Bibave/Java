// Write a program to print following output:
// 1 4 9
// 16 25 36
// 49 64 81

class Problem6{
	public static void main(String [] args){
		int n=3;
		int num=1;
		int mult=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				mult =num*num;
				System.out.print(mult +" ");
				num++;
			} 
			System.out.println();
		}
	}
}
