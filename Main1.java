public class Main1{
    public static void main(String[] args) {
        Student student = new Student("John Doe", 12345);
        student.addCourse("Math");
        student.addCourse("English");
        student.printInfo();
        
        System.out.println();
        
        GraduateStudent gradStudent = new GraduateStudent("Jane Smith", 67890, "Computer Science");
        gradStudent.addCourse("Algorithms");
        gradStudent.printInfo();
    }
}
