class StringBufferDemo6{
	public static void main(String [] args){

	String str1 = "Atharv";
	String str2 = new String("Bibave");
	StringBuffer str3 = new StringBuffer("Core2Web");
	String str4 = str1.concat(str3);
	String str5 = str3.append(str1);

	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	System.out.println(str5);
	}
}
