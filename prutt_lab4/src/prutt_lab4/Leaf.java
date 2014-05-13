package prutt_lab4;

public class Leaf extends Component {
	
	public Leaf(String name, float weight) {
		super(name, weight);
		// TODO Auto-generated constructor stub
	}

	//getWeight()
	public float getWeight(){
		return weight;
	}
	
	//toString()
	public String toString(){
		return name;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Component next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
		
		
	

}