class Switch5{
	public static void main(String [] args){
		String str1="Non-Veg";
		System.out.println("Before Switch");

		switch(str1){


			case "Veg":
				
					   String str2 ="Main Course";
					   switch(str2){

						   case "Main Course":{
							   System.out.println("Veg Thali");
							   break;
								}
						   case "Starter":{
							   System.out.println("Soup");
							   break;
								}
					   }
					   break;
		
			case "Non-Veg":
			
					       String str3 ="Main Course";
					       switch(str3){
						       case "Main Course":{
							       System.out.println("Non-Veg Thali");
							       break;
								}
							case "Starter": {
							       System.out.println("Alni rassa");
							       break;
								}
					       }
					       break;
		
			default:
			       System.out.println("");
				break;
	 			
			}
			System.out.println("After switch");
		}
	}


