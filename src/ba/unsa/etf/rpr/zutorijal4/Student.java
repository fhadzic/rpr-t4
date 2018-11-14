package ba.unsa.etf.rpr.zutorijal4;

import java.util.List;
import java.util.ArrayList;

public class Student {

    List<Predmet> odslusaniPredmeti = new ArrayList<Predmet>();
    List<Predmet> aktivniPredmeti = new ArrayList<Predmet>();
    String ime;
    String prezime;
    int index;

    public Student(String ime, String prezime, int index){
        this.ime = ime;
        this.prezime = prezime;
        this.index = index;
    }

    public void upisiStudentaNaPredmet(Predmet p){
        aktivniPredmeti.add(p);
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

    public void spisAkaktivnihPredmeta(){

        System.out.println("Student " + prezime + " " + ime + " sluša slijedeće predmete: ");
        for(int i=0; i<aktivniPredmeti.size(); i++){
            System.out.println(" -  " + aktivniPredmeti.get(i));
        }
    }

    int brojAktinihPredmeta() { return  aktivniPredmeti.size();}

    public void spisOdslusanihPredmeta(){

        System.out.println("Student " + prezime + " " + ime + " je odslušao slijedeće predmete: ");
        for(int i=0; i<odslusaniPredmeti.size(); i++){
            System.out.println(" -  " + odslusaniPredmeti.get(i) + ", Ocjena: " + odslusaniPredmeti.get(i).getOcjena());
        }
    }

    int brojOdslusanihPredmeta() { return  odslusaniPredmeti.size();}

    void studentPolagaoPredmet(Predmet p, int ocjena){
        for(int i=0; i<aktivniPredmeti.size(); i++){
            if( p == aktivniPredmeti.get(i) && ocjena > 5){
                aktivniPredmeti.get(i).setOcjena(ocjena);
                odslusaniPredmeti.add(aktivniPredmeti.get(i));
                aktivniPredmeti.remove(aktivniPredmeti.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return prezime + " " + ime + " (" + index + ")";
    }
}
