import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public interface LesDAO {
    List<Les> findAll();
    List<Les> findById();
    List<Les> findByName();
    boolean insertLes(Les les);
    boolean updateLes(Les les);
    boolean deleteLes(Les les);
}