package Hashset;

import java.util.HashSet;

public class IterateHashset {

	public static void main(String[] args) {
		// Creating new Hashset and declaring object
		HashSet<String> set= new HashSet<>();
		set.add("Capgemini");//using add method, adding elements into Hashset
		set.add("Wipro");
		set.add("Infosys");		
		set.add("TCS");
		System.out.println("Set:"+set);
		System.out.println("Iterate Hashset:");
		for(String st:set) // Using for each loop to iterate hashset
		{
			System.out.println(st);
		}
			
	}

}
