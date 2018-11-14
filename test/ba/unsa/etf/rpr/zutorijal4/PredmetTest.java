package ba.unsa.etf.rpr.zutorijal4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void brojAktivnihStudenata() {
        Student s1 = new Student("Ferid", "Hadzic", 17685);
        Student s2 = new Student("Mujo", "Mujic", 17684);
        Student s3 = new Student("Fata", "Fatic", 17683);
        Predmet p1 = new Predmet("Rpr", true, 7);
        p1.dodajStudentaNaPredmet(s1);
        p1.dodajStudentaNaPredmet(s2);
        p1.dodajStudentaNaPredmet(s3);

        s1.studentPolagaoPredmet(p1, 10);
        p1.ispisiStudentaSaPredmeta(s1);

        assertEquals(2, p1.brojAktinihStudenata());

    }

    @Test
    void brojBivsihStudenata() {
        Student s1 = new Student("Ferid", "Hadzic", 17685);
        Student s2 = new Student("Mujo", "Mujic", 17684);
        Student s3 = new Student("Fata", "Fatic", 17683);
        Predmet p1 = new Predmet("Rpr", true, 7);
        p1.dodajStudentaNaPredmet(s1);
        p1.dodajStudentaNaPredmet(s2);
        p1.dodajStudentaNaPredmet(s3);

        s1.studentPolagaoPredmet(p1, 10);
        p1.ispisiStudentaSaPredmeta(s1);

        assertEquals(1, p1.brojBivsihStudenata());
    }
}