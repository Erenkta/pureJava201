package Java201.Exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CheckedException {
	public static void main(String[] args) {
		yaz();
	}
	
	public static void yaz() {
		File file = new File("read.me");
		FileWriter fileWriter = null; //IO exception fırlattığı için try catch'de yapmalıyız ya da throw yapmalıyız
		Scanner scanner = new Scanner(System.in);
		try {
			fileWriter = new FileWriter(file);
			System.out.println("Bir yazı giriniz");
			fileWriter.write(scanner.nextLine());
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			scanner.close();
			try {
				fileWriter.close(); //Bu da exception fırlatıyor
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
