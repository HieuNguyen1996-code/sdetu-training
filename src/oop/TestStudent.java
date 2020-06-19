package oop;

import java.time.LocalDateTime;

public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student("Hieu", "Nguyen", "256317842");
		student1.setPhone("(409)-466-123");
		student1.setCity("Beaumont");
		student1.setState("Texas");
		student1.enroll();
		System.out.println(student1.ToString());
		
		student1.checkBalance();
		student1.enroll();
		student1.pay();
		student1.showCourses();
	

		
		
		

	}

}

class Student implements IInterface {
	private static int ID=8000;
	private String accountID;
	private String firstName;
	private String lastName; 
	private String SSN;
	private String phone; 
	private String city; 
	private String state;
	private String email; 
	private double balance = 10_0000.00;

	//New Student constructor that takes name and SSN in the arguments
	public Student(String firstName, String lastName, String SSN){
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN; 
		//Student email create by using first name initial and Last name 
		email = firstName.substring(0,1).toLowerCase() + lastName.toLowerCase() + "@gmail.com";
		System.out.println("Student email has been created : " 
				+  email); 
		setAccountID();
		
	}
	private void setAccountID() {
		int random = (int)(Math.random()* 10000);
		accountID = ID + "" + random + "" + SSN.substring(SSN.length()-4, SSN.length());
		System.out.println("Student account number is: " + accountID);
	}
	
	@Override
	public void enroll() {
		// 
		
		
		 LocalDateTime now = LocalDateTime.now(); 
		 System.out.println("Student enroll on : "  + now);
		
	}
	@Override
	// the amount of pay is base on how many courses the student willing to take
	// 1 course cost $1000
	public double pay() {
		int totalDue = cost * course.length;
		return totalDue;
		
	}
	@Override
	public double checkBalance() {
		return balance - pay();
		
	}
	@Override
	public void showCourses() {
		//
		System.out.print("Courses: ");
		for(int i =0; i< course.length; i++) {
			System.out.print(course[i] + " ");
		}
		
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {	
		return state;
	}
	
	public String ToString() {
		return "Student name: " + firstName + " " + lastName
				+ "\nStudent Account: " + accountID
				+ "\nStudent phone number: " + phone
				+ "\nStudent city and state: " + getCity() + ", " + getState() ;
	}
	
}