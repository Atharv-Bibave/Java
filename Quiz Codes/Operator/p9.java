class Core2Web9{
	public static void main(String [] args){
		System.out.println(4/0);
	}
}
// Explanation: Assignment operator is right associative and multiple assignment operators used in the same line are on the same priority level. So the execution starts from the right side and all the variables var1, var2, var3 are assigned 45 values.
