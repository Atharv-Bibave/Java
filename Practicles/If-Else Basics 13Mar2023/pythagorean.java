class Pythagorean{
	public static void main(String [] args){
	int a = 3;
	int b = 4;
	int c = 5;
	
	if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a){
		System.out.println("This is pythagorean triplet");
	}else{
		System.out.println("This is not pythagorean triplet");
	}
}
}

