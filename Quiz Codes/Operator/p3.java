class Core2Web{
	static int var = 2;
	public static void main(String [] args){
		var =(var=4)*(++var);
		System.out.println(var);
	}
}
// Explanation : First it assigns the value 4 to the var, after that it performs the increment operator so it gives answer 20
