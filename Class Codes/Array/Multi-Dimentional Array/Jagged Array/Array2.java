
class JaggedArray2{
	public static void main(String [] arga){
		int arr[][] = new int[3][];
		arr[0] = new int[]{1,2,3};
		arr[1] = new int[]{4,5};
		arr[2] = new int[]{7};

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){

				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
