import java.io.FileWriter;
import java.io.IOException;

public class StudentManagement {
    private static final String FILE ="students.txt";

    public void addStudents(String[] data){
        try(FileWriter fw=new FileWriter(FILE,true)){
            fw.write(String.join(",",data)+"\n");
        } catch (IOException e) {
            System.out.println("error saving student");
        }
    }


}
