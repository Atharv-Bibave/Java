// Write a program to print following output:
// 1 2 3 4
// 2 3 4 5
// 3 4 5 6
// 4 5 6 7

class P10{
	 public static void main(String [] args){
		 int k = 0;
		 for(int i =1; i<=4; i++){
			 for(int j =1; j<=4; j++){
				 System.out.print(k+j +" ");
			 }
			 System.out.println();
			 k++;

			 
		 }
	 } 
}

