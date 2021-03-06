import java.util.List;

interface StudentDAO {
    List<Student> findAll();
    List<Student> findById();
    List<Student> findByName();
    boolean insertStudent(Student student);
    boolean updateStudent(Student student);
    boolean deleteStudent(Student student);
}
