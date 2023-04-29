// Write a program to print following output:
// 14 14 14 14 
// 15 15 15 15 
// 16 16 16 16
// 17 17 17 17

class P3{
	public static void main(String [] args){
		int n = 4;
		for(int i = 1; i<= n; i++){
			for(int j = 1; j<= n; j++){
				System.out.print(15 - i +" ");
			} 
			System.out.println();
		}
	}
}
