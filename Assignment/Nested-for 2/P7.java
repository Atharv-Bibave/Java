// Write a program to print following output:
// 1 2 9
// 4 25 6
// 47 8 81

class Problem7{
	public static void main(String [] args){
		int n=3;
		int mult=0;
		int num=1;
		for(int i=1;i<=3;i++){
			for(int j=1; j<=3;j++){
				if(num%2==1){
					System.out.print(num*num + " ");
				}else{
					System.out.print(num + " ");
				}num++;
			}
			
			System.out.println();
		}
	}
}
