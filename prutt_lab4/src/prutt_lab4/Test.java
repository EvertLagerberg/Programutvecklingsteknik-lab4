package prutt_lab4;


import java.util.Iterator;


public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Composite resväska = new Composite("Resväska", 1.0f);
	Composite necessär = new Composite("Necessär", 0.2f);
	Composite påse = new Composite("Påse", 0.01f);
	Leaf tandborste = new Leaf("Tandborste", 0.1f);
	Leaf bok = new Leaf("Bok", 0.1f);
	Leaf tvål = new Leaf("Tvål", 0.1f);
	Leaf schampoo = new Leaf("Schampoo", 0.1f);
	Leaf rakapparat = new Leaf("Rakapparat", 0.4f);
	
	
	
	resväska.add(necessär);
	resväska.add(bok);
	necessär.add(tandborste);
	necessär.add(påse);
	necessär.add(rakapparat);
	påse.add(tvål);
	påse.add(schampoo);
	
	/*while (itr.hasNext()) {
		Component c = itr.next();
		System.out.println(c);
	}*/
	
	
	/*System.out.println(resväska.toString());
	
	System.out.println("Total:" + resväska.getWeight());
	
	System.out.println("Påse:" + påse.getWeight());*/

	 Human anna = Human.create("Anna", "xxxxxx-012x");
	 Human magnus = Human.create("Magnus","xxxxxx-011x");
	 Human Tommy = Human.create("Tommy", "890403-0650");
	
	 System.out.println(anna);
	 System.out.println(magnus);
	 System.out.println(Tommy);
	 
	 Iterator<Component> packet =  resväska.iterator();
	 while(packet.hasNext()){
		 System.out.println(packet.next().name);
	 }
	}
}
