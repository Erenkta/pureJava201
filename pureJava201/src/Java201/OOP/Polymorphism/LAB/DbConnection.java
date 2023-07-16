package Java201.OOP.Polymorphism.LAB;

public class DbConnection {
	public void openConnection() {
		System.out.println("Veritabanı açıldı");
	}
	public void closeConnection() {
		System.out.println("Veritabanı kapatıldı");
	}
	public void executeQuery() {
		System.out.println("Komut Çalıştı");
	}

}
