package prutt_lab4;

import java.util.Iterator;
import java.util.LinkedList;

public class Composite extends Component implements Iterable<Component> {

	LinkedList<Component> list;
	Iterator<Component> itr;

	// Constructor
	public Composite(String name, float weight) {
		super(name, weight);
		list = new LinkedList<Component>();
		itr = list.iterator();

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

		for (Component c : list) {

			System.out.println(c.name + ":" + c.getWeight());

			d += c.getWeight();
		}

		return d;

	}

	// toString()
	public String toString() {
		String s = "\n" + name + "\n" + "Innehåll:\n";

		for (Component c : list) {
			s += "" + c.toString() + "\n";

		}
		return s;
	}

	@Override
	public boolean hasNext() {
		if(list.isEmpty()){;
		return false;
		}
		else{return true;}
	}

	@Override
	public Component next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Component> iterator() {

		return list.iterator();
	}

}
