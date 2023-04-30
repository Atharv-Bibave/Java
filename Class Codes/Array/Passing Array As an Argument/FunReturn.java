class FunReturn{
	public static void main(String [] args){
		FunReturn obj = new FunReturn();
		int ret = obj.fun(10);
		System.out.println(ret);
	}
	int fun(int x){
		int val = x+50;
		return val;
	}
}
