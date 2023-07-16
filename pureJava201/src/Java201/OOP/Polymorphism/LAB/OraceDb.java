package Java201.OOP.Polymorphism.LAB;

public class OraceDb extends DbConnection{
	public void openConnection() {
		System.out.println("Oracle açıldı");
	}
	public void closeConnection() {
		System.out.println("Oracle kapatıldı");
	}
	public void executeQuery() {
		System.out.println("Oracle Komutlar Çalıştı");
	}

}
