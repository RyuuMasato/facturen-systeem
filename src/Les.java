import java.io.Serializable;
import java.util.Date;

/**
 * Created by wikde on 02/01/2017.
 */
public class Les implements Serializable {
    private int id;
    private Date datum;
    private int aantalUren;
    private Student student;

    public Les() {
    }

    public Les(int id, Date datum, int aantalUren, Student student) {
        this.id = id;
        this.datum = datum;
        this.aantalUren = aantalUren;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public int getAantalUren() {
        return aantalUren;
    }

    public void setAantalUren(int aantalUren) {
        this.aantalUren = aantalUren;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
