package assignment.hashmap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Logger;

public class Hashset {

	public static void main(String[] args) {
		//Creating HashSet and adding elements
		 Logger log =  Logger.getLogger("CreditCard");
		 HashSet<String> set=new HashSet<String>();  
         set.add("One");    
         set.add("Two");    
         set.add("Three");   
         set.add("Four");  
         set.add("Five");  
         //Traversing elements 
         Iterator<String> i=set.iterator();  
         while(i.hasNext())  
         {  
         log.info(i.next());  
         }  
         
         HashSet<String> set1=new HashSet<String>();  
         set1.add("Ten");  
         set1.add("Twenty");  
         set.addAll(set1);  
         log.info("Updated List: "+set);
         
         //Removing specific element from HashSet  
         set.remove("one"); 

	}

}

