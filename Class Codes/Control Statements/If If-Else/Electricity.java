/* Problem 8 : Electricity bill problem
		   Given an integer input A which represents units of 
		   electricity consumed at your house.
		   Calculate and print the bill amount.
		   unit <=100 : price per unit is 1
		   unit >100  : price per unit is 2
		   Input : 50
		   output : 50

		   Input : 200
		   Output : 300

*/


class Bill{
	public static void main(String [] args){
		int unit= 101;
		if(unit<=100){
			System.out.println(unit*1);
		}else if(unit>100){
			System.out.println(100*1+(unit-100)*2);
		}
	}
}
