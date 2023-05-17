
class Aeroplane{

	String airline = "Emirates";
	int seatNo = 123;
	String destination = "London";

	void activity(){

		System.out.println("Reeading book");
	}

	public static void main(String[] args){

		Aeroplane flight = new Aeroplane();

		System.out.println("Flight Information.");
		System.out.println(flight.seatNo);
		System.out.println(flight.airline);
		System.out.println(flight.destination);
		flight.activity();
	}
}
