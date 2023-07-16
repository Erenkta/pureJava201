package Java201.OOP.Polymorphism.LAB;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		DbConnection dbConnection = new OraceDb(); 
		//Kendini inherit edenlerin referansını tutabilir !! Çok kullanılır
		dbConnection.openConnection(); //Oracle'daki çalıştı
		
		//Şimdi şöyle bir örnek yapalım
 //null da bir initializedır
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Database Seçiniz : 1-> MySQL 2->Oracle");
		int secim = scanner.nextInt();
		
		
		switch(secim) { //Bu prensip SOLID e aykırı
		case 1 :
			kullanıcıDB = new MySqlDB();
			break;
		case 2 :
			kullanıcıDB = new OraceDb();
			break;
		default : System.out.println("Lütfen geçerli bir sayı giriniz");
					break;
		}
		
		if(kullanıcıDB != null) {
			kullanıcıDB.openConnection();
		}
		*/
		//DbConnection kullanıcıDB = (DbConnection) Class.forName(args[0]).newInstance();
		//Run configuration'dan yazıyorsun ve SOLID'e daha uygun bir hale geliyor
		//kullanıcıDB.openConnection();
		


	}

}
