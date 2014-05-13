package prutt_lab4;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator_ver implements Iterator<Component>{
	
	
	private int position;
	LinkedList<Component> queue;
	Iterator_ver(LinkedList<Component> list){
		position =0;
		queue = new LinkedList<Component>();
	
		for (Component i:list){
			goDeep(i);
		}
	}

	@Override
	public boolean hasNext() {
		return(position < queue.size());
	}

	@Override
	public Component next() {
		Component c =queue.get(position);
		position ++;
		// TODO Auto-generated method stub
		return c;
	}
	
	public void goDeep(Component c){
		if (c.getChildren() != null){
			LinkedList<Component> childs = c.getChildren();
			queue.add(c);
			for(Component k : childs){
				goDeep(k);
			}
		}
		else{
			queue.add(c);
		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
