class StringBufferDemo5{
	public static void main(String [] args){

		StringBuffer br = new StringBuffer(100);

		br.append("Biencaps");
		br.append("Core2Web");

		System.out.println(br);
		System.out.println(br.capacity());

		br.append("Incubator");
		System.out.println(br);
		System.out.println(br.capacity());

	}
}
