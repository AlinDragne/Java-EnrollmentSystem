package TheAshdenCollege;
/**
 * Courses class is where the college keeps basic
 * information about each course.
 * It has the following fields: courseID, courseTitle
 * and courseEnrolmentFee
 * @author Alin Andrei Dragne
 * @version 11/12/2021 Alpha version 
 */

public class Courses {
	private int courseID;
	private String courseTitle;
	private float courseEnrolmentFee;
	/**
	 * Constructor Courses initialise each
	 * field with a given value from the
	 * parameters.
	 * @param courseID - ID number of the course (int)
	 * @param courseTitle - Name of the course (String)
	 * @param courseEnrolmentFee - Fee of the course yearly (float)
	 * */
	public Courses(int courseID, String courseTitle, float courseEnrolmentFee) {
		//initialise each field with the given parameter
		this.setCourseID(courseID);
		this.setCourseTitle(courseTitle);
		this.setCourseEnrolmentFee(courseEnrolmentFee);
	}
/**
 * This method is a Getter to get CourseID
 * @return courseID
 * */
	public int getCourseID() {
		return courseID;
	}
/**
 * Setter for the courseID
 * @param courseID
 * */
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
/**
 * Getter method to get the Course Name/Title
 * @return courseTitle
 * */
	public String getCourseTitle() {
		return courseTitle;
	}
/**
 * setter method to set course name/title to the given parameter
 * @param courseTitle
 * */
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
/**
 * getter method to get course enrolment fee
 * @return courseEnrolmentFee
 * */
	public float getCourseEnrolmentFee() {
		return courseEnrolmentFee;
	}
/**
 * method to set course enrolment fee
 * @param courseEnrolmentFee
 * */
	public void setCourseEnrolmentFee(float courseEnrolmentFee) {
		this.courseEnrolmentFee = courseEnrolmentFee;
	}
	/**
	 * This method is used to print all of the details of the courses and also return a string called "s"
	 * just to be used in System.out.println later on in the code
	 * @return s - String that contains the same info as the System.out.print*/	
	public String printCoursesDetails() {
		System.out.println("Course Title: " + courseTitle +
				" Course ID: " + courseID + 
				" Course Enrolment Fee " + courseEnrolmentFee);
		//String that contais the info regarding courses
		String s = "Course Title: " + courseTitle +
				" || Course ID: " + courseID + 
				" || Course Enrolment Fee " + courseEnrolmentFee;
		return s;
	}
	
}
