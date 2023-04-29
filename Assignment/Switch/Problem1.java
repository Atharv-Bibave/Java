/*Write a program in which students should enter marks of 5 different subjects. If all subject
having above passing marks add them and provide to switch case to print grades(first class
second class), if student get fail in any subject program should print “You failed in exam”
*/
import java.io.*;
class Program1{
	public static void main(String [] args){
		System.out.println("Enter Your Marks");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Maths Marks");
		int marks1 = Integer.parseInt(br.readLine());

		System.out.println("Enter Your Physics Marks");
		int marks2 = Integer.parseInt(br.readLine());

		System.out.println("Enter Your Chemistry Marks");
                int marks3 = Integer.parseInt(br.readLine());

		System.out.println("Enter Your History Marks");
                int marks4 = Integer.parseInt(br.readLine());

		System.out.println("Enter Your Science Marks");
                int marks5 = Integer.parseInt(br.readLine());

		int sum = marks1+marks2+marks3+marks4+marks5;
		float average = ((sum)f/5)*100;
		switch(marks) {
		case marks1>35:{
			case marks2>35:{
				case marks3>35:{
					case marks4>35:{
						case marks5>35:{
								       System.out.println("You've Passed");
								       break;
						}
					}
				}
			}
		}
	}

	}
}




