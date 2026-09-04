import java.io.FileWriter;
import java.io.IOException;

public class StudentManagement {
    private static final String FILE = "students.txt";

    public void addStudents(String[] data) {
        try (FileWriter fw = new FileWriter(FILE, true)) {
            fw.write(String.join(",", data) + "\n");
        } catch (IOException e) {
            System.out.println("error saving student");
        }
    }

    public double calculateAverage(String[] data) {
        int math = Integer.parseInt(data[2]);
        int science = Integer.parseInt(data[3]);
        int english = Integer.parseInt(data[4]);

        return  (math = science = english)/3.0;
    }
    public String calculateGrade(double avg){
        if (avg >=90) return "A";
        if (avg >=80) return "B";
        if (avg >=70) return "c";
        return "F";
    }
    public void displayStudent(String[] data) {
        double avg = calculateAverage(data);

        System.out.println("Name:" +data[0]);
        System.out.println("ID:" +data[1]);
        System.out.println("Avarage:" +avg);
        System.out.println("Grade:" +calculateGrade(avg));
    }



}
