class StringBufferDemo3{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb);

		sb.append("Atharv");
		System.out.println(sb.capacity());
                System.out.println(sb);
	}
}
