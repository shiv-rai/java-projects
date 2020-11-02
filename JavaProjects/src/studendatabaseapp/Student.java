package studendatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//Constructor: prompt user to enter student's name and year
	public Student()
	{
		Scanner in=new Scanner(System.in);
		System.out.print(" Enter Student's first name : ");
		this.firstName=in.nextLine();
		
		System.out.print(" Enter Student's last name : ");
		this.lastName=in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter Student's class level : ");
		this.gradeYear=in.nextInt();
		
		setStudentId();	
	
		
			
	}
	
	//generate an ID
	private void setStudentId()
	{
		//Grade level + ID
		id++;
		this.studentID = gradeYear + ""+id;
	}
	
	//Enroll in course
	public void enroll()
	{
		do {
				//get inside a loop, user hits 0
					System.out.print("Enter course to enroll (Q to quit) :  ");
					Scanner in = new Scanner(System.in);
					String course = in.nextLine();
					if(!course.equals("Q"))
					{
						courses = courses +"\n" + course;
						tuitionBalance=tuitionBalance+costOfCourse;
					}
					else
					{
						
						break;
					}
			}		
		while(1!=0);
			
			
	}
	
	//view Balance
	public void viewBalance()
	{
		System.out.println("Your balance is $"+tuitionBalance);
	}
	
	//Pay Tuition
	public void payTuition()
	{
		viewBalance();
		System.out.print("Enter your paymeent : $");
		Scanner in= new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $"+ payment);
		viewBalance();
	}
	
	//Show status
	public String toString()
	{
		return "Name : "+ firstName + lastName+"\nGrade Level : "+gradeYear+"\nStudentId : "+studentID+"\nCourses Enrolled : "+ courses+"\nBalance : $"+tuitionBalance;
	}
	
	
}
