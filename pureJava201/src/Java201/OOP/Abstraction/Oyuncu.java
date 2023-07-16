package Java201.OOP.Abstraction;

public abstract class Oyuncu {
	private String isim;
	private int numara;
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getNumara() {
		return numara;
	}
	public void setNumara(int numara) {
		this.numara = numara;
	}
	
	public abstract void sut(); // abstract fonksiyonları extend etmek zorunda
	public abstract void pas();
}
