package week3.weedayassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import week1.weekdayass.CharOccurance;

public class MapProgram {
	public static void main(String[] args) {
		String input="PayPalIndia";
		Map<Character, Integer> charOccurance=new LinkedHashMap<Character,Integer>();
		
		char[] charArray = input.toCharArray();
		for (char ch : charArray) {
			if(charOccurance.containsKey(ch)) {
				charOccurance.put(ch, charOccurance.get(ch)+1);
				
			}else {
				charOccurance.put(ch, 1);
			}
		}
	List<Integer> secondLargestNumber=new ArrayList<Integer>(charOccurance.values());
	Collections.sort(secondLargestNumber);
	Integer size = secondLargestNumber.get(secondLargestNumber.size()-2);
	System.out.println("The Second Largest"+size);
	for (Map.Entry<Character, Integer> entry : charOccurance.entrySet()) {
		if(entry.getValue()==size) {
			System.out.println("The key for the Value "+size+ "is"  +entry.getKey());
		}
			
		
	}
	}
	
	
}
