class Method2{
	int x=10;
	static int y=20;

	void fun(){
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String [] args){
		Method2 obj = new Method2();
		obj.fun();
		System.out.println(obj.x);
		System.out.println(y);
	}
}	
