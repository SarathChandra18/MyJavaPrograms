package com.custom.linkedlist.test;

import com.custom.linkedlist.CustomLinkedList;

import junit.framework.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class LinkedListTest {

	CustomLinkedList cll = new CustomLinkedList();

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetIndexOutOfBoundsException() {
		cll.get(0);
	}

	@Test
	public void testGetElementAtStartPostion() {
		cll.add("sarath");
		cll.add("vijay");
		cll.add("amit");

		assertEquals(cll.get(0), "sarath");
	}

	@Test
	public void testGetElementAtEndPostion() {
		cll.add("sarath");
		cll.add("vijay");
		cll.add("naveen");

		assertEquals(cll.get(cll.size() - 1), "naveen");
	}

	@Test
	public void testAddElemntToEmptyList() {

		assertEquals(0, cll.size());

		cll.add("sudhan");

		assertEquals(cll.get(0), "sudhan");
		assertEquals(1, cll.size());
	}
	
	@Test
	public void testDeleteFirstElement() {
		
		cll.add("sarath");
		cll.add("vijay");
		cll.add("naveen");

		cll.delete(0);
		
		assertNotEquals("sarath", cll.get(0));
	}
	
	@Test
	public void testDeleteLastElement() {
		
		cll.add("sarath");
		cll.add("vijay");
		cll.add("naveen");
		
		cll.delete(2);
		
		assertNotEquals("naveen", cll.size()-1);
	}
	
	@Test
	public void testDeleteMiddleElement() {
		
		cll.add("sarath");
		cll.add("vijay");
		cll.add("naveen");
		
		cll.delete(1);
		
		assertEquals("naveen",cll.get(1));
		
	}
	
	@Test
	public void testToString() {
		cll.add("sarath");
		cll.add("vijay");
		cll.add("naveen");
		cll.toString();
		
		assertEquals("CustomLinkedList[sarath:vijay:naveen]",cll.toString());
	}
	
	@Test
	public void testSet() {
		cll.add("sarath");
		cll.add("vijay");
		cll.add("naveen");
		
		cll.set(0, "chandra");
		
		assertEquals("chandra",cll.get(0));

		assertEquals(4,cll.size());
	}

}
