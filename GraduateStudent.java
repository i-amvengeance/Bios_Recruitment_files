public class GraduateStudent extends Student {
    private String researchArea;

    public GraduateStudent(String name, int id, String researchArea) {
        super(name, id);
        this.researchArea = researchArea;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Research Area: " + researchArea);
    }
}