import java.util.ArrayList;
import java.io.*;

/**
 * Created by wikde on 02/01/2017.
 */
public class StudentManager {

    public void studentSave(ArrayList<Student> students){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("students.obj")
            );
            oos.writeObject(students);
            oos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Student> studentShow(){
        ArrayList<Student> students = new ArrayList<>();
        File f = new File("students.obj");
        if (!f.exists() && !f.isDirectory()) {
            return students;
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("students.obj"));

            students = (ArrayList<Student>) ois.readObject();
            ois.close();

            return  students;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

}