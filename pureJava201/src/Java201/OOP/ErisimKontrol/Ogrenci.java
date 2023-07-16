package Java201.OOP.ErisimKontrol;

public class Ogrenci {
	/*Erişimler 
	 * public
	 * protected --> inherit edilenlere public diğerlerine private
	 * default -->aynı pakette yer alan ve aynı sınıfta olanlara public
	 * default için farklı paketteysek  eğer import edilmesi lazım
	 * -> otomatik olarak default olur sen bir şey yazmazsan
	 * private
	 */
	private int id ;
	public String isim;
	private Ogretmen ogretmen;
	

	private void idYazdir() {
		System.out.println(id);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id < 0) {
			System.out.println("Error");
		}else {
			this.id = id;			
		}

	}
	
	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}
	public Ogretmen getOgretmen() {
		return ogretmen;
	}

}