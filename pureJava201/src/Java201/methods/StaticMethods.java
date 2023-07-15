package Java201.methods;

public class StaticMethods {
	int y = 5;

	public static void main(String[] args) {
		/*
		 * statik methodlar sadece başka statik methodlardan çağrılabilir
		 * sadece statik veriye erişim sağlayabilir -> kendi class'ındaki ya da farklı classtaki
		 * this ve super anahtar kelimeleri kullanılamaz
		 */
		merhaba();
		Math.sqrt(9); // bu method da bir static methoddur
		int x = Integer.parseInt("12");
		System.out.println(x);
		yazdır(x);
		// hata verir yazdır(y);
	}
	
	public static void merhaba() {
		System.out.println("Merhaba");
	}
	public static void yazdır(int x) {
		System.out.println(x);
	}
}
