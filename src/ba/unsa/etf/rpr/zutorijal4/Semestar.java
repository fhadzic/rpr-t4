package ba.unsa.etf.rpr.zutorijal4;

import java.util.ArrayList;
import java.util.List;

public class Semestar {

    List<Predmet> predmeti = new ArrayList<Predmet>();
    private int ECTS;
    private int brojSemestra;

    public Semestar(int brojSemestra, int ECTS){
        this.brojSemestra = brojSemestra;
        this.ECTS = ECTS;
    }

    public void dodajPredmet(Predmet p){

        predmeti.add(p);
    }

    public int brojPredmeta(){

        return predmeti.size();
    }

    public void spisakPredmeta(){

        System.out.println("Predmeti u " + brojSemestra + ". semestru su: ");
        for(int i=0; i<predmeti.size(); i++){
            System.out.println(i+1 + ". " + (Predmet)predmeti.get(i));
        }
    }

}
