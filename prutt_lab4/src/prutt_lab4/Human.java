package prutt_lab4;


abstract class Human {
	
	public String name;
	public String sex;
	String pnr;
	static Human person;
	
	public Human(String name, String sex) {
		this.sex = sex;
		this.name = name;
	}	
	
	public static Human create (String name, String pnr) {
		int lastNumber = Integer.parseInt(pnr.substring(pnr.length()-2,pnr.length()-1));
		System.out.println("-------->"+lastNumber);
		if (lastNumber % 2 == 0){
			person = Women.createWoman(name, "Kvinna");
		}
		else{
			person = Man.createMan(name, "Man");
		}
		return person;
    }
	
	public String toString(){
		String message = "Hej jag Šr " + sex + " och jag heter " + name;
		return message;
	}
	
	
}
