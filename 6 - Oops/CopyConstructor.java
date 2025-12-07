public class CopyConstructor {
    public static void main(String args[]) {

        // Default constructor
        Student s1 = new Student();

        // Constructor with name
        Student s2 = new Student("Aakash");

        // Constructor with roll number
        Student s3 = new Student(32);

        // Setting values for s3
        s3.StudentMarks[0] = 32;
        s3.StudentMarks[1] = 33;
        s3.StudentMarks[2] = 34;
        s3.StudentName = "Chandan";

        /*
         * NOTE:
         * If we try:
         *   Student sX = new Student("Name", 10);
         * it will give ERROR, because there is NO constructor Student(String, int)
         * defined in the Student class.
         *
         * Also:
         * When we define our own constructors (like Student(String), Student(int)),
         * Java will NOT create the default constructor Student() automatically.
         * So we MUST define Student() manually (which we did below),
         * otherwise code like: new Student() will be invalid.
         */

        // Copy constructor: creating s4 by copying s3
        Student s4 = new Student(s3);

        System.out.println("s3 name: " + s3.StudentName);
        System.out.println("s4 name (copied): " + s4.StudentName);

        // Change the value of s3's marks AFTER copying
        s3.StudentMarks[1] = 90;

        System.out.println("\nAfter modifying s3.StudentMarks[1] to 90:");

        System.out.println("s3 marks: ");
        System.out.println(s3.StudentMarks[0] + " " + s3.StudentMarks[1] + " " + s3.StudentMarks[2]);

        System.out.println("s4 marks (copied from s3): ");
        System.out.println(s4.StudentMarks[0] + " " + s4.StudentMarks[1] + " " + s4.StudentMarks[2]);

        /*
         * You will notice:
         * s4.StudentMarks[1] is ALSO 90.
         *
         * Reason:
         *  - In the copy constructor, we did:
         *        this.StudentMarks = s1.StudentMarks;
         *    This copies the REFERENCE of the array, not a new array.
         *
         *  - Both s3 and s4 are pointing to the SAME int[] array in memory.
         *  - This is called a SHALLOW COPY for reference types.
         */

        /*
            if we use deep copy then  s3.StudentMarks[1] = 90; 
            is not going to affect the s4 eventually
        */

    }
}

class Student {

    String StudentName;
    int StudentNo;
    int StudentMarks[];

    /*
     * ===========================
     *   COPY CONSTRUCTOR
     * ===========================
     *
     * This constructor takes another Student object
     * and copies its values into the new object.
     *
     * Currently this is a SHALLOW COPY for StudentMarks array
     * because we are just copying the reference.
     */
    Student(Student s1) {
        // SHALLOW COPY: both objects share same array
        this.StudentMarks = s1.StudentMarks;
        this.StudentNo = s1.StudentNo;
        this.StudentName = s1.StudentName;
    }
    // If you want DEEP COPY for array (independent copy),
    // you could do:
    //
    // Student(Student s1) {
    //     this.StudentMarks = new int[3];
    //     for (int i = 0; i < 3; i++) {
    //         this.StudentMarks[i] = s1.StudentMarks[i];
    //     }
    //     this.StudentNo = s1.StudentNo;
    //     this.StudentName = s1.StudentName;
    // }

    // Default constructor
    Student() {
        StudentMarks = new int[3];  // new array for each object
        System.err.println("Default Constructor Called");
    }

    // Constructor with name
    Student(String StudentName) {
        StudentMarks = new int[3];
        this.StudentName = StudentName;
    }

    // Constructor with roll number
    Student(int StudentNo) {
        StudentMarks = new int[3];
        this.StudentNo = StudentNo;
    }

    /*
     * This is called CONSTRUCTOR OVERLOADING:
     * - Same constructor name (Student)
     * - Different parameter lists (no-arg, String, int, Student)
     *
     * This is also part of COMPILE-TIME POLYMORPHISM in Java.
     */
}
