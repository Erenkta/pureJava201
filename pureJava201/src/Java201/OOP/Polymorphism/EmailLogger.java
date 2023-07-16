package Java201.OOP.Polymorphism;

public class EmailLogger extends BaseLogger{
	public EmailLogger(int logTime) {
		super(logTime);
		System.out.println(this.logTime);
	}
	public void Log() {
		System.out.println("Email Logged");
	}

}
