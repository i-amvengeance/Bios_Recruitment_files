import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the school enrollment system!");
        System.out.println();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        Student student = new Student(name, id);

        boolean done = false;

        while (!done) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Add course");
            System.out.println("2. Print student information");
            System.out.println("3. Quit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter course name: ");
                    String course = scanner.nextLine();
                    student.addCourse(course);
                    System.out.println("Course added!");
                    break;
                case 2:
                    System.out.println("Student information:");
                    student.printInfo();
                    break;
                case 3:
                    done = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}
