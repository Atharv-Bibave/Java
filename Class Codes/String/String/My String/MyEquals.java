class MyEquals{

	static void myEquals(String str1 , String str2){
		
		if(str1 == str2){
			 System.out.println("true");
		}else{
			 System.out.println("false");
		}
	}
	public static void main(String [] args){

		String str1 = "Atharv";
		String str2 = "atharv";
		
		System.out.println(str1);
		System.out.println(str2);

		myEquals(str1 ,  str2);
	}
}
