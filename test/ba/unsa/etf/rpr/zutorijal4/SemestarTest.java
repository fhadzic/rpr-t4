package ba.unsa.etf.rpr.zutorijal4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SemestarTest {

    @Test
    void brojPredmeta() {
        Semestar prvi = new Semestar(1, 30);
        Predmet p1 = new Predmet("Rpr", true, 7);
        Predmet p2 = new Predmet("Asp", true, 6);
        Predmet p3 = new Predmet("Obp", true, 5);
        prvi.dodajPredmet(p1);
        prvi.dodajPredmet(p2);
        prvi.dodajPredmet(p3);
        assertEquals(3, prvi.brojPredmeta());
    }
}