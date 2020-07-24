package Package1;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionT1 {

	public static void main(String[] args) {
	
		ArrayList<String> color = new ArrayList<String>();
		color.add("Yellow");
		color.add("green");
		color.add("Red");
		color.add("Meganta");
		
		color.add(1, "Black");
		
		for(String s : color) {
			System.out.println("Printing color list "+ s);
		}
		
		Iterator<String> itr = color.iterator();
		while(itr.hasNext()) {
			System.out.println("The color list are "+ itr.next());
		}
	}

}
