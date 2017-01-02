import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        StudentManager studentManager = new StudentManager();

        students = studentManager.studentShow();

        students.add(new Student("Arthur"));

        studentManager.studentSave(students);

        for (Student student : studentManager.studentShow())
            System.out.println(student.getVoornaam());
    }
}