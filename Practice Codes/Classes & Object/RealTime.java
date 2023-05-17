class Laptop{

	String laptopName = "Msi-Modern14";
	float display = 14.5f;
	String processor = new String("intel i7 11th-gen");
	long ssdMemory = 524288;
	int price = 58990;
	int ram = 8;

	void specification(){
		System.out.println("Laptop specification are as follows: ");
		System.out.println("Name of laptop: " +laptopName);
		System.out.println("display size: " +display+ " inch");
		System.out.println("Processor info: " +processor);
		System.out.println("Internal memory: " +ssdMemory+ " Megabytes");
		System.out.println("Price: " +price+ " K");
		System.out.println("RAM memory: " +ram+ " Gigabytes");
	}
	public static void main(String [] args){
		Laptop info = new Laptop();
		info.specification();
	}
}


