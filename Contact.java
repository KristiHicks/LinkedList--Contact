//Contact.java
//Name: Kristi Hicks, hicksk2
public class Contact extends LinkedListRunner{
	private String firstname;
	private String lastname;
	private String email;
	
	public Contact(String f, String I, String E){
		firstname = f;
		lastname = I;
		email = E;
	}
	
	public String toString(){
		return firstname +" " + lastname + ": " + email;
	}

	

	//@Override
	//public int compareTo(Contact t) {
	//	return lastname.compareTo(t.lastname);
//	}
}
/*
*
* Name: Kristi Hicks
* User Name: hicksk2
* Assignment: Lab Project 9
*
* Description:
*   This program creates an array of names and displays first name,
*   last name, and email in alphabetical order according to last name in
*   decending order.
*   
* Bug Report:
*   None.
*/