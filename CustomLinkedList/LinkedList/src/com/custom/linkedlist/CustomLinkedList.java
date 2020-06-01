package com.custom.linkedlist;

import com.custom.linkedlist.utils.Node;

public class CustomLinkedList {

	Node headNode;

	public void add(String data) {
		Node node = new Node();
		node.data = data;
		node.nextNode = null;

		if (headNode == null) {
			headNode = node;
		}

		else {
			Node currentNode = headNode;

			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = node;

		}
	}

	public void print() {
		Node currentNode = headNode;

		while (currentNode.nextNode != null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.nextNode;
		}
		System.out.println(currentNode.data);
	}

	public void setFirst(String data) {
		Node node = new Node();
		node.data = data;
		node.nextNode = null;
		node.nextNode = headNode;
		headNode = node;
	}

	public void set(int position, String data) {

		Node node = new Node();
		node.data = data;
		node.nextNode = null;

		if (position == 0) {
			setFirst(data);
		}
		Node currentNode = headNode;

		for (int i = 0; i < position - 1; i++) {
			currentNode = currentNode.nextNode;
		}
		node.nextNode = currentNode.nextNode;
		currentNode.nextNode = node;

	}
	
	
	public String get(int position)
	{
		Node node = headNode;
		
		if(position==0)
		{
			if(headNode==null)
			{
				throw new ArrayIndexOutOfBoundsException();
			}

return node.data;		
}
		else
		{
		for(int i = 0;i<position;i++)
		{
			node = node.nextNode;
		}
		return node.data;
		}
	}
	
	
	public int size() {

		Node node = headNode;
		int size = 0;

		if (headNode != null) {
			while (node != null) {
				size++;
				node = node.nextNode;
			}
		}

		return size;

	}

	
	public void delete ( int i) {
		Node node = headNode;
		
		//remove the element at index position 0
		if(i==0)
		{
			if(node!=null)
			{
			if(node.nextNode!=null)
			{
				headNode=headNode.nextNode;
				node.nextNode =null;
			}
		}
		}
		
		else
		{
			for(int j=0;j<i-1;j++)
			{
				node = node.nextNode;
			}
			node.nextNode=node.nextNode.nextNode;
		}
		
	}
	
	public String toString() {
		
		
		
		String s = "CustomLinkedList[";
		
		Node currentNode = headNode;

		
		while (currentNode.nextNode != null) {
			s=s+currentNode.data +":";

			currentNode = currentNode.nextNode;

		}
		s=s+currentNode.data +"]";

		return s;
		
		
	}
}
