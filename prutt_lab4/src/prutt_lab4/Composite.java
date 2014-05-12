package prutt_lab4;

import java.util.LinkedList;

public class Composite extends Component {

	LinkedList<Component> list;

	// Constructor
	public Composite(String name, float weight) {
		super(name, weight);
		list = new LinkedList<Component>();
		// TODO Auto-generated constructor stub
	}

	public void add(Component c) {
		c.setParent(this);
		list.add(c);

	}

	public void remove() {

	}

	public void getChild() {

	}

	// getWeight()
	public float getWeight() {
		
		float d = weight;
		
		for (Component c : list){
			
			System.out.println(c.name +":" + c.getWeight());
			
			d += c.getWeight();
		}
		
		return d;
		
		
		
		
	}

	// toString()
	public String toString() {
		String s = "\n" +name + "\n" + "Innehåll:\n";

		for (Component c : list) {
			s += "" + c.toString() + "\n";

		}
		return s;
	}


}
