/* Problem 4 : Given the temperature of a person in Farenheit.
		   Print whether the person has high, normal or low temperature
		   >98.6		==> high
		   >=98.0 & <=98.6==> normal
		   <98.0 		==> low
*/

class Temp{
	public static void main(String [] args){
		float temp = 92.0f;

		if(temp>98.6f){
			System.out.println("Temperature is High");
		}else if(temp<98.0f){
			System.out.println("Temperature is low");
		}else{
			System.out.println("Temperature is normal");
		}
	}
}

