package prutt_lab4;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator_hor  implements Iterator<Component>{

	private int position;
	LinkedList<Component> queue;
	Iterator_hor(LinkedList<Component> list){
		position =0;
		queue= list;
	}
	
	
	@Override
	public boolean hasNext() {
		return(position < queue.size());
	}

	@Override
	public Component next() {
		Component c =queue.get(position);
		if (c.getChildren()!=null){
			queue.addAll(c.getChildren());
		}
		position ++;
		return c;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	

}
