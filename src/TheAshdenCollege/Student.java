package TheAshdenCollege;

/**
 * Student class is where the college keeps basic
 * information about each student.
 * It has the following fields: firstName, lastName,
 * phoneNumber and Student ID.
 * @author Alin Andrei Dragne
 * @version 11/12/2021 Alpha version
 *	Student class is a class meant to store all of the
 *	students details 
 */
public class Student {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int studentID;
/**
 * Constructor Students initialise each
 * field with a given value from the
 * parameters.
 * @param firstName - First name of student (String)
 * @param lastName - Last name of student (String)
 * @param phoneNumber - Student's phone number (String because the maximum int amount is not enough for 11 numbers)
 * @param studentID - Student's ID (int it is set automatically to 1 and it is increasing by 1 with each student)
 * */	
	public Student(String firstName, String lastName, String phoneNumber, int studentID) {
		//validation for student ID not to be lesser than 0
		if(studentID > 0) {
			//initialise fields with parameters
			this.setFirstName(firstName);
			this.setLastName(lastName);
			this.setPhoneNumber(phoneNumber);
			this.setStudentID(studentID);
		}else {
			System.out.println("Invalid Student ID!");
				}
		}
/**
 * This method is a Getter to get FirstName
 * @return - firstName
 * */
	public String getFirstName() {
		return firstName;
	}
/**
 * This method is a Setter to set firstName 
 * @param - firstName(String)
 * */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
/**
 * This method is a Getter to get lastName
 * @return - lastName
 * */
	public String getLastName() {
		return lastName;
	}
/**
 * Method for setting LastName
 * @param - lastName(String)
 * */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
/**
 * Method to get phone number
 * @return - phoneNumber
 * */
	public String getPhoneNumber() {
		return phoneNumber;
	}
/**
 * Method to set phone number
 * @param - phoneNumber(String)
 * */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
/**
 * Method to get Student's ID
 * @return - studentID
 * */
	public int getStudentID() {
		return studentID;
	}
/**
 * Method to set Student ID
 * @param - studentID
 * */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
/**
 * This method is used to print all of the details of the student and also return a string called "s"
 * just to be used in System.out.println later on in the code
 * @return s - String that contains the same info as the System.out.print
 * */	
	public String printStudentDetails() {
		System.out.println("Frist Name: " + firstName +
				" Last Name: " + lastName + 
				" Phone Number: " + phoneNumber +
				" Student ID: " + studentID);
		//String that contains details about the students
		String s = "Frist Name: " + firstName +
				" || Last Name: " + lastName + 
				" || Phone Number: " + phoneNumber +
				" || Student ID: " + studentID;
		//I choose it to be this way so i can use it in a System.out.print later on in the project
		return s;
	}
}
