class StringBufferDemo7{
	public static void main(String [] args){
		String str1 = "Atharv";
		String str2 = new String("Bibave");
		StringBuffer str3 = new StringBuffer("Core2Web");
		str1.concat(str2);
		str3.append(str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
