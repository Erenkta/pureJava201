package Java201.OOP.Polymorphism;

public class FileLogger extends BaseLogger{
	public FileLogger(int logTime) {
		super(logTime);
		System.out.println(this.logTime);
	}
	public void Log() {
		System.out.println("File Logged");	}
}
