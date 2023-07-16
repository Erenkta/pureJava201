package Java201.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Checked ve Unchecked excepitons !
		
		//Syntax Hatası -> derleme zamaanı
		//Runtime -> Çalışma esnasında alınan hatalardır
		
		/*
		 * Errorlar JVM ile alakalı müdahale edilemez
		 */
		
		//
		/*
		 * try-catch-finally ile hata yönetimi yaparız
		 * try-> hata olabilecek kod bloğu
		 * catch-> hatayı yakalayan
		 * finally-> hata olsa da olmasa da ne yapılacağını söyleyen blok
		 */
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		try {
			System.out.println(x/y);
		}catch(ArithmeticException e) {
			System.out.println("Hata = "+ e);
		}catch (InputMismatchException e) {
			System.out.println("Hata = "+e);
		}finally {
			scanner.close();
		}
		//Try bloğunun içi olabildiğince sade olmalıdır ki yavaşlamasın
		//Throw e ile uygulamaya crash yaptırırız ki daha çalışmasın
		
		//Kendi error class'ımızı oluşturmak için Exception class'ı extends etmeliyiz
		//Runtime ya da compile time extend edilir
		//Eğere direkt Exception'u extend edersek kullandığımz yerde hata fırlatmamız lazım
	}

}
