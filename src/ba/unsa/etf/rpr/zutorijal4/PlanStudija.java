package ba.unsa.etf.rpr.zutorijal4;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class PlanStudija {

    Map< Integer, Set<Semestar> > mapa = new HashMap<>();

    public PlanStudija(Integer brojSemestra, Set<Semestar> semestar){
        mapa.put(brojSemestra, semestar);
    }



}
