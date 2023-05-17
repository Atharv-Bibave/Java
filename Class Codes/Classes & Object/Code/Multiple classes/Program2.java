class McD{

	int item = 5;
	String product = "Fries";

	void menu(){
		String name1 = "Veg";
		String name2 = "Non-Veg";

		System.out.println(item);
		System.out.println(product);
	}

}
class User{

	public static void main(String [] args){

		McD obj = new McD();
		obj.menu();
	}

}
