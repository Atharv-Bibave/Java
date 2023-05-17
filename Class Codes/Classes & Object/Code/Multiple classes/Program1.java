class Project{
	String projectName = "Online edu";
	int noOfEmp = 20;

	void clientInfo(){
		String strClient = "Core2Web";
		System.out.println("Client name: "+strClient);
		System.out.println("Project name: "+projectName);
		System.out.println("Number of Employee: "+noOfEmp);
	}
}
class C2w{
	public static void main(String [] args){
		Project obj = new Project();
		obj.clientInfo();
	}
}
