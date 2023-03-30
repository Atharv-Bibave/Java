/* Problem 3 : Take two integers A & B as input
			    Print max of two.
				If-else Ladder.
*/

class Ladder{
	public static void main(String [] args){
		int x = 5;
		int y = 5;

		if(x>y){
			System.out.println(x+ "is greater");
		}else if(x<y){
			System.out.println(y+ "is greater");
		}else{
			System.out.println("both are equal");
		}
	}
}
