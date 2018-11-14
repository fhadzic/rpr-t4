package ba.unsa.etf.rpr.zutorijal4;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    void getIme() {
        Student s = new Student("Ferid", "Hadzic", 17685);
        assertEquals("Ferid", s.getIme());
    }

    @Test
    void getPrezime() {
        Student s = new Student("Ferid", "Hadzic", 17685);
        assertEquals("Hadzic", s.getPrezime());
    }

    @Test
    void getIndex() {
        Student s = new Student("Ferid", "Hadzic", 17685);
        assertEquals(17685, s.getIndex());
    }


    @Test
    public void brojAktivnihPredmeta() {
        Student s = new Student("Ferid", "Hadzic", 17685);
        Predmet p1 = new Predmet("Rpr", true, 7);
        Predmet p2 = new Predmet("Asp", true, 6);
        Predmet p3 = new Predmet("Obp", true, 5);
        s.upisiStudentaNaPredmet(p1);
        s.upisiStudentaNaPredmet(p2);
        s.upisiStudentaNaPredmet(p3);

        s.studentPolagaoPredmet(p1, 10);
        s.studentPolagaoPredmet(p2, 5);

        assertEquals(2, s.brojAktinihPredmeta());
    }


    @Test
    void brojOdslusanihPredmeta() {
        Student s = new Student("Ferid", "Hadzic", 17685);
        Predmet p1 = new Predmet("Rpr", true, 7);
        Predmet p2 = new Predmet("Asp", true, 6);
        Predmet p3 = new Predmet("Obp", true, 5);
        s.upisiStudentaNaPredmet(p1);
        s.upisiStudentaNaPredmet(p2);
        s.upisiStudentaNaPredmet(p3);
        s.studentPolagaoPredmet(p1, 10);
        s.studentPolagaoPredmet(p2, 8);
        assertEquals(2, s.brojOdslusanihPredmeta());
    }
}
