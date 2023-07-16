package Java201.OOP.Polymorphism;

public class Polymorphism {
	public static void main(String[] args) {
		BaseLogger baseLogger = new BaseLogger(5);
		System.out.println("-");
		FileLogger fileLogger = new FileLogger(10);
		System.out.println("-");
		EmailLogger emailLogger = new EmailLogger(15);
		
		baseLogger.Log();
		System.out.println("-");
		fileLogger.Log();
		System.out.println("-");
		emailLogger.Log();
	}
}
