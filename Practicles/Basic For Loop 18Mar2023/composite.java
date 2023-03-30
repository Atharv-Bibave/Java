// Write a program to find number is composite  or not.

 class Composite{
	 public static void main(String [] args){
		 int n= 6;
		 int count = 0;
		 for(int i= 1; i<=n; i++){
			if(n%i==0){
				count++;
			}
		 }if(count>2){
			 System.out.println(n+ " is Composite number");
		 }else{
			 system.out.println(n+ "is not a Composite number");
		 }
	 }
 }

			 
