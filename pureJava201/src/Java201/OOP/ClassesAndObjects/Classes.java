package Java201.OOP.ClassesAndObjects;

public class Classes {

	public static void main(String[] args) {
		//Classlar Attribıtes ve Behaviours'a sahiptirler
		//Sınıflar method sayesinde dış dünya ile bağlantı kurar
		
		Daire daire = new Daire(); //new demeden bu yaşayan bir nesne olmaz bellekte yer ayrılmaz
		daire.r = 10.0;
		daire.cevre = 25.0;
		//bunu istersek constructor yani yapıcı methodla da verebilirdik
		
		daire.alanHesapla(daire.r);
		System.out.println(daire.alan);
		
		Daire daire2 = new Daire();
		daire2.r = 12;
		daire2.daireHesapla();
		System.out.println(daire2.cevre);
		
		System.out.println(Daire.daireSayisi); //static olduğu için sınıf üzerinden çağırdık
		
	}

}
