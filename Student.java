
public class Student extends Person {
    private int rollNo;
    private String course;
    private double marks;
    private String grade;

    public Student() {}

    public Student(int rollNo, String name, String email, String course, double marks) {
        super(name, email);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        this.grade = calculateGrade();
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Info:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
    }

    // Method OVERLOADING
    public void displayInfo(String researchArea) {
        displayInfo();
        System.out.println("Research Area: " + researchArea);
    }

    public void displayInfo(boolean showMarks) {
        displayInfo();
        if (showMarks) {
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + grade);
        }
    }

    // Overloaded update methods
    public void update(double marks) {
        this.marks = marks;
        this.grade = calculateGrade();
    }

    public void update(double marks, String course) {
        this.marks = marks;
        this.course = course;
        this.grade = calculateGrade();
    }

    private String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else return "D";
    }
}

