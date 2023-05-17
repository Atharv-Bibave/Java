class MyConcat{

	static void myConcat(String str1, String str2){
		String str3 = str1 + str2;
		System.out.println("Concated string: " +str3);
	}
	public static void main(String [] args){
		
		String str1 = "Core";
		String str2 = "2Web";
		System.out.println(str1);
		System.out.println(str2);

		myConcat(str1 , str2);
	}
}

