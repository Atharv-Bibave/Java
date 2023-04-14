class Demo1{
	int fun(int x){

		return x+10;
		
	}
	public static void main(String [] args){
		Demo1 obj = new Demo1();
		obj.fun(20);
		System.out.println("In Main");
	}
}
