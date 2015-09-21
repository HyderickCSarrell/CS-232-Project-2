# CS-232-Project-2
Hyderick C. Sarrell
The Queue Creation Program
September 20, 2015


	The Queue Creation Program is a Java project I created in a group for my Computer Programming II class. It creates either an array queue or a linked-list queue based on the user’s choice. Both the array-queue and the linked-list-queue are classes that implement the Queue interface. The main program, called Queue-main, uses these classes to create both the linked-list-queue and the array-queue.
	
	Queue consist of five methods that will be implemented by its child classes. The first one is the void method add and its purpose is to add items to the queue. The second method is the Boolean method is-Empty, which tells us if the queue is empty. The next two methods are T methods peek and remove; peek will let us see the first item in the list and remove will remove it and display it to the screen. The last method in Queue is the integer method size, which returns the number of items in the queue.
	
	Array-queue defines the methods to be used by the main program to create the array queue. Before defining the methods, we had to create three private variables for the methods to use. Two of the variables are object list named stuff and old-stuff, which are the arrays that will be stored and manipulated. The third variable is an integer variable called numelements that is used to keep track of the number of elements inside the array. The first method is the constructor method which assigns zero to numelements and stuff to a new object list.
	
	Next, peek uses indexing to return the first element in the array. Is-Empty will return true if numelements equals zero; however, if that is not the case it uses a for-loop to search the list and return false if any of the elements is not null. The size method simply returns the numelements variable. The add method for array-queue will use stuff and old-stuff to add elements by assigning stuff to old-stuff, and assigning a new array to stuff, and finally copying everything back to stuff.
	
	Remove also uses both object list, but uses another variable to store the variable that is removed. It then sets the first element to null and uses a for-loop to move the elements from old-stuff to stuff in the same manner as add. Both of the queue classes use another method called to-String. This method is the last method in both queues, and it create a string visualization of the array or linked-list. In the array-queue, to-String uses a for-loop to iterate through the array and add each element to a string. The variable to contain the string is given a bracket before and after the for-loop, and commas are added to separate each element.
	
	In the linked-list queue we have three private variables; however, two of the variables are linked-list objects, new-list and old-list, created from the linked-list class which contains a pointer called next and an object variable called item. The third variable is an integer object called new-list-elements. The class constructor sets this to zero, new-list to null, and old-list to a new linked-list object. Peek, Is-empty, and size work just like they do in the array queue. Add uses a while loop to iterate through old-list and a third linked-list variable to add a new node at the end of the queue. Remove does the same thing as it does in the array; however, we have to set old-list to point to the next node in the queue. To-String also does the same thing as it does in the array queue, but in order to get each value old-list will point to the next node in new-list.
	
	The main program has three methods in it: main, my-Array-Queue, and my-Linked-Queue. Main asks the user which type of queue they want then it will run either my-Array-Queue or my-Linked-Queue based on that person’s choice. Both of the classes create their own interfaces to interact with. However, my-Array-Queue uses array-queue and my-Linked-Queue uses linked-list-queue to create their own queues. They use switch statements to determine the user’s choice and then run the corresponding methods. The user is able to add and remove elements, determine if the queue is empty, print the size, and print the queue. When the user is done with program, they can select the exit choice and the control variable that loops the program will end.
