/**
 *@author sonalimoholkar
 * Vectors are thread safe 
 */

import java.util.*;

public class vector{
	public static void main(String args[]){
		
		Vector v = new Vector();
		/*
	       Add elements to Vector using
	       boolean add(Object o) method. It returns true as a general behavior
	       of Collection.add method. The specified object is appended at the end
	       of the Vector.
	    */
		v.add(12);
		v.add(13);
		v.add(2);
		
		/*
	      Use get method of Java Vector class to display elements of Vector.
	      Object get(int index) returns an element at the specified index in
	      the Vector    
	    */
		
		for(int i=0;i<v.size();i++){
		System.out.println(v.get(i));
		}
	}
}