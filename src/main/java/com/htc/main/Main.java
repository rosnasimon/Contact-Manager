package com.htc.main;

public class Main {

	public static void main(String[] args) {
		
		ContactManager manager = new ContactManager();
		manager.addContact("John", "Doe", "1234567890");
		manager.addContact("Rosna", "Simon", "9207515171");
		System.out.println(manager.getAllContacts());
	}
}
