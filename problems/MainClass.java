package com.address.problems;

import java.util.HashMap;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Welcome in AddressBook Program");
		HashMap<String, HashMap> list = new HashMap<String, HashMap>();
		AddressBook book = new AddressBook();

		while (true) {
			book.getUserChoice();
		}
	}
}
