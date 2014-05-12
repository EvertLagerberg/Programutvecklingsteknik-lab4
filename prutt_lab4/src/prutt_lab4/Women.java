package prutt_lab4;

public class Women extends Human {

	private Women(String name, String sex) {
		super(name, sex);
	}
	
	public static Women createWoman(String name, String sex){
		return new Women(name,sex);
	}
}
