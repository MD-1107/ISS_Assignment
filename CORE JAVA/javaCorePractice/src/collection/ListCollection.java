package collection;
import java.util.*;

public class ListCollection 
{
	//list contains multiple elements of same datatype but with variable length/size
	
	public static void main(String args[])
	{
		List<Integer> listLinkedList=new LinkedList<Integer>();

		 listLinkedList.add(10);
	     listLinkedList.add(20);
	     listLinkedList.add(40);
         listLinkedList.add(10);
         listLinkedList.add(348);
	     listLinkedList.add(340);
         listLinkedList.add(293);
         listLinkedList.add(4505);
	     listLinkedList.add(1239);
         listLinkedList.add(548);
         listLinkedList.add(34897);
	     listLinkedList.add(12);
         listLinkedList.add(450);
         listLinkedList.add(238);
         
         System.out.println(listLinkedList);
         
         System.out.println("Size of the list: "+listLinkedList.size());
         
         System.out.println("Index of 340: "+listLinkedList.indexOf(340));
         System.out.println("Index of 1: "+listLinkedList.indexOf(1));
         
         System.out.println("Check if contains 40: "+listLinkedList.contains(40));
         
         System.out.println("Remove 3rd element: "+listLinkedList.remove(2));
         System.out.println("Check if 40 still present: "+listLinkedList.contains(40));
         
         System.out.println("Get the value at index 5: "+listLinkedList.get(5));
	
	
	}

}
