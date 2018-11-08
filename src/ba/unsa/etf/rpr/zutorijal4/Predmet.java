package ba.unsa.etf.rpr.zutorijal4;

import java.util.ArrayList;
import java.util.List;

public class Predmet {

    String nazivPredmeta;
    boolean obavezni;
    boolean izborni;
    int ECTS;

    List<Student> studenti = new ArrayList<Student>();

    public Predmet(String naziv, boolean obavezni, boolean izborni, int ects){
        this.nazivPredmeta = naziv;
        this.obavezni = obavezni;
        this.izborni = izborni;
        this.ECTS = ects;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public boolean isObavezni() {
        return obavezni;
    }

    public void setObavezni(boolean obavezni) {
        this.obavezni = obavezni;
    }

    public boolean isIzborni() {
        return izborni;
    }

    public void setIzborni(boolean izborni) {
        this.izborni = izborni;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public void dodajStudenta(Student s){
        studenti.add(s);
    }

    public int brojStudenata(){
        return studenti.size();
    }

    public void spisakStudenata(){

        System.out.println("Studenti na predmetu " + nazivPredmeta + " su: ");
        for(int i=0; i<studenti.size(); i++){

            System.out.println( i+1 + ". " + (Student) studenti.get(i));
        }
    }

    @Override
    public String toString() {
        return nazivPredmeta + ", ECTS ( " + ECTS + " )";
    }
}
