/* Problem 8 : Take an integer nas am input.
		Print perfect  squares till n.
		Perfect square : An integer whose square root is integer.
		25 --> 5 : Yes
		81 --> 9 : Yes
		1 --> 1 : Yes 
		10, 3, 13: No

		Input : 30
		Output : 1 4 9 16 25
<Second Approach>
*/

class Square2{
	public static void main(String [] args){
		int n = 30;
		int i = 1;
		int sq = 0;
		while(i>0 && i<=n){

			sq = i*i;
			if(sq<=n){
			System.out.println(sq);
			
		}
			i++;
		}

	}
}
