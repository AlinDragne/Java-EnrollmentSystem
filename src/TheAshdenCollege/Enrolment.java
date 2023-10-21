package TheAshdenCollege;
import java.util.GregorianCalendar;
/**
 * Enrolment class is where the college keeps basic
 * information about each enrolment.
 * So basically i imagined that this class combines
 * the students and courses classes
 * It has the following fields: idS(Student), idC(Courses), gcal(GregorianCalendar)
 * , year, month and day
 * @author Alin Andrei Dragne
 * @version 11/12/2021 Alpha version 
 */

public class Enrolment {
	private Student idS;
	private Courses idC;
	private GregorianCalendar gcal = new GregorianCalendar();
	private int year;
	private int month;
	private int day;
	/**
	 * Constructor Enrolment initialise each
	 * field with a given value from the
	 * parameters.
	 * @param idS - Object of type Student
	 * @param idC - Object of type Courses
	 * @param year - basic int
	 * @param month - basic int
	 * @param day - basic int
	 * */
	public Enrolment(Student idSs, Courses idCc, int year, int month, int day) {
		idS = idSs;
		idC = idCc;
		//initialise gcal object of type Gregorian calendar with given year month and day parameters.
		gcal.set(year, month, day);
		this.setYear(year);
		month = this.month;
		day = this.day;
	}
	/**
	 * This method is a Setter to set Gregorian Calendar gcal
	 * @param gcal - Gregorian Calendar
	 * */
	public void setGcal(GregorianCalendar gcal) {
		this.gcal = gcal;
	}
	/**
	 * Getter to get gcal
	 * @return gcal
	 * */
	public GregorianCalendar getGcal() {
		return gcal;
	}
	/**
	 * getter to get Object of type Students
	 * @return idS
	 * */
	public Student getIdS() {
		return idS;
	}
	/**
	 * setter for object of type Students
	 * @param idS
	 * */
	public void setIdS(Student idS) {
		this.idS = idS;
	}
	/**
	 * getter for Courses object
	 * @return idC
	 * */
	public Courses getIdC() {
		return idC;
	}
	/**
	 * setter method for Courses
	 * @param idC 
	 * */
	public void setIdC(Courses idC) {
		this.idC = idC;
	}	
	/**
	 * Method used to print details
	 * for the enrolment
	 * */
	public void printEnrolment() {
		System.out.println("Student: " + idS.getFirstName() + " " + idS.getLastName() +
				" enrolled for course: " + idC.getCourseTitle() +
				" on Date: " + gcal.getTime());
	}
	/**
	 * Method to get the value
	 * for the year
	 * @return year
	 * */
	public int getYear() {
		return year;
	}
	/**
	 * getter for years v2
	 * to return years using .get method from GregorianCalendar 
	 * @return gcal.get(year)
	 * */
	public int getYears() {
		return gcal.get(year);
		
	}
	/**
	 * setter for years
	 * @param year
	 * */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * getter for month
	 * @return month
	 * */
	public int getMonth() {
		return month;
	}
	/**
	 * setter for month
	 * @param month
	 * */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * getter for day
	 * @return day
	 * */
	public int getDay() {
		return day;
	}
	/**
	 * setter for day
	 * @param day
	 * */
	public void setDay(int day) {
		this.day = day;
	}

}
