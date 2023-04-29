/* Write a program to print following output:
 	1
	8 9
	27 16 125
	64 25 216 49
*/

class Program9{
	public static void main(String [] args){
		int row=4;
		int num=1;

		for(int i=1;i<=row;i++){
			 num =i;
			for(int j=1;j<=i;j++){
				int mult=1;
				if(j%2==0){
					mult = num*num;
					System.out.print(mult+ " ");
				}else{
					mult = num*num*num;
					System.out.print(mult+ " ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
