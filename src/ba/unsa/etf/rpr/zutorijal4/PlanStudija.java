package ba.unsa.etf.rpr.zutorijal4;


import java.util.HashMap;
import java.util.Map;


public class PlanStudija {

    int brojSemestara;
    Map< Integer, Semestar > mapa = new HashMap<>();

    public PlanStudija(int brojSemestara){
        this.brojSemestara = brojSemestara;
    }

    public void dodajSemestar(Integer brojSemestra, Semestar semestar){
        if(brojSemestra > brojSemestara) {
     //       throw new IllegalAccessException("Nelegalan broj semestra!");
        }
        mapa.put(brojSemestra, semestar);
    }


    public int getBrojSemestara(){ return  brojSemestara; }

}
