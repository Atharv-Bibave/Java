class Month{
	public static void main(String arg[]){
		int month= 7;
		if (month== 1){
			System.out.println("Jan has 31 days");
		}else if(month== 2){
			System.out.println("Feb has 28 or 29 days");
		}else if(month== 3){
			System.out.println("Mar has 31 days");
		}else if(month== 4){ 
			System.out.println("Apr has 30 days");
		}else if(month== 5){ 
			System.out.println("May has 31 days");
		}else if(month== 6){           
			System.out.println("Jun has 30 days");
		}else if(month== 7){
			System.out.println("Jul has 31 days");
		}else if(month== 8){ 
			System.out.println("Aug has 31 days");
		}else if(month== 9){        
			System.out.println("Sept has 30 days");
		}else if(month== 10){
			System.out.println("Oct has 31 days");  
		}else if(month== 11){     
			System.out.println("Nov has 30 days");
		}else if(month== 12){    
			System.out.println("Dec has 31 days");
		}else if(month<=0 || month >=13){
			System.out.println("Invalid Month");
		}
	}
}


