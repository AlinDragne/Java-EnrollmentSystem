package TheAshdenCollege;
import java.util.Iterator;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Calendar;
/**
 * College class is where the AshdenCollege functionality is based
 * It has the following fields: student, courses, newIDnumber, enrolement
 * @author Alin Andrei Dragne
 * @version 21/12/2021 Beta version 
 */
public class College {
	private ArrayList<Student> student;
	private ArrayList<Courses> courses;
	private int newIDnumber = 1;
	private ArrayList<Enrolment> enrolment;
	
	/**
	 * This constructor is a default one
	 * since it is no need to initialise
	 * fields with a parameter(given vaule)
	 * because they are already initialized 
	 * with values from the other classes /
	 * tester
	 * */
	public College() {
		//initialising array lists that we have
		student = new ArrayList<Student>();
		courses = new ArrayList<Courses>();
		enrolment = new ArrayList<Enrolment>();
	}
	/**
	 * We are adding student to the array list
	 * @param newFirstName 
	 * @param newLastName
	 * @param newPhoneNumber
	 * */
	//The method below adds a new Student
	public void addStudent(String newFirstName, String newLastName, String newPhoneNumber) {
		student.add(new Student(newFirstName, newLastName, newPhoneNumber, newIDnumber));
		newIDnumber ++;
	}
	/**
	 * Method that goes through each element from
	 * the array list and prints it
	 */
	public void printStudents() {
		for(Student a: student) {
			a.printStudentDetails();
		}
	}
	/**
	 * Method that prints only the student
	 * with the given ID number
	 * @param id
	 * */
	public void printStudentID(int id) {
		//define and initialise iterator it
		Iterator<Student> it = student.iterator();
		//loop to go through each element
		for(int i = 0; it.hasNext(); i++) {
			//initialise a new variable studID of type Student
			//and give it the value where the index pointed
			Student studID = it.next();
			//validation
			if(id == studID.getStudentID()) {
				//calling the method to print the student
				//if the validation is tru
				studID.printStudentDetails();
			}
		}
	}
	/**
	 * Method that ads objects of type courses
	 * @param newCourse
	 * */
	public void addCourse(Courses newCourse) {
		courses.add(newCourse);
	}
	/**
	 * Method thats prints a certain course if 
	 * the given id is the same as course id
	 * @param id
	 * */
	public void printCoursesID(int id) {
		Iterator<Courses> it = courses.iterator();
		while(it.hasNext()) {
			Courses courseID = it.next();
			if(id == courseID.getCourseID()) {
				courseID.printCoursesDetails();
			}
		}
	}/**
	Method to print the courses
	*/
	public void printCourses() {
		//loop to go through each element of the ArrayList
		for(Courses b : courses) {
			b.printCoursesDetails();;
		}
	}
	/**
	 * This method search for a student which has
	 * the same id as the given ID and return it
	 * @param givenID
	 * @return studID - object of type student with has certain id
	 * else @return null
	 * */
	public Student searchStudentID(int givenID) {
		Iterator<Student> it = student.iterator();
		for(int i = 0; it.hasNext(); i++) {
			Student studID = it.next();
			if(givenID == studID.getStudentID()) {
				//The below call for "printStudentDetails" was to make sure that 
				//this method works.
				//studID.printStudentDetails();
				return studID;
			}
		}
		return null;
	}
	/**
	 * Method that is printing a student by the given parameter of
	 * type string
	 * @param givenSurName
	 * */
	public void searchStudentName(String givenSurName) {
		Iterator<Student> it = student.iterator(); 
		while(it.hasNext()) {
			Student stud = it.next();
			String stud1 = stud.getFirstName();
			if(stud1.contains(givenSurName)) {
				stud.printStudentDetails();
			}			
		}
	}
	/**
	 * Method that removes a student by given id
	 * @param givenID
	 * */
	public void removeStudentByID(int givenID) {
		Iterator<Student> it = student.iterator(); 
		while(it.hasNext()) {
			Student stud = it.next();
			if(stud.getStudentID() == givenID) {
				System.out.println("Student " + stud.getFirstName() + " was removed.");
				it.remove();
			}
		}
	}
	/**
	 * This method search a certain course by the
	 * given parameter and return it if found
	 * otherwise returns null
	 * @param null*/
	public Courses searchSCourseID(int givenID) {
		Iterator<Courses> it = courses.iterator();
		for(int i = 0; it.hasNext(); i++) {
			Courses courseID = it.next();
			if(givenID == courseID.getCourseID()) {
				return courseID;
			}
		}
		return null;
	}
	/**
	 * Search through courses ArrayList and prints
	 * the details if the parameters is found in 
	 * the title of the course
	 * @param givenCourseName
	 * */
	public void searchCourseName(String givenCourseName) {
		Iterator<Courses> it = courses.iterator(); 
		while(it.hasNext()) {
			Courses corse = it.next();
			String corse1 = corse.getCourseTitle();
			if(corse1.contains(givenCourseName)) {
				corse.printCoursesDetails();
			}			
		}
	}
	/**
	 * Remove a course if the ID is found
	 * @param givenID
	 * */
	public void removeCourseByID(int givenID) {
		Iterator<Courses> it = courses.iterator(); 
		while(it.hasNext()) {
			Courses corse = it.next();
			if(corse.getCourseID() == givenID) {
				System.out.println("Course " + corse.getCourseTitle() + " was removed.");
				it.remove();
			}
		}
	}
	/**
	 * This method adds enrolments and checks if Student and Course exists
	 * if not nothing happens
	 * @param givenStudID
	 * @param givenCourseID
	 * @param year
	 * @param month
	 * @param day*/
	public void addEnrolment(int givenStudID, int givenCourseID, int year, int month, int day) {
		//the if below is a validation to check if the students and courses exists in the arrayList
		//by using .searchStudentID and .searchCourseID methods that exist in this class
		if(searchStudentID(givenStudID) != null && searchSCourseID(givenCourseID) != null) {
			//adding enrolment
			enrolment.add(new Enrolment(searchStudentID(givenStudID), searchSCourseID(givenCourseID), year, month - 1, day));
		}
	}
	/**
	 * Method to print enrolments
	 * */
	public void printEnrolments() {
		for(Enrolment b : enrolment) {
			b.printEnrolment();
		}
	}
	/**
	 * Method to remove the enrolment for a student
	 * with a given ID that enrolled for a course with a given ID
	 * @param givenStudID
	 * @param givenCourseID
	 * */
	public void removeEnrolment(int givenStudID, int givenCourseID) {
		Iterator<Enrolment> it = enrolment.iterator();
		while (it.hasNext()) {
			Enrolment en = it.next();
			Student stud = en.getIdS();
			Courses cor = en.getIdC();
			if(givenStudID == stud.getStudentID() && givenCourseID == cor.getCourseID()) {
				it.remove();
				System.out.println("Enrolment for student " + stud.getFirstName() + " was deleted." );
			}
		}
	}
	/**
	 * Method that prints all of the enrolments between
	 * given dates
	 * @param year
	 * @param year1*/
	public void printEnrolmentsByGivenDates(int year, int year1) {
		Iterator<Enrolment> it = enrolment.iterator();
		System.out.println("Enrolments between folowing dates: " + year + " and " + year1);
		while(it.hasNext()) {
			Enrolment enrol = it.next();
			if(enrol.getYear() > year && enrol.getYear() < year1) {
				enrol.printEnrolment();
			}
		}
	}
}
