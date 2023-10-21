package TheAshdenCollege;
/**
 * TestAshdenCollege class is where the AshdenCollege test is based
 * 
 * @author Alin Andrei Dragne
 * @version 21/12/2021 Alpha version 
 */
public class TestAshdenCollege {
	/**
	 * Method used to add Students
	 * @param col - of type college where the functionality is
	 * */
	private void addStudentsToCollege(College col) {	   
		col.addStudent("Adrian", "Olaru", "01234568911");
		col.addStudent("Alin", "Dragne", "5123");
		col.addStudent("Simona", "Avacum", "523");
		col.addStudent("Anas", "Munawar", "623");
		col.addStudent("Nitesh", "Bandit", "6213");
		col.addStudent("Milky", "Way", "7213");
	        
	    }
	/**
	 * Method used to add Courses
	 * @param col - of type college where the functionality is
	 * */
	 private void addCoursesToCollege(College col) {
		 col.addCourse(new Courses(1, "Computing", 9250));
	     col.addCourse(new Courses(2, "Software Engineering", 10230));
	     col.addCourse(new Courses(3, "Marketing", 8300));   
	    }
	 /**
		 * Method used to add Enrolments
		 * @param col - of type college where the functionality is
		 * */
	 private void addEnrolments(College col) {
		 col.addEnrolment(1, 1, 2019, 10, 25);
		 col.addEnrolment(1, 2, 2020, 12, 25);
		 col.addEnrolment(3, 2, 2017, 9, 25);
		 col.addEnrolment(3, 1, 2020, 12, 25);

	 }
	 /**
	  * Method used to call each method related to Enrolment
	  * situated in college to test their functionality situated
	  * */
	 private void Enrolment() {
		 College col = new College();	
		 addStudentsToCollege(col);
		 addCoursesToCollege(col);
		 addEnrolments(col);
		 col.printEnrolments();
		 col.removeEnrolment(1, 1);
		 col.printEnrolments();
		 col.printEnrolmentsByGivenDates(2019,2021);
	 }
	 /**
	  * Method used to call each method related to Student
	  * situated in college to test their functionality situated
	  * */
	 private void testStudents() {
		 College col = new College();
		 addStudentsToCollege(col);
		 col.printStudents();
		 col.printStudentID(3);
		 //the method below just return the object
		 //doesn't print anything
		 col.searchStudentID(2);
		 col.searchStudentName("Milky");
		 col.removeStudentByID(1);
	 }
	 /**
	  * Method used to call each method related to Courses
	  * situated in college to test their functionality situated
	  * */
	 private void testCourses() {
		 College col = new College();
		 addCoursesToCollege(col);
		 col.printCourses();
		 col.printCoursesID(1);
		 col.searchSCourseID(3);
		 col.searchCourseName("Computing");
		 col.removeCourseByID(1);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialising an object of type TestAshdenCollege
		TestAshdenCollege t1 = new TestAshdenCollege();
		//Calling each method above
		t1.testCourses();
		//Printing a gap/new empty line to difference the classes 
		System.out.println();
		t1.testStudents();
		System.out.println();
		t1.Enrolment();
;	}

}
