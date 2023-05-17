class Core2Web{

	int noOfCourses = 8;
	String favCourse = "Java";

	void display(){
		System.out.println("Number of courses: "+noOfCourses);
		System.out.println("Favourite course: "+favCourse);
	}

}
class User1{

	public static void main(String [] args){
		Core2Web info = new Core2Web();
		info.display();
	}

}
