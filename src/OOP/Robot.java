/**
 * 
 */
package OOP;

/**
 * @author Jeewaka- SLIIT
 *
 *Q1 . Create class Robot which will have methods for move() and parameterized constructor as needed
 *Q2 . Create class Human which will have methods for addRobot() and parameterized constructor as needed
 *Q3. Create 2 subclasses of Human, Child and Adult.
 **********Child can hold upto 3 robots and Adult upto 4.
 **********AddCrawler() will request user to enter number of robots to add and use a for loop to add each one.
 **********create a addRobot() to include a parameter that will take a robot object and add it to the given index.
 *Q4. Create two subclasses of Robot: Crawler and Humanoid
 **********implement move() in Crawler to display "I can only Crawl"
 **********Create two subclasses of Humanoid. HumanoidWithLegs and HumanoidWithWheels. and implement move() method to display
 ************ "I can Walk" and "I can Drive".
 *Q4. Use Information Hiding principles and implement relevant getters and setters (Mutator and Accessor methods)
 *Q5. Create and Interface Printable with a method printInfo()
 **********Implement the PrintInfo method in Human and Robot classes(or subclasses) where printing information (RobitId or Human name) is needed.
 *
 *Q5. Try creating a child object in Main class. use the addCrawlers() to add 4 Crawler to the child with ids 1, 2 3, and 4
 **********What Happened?
 *Q6. Try creating an adult Object and using addCrawlers() Method add 1 Crawler with id "G"
 **********What happened?
 *Q7. Use Try-Catch statements to catch the relevant exceptions you got in Q6 and Q7 and Display meaningful message to users 
 */
abstract class Robot{
	int robotID;
	
	public Robot(int id){
		robotID = id;
	}
	
}
