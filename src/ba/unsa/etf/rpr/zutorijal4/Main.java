package ba.unsa.etf.rpr.zutorijal4;

public class Main {

    public static void main(String[] args) {
	        Student s = new Student("Ferid", "Hadzic", 17685);
	        Predmet p = new Predmet("Rpr", true, false, 5);
	        p.dodajStudenta(s);
	        p.spisakStudenata();
	        System.out.println(p.brojStudenata());
    }
}
