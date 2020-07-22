package com.epam.collections.assignments;

import java.util.*;

public class CustomList<E> {
	
	int default_size=10;
	int count=0;
	int size = 0;
	public Object list[];
	public CustomList()
	{
		list = new Object[default_size];
		for(count=0;count<10;count++) {
			list[count]=0;
		}
	}
	
	public void addElement(E x) {
		if(size == list.length)
		{
			expandList();
		}
		list[size++] = x;
	}
	
	public int listSize() {
		return size;
	}
	
	private void expandList() {
		int newSize = list.length * 2;
		list = Arrays.copyOf(list, newSize);
	}
	
	@SuppressWarnings("unchecked")
	public E getElement(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) list[i];
    }
	
	@SuppressWarnings("unchecked")
	public E removeElement(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = list[i];
        int numElts = list.length - ( i + 1 ) ;
        System.arraycopy( list, i + 1, list, i, numElts ) ;
        size--;
        return (E) item;
    }
	
	public void printList()
	{
	  System.out.println("Elements in the List are");
	  for(int i=0;i<size;i++)
	  {
		  System.out.println(list[i]+" ");
	  }
	}
	
	

}
