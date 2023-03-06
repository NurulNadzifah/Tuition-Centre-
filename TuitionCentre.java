// import all module
import java.util.*;

public class TuitionCentre{
    
    private int id;
    private String name;
    private String address;
    //private String teacher;
    private boolean isOpen;
    private Teacher teacher;
    private Student students;
    
    // constructor
    public TuitionCentre(int id, String name, String address, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student getStudents() {
        return students;
    }

    /*public void generatePerformanceReport() {
        // Logic to generate performance report for the center
        double avgMarks = calculateAverageMarks();
        int minMarks = calculateMinimumMarks();
        int maxMarks = calculateMaximumMarks();
    }*/

    /*private double calculateAverageMarks() {
        // Logic to calculate average marks for all students in the center
    }

    private int calculateMinimumMarks() {
        // Logic to calculate minimum marks for all students in the center
    }

    private int calculateMaximumMarks() {
        // Logic to calculate maximum marks for all students in the center
    }*/

}