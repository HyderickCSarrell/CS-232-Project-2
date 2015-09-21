package cs232_project2;

public class LinkedQueue<T> implements Queue<T> {
    //Creates two LinkedList objects newlist points to the linkedlist
    //and oldlist is used to points to individual nodes
    private LinkedList<Object> newlist;
    private LinkedList<Object> oldlist;
    private int newlistelements;
    
    public LinkedQueue() {
        /*sets the size to zero and creates the main list
        */
        newlistelements = 0;
        newlist = null;
        oldlist = new LinkedList<>();
    }
    
    public T peek() {
        /*Returns the first element in the list  */
        return (T) newlist.item;
    }
    
    public boolean isEmpty() {
        /*Returns True if the list is empty and false is there
        are elements in it.
        */
        if (newlistelements == 0) {
            return true;
        }
        
        else {
            return false;
        }
    }
    
    public int size() {
        /* Returns the size of the linkedlist*/
        return newlistelements;
    }
    
    public void add(T item) {
        /* Adds an item in the next node of the Linkedlist*/

        if(newlistelements == 0) {
            oldlist.item = item;
            newlistelements ++;
            newlist = oldlist;
        }
        
        else {
            newlistelements++;
            //Solved problem with loop needed a third LinkedList object to store new node
            LinkedList<Object> tempNode = new LinkedList<>();
            
            tempNode.item = item;
            oldlist = newlist;
            
            while(oldlist.next != null) {
                oldlist = oldlist.next;
            }

            oldlist.next = tempNode;
        }
    }
    
    public T remove() {
        /*Removes the first node of the linkedlist and returns its item*/
        if(newlistelements == 0) {
            System.out.println("The Queue is empty");
            return null;
        }
        
         else {
            
            T fElement = (T) newlist.item;
            oldlist = newlist.next;
            newlist = oldlist;
            newlistelements--;
            return fElement;
        }
        
    }
    
    public String toString() {
        /*Returns a string representation of the Queue*/
        String myString = "[";
        oldlist = newlist;
        if (oldlist.next == null) {
            myString = myString + oldlist.item;
        }
        else {
            myString = myString + oldlist.item + ",";
            while (oldlist.next != null) {
                oldlist = oldlist.next;
                if (oldlist.next == null) {
                    myString = myString + oldlist.item;
                }
                else {
                    myString = myString + oldlist.item + ",";
                }
            }
        }
        myString = myString + "]";
        
        return myString;
    }
    }
