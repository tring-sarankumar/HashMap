package assignment.hashmap;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Logger;

public class Hashtree {

	public static void main(String[] args) {
		Logger l =  Logger.getLogger("CreditCard");
	      // TreeSet
        TreeSet<String> ts1 = new TreeSet<>();
  
        // Elements are added using add() method
        ts1.add("AB");
        ts1.add("BC");
        ts1.add("CD");
  
        // Duplicates will not get insert
        ts1.add("CD");
  
        // Elements get stored in default natural
        // Sorting Order(Ascending)
	l.log(Level.INFO,()->"Set "+(ts1));
        
      //Traversing elements 
        Iterator<String> it=ts1.iterator();
		while(it.hasNext()) {
			
			l.log(Level.INFO,()->" " +it.next());
		}
		
		//Size
		 l.log(Level.INFO,()->" "+(map.size()));
		
		ts1.remove("BC");

	}

}
