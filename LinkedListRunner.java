import java.util.LinkedList;


public class LinkedListRunner  {
	public static void main(String[] args){
		LinkedList<Contact> contacts = new LinkedList<>();
		
		contacts.add( new Contact("Mary", "Smith", "smithm@yahoo.com") );
	    contacts.add( new Contact("John", "Doe", "johnd@gmail.com") );
	    contacts.add( new Contact("Bob", "Jones", "bjones@aol.com") );
	    contacts.add( new Contact("Frank", "Burns", "frankb@hotmail.com") );
	    contacts.add( new Contact("Walter", "O'Reilly", "wallyor@gmail.com") );
	    contacts.add( new Contact("Sheldon", "Cooper", "shelly@caltech.edu"));
	    contacts.add( new Contact("Leonard", "Hofstadter", "lenny@caltech.edu"));
	    contacts.add( new Contact("Howard", "Wolowitz", "howie@caltech.edu"));
	    contacts.add( new Contact("Rajesh", "Koothrappali", "raj@caltech.edu"));
	    
	    System.out.println("My Contacts:");
	    for (Contact nextContact : contacts)
	    {
	        System.out.println(nextContact);
	    }
	    
	    contacts.remove(0);
	    contacts.remove(0);
	    System.out.println("");
	    
	    System.out.println("New List of Contacts:");
	    for (Contact newContact : contacts)
	    {
	        System.out.println(newContact);
	    }
	    
	    contacts.remove(0);
	    contacts.remove(0);
	    System.out.println("");
	    
	    System.out.println("New List of Contacts:");
	    for (Contact newC : contacts)
	    {
	        System.out.println(newC);
	    }
	}

}
