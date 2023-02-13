package assignment.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.logging.Logger;

public class Hashmap 
{
    public static void main( String[] args )
    {
    	Logger log =  Logger.getLogger("CreditCard");
    	 HashMap<Integer, String> languages = new HashMap<>();

    	    languages.put(1, "Java");
    	    languages.put(2, "Python");
    	    languages.put(3, "JavaScript");
    	    log.info("HashMap: " + languages);

    	    // return set view of keys
    	    log.info("Keys: " + languages.keySet());

    	    // return set view of values
    	    log.info("Values: " + languages.values());

    	    // return set view of key/value pairs
    	    log.info("Key/Value mappings: " + languages.entrySet());
    	    
    	    // remove element associated with key 
    	    String value = languages.remove(2);
    	    log.info("Removed value: " + value);

    	    log.info("Updated HashMap: " + languages);
    	    
    	 // iterate through keys only
    	    log.info("Keys: ");
    	    for (Integer key : languages.keySet()) {
    	      log.info(String.valueOf(key));
    	    }

    	    // iterate through values only
    	    log.info("\nValues: ");
    	    for (String values : languages.values()) {
    	      log.info(values);
    	    }
    	    
    	    // iterate through key/value entries
    	    log.info("\nEntries: ");
    	    for (Entry<Integer, String> entry : languages.entrySet()) {
    	      log.info(String.valueOf(entry));
        
    }
}
}