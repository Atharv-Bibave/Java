import java.util.*;
class Array4{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();
		}
		int count = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count++;
			}
		}
		System.out.println("Even element count: "+ count);
	}
}
