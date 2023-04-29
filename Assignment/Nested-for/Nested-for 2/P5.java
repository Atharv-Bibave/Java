// Write a program to print following output:
// 26 Z 25 Y
// 24 X 23 W
// 22 V 21 U
// 20 T 19 S

class Problem5{
	public static void main(String [] args){
		int n=4;
		int num=26;
		char ch='Z';
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j%2==1){
					System.out.print(num-- + " ");
				}else{
					System.out.print(ch-- + " ");
				}
			}
			System.out.println();
		}
	}
}

