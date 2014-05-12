package prutt_lab4;

public class Man extends Human {

	private Man(String name, String sex) {
		super(name, sex);
	}
	
	public static Man createMan(String name, String sex){
		return new Man(name,sex);
	}
	
	
}
