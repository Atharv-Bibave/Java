// Write a program to print following output:
// A 1 B 2
// A 1 B 2
// A 1 B 2

class Pattern8{
	public static void main(String [] args){
		for(int i=1; i<=3; i++){
			char ch = 'A';
			int k = 1;
			for(int j=1; j<=4; j++){
				if(j%2==1){
					System.out.print(ch++ +" ");
				}else{
					System.out.print(k++ + " ");
				}
			} System.out.println();
		}
	}
}
