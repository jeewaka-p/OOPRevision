package OOP;

import java.util.Scanner;
/**
 *Q2 . Create class Human which will have methods for addRobot() and parameterized constructor as needed
 *Q3. Create 2 subclasses of Human, Child and Adult.
 **********Child can hold upto 3 robots and Adult upto 4.
 **********AddCrawler() will request user to enter number of robots to add and use a for loop to add each one.
 **********create a addRobot() to include a parameter that will take a robot object and add it to the given index.
*/

public class Human {
	String name;
	Robot[] r;
	public Human(String name, int i){
		r = new Robot[i];
	}
	
	public void addCrawlers(){
		Scanner sc = new Scanner(System.in);
		System.out.print("How Many Robots do you need to Add : ");
		int num = sc.nextInt();
		// add for loop to add the robots
		
		//request user to enter robotID inside the
		
	}
	
	public void addRobot(Robot r,  int i){
		this.r[i] = r;
	}
	
}
