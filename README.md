# Java-EnrollmentSystem
Enrollment System for College

College Class - The Ashden College Functionality
The College class represents the core functionality of the Ashden College. It manages students, courses, and enrollments within the college.
Fields:

    student: An ArrayList of Student objects, representing the students within the college.
    courses: An ArrayList of Courses objects, representing the courses offered by the college.
    newIDnumber: An integer used to assign unique ID numbers to students. It starts at 1 and increments as new students are added.
    enrolment: An ArrayList of Enrolment objects, representing the enrollments of students in various courses.

Methods:

    Constructor College(): Initializes the ArrayLists for students, courses, and enrollments.
    addStudent(String newFirstName, String newLastName, String newPhoneNumber): Adds a new student to the student ArrayList with the provided first name, last name, and phone number. The student is assigned a unique ID based on the newIDnumber field.
    printStudents(): Iterates through the student ArrayList and prints the details of each student.
    printStudentID(int id): Searches for a student with the given ID and prints their details.
    removeStudent(int id): Removes a student with the given ID from the student ArrayList.
    searchStudentID(int id): Searches for and returns a Student object with the given ID. If not found, returns null.
    addCourse(String newCourseName, String newCourseTutor): Adds a new course to the courses ArrayList with the provided course name and tutor name.
    printCourses(): Iterates through the courses ArrayList and prints the details of each course.
    searchSCourseID(int id): Searches for and returns a Courses object with the given ID. If not found, returns null.
    addEnrolment(int givenStudID, int givenCourseID, int year, int month, int day): Adds a new enrollment if both the student and the course exist for the given IDs. The enrollment is associated with the provided date.
    printEnrolments(): Iterates through the enrolment ArrayList and prints the details of each enrollment.
    removeEnrolment(int givenStudID, int givenCourseID): Removes an enrollment for the given student ID and course ID.
    printEnrolmentsByGivenDates(int year, int year1): Prints all enrollments that occurred between the two given years.

Key Concepts Used:

    ArrayList: The class makes extensive use of the ArrayList data structure to manage lists of students, courses, and enrollments.
    Encapsulation: The fields of the College class are kept private and are accessed and modified using public methods.
    Iteration: The class uses various forms of loops, including enhanced for-loops and iterators, to traverse and manipulate the ArrayLists.
    Object-Oriented Programming: The College class interacts with other classes (Student, Courses, Enrolment), creating and managing instances of these classes.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Courses Class - Basic Information about College Courses
The Courses class represents individual courses within the Ashden College. Each course contains essential details such as its ID, title, and enrolment fee.
Fields:

    courseID: An integer representing the unique ID number of the course.
    courseTitle: A string representing the name or title of the course.
    courseEnrolmentFee: A float representing the yearly enrolment fee for the course.

Methods:

    Constructor Courses(int courseID, String courseTitle, float courseEnrolmentFee): Initializes a new course with the provided ID, title, and enrolment fee.
    getCourseID(): A getter method that returns the course ID.
    setCourseID(int courseID): A setter method that sets the course ID.
    getCourseTitle(): A getter method that returns the course title.
    setCourseTitle(String courseTitle): A setter method that sets the course title.
    getCourseEnrolmentFee(): A getter method that returns the course enrolment fee.
    setCourseEnrolmentFee(float courseEnrolmentFee): A setter method that sets the course enrolment fee.
    printCoursesDetails(): A method that prints out the course details and returns a string containing the same information.

Key Concepts Used:

    Encapsulation: The fields of the Courses class are kept private. They are accessed and modified using public getter and setter methods.
    Object-Oriented Programming: The Courses class provides a blueprint for creating individual course objects with specific attributes and behaviours.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Student Class - Basic Information about College Students
The Student class represents individual students within the Ashden College. Each student contains essential details such as first name, last name, phone number, and a unique student ID.
Fields:

    firstName: A string representing the first name of the student.
    lastName: A string representing the last name of the student.
    phoneNumber: A string representing the phone number of the student. It's stored as a string to accommodate various phone number formats and lengths.
    studentID: An integer representing the unique ID of the student.

Methods:

    Constructor Student(String firstName, String lastName, String phoneNumber, int studentID): Initializes a new student with the provided first name, last name, phone number, and student ID. It includes validation to ensure the student ID is positive.
    getFirstName(): A getter method that returns the student's first name.
    setFirstName(String firstName): A setter method that sets the student's first name.
    getLastName(): A getter method that returns the student's last name.
    setLastName(String lastName): A setter method that sets the student's last name.
    getPhoneNumber(): A getter method that returns the student's phone number.
    setPhoneNumber(String phoneNumber): A setter method that sets the student's phone number.
    getStudentID(): A getter method that returns the student's ID.
    setStudentID(int studentID): A setter method that sets the student's ID.
    printStudentDetails(): A method that prints out the student's details and returns a string containing the same information.

Key Concepts Used:

    Encapsulation: The fields of the Student class are kept private. They are accessed and modified using public getter and setter methods.
    Object-Oriented Programming: The Student class provides a blueprint for creating individual student objects with specific attributes and behaviors.
    Validation: The constructor of the Student class includes a check to ensure the student ID is positive.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Enrolment Class - Basic Information about Student Enrolments
The Enrolment class represents individual enrolments within the Ashden College. It links students to specific courses they are enrolled in and stores the date of enrolment.
Fields:

    idS: A reference to a Student object, representing the student who is enrolled.
    idC: A reference to a Courses object, representing the course in which the student is enrolled.
    gcal: An instance of GregorianCalendar, representing the date of enrolment.
    year: An integer representing the year of enrolment.
    month: An integer representing the month of enrolment.
    day: An integer representing the day of enrolment.

Methods:

    Constructor Enrolment(Student idSs, Courses idCc, int year, int month, int day): Initializes a new enrolment with the provided student, course, and date details.
    setGcal(GregorianCalendar gcal): A setter method that sets the date of enrolment using a GregorianCalendar object.
    getGcal(): A getter method that returns the GregorianCalendar object representing the enrolment date.
    getIdS() and setIdS(Student idS): Getter and setter methods for the Student object associated with the enrolment.
    getIdC() and setIdC(Courses idC): Getter and setter methods for the Courses object associated with the enrolment.
    printEnrolment(): A method that prints out the details of the enrolment, including the student's name, course title, and enrolment date.
    getYear(), getYears(), and setYear(int year): Methods to get and set the year of enrolment. The getYears() method specifically retrieves the year from the gcal object.
    getMonth() and setMonth(int month): Methods to get and set the month of enrolment.
    getDay() and setDay(int day): Methods to get and set the day of enrolment.

Key Concepts Used:

    Object Composition: The Enrolment class is composed of references to Student and Courses objects, allowing it to link a student to a specific course.
    Encapsulation: The fields of the Enrolment class are kept private. They are accessed and modified using public getter and setter methods.
    Date Handling: The class uses the GregorianCalendar class to manage and represent dates of enrolment.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
TestAshdenCollege Class - Testing the Functionality of Ashden College
The TestAshdenCollege class is designed to test the functionalities of the Ashden College. It contains methods that add students, courses, and enrollments to the college and subsequently tests various operations related to these entities.
Methods:

    addStudentsToCollege(College col): Adds a set of predefined students to the given college instance.
    addCoursesToCollege(College col): Adds a set of predefined courses to the given college instance.
    addEnrolments(College col): Adds a set of predefined enrollments to the given college instance.
    Enrolment(): Tests the enrollment-related functionalities of the college. This includes adding students, courses, and enrollments, printing enrollments, removing enrollments, and printing enrollments by specific date ranges.
    testStudents(): Tests the student-related functionalities of the college. This includes adding students, printing student details, searching for a student by ID and name, and removing a student by ID.
    testCourses(): Tests the course-related functionalities of the college. This includes adding courses, printing course details, searching for a course by ID and name, and removing a course by ID.
    main(String[] args): The main method of the class. It initializes an instance of the TestAshdenCollege class and calls the testing methods to evaluate the functionality of the college system.

Key Concepts Used:

    Testing: The class is structured to test the functionalities of the college system, ensuring that operations related to students, courses, and enrollments work as expected.
    Method Calls: The class makes several calls to methods from the College class to validate the system's functionality.
    Object-Oriented Programming: The testing class creates and uses instances of the College class to test its methods.
