// Write a program to print following output:
// A 1 B 2
// C 3 D 4 
// E 5 F 6

class Pattern9{
	public static void main(String [] args){
		char ch = 'A';
		int k = 1;
		for(int i =1; i<=3; i++){
			for(int j =1; j<=4; j++){
				if(j%2==1){
					System.out.print(ch++ + " ");
				}else{
					 System.out.print(k++ + " "); 
				}
			}
			System.out.println();
		}
	}
}
