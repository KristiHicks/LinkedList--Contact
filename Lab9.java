//Lab9.java
//Name: Kristi Hicks, hicksk2
import java.util.ArrayList;
import java.util.Collections;

public class Lab9 {
	public static void main(String[] args)
	{
	    ArrayList<Contact> contacts = new ArrayList<>(); // remember to import java.util.ArrayList
	    
	    // add contacts
	    contacts.add( new Contact("Mary", "Smith", "smithm@yahoo.com") );
	    contacts.add( new Contact("John", "Doe", "johnd@gmail.com") );
	    contacts.add( new Contact("Bob", "Jones", "bjones@aol.com") );
	    contacts.add( new Contact("Frank", "Burns", "frankb@hotmail.com") );
	    contacts.add( new Contact("Walter", "O'Reilly", "wallyor@gmail.com") );
	    
	 // sort the contacts by last name
	   // Collections.sort(contacts); // remember to import java.util.Collections
	    
	    // output the contacts
	  //  System.out.println("My Contacts:");
	  //  for (Contact nextContact : contacts)
	  //  {
	   //     System.out.println(nextContact);
	   // }
	}
}
/*
*
* Name: Kristi Hicks
* User Name: hicksk2
* Assignment: Lab Project 9
*
* Description:
*   This program creates an array of names and displays first name,
*   last name, and email in alphabetical order according to last name.
*   
* Bug Report:
*   None.
*/