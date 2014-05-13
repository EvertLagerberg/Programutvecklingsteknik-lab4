package prutt_lab4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Composite extends Component implements Iterable<Component> {

	private int position;
	LinkedList<Component> list;
	Queue<Component> queue;

	// Constructor
	public Composite(String name, float weight) {
		super(name, weight);
		list = new LinkedList<Component>();
		position=0;
	}

	public void add(Component c) {
		c.setParent(this);
		list.add(c);

	}

	public void remove() {

	}

	public void getChild() {
		for(Component c : list){
			queue.add(c);
		}
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
		return(position < list.size());
	}

	@Override
	public Component next() {
		Component c =list.get(position);
		System.out.println("-------->");
		position ++;
		return c;
	}

	@Override
	public Iterator<Component> iterator() {

		return list.iterator();
	}


}
