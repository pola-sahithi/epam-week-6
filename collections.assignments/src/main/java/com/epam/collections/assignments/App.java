package com.epam.collections.assignments;


public class App 
{
    public static void main( String[] args )
    {
        CustomList<Integer> list = new CustomList<>();
        
        //Add Element
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.addElement(4);
        list.addElement(5);
        list.addElement(6);
        list.addElement(7);
        list.addElement(8);
        list.addElement(9);
        list.addElement(10);
        list.addElement(11);
        
        //Printing List Size an List
        System.out.println("List Size is:");
        System.out.println(list.listSize());
        list.printList();
        
        
        
        //Remove element by index
        list.removeElement(2);
        System.out.println("List after deleting an element:");
        list.printList();
        
        //Get elements by index
        System.out.println("Accesed Elements are:");
        System.out.println(list.getElement(1));
        System.out.println(list.getElement(8));
        
        //Printing List Size
        System.out.println("List Size is:");
        System.out.println(list.listSize());
        
        
    }
}
