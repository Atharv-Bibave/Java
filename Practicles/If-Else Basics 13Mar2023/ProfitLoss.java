class ProfitLoss{
	public static void main(String [] args){
	int sellingPrice = 1000;
	int costPrice = 1000;
	int profit;
	int loss;

	if(sellingPrice > costPrice){
		profit = sellingPrice - costPrice;
		System.out.println("Profit of"+ profit);
	}else if(sellingPrice < costPrice){
		loss = costPrice - sellingPrice;
		System.out.println("loss of"+ loss);
	}else if( sellingPrice == costPrice){
	       System.out.println("No profit no loss");
	}
	
	}	
}

