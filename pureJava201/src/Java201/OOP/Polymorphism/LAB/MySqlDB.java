package Java201.OOP.Polymorphism.LAB;

public class MySqlDB extends DbConnection {
	public void openConnection() {
		System.out.println("MySQL açıldı");
	}
	public void closeConnection() {
		System.out.println("MySQL kapatıldı");
	}
	public void executeQuery() {
		System.out.println("MySQL Komutlar Çalıştı");
	}

}
