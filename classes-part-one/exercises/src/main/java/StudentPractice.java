// Call this a "runner class" because it is a class, yes, but created with a main method to run the program.

public class StudentPractice {
    public static void main(String[] args) {
        //instantiate your Student class below
        Student student = new Student("Craig", 12345,0 , 4.0);
//        student.setName("Craig");
//        student.setStudentID(12345);
//        student.setNumberOfCredits(1);
//        student.setGpa(4.0);

        System.out.println("NAME: "+student.getName()+ "Student ID: "+student.getStudentId());
    }
}
