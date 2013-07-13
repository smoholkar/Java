/**
 * @author Sonali Moholkar
 */
/**
 * For each loop in java
 * http://math.hws.edu/javanotes/c7/s2.html
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;
import java.util.HashSet;

// adding a comparable interface to sort according to order ..
/*
public class arrayElement implements Comparable{
	//http://javarevisited.blogspot.com/2011/06/comparator-and-comparable-in-java.html
	Integer data,index;
	@Override
	public int compareTo(Object o){
		arrayElement ae= (arrayElement) o;
		return this.index - o.index;
		
	}
}
*/

public class arrays{
	
	public static void main(String[] args) throws IOException{
		int choice=0,position=0;
		System.out.println("Basic Array Program");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size");
		int arraysize=Integer.parseInt(bf.readLine());
		System.out.println("The array size is:" + arraysize);
		//int[] arr = new int[arraysize];
		Integer[] arr = new Integer[arraysize];
		System.out.println("Enter elements");
		System.out.println("Enter array elements");
		for(int i=0;i<arraysize;i++){
		arr[i]=Integer.parseInt(bf.readLine());
		}
		//int[] arrcopy = (int[])arr.clone();
		Integer[] arrcopy = (Integer[])arr.clone();
		//int[] arrcopy = Arrays.copyOf(arr, arr.length);
		
		do{
		System.out.println("**Menu***");
		System.out.println("1. Print the array elements");
		System.out.println("2. Array - Ascending Order");
		System.out.println("3. Array - Descending Order");
		System.out.println("4. Pairs of elements in an array that sum upto to a given number");
		System.out.println("5. No. of Occurances");
		System.out.println("6. Return indices of 10 greatest values in an array");
		System.out.println("7. Return the duplicate elements in an array");
		System.out.println("8. Exit");
		System.out.println("Enter your choice");
		choice = Integer.parseInt(bf.readLine());
		switch(choice)
		{
				
			case 1:
				System.out.println("Displaying....");
				System.out.println("The elements you entered are:");
				for(int i=0;i<arraysize;i++){
				System.out.println(arr[i]);
				}
				break;
				
			case 2:
				 System.out.println("Array elements in ascending order are..");
				 Arrays.sort(arrcopy);
				 for(int i=0;i<arraysize;i++){
				 System.out.println(arrcopy[i]);
				}
				break;
				
			case 3:
				System.out.println("Array elements descending order...");
				for(int i=arraysize-1;i>=0;i--){
					 System.out.println(arrcopy[i]);
				}
				break;
				
			case 4:
				
				System.out.println("Pairs that sum upto a given number(k)");
				System.out.println("Enter a number(k)=");
				int k= Integer.parseInt(bf.readLine());
				System.out.println("The number(k) that u entered is=" + k);
				
				for(int i=0; i<arraysize;i++){
					if(arrcopy[i]>k){
						position = i;
						System.out.println("Position:"+ position);
					}
					else
					{
						position = arraysize;
						System.out.println("Position:"+ position);
					}
				}
				for(int i=0; i<position-1;i++){
					for(int j=i+1;j<position;j++){
						if(arrcopy[i]+arrcopy[j]==k){
						System.out.println("Pair.."+arrcopy[i]+ "and"+ arrcopy[j]);
						}// end of if
					}// end of for
					}// end of for
					break;
				
			case 5:
				// HashMap
				//http://stackoverflow.com/questions/8098601/java-count-occurrence-of-each-item-in-an-array
				System.out.println("Find no. of occurances of each Integer element in an array ");
				
				HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
				// This is a foreach loop introduced in java 5
				for(Integer integer : arr){
					if (!countMap.containsKey(integer)) {
		                countMap.put(integer, 1);
		            } else {
		                Integer count = countMap.get(integer);
		                count = count + 1;
		                countMap.put(integer, count);
		            }
				}// end of for */
				
				//??????? watch .. wrong :X
				System.out.println("Dispalying key values without using KeySet:");
				for(int i=0;i<countMap.size();i++){
					System.out.println(arr[i] + ":" + countMap.get(arr[i]));
				}
				
				
				System.out.println("Dispalying key values using KeySet:");
				// get keyset value from map
				// returns set view of keys contained in this map
				Set<Integer> keySet = countMap.keySet();
		        for (Integer integer : keySet) {
		            System.out.println(integer + " : " + countMap.get(integer));
		        
		        }
		        
		        
		        System.out.println("To print only duplicates and their occurance:");
		        for (Integer integer : keySet) {
		            if(countMap.get(integer)>1){
		        	System.out.println(integer + " : " + countMap.get(integer));
		            }
		        }
		        
		        
		        		      
				break;
				
			case 6:
				//TreeSet
				// under construction
				System.out.println("Returning indices of 10 greatest values in an array..");
				
				//http://viralpatel.net/blogs/convert-array-to-set-java-arraylist/
				/*	Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(arrcopy));
				int count=0;
				while(count!=10){
				System.out.println(mySet);
				count++;
				}*/
				//http://java-tweets.blogspot.com/2012/07/convert-array-to-treeset-in-java.html
				/**
				 * 
				 * To convert an array into a Set, first we convert it into a List using
				 * Arrays.asList method. Next we create a TreeSet and pass the list as
				 * an argument to the constructor
				 **/
				/*
				List< Integer > list = Arrays.asList(arr);
				Set< Integer > set = new TreeSet< Integer >(list);
				System.out.println("Set contains...:");
				int count=0;
				while(count!=10){
					/**Long form for the for loop for(int i = 0;i < set.size();i++)
						print(set[i])
					
				for(Integer n:set){
					System.out.println(n);
					count ++;
				}
				}
				*/
				break;
				
			case 7:
				System.out.println("List out the duplicates....");
				for(int i=0;i<arrcopy.length-1;i++){
					for(int j=i+1;j<arrcopy.length;j++){
						if(arrcopy[i]==arrcopy[j]){
							System.out.println(arrcopy[i]);
						}
					}
					}
				break;
			case 8:
				System.exit(0);
			
			default:
				System.out.println("Invalid choice");
				break;
		} // end of switch
		}while(choice!=8);
	}
}