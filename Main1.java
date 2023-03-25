public class Main1{
    public static void main(String[] args) {
        Student student = new Student("Sampreeth", 22328);
        student.addCourse("Mathematics");
        student.addCourse("Java");
        student.printInfo();
        
        System.out.println();
        
        GraduateStudent gradStudent = new GraduateStudent("Charan", 22333, "Python");
        gradStudent.addCourse("Mathematics");
        gradStudent.printInfo();
        gradStudent.getResearchArea();
    }
}
