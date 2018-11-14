package ba.unsa.etf.rpr.zutorijal4;

public class Main {

	public void meni(){
		System.out.println("Dobro došli u glavni meni! \n");
	}

	public void meniZaStudente(){
		System.out.println("Dobro došli u meni Studenata! \n");

		System.out.println("0 - za kraj \n" +
							"1 - za kreiranje studenta" +
							"2 - za dodavanje studenta na predmet \n" +
							"3 - za \n"
				);
	}

    public static void main(String[] args) {

	        Student s = new Student("Ferid", "Hadzic", 17685);
	        Predmet p = new Predmet("Rpr", true, 5);
	        p.dodajStudenta(s);
	        p.spisakStudenata();
	        System.out.println(p.brojStudenata());

    }
}
