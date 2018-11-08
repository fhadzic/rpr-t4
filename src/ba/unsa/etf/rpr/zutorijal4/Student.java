package ba.unsa.etf.rpr.zutorijal4;

import java.util.List;
import java.util.ArrayList;

public class Student {

    List<Predmet> predmeti = new ArrayList<Predmet>();
    String ime;
    String prezime;
    int index;

    public Student(String ime, String prezime, int index){
        this.ime = ime;
        this.prezime = prezime;
        this.index = index;
    }

    public void upisiStudentaNaPredmet(Predmet p){
        predmeti.add(Predmet p);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return prezime + " " + ime + " (" + index + ")";
    }
}
