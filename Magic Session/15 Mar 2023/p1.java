/* Problem 1 : Write a program to prrint table of 2
	Output : 2 4 6 8 10 12 14 16 18 20
*/

class Table{
	public static void main(String [] args){
		int i = 1;
		int j = 0;
		while(i<=10){
			j = 2*i;
			System.out.println(j);
			i++;
		}
	}
}
