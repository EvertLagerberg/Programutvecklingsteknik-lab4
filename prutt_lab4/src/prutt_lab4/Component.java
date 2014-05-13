package prutt_lab4;

import java.util.Iterator;

abstract class Component implements Iterator<Component>  {

	public String name;
	public float weight;
	Component parent;

	// Constructor
	public Component(String name, float weight) {
		this.name = name;
		this.weight = weight;
	}

	// getWeight()
	public float getWeight() {
		return weight;
	}

	// toString()
	public String toString() {
		return name;
	}

	public void setParent(Component c) {
		parent = c;
	}

	public Component getParent() {
		return parent;
	}

	// end of class
}
