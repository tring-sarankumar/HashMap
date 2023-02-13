package assignment.hashmap;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Logger;

public class Hashtree {

	public static void main(String[] args) {
		Logger log =  Logger.getLogger("CreditCard");
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
        log.info(String.valueOf(ts1));
        
      //Traversing elements 
        Iterator<String> it=ts1.iterator();
		while(it.hasNext()) {
			log.info(it.next());
		}
		
		//Size
		log.info("Size :"+ts1.size());
		
		ts1.remove("BC");

	}

}
