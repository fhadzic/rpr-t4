package ba.unsa.etf.rpr.zutorijal4;

import java.util.ArrayList;
import java.util.List;

public class Predmet {

    List<Student> bivsiStudenti = new ArrayList<Student>();
    List<Student> aktivniStudenti = new ArrayList<Student>();
    String nazivPredmeta;
    boolean obavezni;
    int ECTS;
    int ocjena = 5;


    public Predmet(String naziv, boolean obavezni, int ects){
        this.nazivPredmeta = naziv;
        this.obavezni = obavezni;
        this.ECTS = ects;
    }

    public int getOcjena() {
        return ocjena;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
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


    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    public void dodajStudentaNaPredmet(Student s){
        aktivniStudenti.add(s);
    }

    public void ispisiStudentaSaPredmeta(Student s){

        for(int i=0; i<aktivniStudenti.size(); i++) {
            if(aktivniStudenti.get(i) == s){
                bivsiStudenti.add(aktivniStudenti.get(i));
                aktivniStudenti.remove(aktivniStudenti.get(i));
            }
        }
    }

    public int brojAktinihStudenata(){
        return aktivniStudenti.size();
    }

    public void spisAkaktivnihStudenata(){

        System.out.println("Aktivni studenti na predmetu " + nazivPredmeta + " su: ");
        for(int i=0; i<aktivniStudenti.size(); i++){

            System.out.println( i+1 + ". " + (Student) aktivniStudenti.get(i));
        }
    }

    public int brojBivsihStudenata(){
        return bivsiStudenti.size();
    }

    public void spisakBivsihStudenata(){

        System.out.println("Bivsi studenti na predmetu " + nazivPredmeta + " su: ");
        for(int i=0; i<bivsiStudenti.size(); i++){

            System.out.println( i+1 + ". " + (Student) bivsiStudenti.get(i) + ", Ocjena: " + ocjena);
        }
    }

    @Override
    public String toString() {
        return nazivPredmeta + ", ECTS ( " + ECTS + " )";
    }
}
