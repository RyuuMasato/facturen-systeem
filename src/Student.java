import java.io.Serializable;

/**
 * Created by wikde on 02/01/2017.
 */
public class Student implements Serializable {
    private int id;
    private String  voornaam,
            achternaam,
            straanaam,
            toevoeging,
            postcode,
            woonplaats,
            emailadres;
    private int     huisnummer,
            telefoonnummer;

    public Student() {
    }

    public Student(String voornaam) {
        this.voornaam = voornaam;
    }

    public Student(int id, String voornaam, String achternaam, String straanaam, String toevoeging, String postcode, String woonplaats, String emailadres, int huisnummer, int telefoonnummer) {
        this.id = id;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.straanaam = straanaam;
        this.toevoeging = toevoeging;
        this.postcode = postcode;
        this.woonplaats = woonplaats;
        this.emailadres = emailadres;
        this.huisnummer = huisnummer;
        this.telefoonnummer = telefoonnummer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getStraanaam() {
        return straanaam;
    }

    public void setStraanaam(String straanaam) {
        this.straanaam = straanaam;
    }

    public String getToevoeging() {
        return toevoeging;
    }

    public void setToevoeging(String toevoeging) {
        this.toevoeging = toevoeging;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String getEmailadres() {
        return emailadres;
    }

    public void setEmailadres(String emailadres) {
        this.emailadres = emailadres;
    }

    public int getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(int huisnummer) {
        this.huisnummer = huisnummer;
    }

    public int getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(int telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }
}
