package cs232_project2;

public class ArrayQueue<T> implements Queue<T> {
    // Two object lists to store variables and an int variable to store size of list
    private Object[] stuff;
    private  Object[] oldstuff;
    private int numelements;
    
    public ArrayQueue() {
        /*sets the size to zero and creates the main list
        */
        this.numelements = 0;
        this.stuff = new Object[0];
    }
    
    public T peek() {
        /*Returns the first element in the list  */
        return (T) this.stuff[0];
    }
    
    public boolean isEmpty() {
        /*Returns True if the list is empty and false if there
        are elements in it.
        */
        if (this.numelements == 0) {
            return true;
        }
        
        else {
            for(int i = 0; i < this.numelements - 1; i++) {
                if (this.stuff[i] != null) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public int size() {
        /* Returns the size of the list*/
        return this.numelements;
    }
    
    public void add(T item) {
        /* Adds an item in the next position of the list*/
        if(this.numelements == 0) {
            this.numelements ++;
            
            this.stuff = new Object[this.numelements];
            this.stuff[0] = item;
        }
        
        else {
            
            this.numelements++;
            this.oldstuff = this.stuff;
            this.stuff = new Object[this.numelements];
            
            for(int i = 0; i < this.numelements - 1; i++) {
                this.stuff[i] = this.oldstuff[i];
            }
            
            this.stuff[this.numelements - 1] = item;
        }
    }
    
    public T remove() {
        /*Removes the first element in the list and returns it*/
        if(this.numelements == 0) {
            System.out.println("The Queue is empty");
            return null;
        }
        
        else {
            
            T fElement = (T) this.stuff[0];
            this.numelements = this.numelements - 1;
            this.stuff[0] = null;
            this.oldstuff = this.stuff;
            this.stuff = new Object[this.numelements];
            
            if (this.numelements > 0) {
                for(int i = 1;i < this.numelements + 1; i++) {
                    this.stuff[i - 1] = this.oldstuff[i];
                }
            }

            return fElement;
        }
    }
    
    public String toString() {
        /*Returns a string representation of the Queue*/
        String myString;
        
        if (numelements == 1) {
            myString = "[" + stuff[0] + "]";
            return myString;
        }
        
        else {
            
            myString = "[";

            for(int i = 0; i < this.numelements; i++) {
                if(i == this.numelements - 1) {
                    myString = myString + stuff[i];
                }
                
                else {
                    myString = myString + stuff[i]+ ",";
                }
            }

            myString = myString + "]";

        }
        
        return myString;
    }
}
