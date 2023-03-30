// Write a program to print following output:
// F 5 D 3 B 1
// F 5 D 3 B 1
// F 5 D 3 B 1
// F 5 D 3 B 1
// F 5 D 3 B 1
// F 5 D 3 B 1

class Problem10{
	public static void main(String[] args){
		int n=6;

		for(int i=1;i<=n;i++){
			char ch= 'F';
			int num=5;
			for(int j=1;j<=n;j++){
				if(j%2==1){
					System.out.print(ch-- +" ");
					ch--;
				}else{
					System.out.print(num-- +" ");
					num--;
				}
			}
			System.out.println();
		}
	}
}

