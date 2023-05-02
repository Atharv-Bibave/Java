class StringDemo2{
	public static void main(String [] args){
		String str1 = "Atharv";
		String str2 = "Bibave";
		String str5 = new String("AtharvBibave");
		System.out.println(str1 + str2);

		String str3 = "AtharvBibave";
		String str4 = str1 + str2;
		
		System.out.println(System.identityHashCode(str1));
                System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
	}
}
