
/**
 * Write a description of class LinkedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkedListStack
{
    // instance variables - replace the example below with your own
    private Node first = null;
    private int length =0;

    /**
     * Constructor for objects of class LinkedList
     */
    public LinkedListStack()
    {
        // initialise instance variables
        
    }
    private class Node 
    {
        String item;
        Node next;
    }

    /**
     * Checks if the linked list is empty
     * 
     * @param  y   a sample parameter for a method
     * @return     false is not Empty and true if empty
     */
    public boolean isEmpty()
    {
        // put your code here
        return first==null;
    }
    /**
     * Pushes int y to the stack
     * 
     * @param  y   a sample parameter for a method
     * @return     null
     */
    public void push(String item)
    {
        // put your code here
        Node Oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = Oldfirst;
        length++;
    }
    /**
     * Delete the last element and return the added one
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String pop()
    {
        // put your code here
        String item = first.item;
        first = first.next;
        return item;
    }
    public int length(){return length;}
    
    
}
