class StringBufferDemo4{
	public static void main(String [] args){
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb);

		sb.append("Atharv");
		System.out.println(sb.capacity());
                System.out.println(sb);

		sb.append("Bibave");
                System.out.println(sb.capacity());
                System.out.println(sb);

		sb.append("Core2Web");
                System.out.println(sb.capacity());
                System.out.println(sb);
	}
}

