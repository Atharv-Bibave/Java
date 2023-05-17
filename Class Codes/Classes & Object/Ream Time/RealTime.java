class RealTime{
	
	int real = 100;
	void time(){
		System.out.println("This is method time");
	}
	public static void main(String []args){
		RealTime obj = new RealTime();
		obj.time();
		System.out.println(obj.real);
	}
}

