package OOP;

import java.util.Scanner;

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
