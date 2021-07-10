package com.ani.misc;

import java.lang.OutOfMemoryError;

class Item{
	int value;
	Item next;
	
	public Item (int value) {
		this.value = value;
		this.next = null;
	}
	
	public Item(int value, Item item) {
		this.value = value;
		this.next  = item;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Item getNext() {
		return next;
	}

	public void setNext(Item item) {
		this.next = item;
	}
}



public class ReverseLinkedList {
	
	
	public static Item reverse(Item head) {
		Item prev = null;
		Item curr = head;
		Item next = null;
		while(curr != null) {
			System.out.println("[DEBUG]: Curr is :" + curr.getValue());
			next = curr.getNext();
			System.out.println("[DEBUG]: Next is :" + curr.getNext().getValue());
			curr.setNext(prev);
			System.out.println("[DEBUG]: Curr.next is set to:" + (prev == null?"null":prev.getValue()));
			prev = curr;
			curr = next;
		}
		head = next;
		return head;
	}
	
	public static void printList(Item head) {
		Item temp = head;
		while(temp != null) {
			
			System.out.print(temp.getValue() + "->");
			temp = temp.getNext();
		}
		System.out.print("null");
		throw new OutOfMemoryError();
	}
	
	public static void main(String[] args) {
		Item i1 = new Item(10);
		Item i2 = new Item(20);
		i1.setNext(i2);
		Item i3 = new Item(30);
		i2.setNext(i3);
		Item i4 = new Item(40);
		i3.setNext(i4);
		Item i5 = new Item(50);
		i4.setNext(i5);
		
		Item head = i1;
		
		printList(head);
		head = reverse(head);
		printList(head);


		
		
	}

}
