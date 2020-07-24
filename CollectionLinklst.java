package Package1;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionLinklst {

	public static void main(String[] args) {
	
		LinkedList<String> lkdlst = new LinkedList<String>();
		lkdlst.add("Michigan");
		lkdlst.add("Seattle");
		lkdlst.add("Upper Pennsiula");
		lkdlst.addLast("Oreland");
		
		//for(String s: lkdlst) {
			System.out.println("Added element at end of the list: "+lkdlst.get(3));
		//}
			
			Iterator<String> itr = lkdlst.iterator();
			while(itr.hasNext()) {
				System.out.println("Iterate all element: "+ itr.next());
			}
		
		Iterator<String> str = lkdlst.listIterator(2);
		while(str.hasNext()) {
			System.out.println("Iterate from specific position(2): "+str.next());
		}
		Iterator<String> rev =lkdlst.descendingIterator();
		while(rev.hasNext()) {
			System.out.println("Reverse list: "+rev.next());
		}	
		//Iterator<String> revstr = lkdlst.listIterator(lkdlst.size());
		//lkdlst.stream().collect(Collectors.toCollection(LinkedList::new)).descendingIterator().forEachRemaining(System.out::println);
		lkdlst.add(4,"Wyoming");
		System.out.println("Added element at specific position of the list: "+lkdlst.get(4));
		lkdlst.addFirst("Chicago");
		
		LinkedList<String> occur = new LinkedList<String>();
		occur.add("US");
		occur.add("Ind");
		occur.add("UK");
		occur.add("Ind");
		occur.add("Eup");
		occur.add("UK");
		occur.add("Ind");
		occur.add("Io");
		
		System.out.println("First occurance "+occur.indexOf("Ind"));
		System.out.println("Last occurance "+occur.lastIndexOf("Ind")); 
		
		for(int i=0; i<occur.size(); i++) {
			String v =  occur.get(i);
			int pos = occur.indexOf(v);
			System.out.println(pos +"-->" +  occur.get(i)); 		}
		System.out.println("remove a specified element from a linked list " + occur.remove("Eup"));
		System.out.println("remove first element from a linked list" +occur.removeFirst());
		System.out.println("remove last element from a linked list" +occur.removeLast());
		System.out.println("Remove all element from linked list" + occur.removeAll(occur));
	}

}
