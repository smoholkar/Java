/**
 * @author sonalimoholkar
 * Awesome article on Java HashMaps.. and How it works
 * http://javarevisited.blogspot.com/2011/02/how-hashmap-works-in-java.html
 * What exactly are hashcodes
 * http://www.thejavageek.com/2013/06/27/what-are-hashcodes/
 * Difference between HashTable and Concurrent HashMap
 * http://javarevisited.blogspot.com/2010/10/what-is-difference-between-synchronized.html
 * Difference between HashMap and LinkedHashMap
 * http://java67.blogspot.com/2012/08/difference-between-hashmap-and-LinkedHashMap-Java.html
*/
/**
 * A good article on difference between iterator and enumerator
 * http://javarevisited.blogspot.sg/2010/10/what-is-difference-between-enumeration.html
 * Difference between HashMap and Map
 * Map is an interface; HashMap is a particular 
 * implementation of that interface.
 * HashMap uses a collection of hashed key values to do its lookup.O(1)
 *  TreeMap will use a red-black tree as its underlying data store.log(n)
 *  Difference between BST and Hash Table
 *  http://www.programmerinterview.com/index.php/data-structures/hash-tables-versus-binary-search-trees/
 */

import java.util.*;

public class hashMap1{
	public static void main(String args[]){
		System.out.println("Hash Map Example 1");
		HashMap map = new HashMap();
		/*map.put("Cat","Meows");
		map.put("Dog","Barks");
		map.put("Hyena","Laughs");
		map.put("Horse","Neighs");
		map.put("Horse","Neighs");
		map.put("You are","Mad");
		map.put("Hyena","Laughs");*/
		map.put("A", new Integer(2));
		map.put("B", new Integer(6));
		map.put("C", new Integer(1));
		map.put("D", new Integer(0));
		map.put("E", new Integer(5));
		map.put("A", new Integer(9));
		//map.put("F",new Integer());
		System.out.println("This Hash Map contains:" + map);
		
		
	}
}