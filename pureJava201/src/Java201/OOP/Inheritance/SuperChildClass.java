package Java201.OOP.Inheritance;

public class SuperChildClass extends ChildClass{
	public SuperChildClass(String parameter) {
		super(parameter); //bunun ile BaseClass'a yolladık
		System.out.println("Super Child Constructor");
	}

}
