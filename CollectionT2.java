package Package1;
import Package1.CollectionT1;
import java.util.*;
import java.util.ArrayList;

public class CollectionT2 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>(5);
		num.add(265);
		num.add(683);
		num.add(576);
		num.add(100);
		num.add(920);
		
		Integer fn = num.get(0); //retrieve an element
		num.set(0, 808); //insert an element in 1st position
		num.remove(2); //remove the third element
		Collections.sort(num); //sorting arraylist
		
		System.out.println("Sorted list: " + num);
			if(num.contains(683)) { //search an element in a array list
				System.out.println("Search element found "+ num.contains(683) );
		}else {
			System.out.println("Search element found " + num.contains(689));
		}
		System.out.println("Value from specified index 0: " +fn);
		System.out.println("Updating specific array element: "+ num.get(2));
		System.out.println("Remove the 3rd element "+ num.get(3));
		
		List<String> sourc = new ArrayList<String>();
		sourc.add("Test");
		sourc.add("Im adding");
		
		List<String> copied = new LinkedList<String>();
		copied.add("Check");
		copied.add("My data");
		copied.add("a list");
		Collections.copy(copied, sourc); //copy one array list into another
		System.out.println(copied);
		
		Collections.shuffle(num); //
		System.out.println("Shuffled list: " + num);
		
		List<Integer> number = new ArrayList<Integer>();
		for(int i = 0; i<=10; i++) {
			number.add(i);
		}
		Collections.reverse(number);
		System.out.println("Reversing the number "+number);
		
		List<String> lstnam = Arrays.asList("Dog", "cat", "pet", "fish", "lizard", "seagul");
		
		List<String> sublst = lstnam.subList(3,5);
		System.out.println("extracted portion of list "+ sublst);
		System.out.println("The original list ");
		for(String ls: lstnam) {
			System.out.println(ls);
		}
		Collections.swap(lstnam, 2, 3);
		System.out.println("After Swap element position are: ");
		for(String s: lstnam) {
			System.out.println(s); }
		num.addAll(number);//join two array lists
		
		System.out.println("joined two array lists " +num);
		 ArrayList<String> clist = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
		 clist.clear();
		System.out.println("Cleared array lists " +clist);
		if(clist.isEmpty()) { //test an array list is empty or not
			System.out.println("Tested list is empty");
		}else {
			System.out.println("Tested list isn't empty");
		}
		
		ArrayList<String> str = new ArrayList<String>(5);
		str.add("a");
		str.add("d");
		str.add("l");
		str.add("g");
		str.add("r");
		str.add("e");
		str.add("q");
		str.trimToSize(); //trim
		System.out.println("Trim the capacity of an array list" +str); 
		
		ArrayList<Integer> arylst = new ArrayList<Integer>(2);
		arylst.add(56);
		arylst.add(26);
		arylst.size();
		System.out.println("Original array list " +arylst);
		arylst.ensureCapacity(4); //increase the size of an array list
		arylst.add(9);
		arylst.add(10);
		System.out.println("Index element "+ arylst.indexOf(10)); 
		System.out.println("Increased size of array list "+ arylst);
		arylst.set(2, 500);
		System.out.println(arylst);
		for(int i=0; i<arylst.size(); i++) {
			int v = arylst.get(i);
			int pos = arylst.indexOf(v);
			System.out.println(pos + " --> "+ arylst.get(i));
		}
		
		
		
	}

}
