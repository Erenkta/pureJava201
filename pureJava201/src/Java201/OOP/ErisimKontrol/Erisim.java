package Java201.OOP.ErisimKontrol;

public class Erisim {

	public static void main(String[] args) {
		Ogrenci ogr = new Ogrenci();
		ogr.isim = "Ahmet";
		//id'si private erişemem
		//ogr.idYazdır() private olduğundan dolayı erişemiyoruz
		
		ogr.setId(12);
		System.out.println(ogr.getId()); //Encapsulate edilmiş
		ogr.setOgretmen(new Ogretmen()); //bu tarz class isterse böyle yapabiliriz
		
	}

}
