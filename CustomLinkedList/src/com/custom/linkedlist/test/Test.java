package com.custom.linkedlist.test;

import com.custom.linkedlist.CustomLinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomLinkedList cll = new CustomLinkedList();
		cll.add(10);
		cll.add(20);
		cll.add(30);
		cll.add(40);
		cll.setFirst(80);
		cll.set(3, 80);
		
		
		cll.print();
		System.out.println("postion");
		cll.get(2);
		int size = cll.size();
		System.out.println("size of list is :" + size);
		cll.delete(0);
		System.out.println("list after deleting the element at first postion");
		cll.print();
	}

}
