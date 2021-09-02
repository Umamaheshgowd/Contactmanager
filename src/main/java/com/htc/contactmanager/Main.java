package com.htc.contactmanager;

public class Main {

	public static void main(String[] args) {
		ContactManager contactManager= new ContactManager();
		contactManager.addContact("rose", "kerala", "9848023218");
		System.out.println(contactManager.getAllContacts());
		
	}
	
	
}
