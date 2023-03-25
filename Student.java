public class Student {
    private String name;
    private int id;
    private String[] courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new String[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void addCourse(String course) {
        String[] newCourses = new String[courses.length + 1];
        for (int i = 0; i < courses.length; i++) {
            newCourses[i] = courses[i];
        }
        newCourses[courses.length] = course;
        courses = newCourses;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Courses:");
        for (String course : courses) {
            System.out.println("- " + course);
        }
    }
}


