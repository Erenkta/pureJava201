package Java201.OOP.Polymorphism;

public class BaseLogger {
	int logTime;
	public void Log() {
		System.out.println("Logged");
	}
	public  BaseLogger(int logTime) {
		this.logTime = logTime;
		System.out.println(this.logTime);
	}
}
