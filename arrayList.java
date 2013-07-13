/**
 * @author sonalimoholkar
 * Difference between array list and vector
 * http://javarevisited.blogspot.com/2011/09/difference-vector-vs-arraylist-in-java.html
 * If you dont care about threads.. then use this else use Vector as it is thread-safe
 * ArrayList is not synchronized and is not threadsafe.
 * The max size of arraylist seems to be Integer.MAXVALUE..
 * Difference between array in arrayList---->
 * Array has fixed size and arraylist doesn n blah blah...
 * But imp thing to remember is that ....
 * Arrays contain objects and primitives whereas arraylist contains strictly objects 
 * and not primitives.
 * Objects - heap , Primitives - stack
 */

import java.util.ArrayList;

public class arrayList {

public static void main(String[] args) {

ArrayList<String> fruits = new ArrayList<String>();
ArrayList foo = new ArrayList();  
System.out.println(foo.size());

fruits.add("apple");
fruits.remove("apple");
fruits.add("orange");
fruits.add("pear");
fruits.add("pear");
fruits.add("strawberry");
System.out.println("Size of ArrayList is:"+fruits.size());
for (int i=0; i < fruits.size(); i++) {
String sFruit = fruits.get(i);
System.out.println(sFruit);
}
}

}

