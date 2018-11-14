package ba.unsa.etf.rpr.zutorijal4;

public class Main {

	public void meniZaPredmete(){

		System.out.println("Dobro došli u meni Predmeta! \n");
		System.out.println("0 - za kraj \n" +
				"1 - za kreiranje novog predmeta" +
				"2 - za dodavanje studenta na predmet\n" +
				"3 - za \n"
		);
	}

	public void meniZaPlanStudija(){
		System.out.println("Dobro došli u meni Plan studija! \n");
		System.out.println("0 - za kraj \n" +
				"1 - za kreiranje novog plana studija" +
				"2 - za dodavanje semestara u plan studija \n" +
				"3 - za \n"
		);
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

	        Student s1 = new Student("Ferid", "Hadzic", 17685);
			Student s2 = new Student("Mujo", "Mujic", 17684);
			Student s3 = new Student("Fata", "Fatic", 17683);
	        Predmet p1 = new Predmet("Rpr", true, 7);
			Predmet p2 = new Predmet("Asp", true, 6);
			Predmet p3 = new Predmet("Obp", true, 5);

	        s1.upisiStudentaNaPredmet(p1);
			s1.upisiStudentaNaPredmet(p2);
			s1.upisiStudentaNaPredmet(p3);

			s1.studentPolagaoPredmet(p1,10);
			p1.ispisiStudentaSaPredmeta(s1);
			s1.studentPolagaoPredmet(p2, 8);
			p2.ispisiStudentaSaPredmeta(s1);

			Semestar prvi = new Semestar(1, 30);
			prvi.dodajPredmet(p1);
			prvi.dodajPredmet(p2);
			prvi.dodajPredmet(p3);

			PlanStudija bechelr = new PlanStudija(6);
			bechelr.dodajSemestar(1, prvi);

			prvi.spisakPredmeta();

			s1.spisAkaktivnihPredmeta();
			s1.spisOdslusanihPredmeta();

    }
}
