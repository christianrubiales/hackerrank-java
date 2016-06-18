package dataStructures.linkedLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintInReverse {
	class Node {
		int data;
		Node next;
	}
	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/
	    // This is a "method-only" submission. 
	    // You only need to complete this method. 

	void ReversePrint(Node head) {
	  // This is a "method-only" submission. 
	  // You only need to complete this method. 

	    List<Integer> list = new ArrayList<Integer>();
	    while (head != null) {
	        list.add(head.data);
	        head = head.next;
	    }
	    Collections.reverse(list);
	    for (int x : list) {
	        System.out.println(x);
	    }
	}
}
