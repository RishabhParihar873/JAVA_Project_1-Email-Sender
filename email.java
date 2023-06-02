package emailapp;

import java.util.Random;
import java.util.Scanner;

public class email 
{
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailBoxCapacity = 500; 
	private String alternateEmailid;
	private String email;
	private String companysuffix ="company.com";
	
	//constructor to receive the first name and last name
	public email(String firstname, String lastname)
	{
		this.firstname=firstname;
		this.lastname = lastname;
		System.out.println("Email Created Sucessfully"+ this.firstname + " "+ this.lastname);
	
		//call a method asking for department and - return the department
		this.department = Setdepartment();
		//System.out.println("Your Department: " + this.department);
		
		//call a method that returns a random password
		this.password =randomPassword(8);
		System.out.println("Your Password is: " + this.password);
		
		//combine all the info and give them an email
		email = firstname.toLowerCase() + lastname.toLowerCase() + "_"+ department + "@" + companysuffix;
		//System.out.println(email);
	}
	
	
	//Ask for department 
	private String Setdepartment()
	{
		System.out.println("DEPARTMENT CODES: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None \n Enter Your Department: ");
		Scanner sc = new Scanner(System.in);
		int choiceOfDept = sc.nextInt();
		if(choiceOfDept ==1) { return "Sales";}
		else if(choiceOfDept ==2) { return "Development";}
		else if(choiceOfDept ==3) { return "Accounting";}
		else { return "";}
		}
	
	//generate a random password
	private String randomPassword(int length) 
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!0123456789@#$%&";
		char password[] = new char[length];
		for(int i=0;i<length;i++) 
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	
	//set the mailbox capacity
	public void setMailBoxCapacity() 
	{
		this.setMailBoxCapacity();
	}
	
	//set the alternate email
	public void setAlternateEmail(String altemail) 
	{
		this.alternateEmailid = altemail;
	}
	
	//change the password
	public void changepassword(String password) 
	{
		this.password = password;
	}
	
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	public String getAlternameEmail() {return alternateEmailid;}
	public String getNewPassword() {return password;}
	
	
	public String showInfo() 
	{
		return "DISPLAY NAME: " + firstname +  lastname +
			   "\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
		
	}

}
