// Write a program to print following output:
// A b C d
// E f G h
// I j K l
// M n O p

class Problem8{
	public static void main(String [] args){
		char ch= 'A';
		char ch1= 'a';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==1){
					System.out.print(ch++ +" ");
					ch++;
				}else{
				System.out.print(++ch1 +" ");
				ch1++;
				}
			} 
			System.out.println();	
		}
	}
}
