package ba.unsa.etf.rpr.zutorijal4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanStudijaTest {

    @Test
    void getBrojSemestara() {
        PlanStudija bechelr = new PlanStudija(6);
        assertEquals(6, bechelr.getBrojSemestara());
    }

}