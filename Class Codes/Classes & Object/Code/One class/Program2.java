class Demo2{
	int x = 10;
	static String str1 = "Atharv";

 	static void fun(){
		static String str2 = "Atharv";
		static String str3 = new String("Core2web");
	}
	public static void main(String [] args){


		System.out.println(str1+" "+System.identityHashCode(str1));
		System.out.println(str2+" "+System.identityHashCode(str2));
		System.out.println(str3+" "+System.identityHashCode(str3));
	}
}
