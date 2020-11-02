package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String email;
	private String companySuffix = "bigb.com";
	
	//Constructor to receive first name and last name
	public Email(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		
		
		//call a method asking for department - return the department
		this.department = setDepartment();
		
		
		//call a method that returns a random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is : " + this.password);
		
		//combine elements to generate password
		email = firstName.toLowerCase()+"."+ lastName.toLowerCase()+"@"+department+"."+companySuffix;

	}
	
	//Ask for the department
	private String setDepartment()
	{
		System.out.println("\nDepartment codes : \n1 for Sles \n2 for development \n3 for Accounting\n0 for none\nEnter the department code:\n ");
		Scanner in=new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice==1)
		{
			return "sales";
		}
		else if (depChoice==2)
		{
			return "dev";
		}
		else if (depChoice==3)
		{
			return "accnt";
		}
		else
		{
			return "";
		}
		
	}
	
	//Generate a random password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@&!$";
		char[] password = new char[length];
		for(int i=0;i<length;i++)
		{
			int rand =(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	
	//Set the mailbox capacity
	public void setMailBoxCapacity(int Capacity)
	{
		this.mailboxCapacity=Capacity;
	}
	//set the alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = "altEmail";
	}
	
	//set the password 
	public void changePassword(String password)
	{
		this.password=password;
	}
	
	
	//Implementing the getters
	public int getMailboxCapacity()
	{
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() 
	{
		return alternateEmail;
	}
	public String getPassword()
	{
		return password;
	}
	
	
	public String showInfo()
	{
		return "Display Name :  "+firstName+" "+lastName+
				"\nCompany Email : "+ email +
				"\nMailbox Capacity : " + mailboxCapacity + " mb";
	}
}
