package cs232_project2;

import java.util.Scanner;

public class CS232_Project2 {

    public static void main(String[] args) {
        /*Asks the user if they want an ArrayQueue or a LinkedListQueue then runs the appriate method*/
        Scanner myScanner = new Scanner(System.in);
        String myAnswer;
        
        System.out.println("Type 'array' to use an ArrayQueue or press any button to use a LinkedListQueue: ");
        myAnswer = myScanner.nextLine();
        
        if(myAnswer.equals("Array") || myAnswer.equals("array")) {
            //Runs the ArrayQueue funciton
            myArrayQueue();
        }
        
        else {
            //Runs the LinkedList function
            myLinkedQueue();
        }
    }
    
    public static void myArrayQueue() {
        /*Creates the ArrayQueue than uses the switch statement to allow the user to modify the
        Queue. */
        
        //Creates the Queue and a Scanner object
        
        System.out.println();
        System.out.println("Welcome to the ArrayQueue!");
        System.out.println();
        
        ArrayQueue myQueue = new ArrayQueue();
        Scanner myScanner = new Scanner(System.in);
        Object myAnswer;
        boolean myvar = false;
        
        //While loop allows for continued use
        while (myvar != true) {
            System.out.println("1. Add Element"
                    + "\n2. Remove first element"
                    + "\n3. Print Queue "
                    + "\n4. Print Size"
                    + "\n5. Prints whether the Queue is empty or not"
                    + "\n6. exit");
            
            System.out.println();
            System.out.print("Please enter one of the nummerical values: ");
            myAnswer = myScanner.nextInt();
            
            try {
                switch ((int) myAnswer) {
                    //Allows the user to add objects to the Queue
                    case 1 :
                        Scanner myScanner2 = new Scanner(System.in);
                        Object myItem;
                        System.out.println("Please enter item you would like to add to the Queue: ");
                        myItem = myScanner2.nextLine();
                        myQueue.add(myItem);
                        System.out.println();
                        System.out.println("complete...");
                        break;
                    //Allows the user to remove items from the Queue
                    case 2 :
                        System.out.println("Removing the first item from the Queue then printing it.");
                        System.out.println();
                        System.out.println(myQueue.remove());
                        break;
                    //Prints out the Queue
                    case 3 :
                        System.out.println("Here is the Queue: ");
                        System.out.println(myQueue.toString());
                        break;
                    //Prints out the Queue's size
                    case 4 :
                        System.out.print("The Queue's size is: ");
                        System.out.println(myQueue.size());
                        break;
                    //Tells the user if the Queue is empty
                    case 5 :
                        if(myQueue.isEmpty()) {
                            System.out.println("The Queue is empty.");
                            break;
                        }
                        else {
                            System.out.println("The Queue is not empty.");
                            break;
                        }
                    //Closes out the program
                    case 6 :
                        myvar = true;
                        break;
                    default :
                        System.out.println("Please enter a number.");
                        break;
                }
                System.out.println("Press any key to cont...");
                System.in.read();
            }
            
            catch (Exception ex) {
                System.out.println("Warning: The value must be a number from the list!");
            }
            
            myScanner.reset();
        }
    }
    
    public static void myLinkedQueue() {
        /*Creates the LinkedList Queue than uses the switch statement to allow the user to modify the
        Queue. */
        
        //Creates the Queue and a Scanner object
        System.out.println();
        System.out.println("Welcome to the Linked List Queue!");
        System.out.println();
        
        LinkedQueue myQueue = new LinkedQueue();
        Scanner myScanner = new Scanner(System.in);
        Object myAnswer;
        boolean myvar = false;
        
        //While loop allows for continued use
        while (myvar != true) {
            System.out.println("1. Add Element"
                    + "\n2. Remove first element"
                    + "\n3. Print Queue "
                    + "\n4. Print Size"
                    + "\n5. Prints whether the Queue is empty or not"
                    + "\n6. exit");
            
            System.out.println();
            System.out.print("Please enter one of the nummerical values: ");
            myAnswer = myScanner.nextInt();
            try {
                switch ((int) myAnswer) {
                    //Allows the user to add objects to the Queue
                    case 1 :
                        Scanner myScanner2 = new Scanner(System.in);
                        Object myItem;
                        System.out.println("Please enter item you would like to add to the Queue: ");
                        myItem = myScanner2.nextLine();
                        myQueue.add(myItem);
                        System.out.println();
                        System.out.println("complete...");
                        break;
                    //Allows the user to remove items from the Queue
                    case 2 :
                        System.out.println("Removing the first item from the Queue then printing it.");
                        System.out.println();
                        System.out.println(myQueue.remove());
                        break;
                    //Prints out the Queue
                    case 3 :
                        System.out.println("Here is the Queue: ");
                        System.out.println(myQueue.toString());
                        break;
                    //Prints out the Queue's size
                    case 4 :
                        System.out.print("The Queue's size is: ");
                        System.out.println(myQueue.size());
                        break;
                    //Tells the user if the Queue is empty
                    case 5 :
                        if(myQueue.isEmpty()) {
                            System.out.println("The Queue is empty.");
                            break;
                        }
                        else {
                            System.out.println("The Queue is not empty.");
                            break;
                        }
                    //Closes out the program
                    case 6 :
                        myvar = true;
                        break;
                    default :
                        System.out.println("Please enter a number.");
                        break;
                }
                System.out.println();
                System.out.println("Press any key to cont...");
                System.in.read();
                
            }
            
            catch (Exception ex) {
                System.err.println("Please enter a number: ");
            }

            
            myScanner.reset();
        }
    }
    
}
